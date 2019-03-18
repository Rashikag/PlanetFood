/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dbutil.DBConnection;
import pojo.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Rashika
 */
public class ProductDao {
    public static String getNewId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
       int id=101;
       ResultSet rs=ps.executeQuery("select count(*) from products");
       if(rs.next())
       {
           id=id+rs.getInt(1);
       }
       return "P"+id;
       }
        
    public static boolean addProduct(Product p) throws SQLException
    {
     Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into products values(?,?,?,?,?)");
       ps.setString(1,p.getProd_id());
       ps.setString(2,p.getCat_id());
       ps.setString(3,p.getProd_name());
       ps.setDouble(4,p.getPrice());
       ps.setString(5,p.getActive());
       int count=ps.executeUpdate();
       if(count==0)
               {
                   return false;
                   
               }
       else 
           return true;
       
                 
           
    }
    public static HashMap<String,Product> getProductsByCategory(String catId) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
       // String q="select * from PRODUCTS where CAT_ID=?";
        PreparedStatement ps=conn.prepareStatement("select * from products where CAT_ID=? and active='Y'");
        HashMap <String,Product> productList=new HashMap<String,Product>();
        ps.setString(1,catId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Product p=new Product();
            p.setCat_id("cat_id");
            p.setProd_id(rs.getString("prod_id"));
             p.setProd_name(rs.getString("prod_name"));
              p.setPrice(rs.getDouble("prod_price"));
              p.setActive(rs.getString("active"));
              productList.put(p.getProd_id(),p);
              
        }
        return productList;
        
    }
    public static ArrayList<Product> getAllData() throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      Statement sc=conn.createStatement();
      ArrayList<Product> productList=new ArrayList<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=sc.executeQuery("select * from products");
      while(rs.next())
      {
          Product p=new Product();
            p.setProd_id(rs.getString("prod_id"));
            p.setCat_id(rs.getString("cat_id"));
             p.setProd_name(rs.getString("prod_name"));
              p.setPrice(rs.getDouble("prod_price"));
              p.setActive(rs.getString("active"));
              productList.add(p);
             
      }

      return productList;
    }
    public static boolean updateProduct(Product p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update products set prod_name=?, prod_price=?, active=? where prod_id=?");
        ps.setString(1,p.getProd_name());
        ps.setDouble(2,p.getPrice());
        ps.setString(3,p.getActive());
        ps.setString(4,p.getProd_id());
        int x=ps.executeUpdate();
        if(x>0)
            return true;
        else return 
                false;
    }
     public static HashMap<String,String> getActiveProductsByCategory(String catId) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
       // String q="select * from PRODUCTS where CAT_ID=?";
        PreparedStatement ps=conn.prepareStatement("select prod_name,prod_id from products where CAT_ID=? and active='Y'");
        HashMap <String,String> productList=new HashMap<String,String>();
        ps.setString(1,catId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Product p=new Product();
           // p.setCat_id("cat_id");
            String prod_id=rs.getString("prod_id");
            String prod_name=rs.getString("prod_name");
            //  p.setPrice(rs.getDouble("prod_price"));
             // p.setActive(rs.getString("active"));
              productList.put(prod_name,prod_id);
              
        }
        return productList;
        
    }
     public static boolean removeProduct(String prod_id) throws SQLException
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("update products set active='N' where prod_id=?");
         ps.setString(1, prod_id);
         int count;
         count=ps.executeUpdate();
         if(count==0)
             return false;
         else 
             return true;
         
     }
      public static ArrayList<Product> getMenuListData(String catId) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select * from products where cat_id=?");
      ArrayList <Product> productList=new ArrayList<Product>();
        ps.setString(1,catId);
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {
            Product p=new Product();
            
            p.setProd_id(rs.getString("prod_id"));
             p.setCat_id(rs.getString("cat_id"));

             p.setProd_name(rs.getString("prod_name"));
              p.setPrice(rs.getDouble("prod_price"));
              p.setActive(rs.getString("active"));
              productList.add(p);
              
        }
        return productList;
        
    }
}
    


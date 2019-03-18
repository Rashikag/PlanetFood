/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection;
import pojo.Category;
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
public class CategoriesDao {
    public static String getNextCategoryId() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement sc=conn.createStatement();
        ResultSet rs=sc.executeQuery("select count(*) from categories");
       
        int id=101;
        while(rs.next())
        {
            id=id+rs.getInt(1);
        }
        return "C"+id;
    }
    public static boolean addCategory(Category c) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into categories values(?,?)");
        ps.setString(1,c.getCat_Id());
        ps.setString(2,c.getCat_Name());
        int count=ps.executeUpdate();
        if(count==0)
            return false;
        else 
            return true;
        
        
    }
    public static HashMap<String,String> getAllCategoryId() throws SQLException
    {
        
  
                  Connection conn=DBConnection.getConnection();
                  Statement st=conn.createStatement();
                  ResultSet rs=st.executeQuery("select * from categories");
                  HashMap<String,String> categories=new HashMap<>();
                  while(rs.next())
                  {
                      String cat_Id=rs.getString(1);
                      String cat_Name=rs.getString(2);
                      categories.put(cat_Name, cat_Id);
                  }
                  
        return categories;
    }
   // public static ArrayList<Category> getAllCategoryDetails() throws SQLException
   // {
        
  
                 // Connection conn=DBConnection.getConnection();
                  //Statement st=conn.createStatement();
                  //ResultSet rs=st.executeQuery("select * from categories");
                  //ArrayList<Category> categoryList=new ArrayList<>();
                  //while(rs.next())
                  //{   Category c=new Category();
                    //  c.setCat_Id(rs.getString("cat_id"));
                      //c.setCat_Name(rs.getString("cat_name"));
                      //categoryList.add(c);
                 // }
                  
      //  return categoryList;
  //  }
    public static boolean editCategory(Category c) throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("update categories set cat_name=? where cat_id=?");
     
       ps.setString(1,c.getCat_Name());
        ps.setString(2,c.getCat_Id());
        int x=ps.executeUpdate();
        if(x>0)
            return true;
        else return 
                false;
      
      
      
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dbutil.DBConnection;
import pojo.OrderDetails;
import pojo.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rashika
 */
public class OrdersDao {
    public static ArrayList<Orders> getOrderByDate(Date startDate,Date endDate)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from orders where ord_date between ? and ?");
        long ms1=startDate.getTime();
        long ms2=endDate.getTime();
        java.sql.Date d1=new java.sql.Date(ms1);
        java.sql.Date d2=new java.sql.Date(ms2);
        ps.setDate(1,d1);
        ps.setDate(2,d2);
        ArrayList<Orders> orderList=new ArrayList<Orders>();
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {Orders obj=new Orders();
         obj.setOrdId(rs.getString("ord_id"));//date ayegi yy-mm-dd which should be changed to ddmmyy for easier readability
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");//constructor of class 
         java.sql.Date d=rs.getDate("ord_Date");
         String dateStr=sdf.format(d);//to convert to string 
         obj.setOrdDate(dateStr);
         obj.setOrdAmount(rs.getDouble("ord_amount"));
         obj.setGst(rs.getDouble("gst"));
         obj.setGstAmount(rs.getDouble("gst_amount"));
         obj.setGrandTotal(rs.getDouble("grand_total"));
         obj.setDiscount(rs.getDouble("discount"));
         obj.setUserId(rs.getString("userid"));
          orderList.add(obj);  
        }
        return orderList;
    }
     public static String getNewId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement ps=conn.createStatement();
       int id=101;
       ResultSet rs=ps.executeQuery("select count(*) from orders");
       if(rs.next())
       {
           id=id+rs.getInt(1);
       }
       return "OD"+id;
       }
        
    public static boolean addOrder(Orders order,ArrayList<OrderDetails> orderList)throws Exception
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps1=conn.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?)");
        ps1.setString(1,order.getOrdId());
        String dates=order.getOrdDate();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        java.util.Date d1=sdf.parse(dates);
        long ms=d1.getTime();
         java.sql.Date d2=new java.sql.Date(d1.getTime());
         ps1.setDate(2,d2);
         ps1.setDouble(3,order.getGst());
          ps1.setDouble(4,order.getGstAmount());
           ps1.setDouble(5,order.getDiscount());
            ps1.setDouble(6,order.getGrandTotal());
             ps1.setString(7,order.getUserId());
             ps1.setDouble(8,order.getOrdAmount());
             int x=ps1.executeUpdate();
        PreparedStatement ps2=conn.prepareStatement("insert into order_details values(?,?,?,?)");
         int count=0,y;
         for(OrderDetails detail:orderList)
         {
           
             ps2.setString(1,detail.getOrdId());
             ps2.setString(2,detail.getProdId());
             ps2.setDouble(3,detail.getQuantity());
             ps2.setDouble(4,detail.getCost());
             y=ps2.executeUpdate();
             if(y>0)
             {
                 count=count+y;
                
             }
         }
             if(x>0 && count==orderList.size())
             {
                 return true;
           
         }
             else 
                 return false;
         
         
         
        
    }
     public static ArrayList<Orders> getOrder()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from orders");
       
        ArrayList<Orders> orderList=new ArrayList<Orders>();
        ResultSet rs=ps.executeQuery();
        while(rs.next())
        {Orders obj=new Orders();
         obj.setOrdId(rs.getString("ord_id"));//date ayegi yy-mm-dd which should be changed to ddmmyy for easier readability
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");//constructor of class 
         java.sql.Date d=rs.getDate("ord_Date");
         String dateStr=sdf.format(d);//to convert to string 
         obj.setOrdDate(dateStr);
         obj.setOrdAmount(rs.getDouble("ord_amount"));
         obj.setGst(rs.getDouble("gst"));
         obj.setGstAmount(rs.getDouble("gst_amount"));
         obj.setGrandTotal(rs.getDouble("grand_total"));
         obj.setDiscount(rs.getDouble("discount"));
         obj.setUserId(rs.getString("userid"));
          orderList.add(obj);  
        }
        return orderList;
    }
}

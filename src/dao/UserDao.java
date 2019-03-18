/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dbutil.DBConnection;
import pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


/**
 *
 * @author Rashika
 */
public class UserDao {
    public static String validateUser(UserPojo u) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String str="select username from user1 where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement(str);
        ps.setString(1, u.getUserId());
        ps.setString(2, u.getPassword());
        ps.setString(3, u.getUserType());
        ResultSet rs=ps.executeQuery();
        String username=null;
        if(rs.next())
        {
           username=rs.getString(1);
        }
        return username;
    }
      public static String DetailName(String uId) throws SQLException
    {// ArrayList<String,String> some=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
       // String str="select username,empid from user1 where userid=?";
        PreparedStatement ps=conn.prepareStatement("select username from user1 where userid=?");
        ps.setString(1, uId);
        
        ResultSet rs=ps.executeQuery();
        String username=null;
        if(rs.next())
        {
           username=rs.getString("username");
        }
        return username;
    }
       public static String DetailId(String uId) throws SQLException
    {// ArrayList<String,String> some=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
       // String str="select empid from user1 where userid=?";
        PreparedStatement ps=conn.prepareStatement("select empid from user1 where userid=?");
        ps.setString(1, uId);
        
        ResultSet rs=ps.executeQuery();
        String eid=null;
        if(rs.next())
        {
           eid=rs.getString("empid");
        }
        return eid;
    }
    public static boolean setData(UserPojo u,String name,String eid) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
       // String str="insert into user1 values(?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement("insert into user1 values(?,?,?,?,?)");
        ps.setString(1, u.getUserId());
         ps.setString(2, name);
        ps.setString(3, u.getPassword());
         ps.setString(4,eid);
        ps.setString(5, u.getUserType());
        ResultSet rs=ps.executeQuery();
        int count=ps.executeUpdate();
        if(count!=0)
        return true;
        else
            return false;
    }
     public static boolean removeUser(String usid) throws SQLException
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("delete from user1 where userid=?");
         ps.setString(1,usid);
         int count;
         count=ps.executeUpdate();
         if(count==0)
             return false;
         else 
             return true;
         
     }
     public static boolean addUser(String eid,UserPojo u) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
      //  String str="select username from user1 where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement("select ename from employees where empid=?");
        ps.setString(1, eid);
        ResultSet rs=ps.executeQuery();
        String ename="";
       while(rs.next())
       {
           ename=rs.getString("ename");
       }
        PreparedStatement p=conn.prepareStatement("insert into user1 values(?,?,?,?,?)");
        p.setString(1, u.getUserId());
         p.setString(2, ename);
        p.setString(3, u.getPassword());
         p.setString(4,eid);
        p.setString(5, u.getUserType());
      
        int count=p.executeUpdate();
        if(count==0)
        return false;
        else
            return true;
       
    }
     public static HashMap<String,String>  findUserDetails(String uid)throws SQLException{
         Connection conn=DBConnection.getConnection();
      //  String str="select username from user1 where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement("select username,empid from user1 where userid=?");
        ps.setString(1,uid);
        ResultSet rs=ps.executeQuery();
        String uname="",empid="";
        while(rs.next())
        {
            uname=rs.getString("username");
            uname=rs.getString("empid");
        }
        HashMap<String,String> hm=new HashMap<String,String>();
        hm.put(empid,uname);
        return hm;
        
     }
}

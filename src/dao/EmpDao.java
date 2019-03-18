/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import dbutil.DBConnection;
import pojo.EmpPojo;
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
public class EmpDao 
{
  public static boolean addEmployees(EmpPojo e) throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("insert into EMPLOYEES values(?,?,?,?)");
      ps.setString(1,e.getEmpno());
      ps.setString(2, e.getEname());
      ps.setString(3,e.getEjob());
      ps.setDouble(4,e.getSal());
      int count=ps.executeUpdate();
      if(count==0)
          return false;
      else
          return true;
      
      
      
  }
  public static boolean editEmployees(EmpPojo e) throws SQLException
  {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("update employees set ename=?,job=?,sal=? where empid=?");
     
       ps.setString(1,e.getEname());
        ps.setString(2,e.getEjob());
         ps.setDouble(3,e.getSal());
          ps.setString(4,e.getEmpno());
      
     
      int x=ps.executeUpdate();
        if(x>0)
            return true;
        else return 
                false;
      
      
      
  }
   public static ArrayList<EmpPojo> getEmployeeData() throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      Statement sc=conn.createStatement();
      ArrayList<EmpPojo> empList=new ArrayList<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=sc.executeQuery("select * from employees");
      while(rs.next())
      {
          EmpPojo e=new EmpPojo();
          e.setEmpno(rs.getString("empid"));
          e.setEname(rs.getString("ename"));
          e.setEjob(rs.getString("job"));
          e.setSal(rs.getDouble("sal"));
           empList.add(e); 
             
      }

      return empList;
    }
     public static ArrayList<EmpPojo> getEmployeeDataById(String eid) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select * from employees where empid=?");
      ps.setString(1,eid);
      ArrayList<EmpPojo> empList=new ArrayList<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=ps.executeQuery();
      
      while(rs.next())
      {
          EmpPojo e=new EmpPojo();
        e.setEmpno(rs.getString("empid"));
          e.setEname(rs.getString("ename"));
          e.setEjob(rs.getString("job"));
          e.setSal(rs.getDouble("sal"));
           empList.add(e); 
             
      }

      return empList;
    }
      public static boolean removeEmployee(String eid) throws SQLException
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("delete from employees where empid=?");
         ps.setString(1,eid);
         int count;
         count=ps.executeUpdate();
         if(count==0)
             return false;
         else 
             return true;
         
     }
       public static EmpPojo getEmployeeDataByEId(String eid) throws SQLException
    { //HashMap<String,EmpPojo> empList=new HashMap<String,EmpPojo>();
        EmpPojo e=new EmpPojo();
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("select * from employees where empid=?");
      ps.setString(1,eid);
      //ArrayList<EmpPojo> empList=new ArrayList<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=ps.executeQuery();
      
      while(rs.next())
      {
          //EmpPojo e=new EmpPojo();
        e.setEmpno(rs.getString("empid"));
          e.setEname(rs.getString("ename"));
          e.setEjob(rs.getString("job"));
          e.setSal(rs.getDouble("sal"));
         //empList.put(e.getEmpno(),e); 
             
      }

      return e;
    }
       public static HashMap<String,EmpPojo> getEmployeeData(String eid) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      Statement sc=conn.createStatement();
      HashMap<String,EmpPojo> empList=new HashMap<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=sc.executeQuery("select * from employees");
      while(rs.next())
      {
          EmpPojo e=new EmpPojo();
          e.setEmpno(rs.getString("empid"));
          e.setEname(rs.getString("ename"));
          e.setEjob(rs.getString("job"));
          e.setSal(rs.getDouble("sal"));
           empList.put(e.getEmpno(),e); 
             
      }

      return empList;
    }
       public static boolean setJob(String empid) throws SQLException
       {String job=getEjob(empid);
           Connection conn=DBConnection.getConnection();
        //String str="insert into user1 values(?,?,?,?,?)";
        PreparedStatement ps=conn.prepareStatement("update employees set job='Cashier' where empid=?");
        ps.setString(1, empid);
         
       // ResultSet rs=ps.executeQuery();
        int count=ps.executeUpdate();
        if(count!=0)
        return true;
        else
            return false;
    }
    public static String getEjob(String eid) throws SQLException
    {
      Connection conn=DBConnection.getConnection();
     PreparedStatement  ps=conn.prepareStatement("select job from employees where empid=?");
     ps.setString(1, eid);
      
        ResultSet rs=ps.executeQuery();
        String job=null;
        if(rs.next())
        {
           job=rs.getString("job");
        }
        return job;
    
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
        public static ArrayList<String> getCashierEmpId() throws SQLException
    {
      Connection conn=DBConnection.getConnection();
      Statement sc=conn.createStatement();
      ArrayList<String> empList=new ArrayList<>();
     // sc.executeQuery("select * from products");
      ResultSet rs=sc.executeQuery("select empid from employees where job='Cashier' or job='cashier'");
      while(rs.next())
      {
         
          String id=rs.getString("empid");
          
          empList.add(id);
             
      }
      return empList;
    }
        
}

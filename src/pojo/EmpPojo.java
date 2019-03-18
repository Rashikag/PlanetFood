/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author Rashika
 */
public class EmpPojo {
    private String empno;
     private String ename;
    private String ejob;
 private double sal;

    public void setEjob(String ejob) {
        this.ejob = ejob;
    }
   
    public String getEjob() {
        return ejob;
    }
   

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSal() {
        return sal;
    }
    
    
}

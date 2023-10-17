package com.bkacad.app.data;

import java.sql.*;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import com.bkacad.app.exceptions.StudentNotFoundException;

public class StudentDAO {
    static final String TABLE_NAME = "students";
    static final String DB_URL = "jdbc:mysql://localhost:3306/bkacad?autoReconnect=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "my-secret-pw";

    static public class Student{
        Integer id;
        String name;
        Date dob;

        public Student(Integer i, String n, Date d){
            this.id = i;
            this.name = n;
            this.dob = d;
        }

        public void print(){
            System.out.printf("Id: %d, name: %s, DoB: %s\n", this.id, this.name, this.dob);
        }
    }
    static public ArrayList<Student> getStudent() throws SQLException{
        final String QUERY = "select * from "+TABLE_NAME;
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
     
        ResultSet rs= stmt.executeQuery(QUERY);
        ArrayList<Student> allStudents = new ArrayList<>();

        while (rs.next()){
            allStudents.add(
                new Student(rs.getInt("id"), rs.getString("name"), rs.getDate("dob"))
            );
        }
        
        return allStudents;
    }

    static public Student getStudent(Integer id) throws SQLException,StudentNotFoundException{
        final String QUERY = "select * from "+TABLE_NAME+" where id="+id;
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
     
        ResultSet rs= stmt.executeQuery(QUERY);
        if (rs.next()){
            return new Student(rs.getInt("id"), rs.getString("name"), rs.getDate("dob"));
        }
        else {
            throw new StudentNotFoundException(id);
        }
    }

    static public void insertStudent(Student st) throws SQLException{
        final String QUERY = "insert into "+TABLE_NAME+" (id, name, dob) values ("+st.id + ",'"+st.name+"','"+st.dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(DateTimeFormatter.ofPattern("YYYY-MM-dd"))+"')";
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(QUERY);
    }
     
}

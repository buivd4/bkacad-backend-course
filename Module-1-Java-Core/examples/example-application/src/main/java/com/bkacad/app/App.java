package com.bkacad.app;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.bkacad.app.data.StudentDAO;
import com.bkacad.app.exceptions.StudentNotFoundException;

public class App 
{
    public static void main( String[] args )
    {
      try {
         ArrayList<StudentDAO.Student> allS = StudentDAO.getStudent();
         for (int i=0;i<allS.size();i++){
            allS.get(i).print();
         }
         //StudentDAO.Student newStudent = new StudentDAO.Student(5,"Nick",new Date());
         //StudentDAO.insertStudent(newStudent);
         //StudentDAO.getStudent(5).print();;
      }
      catch (SQLException e){
         e.printStackTrace();
      }
      // catch (StudentNotFoundException e){
      //    System.out.println(e.getMessage());
      // }
    }
}

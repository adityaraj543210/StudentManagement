package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		//Jdbc code to insert st
//		boolean f = false;
		try {
			Connection con = CP.createC();
			
			String q = "insert into student(first_name, surname, age) values(?,?,?);";
			
			//prepared statement
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set the values of parameters
			pstmt.setString(1, st.getStudentFirstName());
			pstmt.setString(2, st.getStudentSurName());
			pstmt.setInt(3,st.getAge());
			
			//execute
			if(pstmt.executeUpdate() != 0) return true;
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		//Jdbc code to insert st
				boolean f = false;
				try {
					Connection con = CP.createC();
					
					String q = "delete from student where sid = ?;";
					
					//prepared statement
					
					PreparedStatement pstmt = con.prepareStatement(q);
					
					//set the values of parameters
					pstmt.setInt(1, userId);
					
					
					//execute
					pstmt.executeUpdate();
					f=true;
					
				} catch(Exception e) {
					e.printStackTrace();
				}
				return f;
	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		//Jdbc code to show
//				boolean f = false;
				try {
					Connection con = CP.createC();
					
					String q = "select * from student;";
					
					Statement stmt = con.createStatement();
				
					
					//execute
					ResultSet set  = stmt.executeQuery(q);
					
					while(set.next()) {
						int id = set.getInt(1);
						int age = set.getInt(2);
						String fname = set.getString(3);
						String lname = set.getString(4);
						
						System.out.println("ID : " + id);
						System.out.println("Age: " + age);
						System.out.println("First Name: " + fname);
						System.out.println("Last Name: "+ lname);
						System.out.println("___________________________________");
						
					}
					
				} catch(Exception e) {
					e.printStackTrace();
				}
		
	}

	
	public static Boolean updateAge(int idtoUpdate, int newAge) {
		// TODO Auto-generated method stub
		//update age
		boolean f = false;
		try {
			Connection con = CP.createC();
			
			
			String q ="UPDATE student SET Age = ? WHERE sid = ?;";
			
			PreparedStatement ptsmt = con.prepareStatement(q);
			
			ptsmt.setInt(1,newAge);
			ptsmt.setInt(2, idtoUpdate);
			
			int rowUpdated = ptsmt.executeUpdate();
			
			f=true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;	
	}

	
    public static Boolean updateFirstName(int idtoUpdate, String newfName) {
		// TODO Auto-generated method stub
		//update first name
    	boolean f = false;
		try {
			Connection con = CP.createC();
			
			String q ="UPDATE student SET first_name = ? WHERE sid = ?;";
			
			PreparedStatement ptsmt = con.prepareStatement(q);
//			
			ptsmt.setString(1,newfName);
			ptsmt.setInt(2, idtoUpdate);
			
			int rowUpdated = ptsmt.executeUpdate();
			
			f=true;
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return f;
	}


    public static Boolean updateLastName(int idtoUpdate, String newLastName) {
	// TODO Auto-generated method stub
			//update last name
					boolean f = false;
					try {
						Connection con = CP.createC();
						
						String q ="UPDATE student SET surname = ? WHERE sid = ?;";
						
						PreparedStatement ptsmt = con.prepareStatement(q);
//						
						ptsmt.setString(1,newLastName);
						ptsmt.setInt(2, idtoUpdate);
						
						int rowUpdated = ptsmt.executeUpdate();
						
						f=true;
						
					} catch(Exception e) {
						e.printStackTrace();
					}
					return f;
}
	
	
}

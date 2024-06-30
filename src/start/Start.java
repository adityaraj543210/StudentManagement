package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;
public class Start {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("PRESS 1 TO ADD STUDENT");
			System.out.println("PRESS 2 TO DELETE STUDENT");
			System.out.println("PRESS 3 TO DISPLAY STUDENT");
			System.out.println("PRESS 4 TO UPDATE STUDENT DETAILS");
			System.out.println("PRESS 5 TO EXIT APP");
			int c = Integer.parseInt(br.readLine());
			
			if(c==1) {
				//add student
				System.out.println("Enter user First name: ");
				String fname = br.readLine();
				
				System.out.println("Enter user Last name: ");
				String lname = br.readLine();
				
				System.out.println("Enter user  Age: ");
				int age = br.read();
				
				//create student object to store student
				Student st = new Student(fname, lname, age);
				
				boolean answer = StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Student is added successfuly");
				}else {
					System.out.println("Something went wrong try again");
				}
			}
			else if(c==2) {
				//delete student
				
				System.out.println("Enter Student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean answer = StudentDao.deleteStudent(userId);
				if(answer) {
					System.out.println("Student Deleted successfuly");
				}else {
					System.out.println("Something went wrong try again");
				}
			}
			
			
			else if(c==3) {
				//display student
				StudentDao.showAllStudents();
			}
			else if(c==4) {
				//UPDATE
				
				try {
					
				System.out.println("ID for Update: ");
				int IdtoUpdate = Integer.parseInt(br.readLine());
			
				System.out.println("For Age: 1, For First Name: 2, For Last Name: 3");
				int upd = Integer.parseInt(br.readLine());
				if(upd ==1) {
					//age update
					int newAge = Integer.parseInt(br.readLine());
					Boolean answer = StudentDao.updateAge(IdtoUpdate, newAge);
					if(answer) {
						System.out.println("Student Age updated  successfuly");
					}else {
						System.out.println("Something went wrong try again");
					}
				}
				else if(upd == 2) {
					//update first name
					String newName = br.readLine();
					Boolean answer = StudentDao.updateFirstName(IdtoUpdate, newName);
					if(answer) {
						System.out.println("Student first name updated successfuly");
					}else {
						System.out.println("Something went wrong try again");
					}
					
				}
				else if(upd ==3) {
					//update last name
					String newLastName = br.readLine();
					Boolean answer = StudentDao.updateLastName(IdtoUpdate, newLastName);
					if(answer) {
						System.out.println("Student last name updated successfuly");
					}else {
						System.out.println("Something went wrong try again");
					}
					
				}
				else {
					System.out.println("Please enter valid Entry.");
				}
				}
				catch(Exception e) {
					e.printStackTrace();
				}		
				
			}
			else if (c==5){
				//EXIT
				break;
			}
			else {
				
			}
			
		}
		System.out.println("Thank you for using my application.");
	}

	private static void updateAge(int idtoUpdate, int newAge) {
		// TODO Auto-generated method stub
		
	}

}

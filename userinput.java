package javaprograms;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;


public class userinput {
			String name;
			int age;
			float salary;
			userinput(String name,int age,float salary)
			{
				this.name= name;
				this.age= age;
				this.salary= salary;
			}
			void display()
			{
				System.out.println(name+" "+age+" "+salary+" ");
		}
			public class userInputBufferReader{
			
			public static void main(String[] args) throws IOException{
				int i;
				user a[]=new user[10];
				InputStreamReader reader=new InputStreamReader (System.in);
				BufferedReader br= new BufferedReader(reader);
				for(i=0;i<10;i++) {
					System.out.println("Enter name");
					String name= br.readLine();
					System.out.println("Enter age");
					int age= Integer.parseInt(br.readLine());
					System.out.println("Enter saalry");
					float salary= Float.parseFloat(br.readLine());
					{
						a[i]=new user(name,age,salary);
						a[i].display();
					}
					
				}
					

			}


	}

	}



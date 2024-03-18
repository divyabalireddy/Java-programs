package ja;
	public class assesment_1b{
		String name;
		float salary;
		int hiredate;
		assesment_1b(String name,float salary,int hiredate)
		{
			this.name=name;
			this.salary=salary;
			this.hiredate=hiredate;
		}
		int yearsofservice(int hiredate)
		{
			return 2024-hiredate;
		}
		void display()
		{
			int service=yearsofservice(hiredate);
			if(service<2)
			{
				System.out.println("Temporary Employee");
				System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"Service:"+service+"\n");
			}
			else {
				System.out.println("Permanent Employee");
			System.out.println("Name:"+name+"\n"+"Salary:"+salary+"\n"+"Service:"+service+"\n");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	        assesment_1b ob=new assesment_1b("divya",2000.0f,2001);
	        ob.display();
	        assesment_1b ob1=new assesment_1b("vamsi priya",5000.0f,2021);
	        ob1.display();
	        
		}

	}

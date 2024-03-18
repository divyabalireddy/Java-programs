package ja;

public class assesment_1c {
	String name;
	int yearofjoining;
	double salary;
	String address;
	assesment_1c(String name,int yearofjoining,double salary,String address)
	{
		this.name=name;
		this.yearofjoining=yearofjoining;
		this.salary=salary;
		this.address=address;
	}
	void display()
	{
		System.out.println(name+"   "+ yearofjoining+"      "+salary+"      "+address);
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       assesment_1c ob=new assesment_1c("Ameer",1995,3580.33,"102- Akbhar street");
       assesment_1c ob1=new assesment_1c("Divya",1998,58200.25,"109- ramalayam street");
       assesment_1c ob2=new assesment_1c("amediv",2000, 28700.28,"108- hyd street");
       System.out.println("Name  "+"   YearOfJoining  "+"  Salary "+"     Address");
       ob.display();
       ob1.display();
       ob2.display();
	}

}

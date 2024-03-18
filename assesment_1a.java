package ja;

public class assesment_1a {
		String name;
		int sid;
		String phno;
		static String course;
		 
		 assesment_1a(String name,int sid,String phno)
		 {
			 this.name=name;
			 this.sid=sid;
			 this.phno=phno;
		 }
		 static void setcourse(String coursename)
		 {
			 course=coursename;
		 }
		 void display()
		 {
			 System.out.println("Name:"+name+"\n"+"Id:"+sid+"\n"+"Phno:"+phno+"\n"+"Course:"+course+"\n");
			 
		 }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			assesment_1a.setcourse("Java");
			assesment_1a ob=new assesment_1a("Divya",404,"9390450134");
	       ob.display();
	       assesment_1a ob1=new assesment_1a("Vamsipriya",402,"8764532787");
	       ob1.display();
	       
		}

	}
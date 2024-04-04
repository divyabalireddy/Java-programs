
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("divya");
		al.add("vamsi");
		al.add("kusuma");
		al.add("chinna");
		System.out.println(al);
		System.out.println("using for loop");
		for(String x:al)
		{System.out.println(x);
		}
		System.out.println("using iterator");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
			ArrayList<String> al2= new ArrayList<String>();
			al2.add("priya");
			al2.add("mumma");
			al2.addAll(al);
			System.out.println(al2);
	
	ArrayList<String> al3= new ArrayList<String>();
	al3.add("akka");
	al3.contains(al3);
	System.out.println("getting element"+al.get(2));
	al.set(1, "puppy");
	System.out.println(al);
	for(String name:al)
	{
		System.out.println(name);
	}
	ArrayList<Integer> list= new ArrayList<Integer>();
	System.out.println("sorting number");
	list.add(5);
	list.add(15);
	list.add(20);
	list.add(30);
	Collections.sort(list);
	for(Integer ai:list)
	{
	System.out.println(ai);
	}
	System.out.println("traversing list through for loop");
	ArrayList<Integer> list1= new ArrayList<Integer>();
	list1.add(5);
	list1.add(15);
	list1.add(20);
	list1.add(30);
	ListIterator<Integer> list2= list.listIterator(list.size());
	while(list2.hasPrevious())	
	{
		Integer i=list2.previous();
		System.out.println(i);
	}
	ArrayList<Integer> list3= new ArrayList<Integer>();
	
	list3.add(100);
	list3.add(150);
	list3.add(200);
	list3.add(300);
	list3.remove(1);
	System.out.println(list3);
	System.out.println("is array list empty" +list3.isEmpty());
	System.out.println("list of array"+ list3.size());
	}
	
		}
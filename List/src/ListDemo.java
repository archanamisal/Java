import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>li=new ArrayList<>();
		
		
		
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(4);
		li.add(4);
		li.add(5);
		
		//System.out.println("Elements =" +li.get(5)); for getting index vaalue 
		
		for(Integer i:li)
		{
			System.out.println(i);
		}
		
		List<Integer>li2=new LinkedList<>();
		li2.add(11);
		li2.add(222);
		li2.add(3);
		li2.add(4);
		li2.add(5);
		for(Integer i2:li2)
		{
			System.out.println(i2);
		}
		
		List<Integer>li3=new Vector<>();
		li2.add(1);
		li2.add(2);
		li2.add(3);
		li2.add(4);
		li2.add(5);
		
		for(Integer i3:li3)
		{
			System.out.println(i3);
		}
		
		
		List<Integer>li4=new Stack<>();
		li4.add(1);
		li4.add(2);
		li4.add(3);
		li4.add(4);
		li4.add(5);
		li4.add(5);
		li4.add(5);
		
		for(Integer i4:li4)
		{
			System.out.println(i4);
		}
		
		
		
		
	}

}

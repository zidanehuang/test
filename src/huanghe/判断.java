package huanghe;

import java.util.Scanner;

public class 判断 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int Minor=36;
    int age;
    @SuppressWarnings("resource")
	Scanner in=new Scanner(System.in);
    age=in.nextInt();
    if(age>Minor)
    {System.out.println("你已经老了");
    }
    else 
    	System.out.println("你还年轻");
	}

}

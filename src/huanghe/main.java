package huanghe;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [][]qipan=new int[3][3];
		boolean result=false;
		//输入9个值
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				qipan[i][j]=in.nextInt();
			}
		}
		//System.out.println(qipan[0][0]);如何输出一个3*3方阵
		//判断行是否一致
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(qipan[i][j]==1)
				{
				result=true;
				System.out.print("有行一致"+result);
				break;
				}
			}
		}
		//判断列是否一致
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				if(qipan[i][j]==1)
				{
				result=true;
				System.out.print("有列一致"+result);
				break;
				}
			}
		}
		//判断对角线是否一致
		if(qipan[0][0]==1&qipan[2][2]==1&qipan[3][3]==1)
		{
			result=true;
			System.out.print("有对角线一致"+result);
		}
	}	
}

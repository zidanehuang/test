package huanghe;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [][]qipan=new int[3][3];
		boolean result=false;
		//����9��ֵ
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				qipan[i][j]=in.nextInt();
			}
		}
		//System.out.println(qipan[0][0]);������һ��3*3����
		//�ж����Ƿ�һ��
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(qipan[i][j]==1)
				{
				result=true;
				System.out.print("����һ��"+result);
				break;
				}
			}
		}
		//�ж����Ƿ�һ��
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				if(qipan[i][j]==1)
				{
				result=true;
				System.out.print("����һ��"+result);
				break;
				}
			}
		}
		//�ж϶Խ����Ƿ�һ��
		if(qipan[0][0]==1&qipan[2][2]==1&qipan[3][3]==1)
		{
			result=true;
			System.out.print("�жԽ���һ��"+result);
		}
	}	
}

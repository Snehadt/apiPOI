package com.qa.apache.poi;

public class example {

	public static void main(String[] args) {
		
		int a=3;
		boolean flag=false;
		// TODO Auto-generated method stub
				
				for(int i=1;i<=10;i++)
				{
					for (int j=1;j<=10;j++)
					{
						if(j==a)
						{
							System.out.println("inside" +j);
						//flag=true; 
						break;
						}
					}
					//if(flag)
					
					break;
				}

	}

}

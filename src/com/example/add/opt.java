package com.example.add;
import java.util.Stack;
public class opt
{
	public float Math(String str) throws Exception
	{ 
		String[] operater =new String[20]; 
		String[] number = new String[20]; 
		Stack countStack1 = new Stack(); 
		Stack countStack2 = new Stack(); 
		float result =0;
		float x=0;
		number = str.split("\\/|\\*|\\+|\\-"); 
		operater= str.split("\\d+");
		if(number.length<2)throw new Exception("请输入两位计算数以上!");
		for(int i = 0; i<number.length;i++)
		{
			try
			{
				x=Float.parseFloat(number[i]);
			}
			catch(NumberFormatException e)
			{
				throw new Exception("输入错误!请重新输入!");
			}
			if(operater[i].equals("/"))if(x==0)throw new Exception("除数不能为0!");
			countStack1.push(number[i]);
			if(i!=number.length-1)
			{
				if(operater[i+1]!=null)countStack1.push(operater[i+1]);
			}
		}
		while(!countStack1.isEmpty())countStack2.push(countStack1.pop());
		String op;
		while(!countStack2.isEmpty())
		{ 
			result=0;
			op=countStack2.pop().toString();
			if(op.equals("*"))
			{
				result=Float.parseFloat(countStack1.pop().toString())*Float.parseFloat(countStack2.pop().toString());
				if(number.length==2)return result;
				countStack1.push(result);
				continue;
			}
			if(op.equals("/"))
			{
				result=Float.parseFloat(countStack1.pop().toString())/Float.parseFloat(countStack2.pop().toString());
				if(number.length==2)return result;
				countStack1.push(result);
				continue;
			}
			countStack1.push(op);
		}
		while(!countStack1.isEmpty())countStack2.push(countStack1.pop());
		while(!countStack2.isEmpty())
		{
			result=0;
			op = countStack2.pop().toString();
			if(op.equals("+"))
			{
				result=Float.parseFloat(countStack1.pop().toString())+Float.parseFloat(countStack2.pop().toString());
				countStack1.push(result);
				continue;
			}
			if(op.equals("-"))
			{
				result=Float.parseFloat(countStack1.pop().toString())-Float.parseFloat(countStack2.pop().toString());
				countStack1.push(result);
				continue;
			}
			countStack1.push(op);
		}
		return result;
	}
}

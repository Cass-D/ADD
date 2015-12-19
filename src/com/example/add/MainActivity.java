package com.example.add;

import java.io.File;

import com.example.add.opt;
import com.example.add.R;

import java.text.DecimalFormat;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends Activity {
    	
    	MediaPlayer mp;
    	int x;//题目个数
    	int y=0;
    	int n;
    	int i=1;
    	char[] op = { '+', '-', '*', '/' };
    	int[] nov = new int[4];
    	int zf;//控制正负
    	int zz;//题型控制
    	String str = new String();
    	String str1 = new String();
    	int[] num1 = new int[5];
    	String s[] = new String[5];
    	int num2=0;
    	float[] anser=new float[5];//用户的答案
    	float[] trueanser=new float[5];//正确答案
    	File file;
    	int a=0;
    	int b=0;
    	int bb=0;
    	long begin=0,end=0,time=0;
    	String ss;
    	// int c = 0;
    	opt opt=new opt();;
    	EditText editText,xs;
    	StringBuffer text,text1;
    	String number_1="",number_2="";
    	boolean clicked=false;
    	byte style=0;
    	Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0;
    	Button start,btn_eq,btn_dot,btn_clear,btn_m1,btn_m2,btn_m3;
		private Button btn_dot1;
        /** Called when the activity is first created. */
        
        public void stop(){
			mp.reset();
			mp=MediaPlayer.create(this, R.raw.unity);
		}
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_main);
            text=new StringBuffer();
            editText=(EditText)findViewById(R.id.result);
            xs=(EditText)findViewById(R.id.xs);
    		mp=MediaPlayer.create(this, R.raw.unity);
            //editText.setFocusable(false);
            btn_1=(Button) findViewById(R.id.btn_1);
            btn_1.setOnClickListener(new Button.OnClickListener(){

    			public void onClick(View v) {
    				// TODO Auto-generated method stub
    				if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
    				text.append("7");
    				editText.setText(text.toString());
    				
    			}
            	
            });
            btn_2=(Button) findViewById(R.id.btn_2);
            btn_2.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("8");
            		editText.setText(text.toString());
            	}
            });
            btn_3=(Button) findViewById(R.id.btn_3);
            btn_3.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("9");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_4=(Button) findViewById(R.id.btn_4);
            btn_4.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("4");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_5=(Button) findViewById(R.id.btn_5);
            btn_5.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("5");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_6=(Button) findViewById(R.id.btn_6);
            btn_6.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("6");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_7=(Button) findViewById(R.id.btn_7);
            btn_7.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("1");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_8=(Button) findViewById(R.id.btn_8);
            btn_8.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("2");
            		editText.setText(text.toString());
            	}
            	
            });
            btn_9=(Button) findViewById(R.id.btn_9);
            btn_9.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("3");
            		editText.setText(text.toString());
            	}
            	
            });
           
            btn_0=(Button) findViewById(R.id.btn_0);
            btn_0.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("0");
            		editText.setText(text.toString());
            	}
            	
            });
            
            btn_dot=(Button) findViewById(R.id.btn_dot);
            btn_dot.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		if(editText.getText().toString().indexOf(".")==-1){//已经有.了
            			if(text.length()==0){
            				text.append("0.");
            			}else{
            				text.append(".");
            			}
            			editText.setText(text.toString());
            		}
            	}
            	
            });
            
            btn_dot1=(Button) findViewById(R.id.btn_10);
            btn_dot1.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		if(clicked){
    					editText.setText("");
    					clicked=false;
    					text.setLength(0);
    				}
            		text.append("-");
            		editText.setText(text.toString());
            	}
            	
            });
            
            btn_m1=(Button) findViewById(R.id.music1);
            btn_m1.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		mp.start();
            	}
            });
            
            btn_m2=(Button) findViewById(R.id.music2);
            btn_m2.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		stop();
            	}
            });

            btn_m3=(Button) findViewById(R.id.music3);
            btn_m3.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		mp.pause();
            	}
            });
            
            btn_eq=(Button) findViewById(R.id.btn_eq);
            btn_eq.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
        			if(b==1)
        			{
        				if(editText.getText().toString().length()!=0)
        				{
	        				try
	        				{
	        					x=Integer.parseInt(editText.getText().toString());
	        					if(x>=0 && x<=5)b++;
	        					else Toast.makeText(MainActivity.this, "输入有误", 1).show();
	        				}
	        				catch(NumberFormatException x)
	        				{
	        					Toast.makeText(MainActivity.this, "输入有误", 1).show();
	        				}
        				}
        				else Toast.makeText(MainActivity.this, "输入有误", 1).show();
        				editText.setText("");
                		number_1="";
                		number_2="";
                		style=0;
                		clicked=false;
                		text.setLength(0);
				begin=System.currentTimeMillis();
        			}
        			if(b==2)
        			{
        				if(n!=0)anser[i-2]=Float.parseFloat(editText.getText().toString());
        				str1="第"+i+"道题目为:";
        				n=(int)(Math.random() * 4 + 2);//随机出运算符的数量
        				zz=(int)(Math.random()*2);
        				for(int j=0;j<n;j++)
        				{
        					//zf=(int)(Math.random()*2);
        					//if(zf==0)//负
        					//	num1[j]=-(int)(Math.random()*100);//产生随机数
        					//else		//正
        						num1[j]=(int)(Math.random()*100);
        						if(zz==1)num1[j]=(int)(Math.random()*10+1);
        				}
        				for(int k=0;k<n-1;k++)
        				{
        					nov[k]=(int)(Math.random()*4);
        					if(nov[k]==3&&num1[k+1]==0)
        					{
        						do
        						{
        							num1[k+1]=(int)(Math.random()*100);
        						}while(num1[k+1]==0);
        					}
        				}
        				str="";
        				if(zz==0)
        				{
        					for(int j=0;j<n;j++)
        					{
        						//if(num1[j]<0)str=str+"("+String.valueOf(num1[j])+")";
        						str=str+String.valueOf(num1[j]);
        						if(j==n-1)
        						{
        							//try
        							//{
        								//int ii=0;
        								try{
        									trueanser[i-1]=opt.Math(str);
        									DecimalFormat df = new DecimalFormat("#.00");
        							        trueanser[i-1]=Float.parseFloat(df.format(trueanser[i-1]));
        								} catch (Exception e1) {
        									// TODO 自动生成的 catch 块
        									e1.printStackTrace();
        								}
        							//}
        							/*catch (Exception e1)
        							{
        								System.out.println(e1);
        								//e1.printStackTrace();
        							}*/
        							str=str+"=";
        							//str=str+String.valueOf(trueanser[i-1]);
        							xs.setText(str1+str);
        							break;
        						}
        						str=str+op[nov[j]];
        					}
        				}
        				if(zz==1)
        				{
        					trueanser[i-1]=1;
        					str=String.valueOf(num1[0])+"!=";
        					for(int j=1;j<=num1[0];j++)
        					trueanser[i-1]=trueanser[i-1]*j;
        					//str=str+String.valueOf(trueanser[i-1]);
        					xs.setText(str1+str);
        				}
        				if(i==x+1)
        				{
        					b=3;
        					anser[i-2]=Float.parseFloat(editText.getText().toString());
        				}
        				else i++;
        				editText.setText("");
                		number_1="";
                		number_2="";
                		style=0;
                		clicked=false;
                		text.setLength(0);
        			}
        			if(b==3)
        			{
        				ss="";
        				y=0;
        				for(int j=0;j<x;j++)
        				{
        					if(anser[j]==trueanser[j])y++;
        					ss=ss+(j+1)+"："+trueanser[j]+";\n";
        				}
        				end=System.currentTimeMillis();
        				time=(end-begin)/1000;
        				xs.setText("答题完成!答对"+y+"道!\n"+"用时："+time+"s  正确答案:");
        				editText.setSingleLine(false); 
        				editText.setHorizontallyScrolling(false); 
        				editText.setText(ss);
						
        				b=0;
                		number_1="";
                		number_2="";
                		style=0;
                		clicked=false;
                		text.setLength(0);
        			}
            	}
            });
            start=(Button) findViewById(R.id.start);
            start.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		xs.setText("请输入出题数量!(1-5)");
            		n=0;
        			i=1;
        			b=1;
            	}
            });
            btn_clear=(Button) findViewById(R.id.btn_clear);
            btn_clear.setOnClickListener(new Button.OnClickListener(){
            	
            	public void onClick(View v) {
            		// TODO Auto-generated method stub
            		editText.setText("");
            		number_1="";
            		number_2="";
            		style=0;
            		clicked=false;
            		text.setLength(0);
            	}
            });
        }
    }
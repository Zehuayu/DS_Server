package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * 文件读写的工具类
 * @author Administrator
 *
 */
public class FileWriteAndRead {
	/**
	 * mian方法
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	}
	/**
	 * 文件的读
	 * filePath 文件路径
	 * return String 返回读取内容
	 */
	public static String readFile(File file)
	{
		FileInputStream inputStream = null;//开始读取文件的输入流
		InputStreamReader Streamreader=null;//创建字节流
		BufferedReader reader=null;//创建字节缓冲流
		StringBuffer buffer=null;//字符流
	try {
		 inputStream = new FileInputStream(file);
		 Streamreader=new InputStreamReader(inputStream);
		 reader=new BufferedReader(Streamreader);
		 buffer=new StringBuffer();
		 String string="";
		while((string=reader.readLine())!=null)//读取文件的每一行
		{
			buffer.append(string+"\n");
		}
		
	 } 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {//关闭流
			reader.close();
			inputStream.close();
		    Streamreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return buffer.toString();//函数返回值
	}
	
	public static String readFileByPath(String filePath)
	{
		File file=new File(filePath);//获取磁盘文件
		FileInputStream inputStream = null;//开始读取文件的输入流
		InputStreamReader Streamreader=null;//创建字节流
		BufferedReader reader=null;//创建字节缓冲流
		StringBuffer buffer=null;//字符流
	try {
		 inputStream = new FileInputStream(file);
		 Streamreader=new InputStreamReader(inputStream);
		 reader=new BufferedReader(Streamreader);
		 buffer=new StringBuffer();
		 String string="";
		while((string=reader.readLine())!=null)//读取文件的每一行
		{
			buffer.append(string+"\n");
		}
		
	 } 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {//关闭流
			reader.close();
			inputStream.close();
		    Streamreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return buffer.toString();//函数返回值
	}
	/**
	 * 文件的写
	 * content 写入内容
	 * fileName 文件名称
	 * return boolean 返回真假
	 */
	public static boolean writerFileByLine(String content,String fileName)
	{
		//要写入的文件
		File file=new File(fileName);
		//写入的对象
		PrintWriter writer=null;
		boolean isSuccess=false;//判读是否写入成功
	 try {
		writer=new PrintWriter(file);
		writer.print(content);
		writer.flush();//刷新清除缓存
		isSuccess=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null)
			{
				try{
					writer.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		return isSuccess;
	}
	public static boolean writerFileByfile(String content,File file)
	{
		//要写入的文件
		//写入的对象
		PrintWriter writer=null;
		boolean isSuccess=false;//判读是否写入成功
	 try {
		writer=new PrintWriter(file);
		writer.print(content);
		writer.flush();//刷新清除缓存
		isSuccess=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null)
			{
				try{
					writer.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
		
		return isSuccess;
	}
}

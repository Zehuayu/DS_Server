package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
/**
 * �ļ���д�Ĺ�����
 * @author Administrator
 *
 */
public class FileWriteAndRead {
	/**
	 * mian����
	 * @param args
	 */
	public static void main(String[] args)
	{
		
	}
	/**
	 * �ļ��Ķ�
	 * filePath �ļ�·��
	 * return String ���ض�ȡ����
	 */
	public static String readFile(File file)
	{
		FileInputStream inputStream = null;//��ʼ��ȡ�ļ���������
		InputStreamReader Streamreader=null;//�����ֽ���
		BufferedReader reader=null;//�����ֽڻ�����
		StringBuffer buffer=null;//�ַ���
	try {
		 inputStream = new FileInputStream(file);
		 Streamreader=new InputStreamReader(inputStream);
		 reader=new BufferedReader(Streamreader);
		 buffer=new StringBuffer();
		 String string="";
		while((string=reader.readLine())!=null)//��ȡ�ļ���ÿһ��
		{
			buffer.append(string+"\n");
		}
		
	 } 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {//�ر���
			reader.close();
			inputStream.close();
		    Streamreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return buffer.toString();//��������ֵ
	}
	
	public static String readFileByPath(String filePath)
	{
		File file=new File(filePath);//��ȡ�����ļ�
		FileInputStream inputStream = null;//��ʼ��ȡ�ļ���������
		InputStreamReader Streamreader=null;//�����ֽ���
		BufferedReader reader=null;//�����ֽڻ�����
		StringBuffer buffer=null;//�ַ���
	try {
		 inputStream = new FileInputStream(file);
		 Streamreader=new InputStreamReader(inputStream);
		 reader=new BufferedReader(Streamreader);
		 buffer=new StringBuffer();
		 String string="";
		while((string=reader.readLine())!=null)//��ȡ�ļ���ÿһ��
		{
			buffer.append(string+"\n");
		}
		
	 } 
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try {//�ر���
			reader.close();
			inputStream.close();
		    Streamreader.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return buffer.toString();//��������ֵ
	}
	/**
	 * �ļ���д
	 * content д������
	 * fileName �ļ�����
	 * return boolean �������
	 */
	public static boolean writerFileByLine(String content,String fileName)
	{
		//Ҫд����ļ�
		File file=new File(fileName);
		//д��Ķ���
		PrintWriter writer=null;
		boolean isSuccess=false;//�ж��Ƿ�д��ɹ�
	 try {
		writer=new PrintWriter(file);
		writer.print(content);
		writer.flush();//ˢ���������
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
		//Ҫд����ļ�
		//д��Ķ���
		PrintWriter writer=null;
		boolean isSuccess=false;//�ж��Ƿ�д��ɹ�
	 try {
		writer=new PrintWriter(file);
		writer.print(content);
		writer.flush();//ˢ���������
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

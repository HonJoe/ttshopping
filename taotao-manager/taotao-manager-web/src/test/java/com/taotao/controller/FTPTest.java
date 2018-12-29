package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class FTPTest {
	
	public static void main(String[] args) throws IOException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.26.22",21);
		ftpClient.login("ftpuser", "123456a");
		ftpClient.enterLocalPassiveMode();
		FileInputStream inputStream=new FileInputStream(new File("E:\\picture\\0.jpg"));
//		FileInputStream inputStream = new FileInputStream(new File("‪‪E:\\picture\\0.jpg"));
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("hello.jpg", inputStream);
		inputStream.close();
		
		ftpClient.logout();
	}

}

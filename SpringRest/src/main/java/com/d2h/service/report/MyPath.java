package com.d2h.service.report;

import java.io.File;

public class MyPath {
	 
	  public static void main(String[] args) throws Exception {
		  String basePath = new File("").getAbsolutePath();
		    System.out.println(basePath);

		    String path = new File(basePath+"\\src\\main\\java\\com\\d2h\\service\\report\\email_html.vm").getAbsolutePath();
		    System.out.println(path);
	 
	  }
	}
package com.chetan.sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisWithOracle {

	public static void main(String[] args) {
	
		
		try {
			InputStream inputStream = new FileInputStream(new File("E:\\mybatisConfig.xml"));
			SqlSessionFactory sqlSessionFactory =
					  new SqlSessionFactoryBuilder().build(inputStream);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}

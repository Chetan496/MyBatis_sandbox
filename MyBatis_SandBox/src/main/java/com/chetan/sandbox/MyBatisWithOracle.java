package com.chetan.sandbox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisWithOracle {

	public static void main(String[] args) {

		try {
			InputStream inputStream = new FileInputStream(new File("E:\\mybatisConfig.xml"));
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session = sqlSessionFactory.openSession();

			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			//Employee employee = mapper.selectEmployee(2);

			List<Employee> allEmployees = mapper.selectAllEmployees();
			
			
			for(Employee employee1: allEmployees) {
				System.out.println(employee1);
			}

			session.close();

			//System.out.println(employee);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

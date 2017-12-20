package com.chetan.sandbox;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;


public interface EmployeeMapper {

	@Results({
        @Result(property = "id", column = "ID"),
        @Result(property = "firstName", column = "FIRSTNAME"),
        @Result(property = "lastName", column = "LASTNAME")
      })
	
	
	@Select("SELECT ID, FIRSTNAME, LASTNAME FROM EMPLOYEE WHERE id = #{id} ")
	Employee selectEmployee(int id);
	
	@Insert("INSERT into Employee( FIRSTNAME, LASTNAME ) VALUES(#{FIRSTNAME}, #{LASTNAME})")
	void insertEmployee(Employee emp);
	
	@Update("UPDATE Employee SET FIRSTNAME=#{FIRSTNAMETOSET}, LASTNAME =#{LASTNAMETOSET} WHERE id = #{id}")
	void updateEmployee(Employee emp);
	
	@Delete("DELETE FROM Employee WHERE ID =#{id}")
	void deleteEmployee(int id);
	
	@Select("SELECT ID, FIRSTNAME, LASTNAME FROM EMPLOYEE ")
	List<Employee> selectAllEmployees();
	
	
}

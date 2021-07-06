package mapper;

import pojo.Student;
import java.util.List;

public interface StudentMapper {
	
	// 【多对一】方法一： 按查询嵌套处理
	List<Student> getStudent();
	
	// 【多对一】方法二：按结果嵌套处理
	List<Student> getStudent2();
	
	
	
}

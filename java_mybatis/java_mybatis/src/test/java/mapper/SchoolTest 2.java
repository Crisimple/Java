package mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Student;
import util.MyBatisUtil;

import java.util.List;

/**
 * @Author sf
 * @File SchoolTest
 * @Time 2021-04-08 20:43
 * @Description
 */
public class SchoolTest {
	
	// 多对一【方法一：按查询嵌套处理】
	@Test
	public void getStudentTest(){
		
		SqlSession sqlSession = MyBatisUtil.getSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		
		List<Student> students = studentMapper.getStudent();
		for (Student student : students) {
			//System.out.println("学生名：" + student.getName() + "老师名：" + student.getTeacher().getName());
			System.out.println("test");
		}
				
	}
}

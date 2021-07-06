package pojo;

/**
 * @Author sf
 * @File Student
 * @Time 2021-04-08 17:50
 * @Description
 */
public class Student {
	
	private int id;
	private String student_name;
	
	//多个学生可以是同一个老师，即多对一
   private Teacher teacher;
}

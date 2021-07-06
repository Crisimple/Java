import java.util.Scanner;

public class ProcessChoose {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("if单选泽请输入");
	String s = scanner.nextLine();
	System.out.println("if双选择请输入");
	int score = scanner.nextInt();
	
	/*
	 * if 选择结构
	 */
	// if 单选择结构
	if(s.equals("Hello")) {
		System.out.println(s);
	}
	System.out.println("End");
	
	// if 双选择结构
	if(score >= 60) {
		System.out.println("成绩及格了");
	} else {
		System.out.println("成绩不及格");
	}
	System.out.println("End");
	
	// if 多选择结构
	if(score < 60) {
		System.out.println("不及格");
	} else if(60 <= score && score < 70) {
		System.out.println("及格");
	} else if(70 <= score && score < 90) {
		System.out.println("良好");
	} else if(90 <= score && score <= 100) {
		System.out.println("优秀");
	} else {
		System.out.println("输入成绩不正确");
	}
	scanner.close();
	
	/*
	 * switch 多分支选择，JDK7 以后支持字符串的比较
	 * */
	switch (score) {
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
			System.out.println("良好");
			break;
		case 'C':
			System.out.println("及格");
			break;
		case 'D':
			System.out.println("再接再厉");
			break;
		default:
			System.out.println("默认输出");
	}
}
}

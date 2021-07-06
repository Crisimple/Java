package mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.Blog;
import util.IDUtil;
import util.MyBatisUtil;

import java.util.Date;

/**
 * @Author sf
 * @File BlogTest
 * @Time 2021-04-09 10:32
 * @Description
 */
public class BlogTest {
	
	// 添加一篇博客测试
	@Test
	public void addBlogTest(){
		
		SqlSession sqlSession = MyBatisUtil.getSession();
		BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
		
		Blog blog = new Blog();
		blog.setId(IDUtil.getId());
		blog.setTitle("MyBatis真的好用");
		blog.setAuthor("小菜鸟");
		blog.setCreateTime(new Date());
		blog.setViews(99999);
		blogMapper.addBlog(blog);
		
		blog.setId(IDUtil.getId());
		blog.setTitle("Java如此简单");
		blogMapper.addBlog(blog);
		
		blog.setId(IDUtil.getId());
		blog.setTitle("Spring如此简单");
		blogMapper.addBlog(blog);
		
		blog.setId(IDUtil.getId());
		blog.setTitle("学习如此有趣");
		blogMapper.addBlog(blog);
		
		// 关闭Session流
		sqlSession.close();
	}
}

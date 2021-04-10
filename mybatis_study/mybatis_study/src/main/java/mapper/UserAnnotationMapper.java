package mapper;

import org.apache.ibatis.annotations.*;
import pojo.User;

import java.util.List;

/**
 * @Author sf
 * @File UserAnnotationMapper
 * @Time 2021-04-07 20:03
 * @Description MyBatis使用注解开发
 */
public interface UserAnnotationMapper {
	
	// 查询全部用户
	@Select("select id, username, password from user")
	public List<User> selectAllUser();

	// 根据id查询用户
	@Select("select * from user where id = #{id}")
	User selectUserById(@Param("id")int id);


	// 新增用户
	@Insert("insert into user(id, username, password) values(#{id}, #{username}, #{password})")
	int addUser(User user);


	// 修改用户
	@Update("update user set username=#{username}, password=#{password} where id=#{id}")
	int updateUser(User user);


	// 删除用户
	@Delete("delete from user where id=#{id}")
	int deleteUser(@Param("id")int id);
}

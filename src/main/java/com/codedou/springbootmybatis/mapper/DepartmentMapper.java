package com.codedou.springbootmybatis.mapper;

import com.codedou.springbootmybatis.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select({"select * from department where id = #{id}"})
    public Department getDeptById(Integer id);

    @Delete({"delete from department where id = #{id}"})
    public int deleDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert({"insert into department(department_name) values(#{departmentName})"})
    public int insertDept(Department department);

    @Update({"update department set departName = #{department_name} where id = #{id}"})
    public int UpdateDept(Department department);
}

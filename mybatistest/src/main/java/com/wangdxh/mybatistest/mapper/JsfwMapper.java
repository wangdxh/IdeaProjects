package com.wangdxh.mybatistest.mapper;

import com.wangdxh.mybatistest.bean.Jsfw;
import org.apache.ibatis.annotations.*;

@Mapper
public interface JsfwMapper {
    @Select("select * from tblJSFW where id = #{id}")
    public Jsfw getJsfwBy(Integer id);


    @Delete("delete from tblJSFW where  id = #{id}")
    public int deleteJsfwByid(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into tblJSFW(fwname) values(#{fwname})")
    public int insertJsfw(Jsfw jsfw);

    @Update("update tblJSFW set fwname = #{fwname} where id=#{id}")
    public int updateJsfw(Jsfw jsfw);
}

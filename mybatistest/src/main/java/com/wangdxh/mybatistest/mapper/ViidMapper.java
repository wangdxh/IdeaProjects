package com.wangdxh.mybatistest.mapper;

import com.wangdxh.mybatistest.bean.Viid;

// 已经在main类中使用了 mapperscan
public interface ViidMapper {

    public Viid getViidById(Integer id);

    public void insertViid(Viid data);
}

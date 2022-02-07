package com.larkmidtable.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.larkmidtable.admin.entity.APIAuth;
import com.larkmidtable.admin.entity.APIConfig;
import com.larkmidtable.admin.entity.DevEnvSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface APIConfigMapper extends BaseMapper<APIConfig>{

	int delete(@Param("id") int id);

	List<APIConfig> findAll();

	int save(APIConfig apiConfig);

	int update(APIConfig project);

	APIConfig getById(int id);
}
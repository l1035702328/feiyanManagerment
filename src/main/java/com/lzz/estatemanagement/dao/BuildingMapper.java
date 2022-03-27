package com.lzz.estatemanagement.dao;

import com.lzz.estatemanagement.domain.Building;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BuildingMapper extends Mapper<Building> {
}

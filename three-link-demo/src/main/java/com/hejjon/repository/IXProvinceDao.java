package com.hejjon.repository;

import com.hejjon.entity.XProvince;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IXProvinceDao extends JpaSpecificationExecutor<XProvince>, JpaRepository<XProvince, String> {




}

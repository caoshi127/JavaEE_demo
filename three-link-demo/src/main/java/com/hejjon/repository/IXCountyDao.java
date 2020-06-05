package com.hejjon.repository;

import com.hejjon.entity.XCounty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface IXCountyDao extends JpaSpecificationExecutor<XCounty>, JpaRepository<XCounty, String> {

    List<XCounty> findBycId(String cid);

}

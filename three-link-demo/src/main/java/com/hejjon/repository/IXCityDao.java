package com.hejjon.repository;

import com.hejjon.entity.XCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IXCityDao extends JpaSpecificationExecutor<XCity>, JpaRepository<XCity, String> {

    @Query("from XCity c where c.pId = ?1")
    List<XCity> searchByPid(String pid);


}

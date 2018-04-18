package com.test.dao;

import com.test.entity.Company;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> ,JpaSpecificationExecutor{

    List<Company> findByNameLike(String nane);

    List<Company> findByNameLikeIgnoreCase(String nane);

    Page<Company> findByNameLike(String name,Pageable pageable);
}

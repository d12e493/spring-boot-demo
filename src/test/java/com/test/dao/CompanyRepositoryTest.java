package com.test.dao;

import com.test.util.LogUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CompanyRepositoryTest {

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    @Ignore
    public void testGetCompany(){
        Object c = companyRepository.findAll();
        System.out.println(c);
    }

    @Test
    public void testRepository() throws Exception{

        final String companyName = "%co%";

        List list;
        Page page;

        list = companyRepository.findByNameLike(companyName);
        LogUtils.debug("List findByNameLike",list);

        list = companyRepository.findByNameLikeIgnoreCase(companyName);
        LogUtils.debug("List findByNameLikeIgnoreCase",list);

        Sort sort = new Sort(Sort.Direction.DESC, "name");
        Pageable pageable = PageRequest.of(1, 10, sort);
        page = companyRepository.findByNameLike(companyName,pageable);
        LogUtils.debug("Page findByNameLike",page);
    }
}

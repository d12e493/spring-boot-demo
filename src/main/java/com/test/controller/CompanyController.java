package com.test.controller;

import com.test.bo.Response;
import com.test.dao.CompanyRepository;
import com.test.entity.Company;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
@RequestMapping("/company")
@Slf4j
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @RequestMapping(path = "{id}",method = RequestMethod.POST)
    public Response<Company> getById(@PathVariable("id") long id){
        Optional<Company> c = companyRepository.findById(id);

        if(c.isPresent()){
            return Response.successResponse(c.get());
        }

        return Response.emptyResponse();
    }

}

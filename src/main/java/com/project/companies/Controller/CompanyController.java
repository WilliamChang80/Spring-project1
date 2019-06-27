package com.project.companies.Controller;

import com.project.companies.DTO.Model.Company.CompanyCreateDTO;
import com.project.companies.DTO.Model.Company.CompanyDeleteDTO;
import com.project.companies.DTO.Model.Company.CompanyUpdateDTO;
import com.project.companies.DTO.Model.Company.CompanyViewDTO;
import com.project.companies.Model.Company;
import com.project.companies.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CompanyController
{
    @Autowired
    CompanyService companyService;

    @RequestMapping(value="home")
    public List <CompanyViewDTO> getAllCompanies()
    {
        return companyService.GetAllCompanies();
    }

    @RequestMapping(method = RequestMethod.POST,value="/add")
    public CompanyCreateDTO addCompany(@RequestBody Company company)
    {
        return companyService.createCompany(company);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/edit")
    public CompanyUpdateDTO editCompany(@RequestBody Company company)
    {
        return companyService.updateCompany(company);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="{id}/delete")
    public CompanyDeleteDTO deleteCompany(@PathVariable long id, Company company)
    {
        return companyService.deleteCompany(id,company);
    }
}

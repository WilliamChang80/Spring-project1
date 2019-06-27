package com.project.companies.Service;

import com.project.companies.DTO.Model.Company.CompanyCreateDTO;
import com.project.companies.DTO.Model.Company.CompanyDeleteDTO;
import com.project.companies.DTO.Model.Company.CompanyUpdateDTO;
import com.project.companies.DTO.Model.Company.CompanyViewDTO;
import com.project.companies.Model.Company;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CompanyService
{
    public List <CompanyViewDTO> GetAllCompanies();

    public CompanyCreateDTO createCompany(Company company);

    public CompanyUpdateDTO updateCompany(Company company);

    public CompanyDeleteDTO deleteCompany(long id, Company company);
}

package com.project.companies.DTO.Mapper;

import com.project.companies.DTO.Model.Company.CompanyDeleteDTO;
import com.project.companies.DTO.Model.Company.CompanyUpdateDTO;
import com.project.companies.Model.Company;

public class CompanyDeleteMapper
{
    public static CompanyDeleteDTO convertEntityDTO(Company company)
    {
        return new CompanyDeleteDTO(company.getId(),company.getName(),company.getPhoneNumber(),company.getAddress());
    }
}

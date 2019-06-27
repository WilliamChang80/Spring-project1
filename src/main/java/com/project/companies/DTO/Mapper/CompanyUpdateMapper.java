package com.project.companies.DTO.Mapper;

import com.project.companies.DTO.Model.Company.CompanyUpdateDTO;
import com.project.companies.Model.Company;

public class CompanyUpdateMapper
{
    public static CompanyUpdateDTO convertEntityDTO(Company company)
    {
        return new CompanyUpdateDTO(company.getId(),company.getName(),company.getAddress(),company.getPhoneNumber());
    }
}

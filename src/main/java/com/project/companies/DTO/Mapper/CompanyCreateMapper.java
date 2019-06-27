package com.project.companies.DTO.Mapper;

import com.project.companies.DTO.Model.Company.CompanyCreateDTO;
import com.project.companies.Model.Company;

public class CompanyCreateMapper
{
    public static CompanyCreateDTO convertEntityDTO(Company company)
    {
        return new CompanyCreateDTO(company.getId(),company.getName(),company.getAddress(),company.getPhoneNumber());
    }
}

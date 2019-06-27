package com.project.companies.Service.Impl;

import com.project.companies.DTO.Mapper.CompanyCreateMapper;
import com.project.companies.DTO.Mapper.CompanyDeleteMapper;
import com.project.companies.DTO.Mapper.CompanyUpdateMapper;
import com.project.companies.DTO.Mapper.CompanyViewMapper;
import com.project.companies.DTO.Model.Company.CompanyCreateDTO;
import com.project.companies.DTO.Model.Company.CompanyDeleteDTO;
import com.project.companies.DTO.Model.Company.CompanyUpdateDTO;
import com.project.companies.DTO.Model.Company.CompanyViewDTO;
import com.project.companies.Model.Company;
import com.project.companies.Repository.CompanyRepository;
import com.project.companies.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Vector;

@Service
public class CompanyServiceImpl implements CompanyService
{
    @Autowired
    CompanyRepository companyRepository;

    @Override
    public Vector<CompanyViewDTO> GetAllCompanies()
    {
        List <Company> temp=companyRepository.findAll();
        return CompanyViewMapper.convertEntityDTO(temp);
    }

    @Override
    public CompanyCreateDTO createCompany(Company company)
    {
        companyRepository.save(company);
        return CompanyCreateMapper.convertEntityDTO(company);
    }

    @Override
    public CompanyUpdateDTO updateCompany(Company company)
    {
        Company temp=companyRepository.findById(company.getId());
        if(temp==null)
        {
            return null;
        }
        temp.setAddress(company.getAddress());
        temp.setName(company.getName());
        temp.setPhoneNumber(company.getAddress());
        companyRepository.save(temp);
        return CompanyUpdateMapper.convertEntityDTO(company);
    }

    @Override
    public CompanyDeleteDTO deleteCompany(long id, Company company)
    {
        company=companyRepository.findById(id);
        companyRepository.deleteById(id);
        return CompanyDeleteMapper.convertEntityDTO(company);
    }

}

package com.project.companies.DTO.Mapper;

import com.project.companies.DTO.Model.Company.CompanyViewDTO;
import com.project.companies.Model.Company;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Vector;

public class CompanyViewMapper
{
    public static Vector <CompanyViewDTO> convertEntityDTO(List <Company> companies)
    {
        Vector <CompanyViewDTO> temp= new Vector<>();
        for(int i=0;i<companies.size();i++)
        {
            temp.add(new CompanyViewDTO(companies.get(i).getName(),companies.get(i).getAddress(),companies.get(i).getPhoneNumber()));
        }
        return temp;
    }
}

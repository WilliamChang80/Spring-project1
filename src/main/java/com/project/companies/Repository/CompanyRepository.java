package com.project.companies.Repository;

import com.project.companies.DTO.Model.Company.CompanyViewDTO;
import com.project.companies.Model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Vector;

@Repository
public interface CompanyRepository extends JpaRepository <Company,Long>
{
    @Override
    Vector<Company> findAll();

    Company findById(long id);
}

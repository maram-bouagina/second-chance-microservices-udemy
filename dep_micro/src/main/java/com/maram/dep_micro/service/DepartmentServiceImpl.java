package com.maram.dep_micro.service;



import com.maram.dep_micro.dto.DepartmentDto;
import com.maram.dep_micro.entities.Department;
import com.maram.dep_micro.repos.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department dep = departmentRepository.findByDepCode(code);
        DepartmentDto departmentDto = new DepartmentDto(
                dep.getId(),
                dep.getDepName(),
                dep.getDepCode()
        );
        return departmentDto;
    }
}
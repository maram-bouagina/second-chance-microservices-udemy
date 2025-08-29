package com.maram.dep_micro.service;

import com.maram.dep_micro.dto.DepartmentDto;

public interface DepartmentService {
    DepartmentDto getDepartmentByCode(String code);
}
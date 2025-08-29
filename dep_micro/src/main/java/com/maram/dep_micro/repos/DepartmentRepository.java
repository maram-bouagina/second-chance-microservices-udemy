package com.maram.dep_micro.repos;



import com.maram.dep_micro.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
    Department findByDepCode(String code);
}

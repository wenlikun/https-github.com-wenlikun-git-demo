package com.wlk.demo.test;

import com.wlk.demo.pojo.Department;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WlkTest {


    public static void main(String[] args) {
        Map departments = new HashMap<>();
        departments.put(101, new Department(101, "D-AA"));
        departments.put(102, new Department(102, "D-BB"));
        departments.put(103, new Department(103, "D-CC"));
        departments.put(104, new Department(104, "D-DD"));
        departments.put(105, new Department(105, "D-EE"));
        Collection values = departments.values();
        // [Department(id=101, departmentName=D-AA), Department(id=102, departmentName=D-BB), Department(id=103, departmentName=D-CC), Department(id=104, departmentName=D-DD), Department(id=105, departmentName=D-EE)]
        System.out.println(values);

    }



}

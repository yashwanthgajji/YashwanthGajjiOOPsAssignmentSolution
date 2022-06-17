package com.yashwanthgajji.greatlearning;

import com.yashwanthgajji.greatlearning.departments.AdminDepartment;
import com.yashwanthgajji.greatlearning.departments.HrDepartment;
import com.yashwanthgajji.greatlearning.departments.TechDepartment;

public class Main {

    public static void main(String[] args) {
        AdminDepartment adminDepartment = new AdminDepartment();
        HrDepartment hrDepartment = new HrDepartment();
        TechDepartment techDepartment = new TechDepartment();

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Welcome to ").append(adminDepartment.departmentName()).append("\n");
        stringBuilder.append(adminDepartment.getTodaysWork()).append("\n");
        stringBuilder.append(adminDepartment.getWorkDeadline()).append("\n");
        stringBuilder.append(adminDepartment.isHolidayAToday()).append("\n");
        stringBuilder.append("\n");

        stringBuilder.append("Welcome to ").append(hrDepartment.departmentName()).append("\n");
        stringBuilder.append(hrDepartment.doActivity()).append("\n");
        stringBuilder.append(hrDepartment.getTodaysWork()).append("\n");
        stringBuilder.append(hrDepartment.getWorkDeadline()).append("\n");
        stringBuilder.append(hrDepartment.isHolidayAToday()).append("\n");
        stringBuilder.append("\n");

        stringBuilder.append("Welcome to ").append(techDepartment.departmentName()).append("\n");
        stringBuilder.append(techDepartment.getTodaysWork()).append("\n");
        stringBuilder.append(techDepartment.getWorkDeadline()).append("\n");
        stringBuilder.append(techDepartment.getTechStackInformation()).append("\n");
        stringBuilder.append(techDepartment.isHolidayAToday()).append("\n");

        System.out.print(stringBuilder);
    }
}

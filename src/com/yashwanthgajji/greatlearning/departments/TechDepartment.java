package com.yashwanthgajji.greatlearning.departments;

public class TechDepartment extends SuperDepartment{

    protected String departmentName = "Tech Department";

    public String departmentName() {
        return departmentName;
    }

    public String getTodaysWork() {
        return "Complete coding of module 1";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String getTechStackInformation() {
        return "Core Java";
    }
}

package com.yashwanthgajji.greatlearning.departments;

public class AdminDepartment extends SuperDepartment{

    protected String departmentName = "Admin Department";

    public String departmentName() {
        return departmentName;
    }

    public String getTodaysWork() {
        return "Complete your documents Submission";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}

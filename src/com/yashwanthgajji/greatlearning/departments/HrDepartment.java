package com.yashwanthgajji.greatlearning.departments;

public class HrDepartment extends SuperDepartment{

    protected String departmentName = "Hr Department";

    public String departmentName() {
        return departmentName;
    }

    public String getTodaysWork() {
        return "Fill today’s worksheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "team Lunch";
    }
}

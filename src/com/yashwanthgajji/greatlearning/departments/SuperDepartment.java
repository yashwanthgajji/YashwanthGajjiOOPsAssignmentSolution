package com.yashwanthgajji.greatlearning.departments;
import java.lang.*;

public class SuperDepartment {

    protected String departmentName = "Super Department";

    public String departmentName() {
        return departmentName;
    }

    public String getTodaysWork() {
        return "No Work as of now";
    }

    public String getWorkDeadline() {
        return "Nil";
    }

    public String isHolidayAToday() {
        return "Today is not a holiday";
    }
}

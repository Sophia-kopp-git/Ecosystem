package org.example;

public enum DaysOfWeek {
    MONDAY("Monday", true),
    TUESDAY("Tuesday", true),
    WEDNESDAY("Wednesday", true),
    THURSDAY("Thursday", true),
    FRIDAY("Friday", true),
    SATURDAY("Saturday", false),
    SUNDAY("Sunday", false);

    private String value;
    private boolean workday;

    DaysOfWeek(String value, Boolean workday) {
    this.value = value;
    this.workday = workday;
    }

    public String getValue() {
        return value;
    }

    public boolean isWorkday() {
        return workday;
    }
    public String typeOfWeek(DaysOfWeek dayOfWeek){
        if(dayOfWeek.isWorkday()){
            return dayOfWeek.value;
        } else{
            return "Weekend";
        }
    }
}

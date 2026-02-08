package com.gov.internship.model;

public class Internship {

    private int internshipId;
    private String internName;
    private String emailId;
    private String department;
    private int durationMonths;

    public Internship(int internshipId, String internName,
                      String emailId, String department,
                      int durationMonths) {
        this.internshipId = internshipId;
        this.internName = internName;
        this.emailId = emailId;
        this.department = department;
        this.durationMonths = durationMonths;
    }

    public int getInternshipId() { return internshipId; }
    public String getInternName() { return internName; }
    public String getEmailId() { return emailId; }
    public String getDepartment() { return department; }
    public int getDurationMonths() { return durationMonths; }
}

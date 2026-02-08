package com.gov.internship.main;

import com.gov.internship.model.Internship;
import com.gov.internship.service.InternshipService;

public class InternshipCrudApp {

    public static void main(String[] args) {

        InternshipService service = new InternshipService();

        // INSERT
        service.insert(new Internship(1, "Sai Koushil", "saikoushilnam@gmail.com", "IT", 6));
        service.insert(new Internship(2, "Ananya", "ananya@gmail.com", "AI Dept", 5));
        service.insert(new Internship(3, "Rahul", "rahul@gmail.com", "MeitY", 3));

        // FETCH
        System.out.println("\n--- Internship Records ---");
        service.fetchAll().forEach(i ->
            System.out.println(
                i.getInternshipId()+" | "+
                i.getInternName()+" | "+
                i.getEmailId()+" | "+
                i.getDepartment()+" | "+
                i.getDurationMonths()
            )
        );

        // UPDATE
        service.update(new Internship(
            2, "Ananya Sharma", "ananya.sharma@gmail.com", "AI Dept", 6
        ));

        // DELETE
        service.delete(3);

        System.out.println("\n✅ CRUD Operations Completed");
    }
}

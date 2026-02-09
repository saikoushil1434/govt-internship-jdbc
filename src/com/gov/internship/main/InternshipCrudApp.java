package com.gov.internship.main;

import com.gov.internship.model.Internship;
import com.gov.internship.service.InternshipService;

public class InternshipCrudApp {

    public static void main(String[] args) {

        InternshipService service = new InternshipService();

        // INSERT
        service.insert(new Internship("Sai Koushil", "saikoushil@gmail.com", "IT", 6));
        service.insert(new Internship("Ananya", "ananya@gmail.com", "AI", 5));
        service.insert(new Internship("Rahul", "rahul@gmail.com", "Meity", 3));

        // FETCH
        service.fetchAll();

        // UPDATE (ID = 2)
        Internship updated = new Internship(
                "Ananya",
                "ananya_updated@gmail.com",
                "AI",
                6
        );
        updated.setInternshipId(2);
        service.update(updated);

        // DELETE (ID = 3)
        service.delete(3);

        System.out.println("\n✅ CRUD Operations Completed");
    }
}

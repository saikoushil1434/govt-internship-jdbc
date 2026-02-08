package com.gov.internship.dao;

import java.util.List;
import com.gov.internship.model.Internship;

public interface InternshipDao {

    void insertInternship(Internship internship);
    List<Internship> fetchAllInternships();
    void updateInternship(Internship internship);
    void deleteInternship(int internshipId);
}

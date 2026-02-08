package com.gov.internship.service;

import java.util.List;
import com.gov.internship.dao.*;
import com.gov.internship.model.Internship;

public class InternshipService {

    private InternshipDao dao = new InternshipDaoImpl();

    public void insert(Internship i) { dao.insertInternship(i); }
    public List<Internship> fetchAll() { return dao.fetchAllInternships(); }
    public void update(Internship i) { dao.updateInternship(i); }
    public void delete(int id) { dao.deleteInternship(id); }
}

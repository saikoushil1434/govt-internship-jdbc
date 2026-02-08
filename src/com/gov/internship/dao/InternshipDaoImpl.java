package com.gov.internship.dao;

import java.sql.*;
import java.util.*;
import com.gov.internship.model.Internship;
import com.gov.internship.util.DBConnection;

public class InternshipDaoImpl implements InternshipDao {

    // INSERT
    public void insertInternship(Internship i) {
        String sql = "INSERT INTO internship VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, i.getInternshipId());
            ps.setString(2, i.getInternName());
            ps.setString(3, i.getEmailId());
            ps.setString(4, i.getDepartment());
            ps.setInt(5, i.getDurationMonths());

            ps.executeUpdate();
            System.out.println("Inserted intern: " + i.getInternName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // FETCH
    public List<Internship> fetchAllInternships() {
        List<Internship> list = new ArrayList<>();
        String sql = "SELECT * FROM internship";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Internship(
                    rs.getInt("internship_id"),
                    rs.getString("intern_name"),
                    rs.getString("email_id"),
                    rs.getString("department"),
                    rs.getInt("duration_months")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // UPDATE
    public void updateInternship(Internship i) {
        String sql =
          "UPDATE internship SET intern_name=?, email_id=?, department=?, duration_months=? WHERE internship_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, i.getInternName());
            ps.setString(2, i.getEmailId());
            ps.setString(3, i.getDepartment());
            ps.setInt(4, i.getDurationMonths());
            ps.setInt(5, i.getInternshipId());

            ps.executeUpdate();
            System.out.println("Updated internship ID: " + i.getInternshipId());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteInternship(int internshipId) {
        String sql = "DELETE FROM internship WHERE internship_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, internshipId);
            ps.executeUpdate();
            System.out.println("Deleted internship ID: " + internshipId);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

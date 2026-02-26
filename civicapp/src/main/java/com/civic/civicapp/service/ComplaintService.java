package com.civic.civicapp.service;



import java.util.List;

import com.civic.civicapp.model.Complaint;
import com.civic.civicapp.model.ComplaintStatus;

public interface ComplaintService {

    Complaint createComplaint(Complaint complaint, Long citizenId);

    Complaint getComplaintById(Long id);

    List<Complaint> getAllComplaints();

    Complaint updateComplaintStatus(Long id, ComplaintStatus status);

    void deleteComplaint(Long id);
}
package com.civic.civicapp.controller;

import java.util.List;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.civic.civicapp.model.Complaint;
import com.civic.civicapp.model.ComplaintStatus;
import com.civic.civicapp.service.ComplaintService;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    // ✅ Create Complaint
    @PostMapping
    public Complaint createComplaint(@Valid @RequestBody Complaint complaint,
            @RequestParam Long citizenId) {
        return complaintService.createComplaint(complaint, citizenId);
    }

    // ✅ Get Complaint by ID
    @GetMapping("/{id}")
    public Complaint getComplaint(@PathVariable Long id) {
        return complaintService.getComplaintById(id);
    }

    // ✅ Get All Complaints
    @GetMapping
    public List<Complaint> getAllComplaints() {
        return complaintService.getAllComplaints();
    }

    // ✅ Update Complaint Status
    @PutMapping("/{id}/status")
    public Complaint updateStatus(@PathVariable Long id,
                                  @RequestParam ComplaintStatus status) {
        return complaintService.updateComplaintStatus(id, status);
    }

    // ✅ Delete Complaint
    @DeleteMapping("/{id}")
    public void deleteComplaint(@PathVariable Long id) {
        complaintService.deleteComplaint(id);
    }
}
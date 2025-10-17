package in.crm.Lead.Service.services;

import in.crm.Lead.Service.entities.CRM_Lead;
import in.crm.Lead.Service.exceptions.ResourceNotFoundException;
import in.crm.Lead.Service.repositories.CRM_LeadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRM_LeadServiceImp implements CRM_LeadService {

    @Autowired
    private CRM_LeadRepo crmLeadRepo;

    @Override
    public CRM_Lead createCRM_Lead(CRM_Lead crmLead) {
        return crmLeadRepo.save(crmLead);
    }

    @Override
    public List<CRM_Lead> getAllCRM_Leads() {
        return crmLeadRepo.findAll();
    }

    @Override
    public CRM_Lead findCRM_LeadById(String id) {
        CRM_Lead crmLead = crmLeadRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Lead with id " + id + " not found"));
        return crmLead;
    }

    @Override
    public CRM_Lead updateCRM_Lead(String id, CRM_Lead crmLead) {
        CRM_Lead oldLead = crmLeadRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Lead with id " + id + " not found"));

        oldLead.setLeadName(crmLead.getLeadName());
        oldLead.setEmail(crmLead.getEmail());
        oldLead.setContact(crmLead.getContact());
        oldLead.setScore(crmLead.getScore());
        oldLead.setSource(oldLead.getSource());
        oldLead.setStatus(oldLead.getStatus());
        oldLead.setAssignedTo(crmLead.getAssignedTo());
        return crmLeadRepo.save(oldLead);
    }

    @Override
    public void deleteCRM_Lead(String id) {
        crmLeadRepo.deleteById(id);
    }
}

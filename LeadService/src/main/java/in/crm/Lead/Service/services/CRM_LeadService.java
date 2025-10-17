package in.crm.Lead.Service.services;

import in.crm.Lead.Service.entities.CRM_Lead;

import java.util.List;

public interface CRM_LeadService {
    //create data
    CRM_Lead createCRM_Lead(CRM_Lead crmLead);

    //get data
    List<CRM_Lead> getAllCRM_Leads();
    CRM_Lead findCRM_LeadById(String id);

    //CRM_Lead findCRM_LeadByLeadName(String leadName);
    //CRM_Lead findCRM_LeadByContact(String contact);

    //update
    CRM_Lead updateCRM_Lead(String id, CRM_Lead crmLead);

    //delete
    void deleteCRM_Lead(String id);

}

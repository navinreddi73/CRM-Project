package in.crm.Lead.Service.controllers;

import in.crm.Lead.Service.entities.CRM_Lead;
import in.crm.Lead.Service.services.CRM_LeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crmleads")
public class CRM_LeadController {

    @Autowired
    private CRM_LeadService crmLeadService;

    @PostMapping
    public ResponseEntity<CRM_Lead> addCRM_Lead(@RequestBody CRM_Lead crmLead) {
        return ResponseEntity.status(HttpStatus.CREATED).body(crmLeadService.createCRM_Lead(crmLead));
    }

    @GetMapping
    public ResponseEntity<List<CRM_Lead>> getAllCrmLead() {
        return ResponseEntity.ok(crmLeadService.getAllCRM_Leads());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CRM_Lead> getByIdCRMLead(@PathVariable String id) {
        return ResponseEntity.ok(crmLeadService.findCRM_LeadById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CRM_Lead> updateByIdCrmLead(@PathVariable String id, @RequestBody CRM_Lead LeadDetails) {
        CRM_Lead updateCrmLead = crmLeadService.updateCRM_Lead(id, LeadDetails);
        return ResponseEntity.ok(updateCrmLead);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CRM_Lead> deleteByIdCrmLead(@PathVariable String id) {
        crmLeadService.deleteCRM_Lead(id);
        return ResponseEntity.noContent().build();
    }
}

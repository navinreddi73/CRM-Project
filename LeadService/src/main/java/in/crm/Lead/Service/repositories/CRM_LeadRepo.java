package in.crm.Lead.Service.repositories;

import in.crm.Lead.Service.entities.CRM_Lead;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRM_LeadRepo extends JpaRepository<CRM_Lead, String> {
}

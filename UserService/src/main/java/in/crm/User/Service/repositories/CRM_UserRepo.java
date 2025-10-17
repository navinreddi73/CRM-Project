package in.crm.User.Service.repositories;

import in.crm.User.Service.entities.CRM_User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CRM_UserRepo extends JpaRepository<CRM_User, String> {
    //we can imple any custom methods here really need
    //Write
}

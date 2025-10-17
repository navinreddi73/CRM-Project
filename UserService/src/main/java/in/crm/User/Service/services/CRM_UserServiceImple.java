package in.crm.User.Service.services;

import in.crm.User.Service.entities.CRM_User;
import in.crm.User.Service.exceptions.ResourceNotFoundException;
import in.crm.User.Service.repositories.CRM_UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CRM_UserServiceImple implements CRM_UserService {

    @Autowired
    private CRM_UserRepo crmUserRepo;

    @Override
    public CRM_User createCRMUser(CRM_User crmUser) {
        return crmUserRepo.save(crmUser);
    }

    @Override
    public List<CRM_User> getAllUsers() {
        return crmUserRepo.findAll();
    }

    @Override
    public CRM_User getUserById(String userId) {
        CRM_User crmUserFind = crmUserRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Not Found"+ userId));
        return crmUserFind;
    }

    @Override
    public CRM_User updateUser(String userId, CRM_User newCrmUser) {
        CRM_User oldCrmUser = crmUserRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Not Found"+ userId));
        oldCrmUser.setUserName(newCrmUser.getUserName());
        oldCrmUser.setEmail(newCrmUser.getEmail());
        return crmUserRepo.save(oldCrmUser);
    }

    @Override
    public void deleteUser(String userId) {
        crmUserRepo.deleteById(userId);
    }
}

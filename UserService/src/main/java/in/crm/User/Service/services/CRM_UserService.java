package in.crm.User.Service.services;

import in.crm.User.Service.entities.CRM_User;

import java.util.List;

public interface CRM_UserService {

    //create user
    CRM_User createCRMUser(CRM_User crmUser);
    //get all crm users
    List<CRM_User> getAllUsers();
    //get user by id
    CRM_User getUserById(String id);
    //update one user data by userid
    CRM_User updateUser(String id, CRM_User crmUser);
    //delete
    void deleteUser(String id);
}

package in.crm.User.Service.controllers;

import in.crm.User.Service.entities.CRM_User;
import in.crm.User.Service.services.CRM_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crmUsers")
public class CRM_UserController {

    @Autowired
    private CRM_UserService crmUserService;

    @PostMapping
    public ResponseEntity<CRM_User> createCRMUser(@RequestBody CRM_User newCrmUser) {
        CRM_User newUser = crmUserService.createCRMUser(newCrmUser);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping
    public ResponseEntity<List<CRM_User>> getAllCRMUser() {
        List<CRM_User> allCrmUsers = crmUserService.getAllUsers();
        return ResponseEntity.ok(allCrmUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CRM_User> getCRMUserById(@PathVariable String id) {
        CRM_User crmUser = crmUserService.getUserById(id);
        return ResponseEntity.ok(crmUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CRM_User> updateCRMUser(@PathVariable String id, @RequestBody CRM_User newCrmUserDetails) {
        CRM_User updateUser = crmUserService.updateUser(id, newCrmUserDetails);
        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CRM_User> deleteCRMUser(@PathVariable String id) {
        crmUserService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

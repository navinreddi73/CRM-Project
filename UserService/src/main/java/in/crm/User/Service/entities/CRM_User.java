package in.crm.User.Service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class CRM_User {
    @Id
    @Column(length = 4)
    private String userId;
    @Column(length = 36)
    private String userName;
    @Column(length = 36, unique = true)
    private String email;
    @Column(length = 100)
    private String about;
}

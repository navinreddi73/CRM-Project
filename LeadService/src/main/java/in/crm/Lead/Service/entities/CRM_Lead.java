package in.crm.Lead.Service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table
public class CRM_Lead {
    @Id
    @Column(length = 4)
    private String leadId;
    @Column(length = 30)
    private String leadName;
    @Column(length = 30)
    private String email;
    @Column(length = 20)
    private String contact;
    @Column(length = 100)
    private String source;
    @Column(length = 10)
    private String status;
    @Column(length = 10)
    private long score;
    @Column(length = 10)
    private String assignedTo;
}

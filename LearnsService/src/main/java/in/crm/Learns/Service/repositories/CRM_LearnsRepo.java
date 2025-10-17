package in.crm.Learns.Service.repositories;

import in.crm.Learns.Service.entities.Learner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CRM_LearnsRepo extends MongoRepository<Learner, String> {
}

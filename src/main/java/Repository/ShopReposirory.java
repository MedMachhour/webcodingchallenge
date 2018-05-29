package Repository;

import Model.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopReposirory extends MongoRepository<Shop,String> {

}

package mpederiva.microsservicos.shoppingcart.repository;

import mpederiva.microsservicos.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}

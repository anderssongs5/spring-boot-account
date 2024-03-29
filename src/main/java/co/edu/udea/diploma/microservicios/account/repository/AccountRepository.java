package co.edu.udea.diploma.microservicios.account.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import co.edu.udea.diploma.microservicios.account.model.Account;
import reactor.core.publisher.Flux;

public interface AccountRepository extends ReactiveCrudRepository<Account, String> {

	Flux<Account> findByCustomerId(String customerId);
}

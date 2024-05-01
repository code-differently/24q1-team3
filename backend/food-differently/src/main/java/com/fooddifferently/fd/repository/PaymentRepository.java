package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

    /**
     * Find a payment by its ID.
     *
     * @param id The ID of the payment to find.
     * @return An Optional containing the payment if found, empty otherwise.
     */
    Optional<Payment> findById(Long id);

    /**
     * Check if a payment with the given ID exists.
     *
     * @param id The ID of the payment to check.
     * @return true if the payment exists, false otherwise.
     */
    boolean existsById(Long id);

    /**
     * Delete a payment by its ID.
     *
     * @param id The ID of the payment to delete.
     */
    void deleteById(Long id);
}

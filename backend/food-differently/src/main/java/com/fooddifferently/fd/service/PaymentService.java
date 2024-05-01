package com.fooddifferently.fd.service;

import com.fooddifferently.fd.exception.PaymentNotFoundException;
import com.fooddifferently.fd.model.Payment;
import com.fooddifferently.fd.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing payments.
 */
@Service
public class PaymentService {


    private final PaymentRepository paymentRepository;

    /**
     * Constructor-based dependency injection.
     *
     * @param paymentRepository The payment repository.
     */
    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    /**
     * Retrieves a payment by its ID.
     *
     * @param id The ID of the payment to retrieve.
     * @return The payment with the specified ID.
     * @throws PaymentNotFoundException if the payment with the specified ID is not found.
     */
    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id)
                .orElseThrow(() -> new PaymentNotFoundException("Payment with ID " + id + " not found"));
    }

    /**
     * Creates a new payment.
     *
     * @param payment The payment object containing payment details.
     * @return The newly created payment.
     */
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    /**
     * Updates an existing payment.
     *
     * @param id      The ID of the payment to update.
     * @param payment The updated payment object.
     * @return The updated payment.
     * @throws PaymentNotFoundException if the payment with the specified ID is not found.
     */
    public Payment updatePayment(Long id, Payment payment) {
        if (paymentRepository.existsById(id)) {
            payment.setId(id); // Ensure the ID matches the path variable
            return paymentRepository.save(payment);
        }
        throw new PaymentNotFoundException("Payment with ID " + id + " not found");
    }

    /**
     * Deletes a payment by its ID.
     *
     * @param id The ID of the payment to delete.
     * @throws PaymentNotFoundException if the payment with the specified ID is not found.
     */
    public void deletePayment(Long id) {
        if (paymentRepository.existsById(id)) {
            paymentRepository.deleteById(id);
        } else {
            throw new PaymentNotFoundException("Payment with ID " + id + " not found");
        }
    }

    /**
     * Retrieves all payments.
     *
     * @return A list of all payments.
     */
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}

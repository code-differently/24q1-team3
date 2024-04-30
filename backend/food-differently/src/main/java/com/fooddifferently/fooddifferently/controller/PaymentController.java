package com.fooddifferently.fd.controller;

import com.fooddifferently.fd.model.Payment;
import com.fooddifferently.fd.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for handling payment-related operations.
 */
@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    /**
     * Retrieves a payment by its ID.
     *
     * @param id The ID of the payment to retrieve.
     * @return The payment with the specified ID.
     */
    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    /**
     * Creates a new payment.
     *
     * @param payment The payment object containing payment details.
     * @return The newly created payment.
     */
    @PostMapping("/create")
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.createPayment(payment);
    }

    /**
     * Updates an existing payment.
     *
     * @param id      The ID of the payment to update.
     * @param payment The updated payment object.
     * @return The updated payment.
     */
    @PutMapping("/{id}")
    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        return paymentService.updatePayment(id, payment);
    }

    /**
     * Deletes a payment by its ID.
     *
     * @param id The ID of the payment to delete.
     */
    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }

    /**
     * Retrieves all payments.
     *
     * @return A list of all payments.
     */
    @GetMapping("/all")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }
}

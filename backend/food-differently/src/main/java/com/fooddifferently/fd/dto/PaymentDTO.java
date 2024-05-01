package com.fooddifferently.fd.dto;

import com.fooddifferently.fd.model.Payment;
import com.fooddifferently.fd.model.User;

/**
 * Represents a payment DTO (Data Transfer Object) used for transferring payment data.
 */
public class PaymentDTO {

    private Long id;
    private String paymentMethod;
    private Long userId;

    public PaymentDTO() {
        // Default constructor
    }

    public PaymentDTO(Long id, String paymentMethod, Long userId) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.userId = userId;
    }

    /**
     * Get the ID of the payment.
     *
     * @return The ID of the payment.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the payment.
     *
     * @param id The ID of the payment.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the payment method.
     *
     * @return The payment method.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Set the payment method.
     *
     * @param paymentMethod The payment method.
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Get the ID of the associated user.
     *
     * @return The ID of the associated user.
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Set the ID of the associated user.
     *
     * @param userId The ID of the associated user.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Convert this DTO to a Payment entity.
     *
     * @return The corresponding Payment entity.
     */
    public Payment toEntity(User user) {
        Payment payment = new Payment();
        payment.setId(this.id);
        payment.setPaymentMethod(this.paymentMethod);
        payment.setUser(user);
        return payment;
    }

    /**
     * Create a PaymentDTO from a Payment entity.
     *
     * @param payment The Payment entity.
     * @return The corresponding PaymentDTO.
     */
    public static PaymentDTO fromEntity(Payment payment) {
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(payment.getId());
        paymentDTO.setPaymentMethod(payment.getPaymentMethod());
        paymentDTO.setUserId(payment.getUser().getId());
        return paymentDTO;
    }
}

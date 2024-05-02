package com.fooddifferently.fd.model;

import jakarta.persistence.*;

/**
 * Represents a payment in the system.
 */
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Payment() {
    }

    public Payment(String paymentMethod, User user) {
        this.paymentMethod = paymentMethod;
        this.user = user;
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
     * Get the user associated with the payment.
     *
     * @return The user associated with the payment.
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user associated with the payment.
     *
     * @param user The user associated with the payment.
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", user=" + user +
                '}';
    }
}

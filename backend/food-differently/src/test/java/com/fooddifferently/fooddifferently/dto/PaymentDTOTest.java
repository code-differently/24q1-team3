package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.PaymentDTO;
import com.fooddifferently.fd.model.Payment;
import com.fooddifferently.fd.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PaymentDTOTest {

    @Test
    public void testToEntity() {
        Long paymentId = 1L;
        String paymentMethod = "Credit Card";
        Long userId = 1L;

        PaymentDTO paymentDTO = new PaymentDTO(paymentId, paymentMethod, userId);
        User user = new User();
        user.setId(userId);

        Payment payment = paymentDTO.toEntity(user);

        assertNotNull(payment);
        assertEquals(paymentId, payment.getId());
        assertEquals(paymentMethod, payment.getPaymentMethod());
        assertEquals(user, payment.getUser());
    }

    @Test
    public void testFromEntity() {
        Long paymentId = 1L;
        String paymentMethod = "Credit Card";
        Long userId = 1L;

        Payment payment = new Payment(paymentMethod, new User());
        payment.setId(paymentId);

        PaymentDTO paymentDTO = PaymentDTO.fromEntity(payment);

        assertNotNull(paymentDTO);
        assertEquals(paymentId, paymentDTO.getId());
        assertEquals(paymentMethod, paymentDTO.getPaymentMethod());
        assertEquals(userId, paymentDTO.getUserId());
    }

    @Test
    public void testSetAndGetId() {
        Long paymentId = 1L;
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setId(paymentId);

        assertEquals(paymentId, paymentDTO.getId());
    }

    @Test
    public void testSetAndGetPaymentMethod() {
        String paymentMethod = "Debit Card";
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setPaymentMethod(paymentMethod);

        assertEquals(paymentMethod, paymentDTO.getPaymentMethod());
    }

    @Test
    public void testSetAndGetUserId() {
        Long userId = 1L;
        PaymentDTO paymentDTO = new PaymentDTO();
        paymentDTO.setUserId(userId);

        assertEquals(userId, paymentDTO.getUserId());
    }
}

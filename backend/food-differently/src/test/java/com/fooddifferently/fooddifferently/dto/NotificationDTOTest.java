package com.fooddifferently.fooddifferently.dto;

import com.fooddifferently.fd.dto.NotificationDTO;
import com.fooddifferently.fd.model.Notification;
import com.fooddifferently.fd.model.User;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NotificationDTOTest {

    @Test
    public void testConstructorAndGetterMethods() {
        Long id = 1L;
        Long userId = 10L;
        String message = "New message";
        Date createdAt = new Date();

        Notification notification = new Notification();
        notification.setId(id);
        notification.setUser(new User());
        notification.getUser().setId(userId);
        notification.setMessage(message);
        notification.setCreatedAt(createdAt);

        NotificationDTO notificationDTO = new NotificationDTO(notification);

        assertEquals(id, notificationDTO.getId());
        assertEquals(userId, notificationDTO.getUserId());
        assertEquals(message, notificationDTO.getMessage());
        assertEquals(createdAt, notificationDTO.getCreatedAt());
    }

    @Test
    public void testDefaultConstructor() {
        NotificationDTO notificationDTO = new NotificationDTO();

        assertNull(notificationDTO.getId());
        assertNull(notificationDTO.getUserId());
        assertNull(notificationDTO.getMessage());
        assertNull(notificationDTO.getCreatedAt());
    }

    @Test
    public void testSetters() {
        NotificationDTO notificationDTO = new NotificationDTO();

        Long id = 1L;
        Long userId = 10L;
        String message = "New message";
        Date createdAt = new Date();

        notificationDTO.setId(id);
        notificationDTO.setUserId(userId);
        notificationDTO.setMessage(message);
        notificationDTO.setCreatedAt(createdAt);

        assertEquals(id, notificationDTO.getId());
        assertEquals(userId, notificationDTO.getUserId());
        assertEquals(message, notificationDTO.getMessage());
        assertEquals(createdAt, notificationDTO.getCreatedAt());
    }

    @Test
    public void testToString() {
        Long id = 1L;
        Long userId = 10L;
        String message = "New message";
        Date createdAt = new Date();

        NotificationDTO notificationDTO = new NotificationDTO();
        notificationDTO.setId(id);
        notificationDTO.setUserId(userId);
        notificationDTO.setMessage(message);
        notificationDTO.setCreatedAt(createdAt);

        String expectedToString = "NotificationDTO{id=1, userId=10, message='New message', createdAt=" + createdAt + "}";
        assertEquals(expectedToString, notificationDTO.toString());
    }

    @Test
    public void testSetNullValues() {
        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setId(null);
        notificationDTO.setUserId(null);
        notificationDTO.setMessage(null);
        notificationDTO.setCreatedAt(null);

        assertNull(notificationDTO.getId());
        assertNull(notificationDTO.getUserId());
        assertNull(notificationDTO.getMessage());
        assertNull(notificationDTO.getCreatedAt());
    }
}

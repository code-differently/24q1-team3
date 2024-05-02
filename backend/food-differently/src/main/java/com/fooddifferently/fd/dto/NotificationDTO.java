package com.fooddifferently.fd.dto;

import com.fooddifferently.fd.model.Notification;
import com.fooddifferently.fd.model.User;

import java.util.Date;

/**
 * Data Transfer Object (DTO) for transferring notification data.
 */
public class NotificationDTO {

    private Long id;
    private Long userId;
    private String message;
    private Date createdAt;

    public NotificationDTO() {
    }

    public NotificationDTO(Notification notification) {
        this.id = notification.getId();
        this.userId = notification.getUser().getId();
        this.message = notification.getMessage();
        this.createdAt = notification.getCreatedAt();
    }

    /**
     * Get the ID of the notification.
     *
     * @return The ID of the notification.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the ID of the notification.
     *
     * @param id The ID of the notification.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the ID of the user associated with the notification.
     *
     * @return The ID of the user associated with the notification.
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Set the ID of the user associated with the notification.
     *
     * @param userId The ID of the user associated with the notification.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Get the message content of the notification.
     *
     * @return The message content of the notification.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the message content of the notification.
     *
     * @param message The message content of the notification.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Get the date and time when the notification was created.
     *
     * @return The date and time when the notification was created.
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Set the date and time when the notification was created.
     *
     * @param createdAt The date and time when the notification was created.
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

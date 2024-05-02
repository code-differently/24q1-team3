package com.fooddifferently.fd.model;

import jakarta.persistence.*;
import java.util.Date;

/**
 * Represents a notification in the system.
 */
@Entity
@Table(name = "notifications")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "message", nullable = false)
    private String message;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Date createdAt;


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
     * Get the user associated with the notification.
     *
     * @return The user associated with the notification.
     */
    public User getUser() {
        return user;
    }

    /**
     * Set the user associated with the notification.
     *
     * @param user The user associated with the notification.
     */
    public void setUser(User user) {
        this.user = user;
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

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", user=" + user +
                ", message='" + message + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

package com.fooddifferently.fd.service;

import com.fooddifferently.fd.model.Notification;
import com.fooddifferently.fd.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Service layer for managing notifications.
 */
@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    /**
     * Retrieves a notification by its ID.
     *
     * @param id The ID of the notification to retrieve.
     * @return The notification with the specified ID, or null if not found.
     */
    public Notification getNotificationById(Long id) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        return optionalNotification.orElse(null);
    }

    /**
     * Creates a new notification.
     *
     * @param notification The notification object containing notification details.
     * @return The newly created notification.
     */
    public Notification createNotification(Notification notification) {
        // Set the creation timestamp
        notification.setCreatedAt(new Date());
        return notificationRepository.save(notification);
    }

    /**
     * Updates an existing notification.
     *
     * @param id           The ID of the notification to update.
     * @param updatedNotification The updated notification object.
     * @return The updated notification, or null if the notification with the given ID is not found.
     */
    public Notification updateNotification(Long id, Notification updatedNotification) {
        Optional<Notification> optionalNotification = notificationRepository.findById(id);
        if (optionalNotification.isPresent()) {
            Notification existingNotification = optionalNotification.get();
            // Update the existing notification with the new values
            existingNotification.setMessage(updatedNotification.getMessage());
            existingNotification.setUser(updatedNotification.getUser());
            // Save and return the updated notification
            return notificationRepository.save(existingNotification);
        }
        return null;
    }

    /**
     * Deletes a notification by its ID.
     *
     * @param id The ID of the notification to delete.
     */
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }

    /**
     * Retrieves all notifications.
     *
     * @return A list of all notifications.
     */
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
}

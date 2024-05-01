package com.fooddifferently.fd.controller;

import com.fooddifferently.fd.model.Notification;
import com.fooddifferently.fd.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller class for handling notification-related operations.
 */
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    /**
     * Retrieves a notification by its ID.
     *
     * @param id The ID of the notification to retrieve.
     * @return The notification with the specified ID.
     */
    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }

    /**
     * Creates a new notification.
     *
     * @param notification The notification object containing notification details.
     * @return The newly created notification.
     */
    @PostMapping("/create")
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }

    /**
     * Updates an existing notification.
     *
     * @param id            The ID of the notification to update.
     * @param notification  The updated notification object.
     * @return The updated notification.
     */
    @PutMapping("/{id}")
    public Notification updateNotification(@PathVariable Long id, @RequestBody Notification notification) {
        return notificationService.updateNotification(id, notification);
    }

    /**
     * Deletes a notification by its ID.
     *
     * @param id The ID of the notification to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);
    }

    /**
     * Retrieves all notifications.
     *
     * @return A list of all notifications.
     */
    @GetMapping("/all")
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }
}

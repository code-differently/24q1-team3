package com.fooddifferently.fd.repository;

import com.fooddifferently.fd.model.Notification;
import com.fooddifferently.fd.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Repository interface for managing notifications.
 */
@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    /**
     * Find notifications by user ID.
     *
     * @param userId The ID of the user.
     * @return The list of notifications for the user.
     */
    List<Notification> findByUserId(Long userId);


    /**
     * Find notifications created after a specified date.
     *
     * @param date The date after which notifications were created.
     * @return The list of notifications created after the specified date.
     */
    List<Notification> findByCreatedAtAfter(Date date);

    /**
     * Find notifications for a specific user created after a specified date.
     *
     * @param user The user for whom notifications are to be retrieved.
     * @param date The date after which notifications were created.
     * @return The list of notifications for the user created after the specified date.
     */
    List<Notification> findByUserAndCreatedAtAfter(User user, Date date);

    /**
     * Find notifications containing a specific keyword in the message.
     *
     * @param keyword The keyword to search for in the message.
     * @return The list of notifications containing the keyword in the message.
     */
    List<Notification> findByMessageContaining(String keyword);

    /**
     * Find notifications for a user containing a specific keyword in the message.
     *
     * @param user The user for whom notifications are to be retrieved.
     * @param keyword The keyword to search for in the message.
     * @return The list of notifications for the user containing the keyword in the message.
     */
    List<Notification> findByUserAndMessageContaining(User user, String keyword);

    /**
     * Custom query to find the most recent notifications for a user.
     *
     * @param user The user for whom notifications are to be retrieved.
     * @return The list of the most recent notifications for the user.
     */
    List<Notification> findTop5ByUserOrderByCreatedAtDesc(User user);

    /**
     * Custom query to count notifications for a user.
     *
     * @param user The user for whom notifications are to be counted.
     * @return The count of notifications for the user.
     */
    long countByUser(User user);

    /**
     * Custom query to delete notifications by user ID.
     *
     * @param userId The ID of the user.
     */
    void deleteByUserId(Long userId);

}

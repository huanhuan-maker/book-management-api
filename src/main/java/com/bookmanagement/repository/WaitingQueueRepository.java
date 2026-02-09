package com.bookmanagement.repository;

import com.bookmanagement.entity.WaitingQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WaitingQueueRepository extends JpaRepository<WaitingQueue, Long> {
    List<WaitingQueue> findByBookIdOrderByAddedAt(Long bookId);
    List<WaitingQueue> findByUserId(Long userId);
    Optional<WaitingQueue> findByUserIdAndBookId(Long userId, Long bookId);
}
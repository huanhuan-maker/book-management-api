package com.bookmanagement.repository;

import com.bookmanagement.entity.BorrowingRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BorrowingRecordRepository extends JpaRepository<BorrowingRecord, Long> {
    List<BorrowingRecord> findByUserId(Long userId);
    List<BorrowingRecord> findByBookId(Long bookId);
    List<BorrowingRecord> findByStatus(String status);
    Optional<BorrowingRecord> findByUserIdAndBookIdAndReturnDateIsNull(Long userId, Long bookId);
}
package com.example.announcement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.announcement.model.Announcement;

@Repository
public interface AnnouncementRepository extends PagingAndSortingRepository<Announcement, Long>  {

}
package com.example.announcement.service;

import java.util.List;
import java.util.Optional;

import com.example.announcement.model.Announcement;

public interface AnnouncementService {

	//public List<Announcement> getAnnouncements();
	public Announcement createAnnouncement(Announcement ann);
	
	public List<Announcement> findPaginated(int pageNo, int pageSize);
}
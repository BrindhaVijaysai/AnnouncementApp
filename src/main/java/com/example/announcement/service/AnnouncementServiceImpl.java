package com.example.announcement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.announcement.model.Announcement;
import com.example.announcement.repository.AnnouncementRepository;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	AnnouncementRepository dao;

	
	/*
	 * @Override public List<Announcement> getAnnouncements() { return
	 * dao.findAll(); }
	 */

	@Override
	public Announcement createAnnouncement(Announcement ann) {
		return dao.save(ann);
	}
	
	 @SuppressWarnings("deprecation")
	@Override
	    public List<Announcement> findPaginated(int pageNo, int pageSize) {

	       // Pageable paging = PageRequest.of(pageNo, pageSize);
	        Page<Announcement> pagedResult = dao.findAll(new PageRequest(pageNo, pageSize));

	        return pagedResult.getContent();
	    }
	
}
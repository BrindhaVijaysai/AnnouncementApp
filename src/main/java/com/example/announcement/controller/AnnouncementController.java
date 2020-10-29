package com.example.announcement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.announcement.model.Announcement;
import com.example.announcement.service.AnnouncementService;

/**
 * @author Brindha
 * Controller for creating and listing announcements
 */
@RestController
public class AnnouncementController {

	@Autowired
	private AnnouncementService service;

	/**
	 * @param pageNo  - The startValue from which the list should be displayed
	 * @param pageSize - The offset
	 * @return paginated list of announcements
	 */
	@RequestMapping(value = "v1/announcements/{pageNo}/{pageSize}", method = RequestMethod.GET)
	public List<Announcement> getAnnouncements(@PathVariable int pageNo, @PathVariable int pageSize) {
		return service.findPaginated(pageNo, pageSize);
	}

	/**
	 * Create Announcement
	 * @param newAnn - The request body which contains all the details to be stored in database
	 * @return
	 */
	@RequestMapping(value = "v1/announcements", method = RequestMethod.POST)
	@ResponseStatus(value = HttpStatus.CREATED)
	public Announcement createAnnouncement(@RequestBody Announcement newAnn) {
		return service.createAnnouncement(newAnn);
	}

}
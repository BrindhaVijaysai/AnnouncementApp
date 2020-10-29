package com.example.announcement.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;



@Entity
@Table(name= "announcements")


public class Announcement {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int announcementId;
	
	@XmlElement(required=true)
	@NotNull
	@Valid
	private String announcementTitle;
	
	@XmlElement(required=true)
	@NotNull
	@Valid
	private String announcementDescription;
	
	@Valid
	private LocalDate announcementDate;
	
	public int getAnnouncementId() {
		return announcementId;
	}



	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}



	public String getAnnouncementTitle() {
		return announcementTitle;
	}



	public void setAnnouncementTitle(String announcementTitle) {
		this.announcementTitle = announcementTitle;
	}



	public String getAnnouncementDescription() {
		return announcementDescription;
	}



	public void setAnnouncementDescription(String announcementDescription) {
		this.announcementDescription = announcementDescription;
	}



	public LocalDate getAnnouncementDate() {
		return announcementDate;
	}



	public void setAnnouncementDate(LocalDate announcementDate) {
		if(announcementDate==null)
		{
			this.announcementDate = LocalDate.now();
		}
		this.announcementDate = announcementDate;
	}





	public Announcement() { }



	

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Announcements{");
        sb.append("id=").append(announcementId);
        sb.append(", title='").append(announcementTitle).append('\'');
        sb.append(", description=").append(announcementDescription);
        sb.append(", date=").append(announcementDate);
        sb.append('}');
        return sb.toString();
    }
}
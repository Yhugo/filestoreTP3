package org.filestore.ejb.file.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@NamedQueries(
		@NamedQuery(name="listAllFiles", query="SELECT i FROM FileItem i")
)
public class FileItem {

	@Id
	private String id;
	@Column(length = 4000)
	private String name;
	private String type;
	private long length;
	private long nbdownloads;
	private String owner;
	@ElementCollection
	private List<String> receivers;
	private String message;
	private Date creation;
	private Date lastdownload;
	private String stream;

	public FileItem() {
		nbdownloads = 0;
		creation = new Date();
		lastdownload = creation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getNbdownloads() {
		return nbdownloads;
	}

	public void setNbdownloads(long nbdownloads) {
		this.nbdownloads = nbdownloads;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<String> getReceivers() {
		return receivers;
	}

	public void setReceivers(List<String> receivers) {
		this.receivers = receivers;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreation() {
		return creation;
	}

	public void setCreation(Date creation) {
		this.creation = creation;
	}

	public Date getLastdownload() {
		return lastdownload;
	}

	public void setLastdownload(Date lastdownload) {
		this.lastdownload = lastdownload;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

}

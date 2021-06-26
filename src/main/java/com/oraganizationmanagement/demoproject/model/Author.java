package com.oraganizationmanagement.demoproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_AUTHOR")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTHOR_SEQUENCE")
	@SequenceGenerator(sequenceName = "AUTHOR_SEQUENCE", initialValue = 0, allocationSize = 1, name = "AUTHOR_SEQUENCE_ID")
	private int authorid;
	private String authorname;
	private String authorlanagugae;

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public String getAuthorlanagugae() {
		return authorlanagugae;
	}

	public void setAuthorlanagugae(String authorlanagugae) {
		this.authorlanagugae = authorlanagugae;
	}

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", authorname=" + authorname + ", authorlanagugae=" + authorlanagugae
				+ "]";
	}

}

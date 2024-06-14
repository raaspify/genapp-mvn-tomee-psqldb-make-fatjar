package com.rcomputer.genapp.model;
// Generated 26-May-2024 9:51:06 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Yxxxch643xwwqqhxxxxxacintegr generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "acintegr")
public class Yxxxch643xwwqqhxxxxxacintegr implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount;
	private String a2xxukwmbvxxxxxxxxxxmoduleid;
	private String c1xxuxxxbvxxxxxxxxxxusagedescr;
	private String a3xxukw8bvxxxxxxxxxxusagecode;
	private String a4xxukw9bvxxxxxxxxxxsetsid;
	private String c7xxuxxrbvxxxxxxxxxxextraintfield;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String y1xxuxznbvxxxxxxxxxxnotes;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Yxxxch643xwwqqhxxxxxacintegr() {
	}

	public Yxxxch643xwwqqhxxxxxacintegr(
			Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount,
			String a2xxukwmbvxxxxxxxxxxmoduleid,
			String c1xxuxxxbvxxxxxxxxxxusagedescr,
			String a3xxukw8bvxxxxxxxxxxusagecode,
			String a4xxukw9bvxxxxxxxxxxsetsid,
			String c7xxuxxrbvxxxxxxxxxxextraintfield,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String y1xxuxznbvxxxxxxxxxxnotes, String z3xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.yxxxch601xwwqqhxxxxxaccount = yxxxch601xwwqqhxxxxxaccount;
		this.a2xxukwmbvxxxxxxxxxxmoduleid = a2xxukwmbvxxxxxxxxxxmoduleid;
		this.c1xxuxxxbvxxxxxxxxxxusagedescr = c1xxuxxxbvxxxxxxxxxxusagedescr;
		this.a3xxukw8bvxxxxxxxxxxusagecode = a3xxukw8bvxxxxxxxxxxusagecode;
		this.a4xxukw9bvxxxxxxxxxxsetsid = a4xxukw9bvxxxxxxxxxxsetsid;
		this.c7xxuxxrbvxxxxxxxxxxextraintfield = c7xxuxxrbvxxxxxxxxxxextraintfield;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.y1xxuxznbvxxxxxxxxxxnotes = y1xxuxznbvxxxxxxxxxxnotes;
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sid", unique = true, nullable = false)
	public Integer getA0xxuobxbxxxxxxxxxxxsid() {
		return this.a0xxuobxbxxxxxxxxxxxsid;
	}

	public void setA0xxuobxbxxxxxxxxxxxsid(Integer a0xxuobxbxxxxxxxxxxxsid) {
		this.a0xxuobxbxxxxxxxxxxxsid = a0xxuobxbxxxxxxxxxxxsid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account")
	public Yxxxch601xwwqqhxxxxxaccount getYxxxch601xwwqqhxxxxxaccount() {
		return this.yxxxch601xwwqqhxxxxxaccount;
	}

	public void setYxxxch601xwwqqhxxxxxaccount(
			Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount) {
		this.yxxxch601xwwqqhxxxxxaccount = yxxxch601xwwqqhxxxxxaccount;
	}

	@Column(name = "moduleid", length = 12)
	@Size(max = 12)
	public String getA2xxukwmbvxxxxxxxxxxmoduleid() {
		return this.a2xxukwmbvxxxxxxxxxxmoduleid;
	}

	public void setA2xxukwmbvxxxxxxxxxxmoduleid(
			String a2xxukwmbvxxxxxxxxxxmoduleid) {
		this.a2xxukwmbvxxxxxxxxxxmoduleid = a2xxukwmbvxxxxxxxxxxmoduleid;
	}

	@Column(name = "usagedescr", length = 35)
	@Size(max = 35)
	public String getC1xxuxxxbvxxxxxxxxxxusagedescr() {
		return this.c1xxuxxxbvxxxxxxxxxxusagedescr;
	}

	public void setC1xxuxxxbvxxxxxxxxxxusagedescr(
			String c1xxuxxxbvxxxxxxxxxxusagedescr) {
		this.c1xxuxxxbvxxxxxxxxxxusagedescr = c1xxuxxxbvxxxxxxxxxxusagedescr;
	}

	@Column(name = "usagecode", length = 3)
	@Size(max = 3)
	public String getA3xxukw8bvxxxxxxxxxxusagecode() {
		return this.a3xxukw8bvxxxxxxxxxxusagecode;
	}

	public void setA3xxukw8bvxxxxxxxxxxusagecode(
			String a3xxukw8bvxxxxxxxxxxusagecode) {
		this.a3xxukw8bvxxxxxxxxxxusagecode = a3xxukw8bvxxxxxxxxxxusagecode;
	}

	@Column(name = "setsid", length = 20)
	@Size(max = 20)
	public String getA4xxukw9bvxxxxxxxxxxsetsid() {
		return this.a4xxukw9bvxxxxxxxxxxsetsid;
	}

	public void setA4xxukw9bvxxxxxxxxxxsetsid(String a4xxukw9bvxxxxxxxxxxsetsid) {
		this.a4xxukw9bvxxxxxxxxxxsetsid = a4xxukw9bvxxxxxxxxxxsetsid;
	}

	@Column(name = "extraintfield", length = 20)
	@Size(max = 20)
	public String getC7xxuxxrbvxxxxxxxxxxextraintfield() {
		return this.c7xxuxxrbvxxxxxxxxxxextraintfield;
	}

	public void setC7xxuxxrbvxxxxxxxxxxextraintfield(
			String c7xxuxxrbvxxxxxxxxxxextraintfield) {
		this.c7xxuxxrbvxxxxxxxxxxextraintfield = c7xxuxxrbvxxxxxxxxxxextraintfield;
	}

	@Column(name = "statusfl")
	public Integer getZ1xxzzfxhhxxxxxxxxxxstatusfl() {
		return this.z1xxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZ1xxzzfxhhxxxxxxxxxxstatusfl(
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl) {
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZ2xxcztxlxxxxxxxxxxxstatusfldt() {
		return this.z2xxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZ2xxcztxlxxxxxxxxxxxstatusfldt(
			Date z2xxcztxlxxxxxxxxxxxstatusfldt) {
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getY1xxuxznbvxxxxxxxxxxnotes() {
		return this.y1xxuxznbvxxxxxxxxxxnotes;
	}

	public void setY1xxuxznbvxxxxxxxxxxnotes(String y1xxuxznbvxxxxxxxxxxnotes) {
		this.y1xxuxznbvxxxxxxxxxxnotes = y1xxuxznbvxxxxxxxxxxnotes;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ3xxutoxlhxxxxxxxxxxowner() {
		return this.z3xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ3xxutoxlhxxxxxxxxxxowner(String z3xxutoxlhxxxxxxxxxxowner) {
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	// The following is extra code specified in the hbm.xml files

	private Boolean flaggedAsEditable = false;
	private Boolean flaggedAsDeleteable = false;
	private Boolean flaggedAsNew = false;
	@Transient
	public boolean getFlaggedAsEditable() {
		return flaggedAsEditable;
	}
	public void setFlaggedAsEditable(Boolean value) {
		flaggedAsEditable = value;
	}
	@Transient
	public boolean getFlaggedAsDeleteable() {
		return flaggedAsDeleteable;
	}
	public void setFlaggedAsDeleteable(Boolean value) {
		flaggedAsDeleteable = value;
	}
	@Transient
	public boolean getFlaggedAsNew() {
		return flaggedAsNew;
	}
	public void setFlaggedAsNew(Boolean value) {
		flaggedAsNew = value;
	}

	// end of extra code specified in the hbm.xml files

}

package com.rcomputer.genapp.model;
// Generated 19-Mar-2023 9:37:01 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Dxxxiq155xwwqqhxxxxxresidency generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "residency")
public class Dxxxiq155xwwqqhxxxxxresidency implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private String a0xxukxxbvxxxxxxxxxxresidency;
	private String d1xxuszsbvxxxxxxxxxxdescript;
	private String c1xxhxxxbv11xxxxxxxxmunicipality;
	private String c2xxhxxxbv12xxxxxxxxprovince;
	private String c3xxhxxbbv13xxxxxxxxcountryname;
	private Boolean y1xxfxxxbvxxxxxxxxxxexclude;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String y2xxuznxbvxxxxxxxxxxnotes;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Yxxxiq555xwwqqhxxxxxholiday> yxxxiq555xwwqqhxxxxxholidaies = new HashSet<Yxxxiq555xwwqqhxxxxxholiday>(
			0);
	private Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployees = new HashSet<Jxxxbh400xwwqqhxxxxxemployee>(
			0);

	public Dxxxiq155xwwqqhxxxxxresidency() {
	}

	public Dxxxiq155xwwqqhxxxxxresidency(String a0xxukxxbvxxxxxxxxxxresidency) {
		this.a0xxukxxbvxxxxxxxxxxresidency = a0xxukxxbvxxxxxxxxxxresidency;
	}
	public Dxxxiq155xwwqqhxxxxxresidency(String a0xxukxxbvxxxxxxxxxxresidency,
			String d1xxuszsbvxxxxxxxxxxdescript,
			String c1xxhxxxbv11xxxxxxxxmunicipality,
			String c2xxhxxxbv12xxxxxxxxprovince,
			String c3xxhxxbbv13xxxxxxxxcountryname,
			Boolean y1xxfxxxbvxxxxxxxxxxexclude,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String y2xxuznxbvxxxxxxxxxxnotes, String z3xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Yxxxiq555xwwqqhxxxxxholiday> yxxxiq555xwwqqhxxxxxholidaies,
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployees) {
		this.a0xxukxxbvxxxxxxxxxxresidency = a0xxukxxbvxxxxxxxxxxresidency;
		this.d1xxuszsbvxxxxxxxxxxdescript = d1xxuszsbvxxxxxxxxxxdescript;
		this.c1xxhxxxbv11xxxxxxxxmunicipality = c1xxhxxxbv11xxxxxxxxmunicipality;
		this.c2xxhxxxbv12xxxxxxxxprovince = c2xxhxxxbv12xxxxxxxxprovince;
		this.c3xxhxxbbv13xxxxxxxxcountryname = c3xxhxxbbv13xxxxxxxxcountryname;
		this.y1xxfxxxbvxxxxxxxxxxexclude = y1xxfxxxbvxxxxxxxxxxexclude;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.y2xxuznxbvxxxxxxxxxxnotes = y2xxuznxbvxxxxxxxxxxnotes;
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.yxxxiq555xwwqqhxxxxxholidaies = yxxxiq555xwwqqhxxxxxholidaies;
		this.jxxxbh400xwwqqhxxxxxemployees = jxxxbh400xwwqqhxxxxxemployees;
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

	@Column(name = "residency", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxukxxbvxxxxxxxxxxresidency() {
		return this.a0xxukxxbvxxxxxxxxxxresidency;
	}

	public void setA0xxukxxbvxxxxxxxxxxresidency(
			String a0xxukxxbvxxxxxxxxxxresidency) {
		this.a0xxukxxbvxxxxxxxxxxresidency = a0xxukxxbvxxxxxxxxxxresidency;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getD1xxuszsbvxxxxxxxxxxdescript() {
		return this.d1xxuszsbvxxxxxxxxxxdescript;
	}

	public void setD1xxuszsbvxxxxxxxxxxdescript(
			String d1xxuszsbvxxxxxxxxxxdescript) {
		this.d1xxuszsbvxxxxxxxxxxdescript = d1xxuszsbvxxxxxxxxxxdescript;
	}

	@Column(name = "municipality", length = 20)
	@Size(max = 20)
	public String getC1xxhxxxbv11xxxxxxxxmunicipality() {
		return this.c1xxhxxxbv11xxxxxxxxmunicipality;
	}

	public void setC1xxhxxxbv11xxxxxxxxmunicipality(
			String c1xxhxxxbv11xxxxxxxxmunicipality) {
		this.c1xxhxxxbv11xxxxxxxxmunicipality = c1xxhxxxbv11xxxxxxxxmunicipality;
	}

	@Column(name = "province", length = 20)
	@Size(max = 20)
	public String getC2xxhxxxbv12xxxxxxxxprovince() {
		return this.c2xxhxxxbv12xxxxxxxxprovince;
	}

	public void setC2xxhxxxbv12xxxxxxxxprovince(
			String c2xxhxxxbv12xxxxxxxxprovince) {
		this.c2xxhxxxbv12xxxxxxxxprovince = c2xxhxxxbv12xxxxxxxxprovince;
	}

	@Column(name = "countryname", length = 20)
	@Size(max = 20)
	public String getC3xxhxxbbv13xxxxxxxxcountryname() {
		return this.c3xxhxxbbv13xxxxxxxxcountryname;
	}

	public void setC3xxhxxbbv13xxxxxxxxcountryname(
			String c3xxhxxbbv13xxxxxxxxcountryname) {
		this.c3xxhxxbbv13xxxxxxxxcountryname = c3xxhxxbbv13xxxxxxxxcountryname;
	}

	@Column(name = "exclude")
	public Boolean getY1xxfxxxbvxxxxxxxxxxexclude() {
		return this.y1xxfxxxbvxxxxxxxxxxexclude;
	}

	public void setY1xxfxxxbvxxxxxxxxxxexclude(
			Boolean y1xxfxxxbvxxxxxxxxxxexclude) {
		this.y1xxfxxxbvxxxxxxxxxxexclude = y1xxfxxxbvxxxxxxxxxxexclude;
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
	public String getY2xxuznxbvxxxxxxxxxxnotes() {
		return this.y2xxuznxbvxxxxxxxxxxnotes;
	}

	public void setY2xxuznxbvxxxxxxxxxxnotes(String y2xxuznxbvxxxxxxxxxxnotes) {
		this.y2xxuznxbvxxxxxxxxxxnotes = y2xxuznxbvxxxxxxxxxxnotes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dxxxiq155xwwqqhxxxxxresidency")
	public Set<Yxxxiq555xwwqqhxxxxxholiday> getYxxxiq555xwwqqhxxxxxholidaies() {
		return this.yxxxiq555xwwqqhxxxxxholidaies;
	}

	public void setYxxxiq555xwwqqhxxxxxholidaies(
			Set<Yxxxiq555xwwqqhxxxxxholiday> yxxxiq555xwwqqhxxxxxholidaies) {
		this.yxxxiq555xwwqqhxxxxxholidaies = yxxxiq555xwwqqhxxxxxholidaies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dxxxiq155xwwqqhxxxxxresidency")
	public Set<Jxxxbh400xwwqqhxxxxxemployee> getJxxxbh400xwwqqhxxxxxemployees() {
		return this.jxxxbh400xwwqqhxxxxxemployees;
	}

	public void setJxxxbh400xwwqqhxxxxxemployees(
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployees) {
		this.jxxxbh400xwwqqhxxxxxemployees = jxxxbh400xwwqqhxxxxxemployees;
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
package com.rcomputer.genapp.model;
// Generated 28-Jun-2023 5:43:26 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * Yxxxch65exwwqqhxxxxxglentries generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "glentries")
public class Yxxxch65exwwqqhxxxxxglentries implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Yxxxuq632xwwqqhxxxxxperioddates yxxxuq632xwwqqhxxxxxperioddates;
	private Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount;
	private String a0xxungjbvxxxxxxxxxxglentryno;
	private String b1xxuzsxbvxxxxxxxxxxdescript;
	private String b3xxuxxrbvxxxxxxxxxxrefcode;
	private Date b5xxcxxrlxxxxxxxxxxxpostdate;
	private Date b6xxcxxrlxxxxxxxxxxxcalendardt;
	private Integer y1xxuxexbvxxxxxxxxxxdepcode;
	private Integer y2xxuxoxbvxxxxxxxxxxdivcode;
	private BigDecimal c4xxzxxxbvxxtxxxxxxxtdebitamt;
	private BigDecimal c5xxzxxxbvxxxxxxxxxxtcreditamt;
	private String y8xxuznxbvxxxxxxxxxxnotes;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String z2xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Xorxeh66exwwqqhxxxxxgentriesdetails> xorxeh66exwwqqhxxxxxgentriesdetailses = new HashSet<Xorxeh66exwwqqhxxxxxgentriesdetails>(
			0);

	public Yxxxch65exwwqqhxxxxxglentries() {
	}

	public Yxxxch65exwwqqhxxxxxglentries(String a0xxungjbvxxxxxxxxxxglentryno) {
		this.a0xxungjbvxxxxxxxxxxglentryno = a0xxungjbvxxxxxxxxxxglentryno;
	}
	public Yxxxch65exwwqqhxxxxxglentries(
			Yxxxuq632xwwqqhxxxxxperioddates yxxxuq632xwwqqhxxxxxperioddates,
			Yxxxch601xwwqqhxxxxxaccount yxxxch601xwwqqhxxxxxaccount,
			String a0xxungjbvxxxxxxxxxxglentryno,
			String b1xxuzsxbvxxxxxxxxxxdescript,
			String b3xxuxxrbvxxxxxxxxxxrefcode,
			Date b5xxcxxrlxxxxxxxxxxxpostdate,
			Date b6xxcxxrlxxxxxxxxxxxcalendardt,
			Integer y1xxuxexbvxxxxxxxxxxdepcode,
			Integer y2xxuxoxbvxxxxxxxxxxdivcode,
			BigDecimal c4xxzxxxbvxxtxxxxxxxtdebitamt,
			BigDecimal c5xxzxxxbvxxxxxxxxxxtcreditamt,
			String y8xxuznxbvxxxxxxxxxxnotes,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String z2xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Xorxeh66exwwqqhxxxxxgentriesdetails> xorxeh66exwwqqhxxxxxgentriesdetailses) {
		this.yxxxuq632xwwqqhxxxxxperioddates = yxxxuq632xwwqqhxxxxxperioddates;
		this.yxxxch601xwwqqhxxxxxaccount = yxxxch601xwwqqhxxxxxaccount;
		this.a0xxungjbvxxxxxxxxxxglentryno = a0xxungjbvxxxxxxxxxxglentryno;
		this.b1xxuzsxbvxxxxxxxxxxdescript = b1xxuzsxbvxxxxxxxxxxdescript;
		this.b3xxuxxrbvxxxxxxxxxxrefcode = b3xxuxxrbvxxxxxxxxxxrefcode;
		this.b5xxcxxrlxxxxxxxxxxxpostdate = b5xxcxxrlxxxxxxxxxxxpostdate;
		this.b6xxcxxrlxxxxxxxxxxxcalendardt = b6xxcxxrlxxxxxxxxxxxcalendardt;
		this.y1xxuxexbvxxxxxxxxxxdepcode = y1xxuxexbvxxxxxxxxxxdepcode;
		this.y2xxuxoxbvxxxxxxxxxxdivcode = y2xxuxoxbvxxxxxxxxxxdivcode;
		this.c4xxzxxxbvxxtxxxxxxxtdebitamt = c4xxzxxxbvxxtxxxxxxxtdebitamt;
		this.c5xxzxxxbvxxxxxxxxxxtcreditamt = c5xxzxxxbvxxxxxxxxxxtcreditamt;
		this.y8xxuznxbvxxxxxxxxxxnotes = y8xxuznxbvxxxxxxxxxxnotes;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.z2xxutoxlhxxxxxxxxxxowner = z2xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.xorxeh66exwwqqhxxxxxgentriesdetailses = xorxeh66exwwqqhxxxxxgentriesdetailses;
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
	@JoinColumn(name = "period")
	public Yxxxuq632xwwqqhxxxxxperioddates getYxxxuq632xwwqqhxxxxxperioddates() {
		return this.yxxxuq632xwwqqhxxxxxperioddates;
	}

	public void setYxxxuq632xwwqqhxxxxxperioddates(
			Yxxxuq632xwwqqhxxxxxperioddates yxxxuq632xwwqqhxxxxxperioddates) {
		this.yxxxuq632xwwqqhxxxxxperioddates = yxxxuq632xwwqqhxxxxxperioddates;
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

	@Column(name = "glentryno", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxungjbvxxxxxxxxxxglentryno() {
		return this.a0xxungjbvxxxxxxxxxxglentryno;
	}

	public void setA0xxungjbvxxxxxxxxxxglentryno(
			String a0xxungjbvxxxxxxxxxxglentryno) {
		this.a0xxungjbvxxxxxxxxxxglentryno = a0xxungjbvxxxxxxxxxxglentryno;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getB1xxuzsxbvxxxxxxxxxxdescript() {
		return this.b1xxuzsxbvxxxxxxxxxxdescript;
	}

	public void setB1xxuzsxbvxxxxxxxxxxdescript(
			String b1xxuzsxbvxxxxxxxxxxdescript) {
		this.b1xxuzsxbvxxxxxxxxxxdescript = b1xxuzsxbvxxxxxxxxxxdescript;
	}

	@Column(name = "refcode", length = 20)
	@Size(max = 20)
	public String getB3xxuxxrbvxxxxxxxxxxrefcode() {
		return this.b3xxuxxrbvxxxxxxxxxxrefcode;
	}

	public void setB3xxuxxrbvxxxxxxxxxxrefcode(
			String b3xxuxxrbvxxxxxxxxxxrefcode) {
		this.b3xxuxxrbvxxxxxxxxxxrefcode = b3xxuxxrbvxxxxxxxxxxrefcode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "postdate", length = 29)
	public Date getB5xxcxxrlxxxxxxxxxxxpostdate() {
		return this.b5xxcxxrlxxxxxxxxxxxpostdate;
	}

	public void setB5xxcxxrlxxxxxxxxxxxpostdate(
			Date b5xxcxxrlxxxxxxxxxxxpostdate) {
		this.b5xxcxxrlxxxxxxxxxxxpostdate = b5xxcxxrlxxxxxxxxxxxpostdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "calendardt", length = 29)
	public Date getB6xxcxxrlxxxxxxxxxxxcalendardt() {
		return this.b6xxcxxrlxxxxxxxxxxxcalendardt;
	}

	public void setB6xxcxxrlxxxxxxxxxxxcalendardt(
			Date b6xxcxxrlxxxxxxxxxxxcalendardt) {
		this.b6xxcxxrlxxxxxxxxxxxcalendardt = b6xxcxxrlxxxxxxxxxxxcalendardt;
	}

	@Column(name = "depcode")
	public Integer getY1xxuxexbvxxxxxxxxxxdepcode() {
		return this.y1xxuxexbvxxxxxxxxxxdepcode;
	}

	public void setY1xxuxexbvxxxxxxxxxxdepcode(
			Integer y1xxuxexbvxxxxxxxxxxdepcode) {
		this.y1xxuxexbvxxxxxxxxxxdepcode = y1xxuxexbvxxxxxxxxxxdepcode;
	}

	@Column(name = "divcode")
	public Integer getY2xxuxoxbvxxxxxxxxxxdivcode() {
		return this.y2xxuxoxbvxxxxxxxxxxdivcode;
	}

	public void setY2xxuxoxbvxxxxxxxxxxdivcode(
			Integer y2xxuxoxbvxxxxxxxxxxdivcode) {
		this.y2xxuxoxbvxxxxxxxxxxdivcode = y2xxuxoxbvxxxxxxxxxxdivcode;
	}

	@Column(name = "tdebitamt", precision = 14)
	public BigDecimal getC4xxzxxxbvxxtxxxxxxxtdebitamt() {
		return this.c4xxzxxxbvxxtxxxxxxxtdebitamt;
	}

	public void setC4xxzxxxbvxxtxxxxxxxtdebitamt(
			BigDecimal c4xxzxxxbvxxtxxxxxxxtdebitamt) {
		this.c4xxzxxxbvxxtxxxxxxxtdebitamt = c4xxzxxxbvxxtxxxxxxxtdebitamt;
	}

	@Column(name = "tcreditamt", precision = 14)
	public BigDecimal getC5xxzxxxbvxxxxxxxxxxtcreditamt() {
		return this.c5xxzxxxbvxxxxxxxxxxtcreditamt;
	}

	public void setC5xxzxxxbvxxxxxxxxxxtcreditamt(
			BigDecimal c5xxzxxxbvxxxxxxxxxxtcreditamt) {
		this.c5xxzxxxbvxxxxxxxxxxtcreditamt = c5xxzxxxbvxxxxxxxxxxtcreditamt;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getY8xxuznxbvxxxxxxxxxxnotes() {
		return this.y8xxuznxbvxxxxxxxxxxnotes;
	}

	public void setY8xxuznxbvxxxxxxxxxxnotes(String y8xxuznxbvxxxxxxxxxxnotes) {
		this.y8xxuznxbvxxxxxxxxxxnotes = y8xxuznxbvxxxxxxxxxxnotes;
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

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ2xxutoxlhxxxxxxxxxxowner() {
		return this.z2xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ2xxutoxlhxxxxxxxxxxowner(String z2xxutoxlhxxxxxxxxxxowner) {
		this.z2xxutoxlhxxxxxxxxxxowner = z2xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "yxxxch65exwwqqhxxxxxglentries")
	public Set<Xorxeh66exwwqqhxxxxxgentriesdetails> getXorxeh66exwwqqhxxxxxgentriesdetailses() {
		return this.xorxeh66exwwqqhxxxxxgentriesdetailses;
	}

	public void setXorxeh66exwwqqhxxxxxgentriesdetailses(
			Set<Xorxeh66exwwqqhxxxxxgentriesdetails> xorxeh66exwwqqhxxxxxgentriesdetailses) {
		this.xorxeh66exwwqqhxxxxxgentriesdetailses = xorxeh66exwwqqhxxxxxgentriesdetailses;
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

package com.rcomputer.genapp.model;
// Generated 28-Jun-2023 5:43:26 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
 * Yxxxuq591xwwqqhxxxxxrate1f generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "rate1f")
public class Yxxxuq591xwwqqhxxxxxrate1f implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private String a0xxukxxbvxxxxxxxxxxusertype;
	private String b1xxuxxrbvxxxxxxxxxxprodtype;
	private String b2xxuxxrbv51xxxxxxxxstepname;
	private Integer b3xxzxxrbvxxxxxxxxxxstep;
	private BigDecimal b4xxcxxrbvxxxxxxxxxxvalue;
	private Date h1xxcxxrbvxxxxxxxxxxeffdate;
	private Date h2xxcxxrbvxxxxxxxxxxenddate;
	private String h3xxuxxrbvxxxxxxxxxxincentive;
	private Date h5xxcxxrbvxxxxxxxxxxieffdate;
	private Date h6xxcxxrbvxxxxxxxxxxienddate;
	private String z4xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;

	public Yxxxuq591xwwqqhxxxxxrate1f() {
	}

	public Yxxxuq591xwwqqhxxxxxrate1f(String a0xxukxxbvxxxxxxxxxxusertype,
			String b1xxuxxrbvxxxxxxxxxxprodtype,
			String b2xxuxxrbv51xxxxxxxxstepname) {
		this.a0xxukxxbvxxxxxxxxxxusertype = a0xxukxxbvxxxxxxxxxxusertype;
		this.b1xxuxxrbvxxxxxxxxxxprodtype = b1xxuxxrbvxxxxxxxxxxprodtype;
		this.b2xxuxxrbv51xxxxxxxxstepname = b2xxuxxrbv51xxxxxxxxstepname;
	}
	public Yxxxuq591xwwqqhxxxxxrate1f(String a0xxukxxbvxxxxxxxxxxusertype,
			String b1xxuxxrbvxxxxxxxxxxprodtype,
			String b2xxuxxrbv51xxxxxxxxstepname,
			Integer b3xxzxxrbvxxxxxxxxxxstep,
			BigDecimal b4xxcxxrbvxxxxxxxxxxvalue,
			Date h1xxcxxrbvxxxxxxxxxxeffdate, Date h2xxcxxrbvxxxxxxxxxxenddate,
			String h3xxuxxrbvxxxxxxxxxxincentive,
			Date h5xxcxxrbvxxxxxxxxxxieffdate,
			Date h6xxcxxrbvxxxxxxxxxxienddate,
			String z4xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt) {
		this.a0xxukxxbvxxxxxxxxxxusertype = a0xxukxxbvxxxxxxxxxxusertype;
		this.b1xxuxxrbvxxxxxxxxxxprodtype = b1xxuxxrbvxxxxxxxxxxprodtype;
		this.b2xxuxxrbv51xxxxxxxxstepname = b2xxuxxrbv51xxxxxxxxstepname;
		this.b3xxzxxrbvxxxxxxxxxxstep = b3xxzxxrbvxxxxxxxxxxstep;
		this.b4xxcxxrbvxxxxxxxxxxvalue = b4xxcxxrbvxxxxxxxxxxvalue;
		this.h1xxcxxrbvxxxxxxxxxxeffdate = h1xxcxxrbvxxxxxxxxxxeffdate;
		this.h2xxcxxrbvxxxxxxxxxxenddate = h2xxcxxrbvxxxxxxxxxxenddate;
		this.h3xxuxxrbvxxxxxxxxxxincentive = h3xxuxxrbvxxxxxxxxxxincentive;
		this.h5xxcxxrbvxxxxxxxxxxieffdate = h5xxcxxrbvxxxxxxxxxxieffdate;
		this.h6xxcxxrbvxxxxxxxxxxienddate = h6xxcxxrbvxxxxxxxxxxienddate;
		this.z4xxutoxlhxxxxxxxxxxowner = z4xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
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

	@Column(name = "usertype", nullable = false, length = 12)
	@NotNull
	@Size(max = 12)
	public String getA0xxukxxbvxxxxxxxxxxusertype() {
		return this.a0xxukxxbvxxxxxxxxxxusertype;
	}

	public void setA0xxukxxbvxxxxxxxxxxusertype(
			String a0xxukxxbvxxxxxxxxxxusertype) {
		this.a0xxukxxbvxxxxxxxxxxusertype = a0xxukxxbvxxxxxxxxxxusertype;
	}

	@Column(name = "prodtype", nullable = false, length = 12)
	@NotNull
	@Size(max = 12)
	public String getB1xxuxxrbvxxxxxxxxxxprodtype() {
		return this.b1xxuxxrbvxxxxxxxxxxprodtype;
	}

	public void setB1xxuxxrbvxxxxxxxxxxprodtype(
			String b1xxuxxrbvxxxxxxxxxxprodtype) {
		this.b1xxuxxrbvxxxxxxxxxxprodtype = b1xxuxxrbvxxxxxxxxxxprodtype;
	}

	@Column(name = "stepname", nullable = false, length = 25)
	@NotNull
	@Size(max = 25)
	public String getB2xxuxxrbv51xxxxxxxxstepname() {
		return this.b2xxuxxrbv51xxxxxxxxstepname;
	}

	public void setB2xxuxxrbv51xxxxxxxxstepname(
			String b2xxuxxrbv51xxxxxxxxstepname) {
		this.b2xxuxxrbv51xxxxxxxxstepname = b2xxuxxrbv51xxxxxxxxstepname;
	}

	@Column(name = "step")
	public Integer getB3xxzxxrbvxxxxxxxxxxstep() {
		return this.b3xxzxxrbvxxxxxxxxxxstep;
	}

	public void setB3xxzxxrbvxxxxxxxxxxstep(Integer b3xxzxxrbvxxxxxxxxxxstep) {
		this.b3xxzxxrbvxxxxxxxxxxstep = b3xxzxxrbvxxxxxxxxxxstep;
	}

	@Column(name = "value", precision = 14)
	public BigDecimal getB4xxcxxrbvxxxxxxxxxxvalue() {
		return this.b4xxcxxrbvxxxxxxxxxxvalue;
	}

	public void setB4xxcxxrbvxxxxxxxxxxvalue(
			BigDecimal b4xxcxxrbvxxxxxxxxxxvalue) {
		this.b4xxcxxrbvxxxxxxxxxxvalue = b4xxcxxrbvxxxxxxxxxxvalue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "effdate", length = 29)
	public Date getH1xxcxxrbvxxxxxxxxxxeffdate() {
		return this.h1xxcxxrbvxxxxxxxxxxeffdate;
	}

	public void setH1xxcxxrbvxxxxxxxxxxeffdate(Date h1xxcxxrbvxxxxxxxxxxeffdate) {
		this.h1xxcxxrbvxxxxxxxxxxeffdate = h1xxcxxrbvxxxxxxxxxxeffdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "enddate", length = 29)
	public Date getH2xxcxxrbvxxxxxxxxxxenddate() {
		return this.h2xxcxxrbvxxxxxxxxxxenddate;
	}

	public void setH2xxcxxrbvxxxxxxxxxxenddate(Date h2xxcxxrbvxxxxxxxxxxenddate) {
		this.h2xxcxxrbvxxxxxxxxxxenddate = h2xxcxxrbvxxxxxxxxxxenddate;
	}

	@Column(name = "incentive", length = 25)
	@Size(max = 25)
	public String getH3xxuxxrbvxxxxxxxxxxincentive() {
		return this.h3xxuxxrbvxxxxxxxxxxincentive;
	}

	public void setH3xxuxxrbvxxxxxxxxxxincentive(
			String h3xxuxxrbvxxxxxxxxxxincentive) {
		this.h3xxuxxrbvxxxxxxxxxxincentive = h3xxuxxrbvxxxxxxxxxxincentive;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ieffdate", length = 29)
	public Date getH5xxcxxrbvxxxxxxxxxxieffdate() {
		return this.h5xxcxxrbvxxxxxxxxxxieffdate;
	}

	public void setH5xxcxxrbvxxxxxxxxxxieffdate(
			Date h5xxcxxrbvxxxxxxxxxxieffdate) {
		this.h5xxcxxrbvxxxxxxxxxxieffdate = h5xxcxxrbvxxxxxxxxxxieffdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ienddate", length = 29)
	public Date getH6xxcxxrbvxxxxxxxxxxienddate() {
		return this.h6xxcxxrbvxxxxxxxxxxienddate;
	}

	public void setH6xxcxxrbvxxxxxxxxxxienddate(
			Date h6xxcxxrbvxxxxxxxxxxienddate) {
		this.h6xxcxxrbvxxxxxxxxxxienddate = h6xxcxxrbvxxxxxxxxxxienddate;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ4xxutoxlhxxxxxxxxxxowner() {
		return this.z4xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ4xxutoxlhxxxxxxxxxxowner(String z4xxutoxlhxxxxxxxxxxowner) {
		this.z4xxutoxlhxxxxxxxxxxowner = z4xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
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

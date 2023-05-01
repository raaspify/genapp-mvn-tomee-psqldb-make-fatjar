package com.rcomputer.genapp.model;
// Generated 19-Mar-2023 9:37:01 PM by Hibernate Tools 4.0.0

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Yxxxuq1r1xwwqqhxxxxxresource generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "resource")
public class Yxxxuq1r1xwwqqhxxxxxresource implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Yxxxuq1l1xwwqqhxxxxxresource_bundle yxxxuq1l1xwwqqhxxxxxresource_bundle;
	private String a0xxukrdbvxxxxxxxxxxkey;
	private String a1xxuxxxbvxxxxxxxxxxvalue;
	private Integer zixxzzfxhhxxxxxxxxxxstatusfl;
	private Date zjxxcztxlxxxxxxxxxxxstatusfldt;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Yxxxuq1r1xwwqqhxxxxxresource() {
	}

	public Yxxxuq1r1xwwqqhxxxxxresource(
			Yxxxuq1l1xwwqqhxxxxxresource_bundle yxxxuq1l1xwwqqhxxxxxresource_bundle) {
		this.yxxxuq1l1xwwqqhxxxxxresource_bundle = yxxxuq1l1xwwqqhxxxxxresource_bundle;
	}
	public Yxxxuq1r1xwwqqhxxxxxresource(
			Yxxxuq1l1xwwqqhxxxxxresource_bundle yxxxuq1l1xwwqqhxxxxxresource_bundle,
			String a0xxukrdbvxxxxxxxxxxkey, String a1xxuxxxbvxxxxxxxxxxvalue,
			Integer zixxzzfxhhxxxxxxxxxxstatusfl,
			Date zjxxcztxlxxxxxxxxxxxstatusfldt,
			String z3xxutoxlhxxxxxxxxxxowner, String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.yxxxuq1l1xwwqqhxxxxxresource_bundle = yxxxuq1l1xwwqqhxxxxxresource_bundle;
		this.a0xxukrdbvxxxxxxxxxxkey = a0xxukrdbvxxxxxxxxxxkey;
		this.a1xxuxxxbvxxxxxxxxxxvalue = a1xxuxxxbvxxxxxxxxxxvalue;
		this.zixxzzfxhhxxxxxxxxxxstatusfl = zixxzzfxhhxxxxxxxxxxstatusfl;
		this.zjxxcztxlxxxxxxxxxxxstatusfldt = zjxxcztxlxxxxxxxxxxxstatusfldt;
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
	@JoinColumn(name = "resourcebundle", nullable = false)
	@NotNull
	public Yxxxuq1l1xwwqqhxxxxxresource_bundle getYxxxuq1l1xwwqqhxxxxxresource_bundle() {
		return this.yxxxuq1l1xwwqqhxxxxxresource_bundle;
	}

	public void setYxxxuq1l1xwwqqhxxxxxresource_bundle(
			Yxxxuq1l1xwwqqhxxxxxresource_bundle yxxxuq1l1xwwqqhxxxxxresource_bundle) {
		this.yxxxuq1l1xwwqqhxxxxxresource_bundle = yxxxuq1l1xwwqqhxxxxxresource_bundle;
	}

	@Column(name = "_key", length = 50)
	@Size(max = 50)
	public String getA0xxukrdbvxxxxxxxxxxkey() {
		return this.a0xxukrdbvxxxxxxxxxxkey;
	}

	public void setA0xxukrdbvxxxxxxxxxxkey(String a0xxukrdbvxxxxxxxxxxkey) {
		this.a0xxukrdbvxxxxxxxxxxkey = a0xxukrdbvxxxxxxxxxxkey;
	}

	@Column(name = "_value", length = 2555)
	@Size(max = 2555)
	public String getA1xxuxxxbvxxxxxxxxxxvalue() {
		return this.a1xxuxxxbvxxxxxxxxxxvalue;
	}

	public void setA1xxuxxxbvxxxxxxxxxxvalue(String a1xxuxxxbvxxxxxxxxxxvalue) {
		this.a1xxuxxxbvxxxxxxxxxxvalue = a1xxuxxxbvxxxxxxxxxxvalue;
	}

	@Column(name = "statusfl")
	public Integer getZixxzzfxhhxxxxxxxxxxstatusfl() {
		return this.zixxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZixxzzfxhhxxxxxxxxxxstatusfl(
			Integer zixxzzfxhhxxxxxxxxxxstatusfl) {
		this.zixxzzfxhhxxxxxxxxxxstatusfl = zixxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZjxxcztxlxxxxxxxxxxxstatusfldt() {
		return this.zjxxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZjxxcztxlxxxxxxxxxxxstatusfldt(
			Date zjxxcztxlxxxxxxxxxxxstatusfldt) {
		this.zjxxcztxlxxxxxxxxxxxstatusfldt = zjxxcztxlxxxxxxxxxxxstatusfldt;
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

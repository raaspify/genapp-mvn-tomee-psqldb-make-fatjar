package com.rcomputer.genapp.model;
// Generated 19-Mar-2023 9:37:01 PM by Hibernate Tools 4.0.0

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
 * Xlrxeh675xwwqqhxxxxxcjournal generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "cjournal")
public class Xlrxeh675xwwqqhxxxxxcjournal implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private String a0xxujpshvxxsxxxxxxxxpostdate;
	private Date b1xxcjpdhvxxxxxxxxxxpostdate;
	private Date b2xxcwcdhvxxxxxxxxxxcalendardt;
	private String b3xxujjtbvxxxxxxxxxxjrnltype;
	private String b4xxzjbxbvxxxxxxxxxxjnlseqb;
	private Integer b5cczjsibvxxxxxxxxxxjnlseq;
	private String b6xxzjjsbvxxxxxxxxxxjnlseqs;
	private Integer c1xxzwppbvpxxxxxxxxxperiod;
	private String c4xxuxexbvxxxxxxxxxxcontrol;
	private BigDecimal c5xxzwdxlvxxxxxxxxxxdebit;
	private BigDecimal c6xxzwrxlvxxxxxxxxxxcredit;
	private String c7xxuwfxrbvxxxxxxxxxxreference;
	private String c8xxuzsxbvxxxxxxxxxxdescript;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private String z2xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Xlrxeh675xwwqqhxxxxxcjournal() {
	}

	public Xlrxeh675xwwqqhxxxxxcjournal(String a0xxujpshvxxsxxxxxxxxpostdate) {
		this.a0xxujpshvxxsxxxxxxxxpostdate = a0xxujpshvxxsxxxxxxxxpostdate;
	}
	public Xlrxeh675xwwqqhxxxxxcjournal(String a0xxujpshvxxsxxxxxxxxpostdate,
			Date b1xxcjpdhvxxxxxxxxxxpostdate,
			Date b2xxcwcdhvxxxxxxxxxxcalendardt,
			String b3xxujjtbvxxxxxxxxxxjrnltype,
			String b4xxzjbxbvxxxxxxxxxxjnlseqb,
			Integer b5cczjsibvxxxxxxxxxxjnlseq,
			String b6xxzjjsbvxxxxxxxxxxjnlseqs,
			Integer c1xxzwppbvpxxxxxxxxxperiod,
			String c4xxuxexbvxxxxxxxxxxcontrol,
			BigDecimal c5xxzwdxlvxxxxxxxxxxdebit,
			BigDecimal c6xxzwrxlvxxxxxxxxxxcredit,
			String c7xxuwfxrbvxxxxxxxxxxreference,
			String c8xxuzsxbvxxxxxxxxxxdescript,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			String z2xxutoxlhxxxxxxxxxxowner, String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.a0xxujpshvxxsxxxxxxxxpostdate = a0xxujpshvxxsxxxxxxxxpostdate;
		this.b1xxcjpdhvxxxxxxxxxxpostdate = b1xxcjpdhvxxxxxxxxxxpostdate;
		this.b2xxcwcdhvxxxxxxxxxxcalendardt = b2xxcwcdhvxxxxxxxxxxcalendardt;
		this.b3xxujjtbvxxxxxxxxxxjrnltype = b3xxujjtbvxxxxxxxxxxjrnltype;
		this.b4xxzjbxbvxxxxxxxxxxjnlseqb = b4xxzjbxbvxxxxxxxxxxjnlseqb;
		this.b5cczjsibvxxxxxxxxxxjnlseq = b5cczjsibvxxxxxxxxxxjnlseq;
		this.b6xxzjjsbvxxxxxxxxxxjnlseqs = b6xxzjjsbvxxxxxxxxxxjnlseqs;
		this.c1xxzwppbvpxxxxxxxxxperiod = c1xxzwppbvpxxxxxxxxxperiod;
		this.c4xxuxexbvxxxxxxxxxxcontrol = c4xxuxexbvxxxxxxxxxxcontrol;
		this.c5xxzwdxlvxxxxxxxxxxdebit = c5xxzwdxlvxxxxxxxxxxdebit;
		this.c6xxzwrxlvxxxxxxxxxxcredit = c6xxzwrxlvxxxxxxxxxxcredit;
		this.c7xxuwfxrbvxxxxxxxxxxreference = c7xxuwfxrbvxxxxxxxxxxreference;
		this.c8xxuzsxbvxxxxxxxxxxdescript = c8xxuzsxbvxxxxxxxxxxdescript;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxutoxlhxxxxxxxxxxowner = z2xxutoxlhxxxxxxxxxxowner;
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

	@Column(name = "spostdate", nullable = false, length = 25)
	@NotNull
	@Size(max = 25)
	public String getA0xxujpshvxxsxxxxxxxxpostdate() {
		return this.a0xxujpshvxxsxxxxxxxxpostdate;
	}

	public void setA0xxujpshvxxsxxxxxxxxpostdate(
			String a0xxujpshvxxsxxxxxxxxpostdate) {
		this.a0xxujpshvxxsxxxxxxxxpostdate = a0xxujpshvxxsxxxxxxxxpostdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "postdate", length = 29)
	public Date getB1xxcjpdhvxxxxxxxxxxpostdate() {
		return this.b1xxcjpdhvxxxxxxxxxxpostdate;
	}

	public void setB1xxcjpdhvxxxxxxxxxxpostdate(
			Date b1xxcjpdhvxxxxxxxxxxpostdate) {
		this.b1xxcjpdhvxxxxxxxxxxpostdate = b1xxcjpdhvxxxxxxxxxxpostdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "calendardt", length = 29)
	public Date getB2xxcwcdhvxxxxxxxxxxcalendardt() {
		return this.b2xxcwcdhvxxxxxxxxxxcalendardt;
	}

	public void setB2xxcwcdhvxxxxxxxxxxcalendardt(
			Date b2xxcwcdhvxxxxxxxxxxcalendardt) {
		this.b2xxcwcdhvxxxxxxxxxxcalendardt = b2xxcwcdhvxxxxxxxxxxcalendardt;
	}

	@Column(name = "jrnltype", length = 12)
	@Size(max = 12)
	public String getB3xxujjtbvxxxxxxxxxxjrnltype() {
		return this.b3xxujjtbvxxxxxxxxxxjrnltype;
	}

	public void setB3xxujjtbvxxxxxxxxxxjrnltype(
			String b3xxujjtbvxxxxxxxxxxjrnltype) {
		this.b3xxujjtbvxxxxxxxxxxjrnltype = b3xxujjtbvxxxxxxxxxxjrnltype;
	}

	@Column(name = "jnlseqb", length = 15)
	@Size(max = 15)
	public String getB4xxzjbxbvxxxxxxxxxxjnlseqb() {
		return this.b4xxzjbxbvxxxxxxxxxxjnlseqb;
	}

	public void setB4xxzjbxbvxxxxxxxxxxjnlseqb(
			String b4xxzjbxbvxxxxxxxxxxjnlseqb) {
		this.b4xxzjbxbvxxxxxxxxxxjnlseqb = b4xxzjbxbvxxxxxxxxxxjnlseqb;
	}

	@Column(name = "jnlseq")
	public Integer getB5cczjsibvxxxxxxxxxxjnlseq() {
		return this.b5cczjsibvxxxxxxxxxxjnlseq;
	}

	public void setB5cczjsibvxxxxxxxxxxjnlseq(Integer b5cczjsibvxxxxxxxxxxjnlseq) {
		this.b5cczjsibvxxxxxxxxxxjnlseq = b5cczjsibvxxxxxxxxxxjnlseq;
	}

	@Column(name = "jnlseqs", length = 15)
	@Size(max = 15)
	public String getB6xxzjjsbvxxxxxxxxxxjnlseqs() {
		return this.b6xxzjjsbvxxxxxxxxxxjnlseqs;
	}

	public void setB6xxzjjsbvxxxxxxxxxxjnlseqs(
			String b6xxzjjsbvxxxxxxxxxxjnlseqs) {
		this.b6xxzjjsbvxxxxxxxxxxjnlseqs = b6xxzjjsbvxxxxxxxxxxjnlseqs;
	}

	@Column(name = "period")
	public Integer getC1xxzwppbvpxxxxxxxxxperiod() {
		return this.c1xxzwppbvpxxxxxxxxxperiod;
	}

	public void setC1xxzwppbvpxxxxxxxxxperiod(Integer c1xxzwppbvpxxxxxxxxxperiod) {
		this.c1xxzwppbvpxxxxxxxxxperiod = c1xxzwppbvpxxxxxxxxxperiod;
	}

	@Column(name = "control", length = 20)
	@Size(max = 20)
	public String getC4xxuxexbvxxxxxxxxxxcontrol() {
		return this.c4xxuxexbvxxxxxxxxxxcontrol;
	}

	public void setC4xxuxexbvxxxxxxxxxxcontrol(
			String c4xxuxexbvxxxxxxxxxxcontrol) {
		this.c4xxuxexbvxxxxxxxxxxcontrol = c4xxuxexbvxxxxxxxxxxcontrol;
	}

	@Column(name = "debit", precision = 14)
	public BigDecimal getC5xxzwdxlvxxxxxxxxxxdebit() {
		return this.c5xxzwdxlvxxxxxxxxxxdebit;
	}

	public void setC5xxzwdxlvxxxxxxxxxxdebit(
			BigDecimal c5xxzwdxlvxxxxxxxxxxdebit) {
		this.c5xxzwdxlvxxxxxxxxxxdebit = c5xxzwdxlvxxxxxxxxxxdebit;
	}

	@Column(name = "credit", precision = 14)
	public BigDecimal getC6xxzwrxlvxxxxxxxxxxcredit() {
		return this.c6xxzwrxlvxxxxxxxxxxcredit;
	}

	public void setC6xxzwrxlvxxxxxxxxxxcredit(
			BigDecimal c6xxzwrxlvxxxxxxxxxxcredit) {
		this.c6xxzwrxlvxxxxxxxxxxcredit = c6xxzwrxlvxxxxxxxxxxcredit;
	}

	@Column(name = "xreference", length = 20)
	@Size(max = 20)
	public String getC7xxuwfxrbvxxxxxxxxxxreference() {
		return this.c7xxuwfxrbvxxxxxxxxxxreference;
	}

	public void setC7xxuwfxrbvxxxxxxxxxxreference(
			String c7xxuwfxrbvxxxxxxxxxxreference) {
		this.c7xxuwfxrbvxxxxxxxxxxreference = c7xxuwfxrbvxxxxxxxxxxreference;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getC8xxuzsxbvxxxxxxxxxxdescript() {
		return this.c8xxuzsxbvxxxxxxxxxxdescript;
	}

	public void setC8xxuzsxbvxxxxxxxxxxdescript(
			String c8xxuzsxbvxxxxxxxxxxdescript) {
		this.c8xxuzsxbvxxxxxxxxxxdescript = c8xxuzsxbvxxxxxxxxxxdescript;
	}

	@Column(name = "statusfl")
	public Integer getZ1xxzzfxhhxxxxxxxxxxstatusfl() {
		return this.z1xxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZ1xxzzfxhhxxxxxxxxxxstatusfl(
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl) {
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
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

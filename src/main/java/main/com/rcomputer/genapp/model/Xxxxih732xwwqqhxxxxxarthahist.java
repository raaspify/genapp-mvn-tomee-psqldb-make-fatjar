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
 * Xxxxih732xwwqqhxxxxxarthahist generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "arthahist")
public class Xxxxih732xwwqqhxxxxxarthahist implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private String a0xxukaxbvxxxxxxxxxxwageearner;
	private String b1xxutsxbvxxxxxxxxxxsin;
	private Integer b2xxzwprbvpxxxxxxxxxperiod;
	private Integer b3xxzxxrbvxxxxxxxxxxmonth;
	private Integer b4xxzxxrbvxxxxxxxxxxccyy;
	private BigDecimal b5xxztvalvxxxxxxxxxxvacation;
	private BigDecimal b6xxztwalvxxxxxxxxxxwage;
	private BigDecimal b7xxztoslvxxxxxxxxxxovertime;
	private BigDecimal b8xxztsolvxxxxxxxxxxsalary;
	private BigDecimal b9xxzxxxavxxxxxxxxxxcommission;
	private BigDecimal c1xxzxxxlvxxxxxxxxxxbenefit;
	private BigDecimal c2xxzxxxlvxxxxxxxxxxfincometx;
	private BigDecimal c3xxzxxxlvxxxxxxxxxxpincometx;
	private BigDecimal c4xxzxxxlvxxxxxxxxxxwcbout;
	private BigDecimal c5xxzxxxlvxxxxxxxxxxemplinsur;
	private BigDecimal c6xxzxxxlvxxxxxxxxxxvacpayout;
	private BigDecimal c7xxzxxxlvxxxxxxxxxxadvance;
	private BigDecimal c8xxzxxxlvxxxxxxxxxxfpensobtx;
	private BigDecimal c9xxzxxxlvxxxxxxxxxxfpensoatx;
	private BigDecimal d1xxzxxxlvxxxxxxxxxxuniondues;
	private BigDecimal d2xxzxxxlvxxxxxxxxxxmedical;
	private BigDecimal d3xxzxxxlvxxxxxxxxxxpayamt;
	private String d4xxuznxbvxxxxxxxxxxnotes;
	private String d5xxuxxrbvxxxxxxxxxxnotes2;
	private String d6xxuxxrbvxxxxxxxxxxchqnumber;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Xxxxih732xwwqqhxxxxxarthahist() {
	}

	public Xxxxih732xwwqqhxxxxxarthahist(String a0xxukaxbvxxxxxxxxxxwageearner) {
		this.a0xxukaxbvxxxxxxxxxxwageearner = a0xxukaxbvxxxxxxxxxxwageearner;
	}
	public Xxxxih732xwwqqhxxxxxarthahist(String a0xxukaxbvxxxxxxxxxxwageearner,
			String b1xxutsxbvxxxxxxxxxxsin, Integer b2xxzwprbvpxxxxxxxxxperiod,
			Integer b3xxzxxrbvxxxxxxxxxxmonth,
			Integer b4xxzxxrbvxxxxxxxxxxccyy,
			BigDecimal b5xxztvalvxxxxxxxxxxvacation,
			BigDecimal b6xxztwalvxxxxxxxxxxwage,
			BigDecimal b7xxztoslvxxxxxxxxxxovertime,
			BigDecimal b8xxztsolvxxxxxxxxxxsalary,
			BigDecimal b9xxzxxxavxxxxxxxxxxcommission,
			BigDecimal c1xxzxxxlvxxxxxxxxxxbenefit,
			BigDecimal c2xxzxxxlvxxxxxxxxxxfincometx,
			BigDecimal c3xxzxxxlvxxxxxxxxxxpincometx,
			BigDecimal c4xxzxxxlvxxxxxxxxxxwcbout,
			BigDecimal c5xxzxxxlvxxxxxxxxxxemplinsur,
			BigDecimal c6xxzxxxlvxxxxxxxxxxvacpayout,
			BigDecimal c7xxzxxxlvxxxxxxxxxxadvance,
			BigDecimal c8xxzxxxlvxxxxxxxxxxfpensobtx,
			BigDecimal c9xxzxxxlvxxxxxxxxxxfpensoatx,
			BigDecimal d1xxzxxxlvxxxxxxxxxxuniondues,
			BigDecimal d2xxzxxxlvxxxxxxxxxxmedical,
			BigDecimal d3xxzxxxlvxxxxxxxxxxpayamt,
			String d4xxuznxbvxxxxxxxxxxnotes,
			String d5xxuxxrbvxxxxxxxxxxnotes2,
			String d6xxuxxrbvxxxxxxxxxxchqnumber,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String z3xxutoxlhxxxxxxxxxxowner, String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.a0xxukaxbvxxxxxxxxxxwageearner = a0xxukaxbvxxxxxxxxxxwageearner;
		this.b1xxutsxbvxxxxxxxxxxsin = b1xxutsxbvxxxxxxxxxxsin;
		this.b2xxzwprbvpxxxxxxxxxperiod = b2xxzwprbvpxxxxxxxxxperiod;
		this.b3xxzxxrbvxxxxxxxxxxmonth = b3xxzxxrbvxxxxxxxxxxmonth;
		this.b4xxzxxrbvxxxxxxxxxxccyy = b4xxzxxrbvxxxxxxxxxxccyy;
		this.b5xxztvalvxxxxxxxxxxvacation = b5xxztvalvxxxxxxxxxxvacation;
		this.b6xxztwalvxxxxxxxxxxwage = b6xxztwalvxxxxxxxxxxwage;
		this.b7xxztoslvxxxxxxxxxxovertime = b7xxztoslvxxxxxxxxxxovertime;
		this.b8xxztsolvxxxxxxxxxxsalary = b8xxztsolvxxxxxxxxxxsalary;
		this.b9xxzxxxavxxxxxxxxxxcommission = b9xxzxxxavxxxxxxxxxxcommission;
		this.c1xxzxxxlvxxxxxxxxxxbenefit = c1xxzxxxlvxxxxxxxxxxbenefit;
		this.c2xxzxxxlvxxxxxxxxxxfincometx = c2xxzxxxlvxxxxxxxxxxfincometx;
		this.c3xxzxxxlvxxxxxxxxxxpincometx = c3xxzxxxlvxxxxxxxxxxpincometx;
		this.c4xxzxxxlvxxxxxxxxxxwcbout = c4xxzxxxlvxxxxxxxxxxwcbout;
		this.c5xxzxxxlvxxxxxxxxxxemplinsur = c5xxzxxxlvxxxxxxxxxxemplinsur;
		this.c6xxzxxxlvxxxxxxxxxxvacpayout = c6xxzxxxlvxxxxxxxxxxvacpayout;
		this.c7xxzxxxlvxxxxxxxxxxadvance = c7xxzxxxlvxxxxxxxxxxadvance;
		this.c8xxzxxxlvxxxxxxxxxxfpensobtx = c8xxzxxxlvxxxxxxxxxxfpensobtx;
		this.c9xxzxxxlvxxxxxxxxxxfpensoatx = c9xxzxxxlvxxxxxxxxxxfpensoatx;
		this.d1xxzxxxlvxxxxxxxxxxuniondues = d1xxzxxxlvxxxxxxxxxxuniondues;
		this.d2xxzxxxlvxxxxxxxxxxmedical = d2xxzxxxlvxxxxxxxxxxmedical;
		this.d3xxzxxxlvxxxxxxxxxxpayamt = d3xxzxxxlvxxxxxxxxxxpayamt;
		this.d4xxuznxbvxxxxxxxxxxnotes = d4xxuznxbvxxxxxxxxxxnotes;
		this.d5xxuxxrbvxxxxxxxxxxnotes2 = d5xxuxxrbvxxxxxxxxxxnotes2;
		this.d6xxuxxrbvxxxxxxxxxxchqnumber = d6xxuxxrbvxxxxxxxxxxchqnumber;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
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

	@Column(name = "wageearner", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxukaxbvxxxxxxxxxxwageearner() {
		return this.a0xxukaxbvxxxxxxxxxxwageearner;
	}

	public void setA0xxukaxbvxxxxxxxxxxwageearner(
			String a0xxukaxbvxxxxxxxxxxwageearner) {
		this.a0xxukaxbvxxxxxxxxxxwageearner = a0xxukaxbvxxxxxxxxxxwageearner;
	}

	@Column(name = "sin", length = 12)
	@Size(max = 12)
	public String getB1xxutsxbvxxxxxxxxxxsin() {
		return this.b1xxutsxbvxxxxxxxxxxsin;
	}

	public void setB1xxutsxbvxxxxxxxxxxsin(String b1xxutsxbvxxxxxxxxxxsin) {
		this.b1xxutsxbvxxxxxxxxxxsin = b1xxutsxbvxxxxxxxxxxsin;
	}

	@Column(name = "period")
	public Integer getB2xxzwprbvpxxxxxxxxxperiod() {
		return this.b2xxzwprbvpxxxxxxxxxperiod;
	}

	public void setB2xxzwprbvpxxxxxxxxxperiod(Integer b2xxzwprbvpxxxxxxxxxperiod) {
		this.b2xxzwprbvpxxxxxxxxxperiod = b2xxzwprbvpxxxxxxxxxperiod;
	}

	@Column(name = "month")
	public Integer getB3xxzxxrbvxxxxxxxxxxmonth() {
		return this.b3xxzxxrbvxxxxxxxxxxmonth;
	}

	public void setB3xxzxxrbvxxxxxxxxxxmonth(Integer b3xxzxxrbvxxxxxxxxxxmonth) {
		this.b3xxzxxrbvxxxxxxxxxxmonth = b3xxzxxrbvxxxxxxxxxxmonth;
	}

	@Column(name = "ccyy")
	public Integer getB4xxzxxrbvxxxxxxxxxxccyy() {
		return this.b4xxzxxrbvxxxxxxxxxxccyy;
	}

	public void setB4xxzxxrbvxxxxxxxxxxccyy(Integer b4xxzxxrbvxxxxxxxxxxccyy) {
		this.b4xxzxxrbvxxxxxxxxxxccyy = b4xxzxxrbvxxxxxxxxxxccyy;
	}

	@Column(name = "vacation", precision = 14)
	public BigDecimal getB5xxztvalvxxxxxxxxxxvacation() {
		return this.b5xxztvalvxxxxxxxxxxvacation;
	}

	public void setB5xxztvalvxxxxxxxxxxvacation(
			BigDecimal b5xxztvalvxxxxxxxxxxvacation) {
		this.b5xxztvalvxxxxxxxxxxvacation = b5xxztvalvxxxxxxxxxxvacation;
	}

	@Column(name = "wage", precision = 14)
	public BigDecimal getB6xxztwalvxxxxxxxxxxwage() {
		return this.b6xxztwalvxxxxxxxxxxwage;
	}

	public void setB6xxztwalvxxxxxxxxxxwage(BigDecimal b6xxztwalvxxxxxxxxxxwage) {
		this.b6xxztwalvxxxxxxxxxxwage = b6xxztwalvxxxxxxxxxxwage;
	}

	@Column(name = "overtime", precision = 14)
	public BigDecimal getB7xxztoslvxxxxxxxxxxovertime() {
		return this.b7xxztoslvxxxxxxxxxxovertime;
	}

	public void setB7xxztoslvxxxxxxxxxxovertime(
			BigDecimal b7xxztoslvxxxxxxxxxxovertime) {
		this.b7xxztoslvxxxxxxxxxxovertime = b7xxztoslvxxxxxxxxxxovertime;
	}

	@Column(name = "salary", precision = 14)
	public BigDecimal getB8xxztsolvxxxxxxxxxxsalary() {
		return this.b8xxztsolvxxxxxxxxxxsalary;
	}

	public void setB8xxztsolvxxxxxxxxxxsalary(
			BigDecimal b8xxztsolvxxxxxxxxxxsalary) {
		this.b8xxztsolvxxxxxxxxxxsalary = b8xxztsolvxxxxxxxxxxsalary;
	}

	@Column(name = "commission", precision = 14)
	public BigDecimal getB9xxzxxxavxxxxxxxxxxcommission() {
		return this.b9xxzxxxavxxxxxxxxxxcommission;
	}

	public void setB9xxzxxxavxxxxxxxxxxcommission(
			BigDecimal b9xxzxxxavxxxxxxxxxxcommission) {
		this.b9xxzxxxavxxxxxxxxxxcommission = b9xxzxxxavxxxxxxxxxxcommission;
	}

	@Column(name = "benefit", precision = 14)
	public BigDecimal getC1xxzxxxlvxxxxxxxxxxbenefit() {
		return this.c1xxzxxxlvxxxxxxxxxxbenefit;
	}

	public void setC1xxzxxxlvxxxxxxxxxxbenefit(
			BigDecimal c1xxzxxxlvxxxxxxxxxxbenefit) {
		this.c1xxzxxxlvxxxxxxxxxxbenefit = c1xxzxxxlvxxxxxxxxxxbenefit;
	}

	@Column(name = "fincometx", precision = 14)
	public BigDecimal getC2xxzxxxlvxxxxxxxxxxfincometx() {
		return this.c2xxzxxxlvxxxxxxxxxxfincometx;
	}

	public void setC2xxzxxxlvxxxxxxxxxxfincometx(
			BigDecimal c2xxzxxxlvxxxxxxxxxxfincometx) {
		this.c2xxzxxxlvxxxxxxxxxxfincometx = c2xxzxxxlvxxxxxxxxxxfincometx;
	}

	@Column(name = "pincometx", precision = 14)
	public BigDecimal getC3xxzxxxlvxxxxxxxxxxpincometx() {
		return this.c3xxzxxxlvxxxxxxxxxxpincometx;
	}

	public void setC3xxzxxxlvxxxxxxxxxxpincometx(
			BigDecimal c3xxzxxxlvxxxxxxxxxxpincometx) {
		this.c3xxzxxxlvxxxxxxxxxxpincometx = c3xxzxxxlvxxxxxxxxxxpincometx;
	}

	@Column(name = "wcbout", precision = 14)
	public BigDecimal getC4xxzxxxlvxxxxxxxxxxwcbout() {
		return this.c4xxzxxxlvxxxxxxxxxxwcbout;
	}

	public void setC4xxzxxxlvxxxxxxxxxxwcbout(
			BigDecimal c4xxzxxxlvxxxxxxxxxxwcbout) {
		this.c4xxzxxxlvxxxxxxxxxxwcbout = c4xxzxxxlvxxxxxxxxxxwcbout;
	}

	@Column(name = "emplinsur", precision = 14)
	public BigDecimal getC5xxzxxxlvxxxxxxxxxxemplinsur() {
		return this.c5xxzxxxlvxxxxxxxxxxemplinsur;
	}

	public void setC5xxzxxxlvxxxxxxxxxxemplinsur(
			BigDecimal c5xxzxxxlvxxxxxxxxxxemplinsur) {
		this.c5xxzxxxlvxxxxxxxxxxemplinsur = c5xxzxxxlvxxxxxxxxxxemplinsur;
	}

	@Column(name = "vacpayout", precision = 14)
	public BigDecimal getC6xxzxxxlvxxxxxxxxxxvacpayout() {
		return this.c6xxzxxxlvxxxxxxxxxxvacpayout;
	}

	public void setC6xxzxxxlvxxxxxxxxxxvacpayout(
			BigDecimal c6xxzxxxlvxxxxxxxxxxvacpayout) {
		this.c6xxzxxxlvxxxxxxxxxxvacpayout = c6xxzxxxlvxxxxxxxxxxvacpayout;
	}

	@Column(name = "advance", precision = 14)
	public BigDecimal getC7xxzxxxlvxxxxxxxxxxadvance() {
		return this.c7xxzxxxlvxxxxxxxxxxadvance;
	}

	public void setC7xxzxxxlvxxxxxxxxxxadvance(
			BigDecimal c7xxzxxxlvxxxxxxxxxxadvance) {
		this.c7xxzxxxlvxxxxxxxxxxadvance = c7xxzxxxlvxxxxxxxxxxadvance;
	}

	@Column(name = "fpensobtx", precision = 14)
	public BigDecimal getC8xxzxxxlvxxxxxxxxxxfpensobtx() {
		return this.c8xxzxxxlvxxxxxxxxxxfpensobtx;
	}

	public void setC8xxzxxxlvxxxxxxxxxxfpensobtx(
			BigDecimal c8xxzxxxlvxxxxxxxxxxfpensobtx) {
		this.c8xxzxxxlvxxxxxxxxxxfpensobtx = c8xxzxxxlvxxxxxxxxxxfpensobtx;
	}

	@Column(name = "fpensoatx", precision = 14)
	public BigDecimal getC9xxzxxxlvxxxxxxxxxxfpensoatx() {
		return this.c9xxzxxxlvxxxxxxxxxxfpensoatx;
	}

	public void setC9xxzxxxlvxxxxxxxxxxfpensoatx(
			BigDecimal c9xxzxxxlvxxxxxxxxxxfpensoatx) {
		this.c9xxzxxxlvxxxxxxxxxxfpensoatx = c9xxzxxxlvxxxxxxxxxxfpensoatx;
	}

	@Column(name = "uniondues", precision = 14)
	public BigDecimal getD1xxzxxxlvxxxxxxxxxxuniondues() {
		return this.d1xxzxxxlvxxxxxxxxxxuniondues;
	}

	public void setD1xxzxxxlvxxxxxxxxxxuniondues(
			BigDecimal d1xxzxxxlvxxxxxxxxxxuniondues) {
		this.d1xxzxxxlvxxxxxxxxxxuniondues = d1xxzxxxlvxxxxxxxxxxuniondues;
	}

	@Column(name = "medical", precision = 14)
	public BigDecimal getD2xxzxxxlvxxxxxxxxxxmedical() {
		return this.d2xxzxxxlvxxxxxxxxxxmedical;
	}

	public void setD2xxzxxxlvxxxxxxxxxxmedical(
			BigDecimal d2xxzxxxlvxxxxxxxxxxmedical) {
		this.d2xxzxxxlvxxxxxxxxxxmedical = d2xxzxxxlvxxxxxxxxxxmedical;
	}

	@Column(name = "payamt", precision = 14)
	public BigDecimal getD3xxzxxxlvxxxxxxxxxxpayamt() {
		return this.d3xxzxxxlvxxxxxxxxxxpayamt;
	}

	public void setD3xxzxxxlvxxxxxxxxxxpayamt(
			BigDecimal d3xxzxxxlvxxxxxxxxxxpayamt) {
		this.d3xxzxxxlvxxxxxxxxxxpayamt = d3xxzxxxlvxxxxxxxxxxpayamt;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getD4xxuznxbvxxxxxxxxxxnotes() {
		return this.d4xxuznxbvxxxxxxxxxxnotes;
	}

	public void setD4xxuznxbvxxxxxxxxxxnotes(String d4xxuznxbvxxxxxxxxxxnotes) {
		this.d4xxuznxbvxxxxxxxxxxnotes = d4xxuznxbvxxxxxxxxxxnotes;
	}

	@Column(name = "notes2", length = 120)
	@Size(max = 120)
	public String getD5xxuxxrbvxxxxxxxxxxnotes2() {
		return this.d5xxuxxrbvxxxxxxxxxxnotes2;
	}

	public void setD5xxuxxrbvxxxxxxxxxxnotes2(String d5xxuxxrbvxxxxxxxxxxnotes2) {
		this.d5xxuxxrbvxxxxxxxxxxnotes2 = d5xxuxxrbvxxxxxxxxxxnotes2;
	}

	@Column(name = "chqnumber", length = 20)
	@Size(max = 20)
	public String getD6xxuxxrbvxxxxxxxxxxchqnumber() {
		return this.d6xxuxxrbvxxxxxxxxxxchqnumber;
	}

	public void setD6xxuxxrbvxxxxxxxxxxchqnumber(
			String d6xxuxxrbvxxxxxxxxxxchqnumber) {
		this.d6xxuxxrbvxxxxxxxxxxchqnumber = d6xxuxxrbvxxxxxxxxxxchqnumber;
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
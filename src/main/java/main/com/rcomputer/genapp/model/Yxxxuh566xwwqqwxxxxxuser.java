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
 * Yxxxuh566xwwqqwxxxxxuser generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "user")
public class Yxxxuh566xwwqqwxxxxxuser implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Yxxxch522xhhxxhxxxxxclient yxxxch522xhhxxhxxxxxclient;
	private Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor;
	private Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer;
	private Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee;
	private String a0xxukuxbvxxxxxxxxxxid;
	private String c1xxuxxxbvxxxxxxxxxxotherid;
	private String c2xxuxuaiv38xxxxxxxxalevel;
	private String c3xxuxubiv39xxxxxxxxblevel;
	private String c4xxuxupivxxxxxxxxxxcurrpw;
	private Date c5xxcxxxbvxxxxxxxxxxexpiry;
	private String c6xxuxuoivxxxxxxxxxxoldpw;
	private Boolean c7xxfxxxivxxxxxxxxxxtemporarypassword;
	private byte[] c8xxuxxxbvxxxxxxxxxxpasswordhash;
	private String c9xxuxxxbvxxxxxxxxxxactivationkey;
	private String y1xxuxxxivxxxxxxxxxxrestrict1;
	private String y2xxuxxxivxxxxxxxxxxrestrict2;
	private String y3xxuxxxivxxxxxxxxxxrestrict3;
	private String y4xxuxxxivxxxxxxxxxxallow1;
	private String y5xxuxxxivxxxxxxxxxxallow2;
	private String y6xxuxxxivxxxxxxxxxxallow3;
	private String y6xxuxxxbvxxxxxxxxxxmaxproflrow;
	private String y6xxuxxxbvxxxxxxxxxxcproflrow;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private Date z3xxcxxxbvxxxxxxxxxxucurrcalda;
	private Boolean z4xxfxxxbvxxxxxxxxxxpreprocess;
	private String y7xxuxznbvxxxxxxxxxxnotes;
	private String y8xxuzdrbvxxxxxxxxxxdocmnt;
	private String z5xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private String e4xxuznrbvxxxxxxxxxxsignature;
	private Set<Yxxxch575xwwqqhxxxxxuserprofl> yxxxch575xwwqqhxxxxxuserprofls = new HashSet<Yxxxch575xwwqqhxxxxxuserprofl>(
			0);

	public Yxxxuh566xwwqqwxxxxxuser() {
	}

	public Yxxxuh566xwwqqwxxxxxuser(String a0xxukuxbvxxxxxxxxxxid,
			String c4xxuxupivxxxxxxxxxxcurrpw) {
		this.a0xxukuxbvxxxxxxxxxxid = a0xxukuxbvxxxxxxxxxxid;
		this.c4xxuxupivxxxxxxxxxxcurrpw = c4xxuxupivxxxxxxxxxxcurrpw;
	}
	public Yxxxuh566xwwqqwxxxxxuser(
			Yxxxch522xhhxxhxxxxxclient yxxxch522xhhxxhxxxxxclient,
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor,
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer,
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee,
			String a0xxukuxbvxxxxxxxxxxid, String c1xxuxxxbvxxxxxxxxxxotherid,
			String c2xxuxuaiv38xxxxxxxxalevel,
			String c3xxuxubiv39xxxxxxxxblevel,
			String c4xxuxupivxxxxxxxxxxcurrpw, Date c5xxcxxxbvxxxxxxxxxxexpiry,
			String c6xxuxuoivxxxxxxxxxxoldpw,
			Boolean c7xxfxxxivxxxxxxxxxxtemporarypassword,
			byte[] c8xxuxxxbvxxxxxxxxxxpasswordhash,
			String c9xxuxxxbvxxxxxxxxxxactivationkey,
			String y1xxuxxxivxxxxxxxxxxrestrict1,
			String y2xxuxxxivxxxxxxxxxxrestrict2,
			String y3xxuxxxivxxxxxxxxxxrestrict3,
			String y4xxuxxxivxxxxxxxxxxallow1,
			String y5xxuxxxivxxxxxxxxxxallow2,
			String y6xxuxxxivxxxxxxxxxxallow3,
			String y6xxuxxxbvxxxxxxxxxxmaxproflrow,
			String y6xxuxxxbvxxxxxxxxxxcproflrow,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			Date z3xxcxxxbvxxxxxxxxxxucurrcalda,
			Boolean z4xxfxxxbvxxxxxxxxxxpreprocess,
			String y7xxuxznbvxxxxxxxxxxnotes,
			String y8xxuzdrbvxxxxxxxxxxdocmnt,
			String z5xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			String e4xxuznrbvxxxxxxxxxxsignature,
			Set<Yxxxch575xwwqqhxxxxxuserprofl> yxxxch575xwwqqhxxxxxuserprofls) {
		this.yxxxch522xhhxxhxxxxxclient = yxxxch522xhhxxhxxxxxclient;
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
		this.a0xxukuxbvxxxxxxxxxxid = a0xxukuxbvxxxxxxxxxxid;
		this.c1xxuxxxbvxxxxxxxxxxotherid = c1xxuxxxbvxxxxxxxxxxotherid;
		this.c2xxuxuaiv38xxxxxxxxalevel = c2xxuxuaiv38xxxxxxxxalevel;
		this.c3xxuxubiv39xxxxxxxxblevel = c3xxuxubiv39xxxxxxxxblevel;
		this.c4xxuxupivxxxxxxxxxxcurrpw = c4xxuxupivxxxxxxxxxxcurrpw;
		this.c5xxcxxxbvxxxxxxxxxxexpiry = c5xxcxxxbvxxxxxxxxxxexpiry;
		this.c6xxuxuoivxxxxxxxxxxoldpw = c6xxuxuoivxxxxxxxxxxoldpw;
		this.c7xxfxxxivxxxxxxxxxxtemporarypassword = c7xxfxxxivxxxxxxxxxxtemporarypassword;
		this.c8xxuxxxbvxxxxxxxxxxpasswordhash = c8xxuxxxbvxxxxxxxxxxpasswordhash;
		this.c9xxuxxxbvxxxxxxxxxxactivationkey = c9xxuxxxbvxxxxxxxxxxactivationkey;
		this.y1xxuxxxivxxxxxxxxxxrestrict1 = y1xxuxxxivxxxxxxxxxxrestrict1;
		this.y2xxuxxxivxxxxxxxxxxrestrict2 = y2xxuxxxivxxxxxxxxxxrestrict2;
		this.y3xxuxxxivxxxxxxxxxxrestrict3 = y3xxuxxxivxxxxxxxxxxrestrict3;
		this.y4xxuxxxivxxxxxxxxxxallow1 = y4xxuxxxivxxxxxxxxxxallow1;
		this.y5xxuxxxivxxxxxxxxxxallow2 = y5xxuxxxivxxxxxxxxxxallow2;
		this.y6xxuxxxivxxxxxxxxxxallow3 = y6xxuxxxivxxxxxxxxxxallow3;
		this.y6xxuxxxbvxxxxxxxxxxmaxproflrow = y6xxuxxxbvxxxxxxxxxxmaxproflrow;
		this.y6xxuxxxbvxxxxxxxxxxcproflrow = y6xxuxxxbvxxxxxxxxxxcproflrow;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.z3xxcxxxbvxxxxxxxxxxucurrcalda = z3xxcxxxbvxxxxxxxxxxucurrcalda;
		this.z4xxfxxxbvxxxxxxxxxxpreprocess = z4xxfxxxbvxxxxxxxxxxpreprocess;
		this.y7xxuxznbvxxxxxxxxxxnotes = y7xxuxznbvxxxxxxxxxxnotes;
		this.y8xxuzdrbvxxxxxxxxxxdocmnt = y8xxuzdrbvxxxxxxxxxxdocmnt;
		this.z5xxutoxlhxxxxxxxxxxowner = z5xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.e4xxuznrbvxxxxxxxxxxsignature = e4xxuznrbvxxxxxxxxxxsignature;
		this.yxxxch575xwwqqhxxxxxuserprofls = yxxxch575xwwqqhxxxxxuserprofls;
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
	@JoinColumn(name = "client")
	public Yxxxch522xhhxxhxxxxxclient getYxxxch522xhhxxhxxxxxclient() {
		return this.yxxxch522xhhxxhxxxxxclient;
	}

	public void setYxxxch522xhhxxhxxxxxclient(
			Yxxxch522xhhxxhxxxxxclient yxxxch522xhhxxhxxxxxclient) {
		this.yxxxch522xhhxxhxxxxxclient = yxxxch522xhhxxhxxxxxclient;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vendor")
	public Jxxxuq300xwwqqhxxxxxvendor getJxxxuq300xwwqqhxxxxxvendor() {
		return this.jxxxuq300xwwqqhxxxxxvendor;
	}

	public void setJxxxuq300xwwqqhxxxxxvendor(
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor) {
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer")
	public Jxxxuq201xwwqqhxxxxxcustomer getJxxxuq201xwwqqhxxxxxcustomer() {
		return this.jxxxuq201xwwqqhxxxxxcustomer;
	}

	public void setJxxxuq201xwwqqhxxxxxcustomer(
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer) {
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee")
	public Jxxxbh400xwwqqhxxxxxemployee getJxxxbh400xwwqqhxxxxxemployee() {
		return this.jxxxbh400xwwqqhxxxxxemployee;
	}

	public void setJxxxbh400xwwqqhxxxxxemployee(
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee) {
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
	}

	@Column(name = "id", nullable = false, length = 60)
	@NotNull
	@Size(max = 60)
	public String getA0xxukuxbvxxxxxxxxxxid() {
		return this.a0xxukuxbvxxxxxxxxxxid;
	}

	public void setA0xxukuxbvxxxxxxxxxxid(String a0xxukuxbvxxxxxxxxxxid) {
		this.a0xxukuxbvxxxxxxxxxxid = a0xxukuxbvxxxxxxxxxxid;
	}

	@Column(name = "otherid", length = 60)
	@Size(max = 60)
	public String getC1xxuxxxbvxxxxxxxxxxotherid() {
		return this.c1xxuxxxbvxxxxxxxxxxotherid;
	}

	public void setC1xxuxxxbvxxxxxxxxxxotherid(
			String c1xxuxxxbvxxxxxxxxxxotherid) {
		this.c1xxuxxxbvxxxxxxxxxxotherid = c1xxuxxxbvxxxxxxxxxxotherid;
	}

	@Column(name = "alevel", length = 12)
	@Size(max = 12)
	public String getC2xxuxuaiv38xxxxxxxxalevel() {
		return this.c2xxuxuaiv38xxxxxxxxalevel;
	}

	public void setC2xxuxuaiv38xxxxxxxxalevel(String c2xxuxuaiv38xxxxxxxxalevel) {
		this.c2xxuxuaiv38xxxxxxxxalevel = c2xxuxuaiv38xxxxxxxxalevel;
	}

	@Column(name = "blevel", length = 12)
	@Size(max = 12)
	public String getC3xxuxubiv39xxxxxxxxblevel() {
		return this.c3xxuxubiv39xxxxxxxxblevel;
	}

	public void setC3xxuxubiv39xxxxxxxxblevel(String c3xxuxubiv39xxxxxxxxblevel) {
		this.c3xxuxubiv39xxxxxxxxblevel = c3xxuxubiv39xxxxxxxxblevel;
	}

	@Column(name = "currpw", nullable = false, length = 40)
	@NotNull
	@Size(max = 40)
	public String getC4xxuxupivxxxxxxxxxxcurrpw() {
		return this.c4xxuxupivxxxxxxxxxxcurrpw;
	}

	public void setC4xxuxupivxxxxxxxxxxcurrpw(String c4xxuxupivxxxxxxxxxxcurrpw) {
		this.c4xxuxupivxxxxxxxxxxcurrpw = c4xxuxupivxxxxxxxxxxcurrpw;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiry", length = 29)
	public Date getC5xxcxxxbvxxxxxxxxxxexpiry() {
		return this.c5xxcxxxbvxxxxxxxxxxexpiry;
	}

	public void setC5xxcxxxbvxxxxxxxxxxexpiry(Date c5xxcxxxbvxxxxxxxxxxexpiry) {
		this.c5xxcxxxbvxxxxxxxxxxexpiry = c5xxcxxxbvxxxxxxxxxxexpiry;
	}

	@Column(name = "oldpw", length = 40)
	@Size(max = 40)
	public String getC6xxuxuoivxxxxxxxxxxoldpw() {
		return this.c6xxuxuoivxxxxxxxxxxoldpw;
	}

	public void setC6xxuxuoivxxxxxxxxxxoldpw(String c6xxuxuoivxxxxxxxxxxoldpw) {
		this.c6xxuxuoivxxxxxxxxxxoldpw = c6xxuxuoivxxxxxxxxxxoldpw;
	}

	@Column(name = "temporarypassword")
	public Boolean getC7xxfxxxivxxxxxxxxxxtemporarypassword() {
		return this.c7xxfxxxivxxxxxxxxxxtemporarypassword;
	}

	public void setC7xxfxxxivxxxxxxxxxxtemporarypassword(
			Boolean c7xxfxxxivxxxxxxxxxxtemporarypassword) {
		this.c7xxfxxxivxxxxxxxxxxtemporarypassword = c7xxfxxxivxxxxxxxxxxtemporarypassword;
	}

	@Column(name = "passwordhash")
	public byte[] getC8xxuxxxbvxxxxxxxxxxpasswordhash() {
		return this.c8xxuxxxbvxxxxxxxxxxpasswordhash;
	}

	public void setC8xxuxxxbvxxxxxxxxxxpasswordhash(
			byte[] c8xxuxxxbvxxxxxxxxxxpasswordhash) {
		this.c8xxuxxxbvxxxxxxxxxxpasswordhash = c8xxuxxxbvxxxxxxxxxxpasswordhash;
	}

	@Column(name = "activationkey", length = 60)
	@Size(max = 60)
	public String getC9xxuxxxbvxxxxxxxxxxactivationkey() {
		return this.c9xxuxxxbvxxxxxxxxxxactivationkey;
	}

	public void setC9xxuxxxbvxxxxxxxxxxactivationkey(
			String c9xxuxxxbvxxxxxxxxxxactivationkey) {
		this.c9xxuxxxbvxxxxxxxxxxactivationkey = c9xxuxxxbvxxxxxxxxxxactivationkey;
	}

	@Column(name = "restrict1", length = 20)
	@Size(max = 20)
	public String getY1xxuxxxivxxxxxxxxxxrestrict1() {
		return this.y1xxuxxxivxxxxxxxxxxrestrict1;
	}

	public void setY1xxuxxxivxxxxxxxxxxrestrict1(
			String y1xxuxxxivxxxxxxxxxxrestrict1) {
		this.y1xxuxxxivxxxxxxxxxxrestrict1 = y1xxuxxxivxxxxxxxxxxrestrict1;
	}

	@Column(name = "restrict2", length = 20)
	@Size(max = 20)
	public String getY2xxuxxxivxxxxxxxxxxrestrict2() {
		return this.y2xxuxxxivxxxxxxxxxxrestrict2;
	}

	public void setY2xxuxxxivxxxxxxxxxxrestrict2(
			String y2xxuxxxivxxxxxxxxxxrestrict2) {
		this.y2xxuxxxivxxxxxxxxxxrestrict2 = y2xxuxxxivxxxxxxxxxxrestrict2;
	}

	@Column(name = "restrict3", length = 20)
	@Size(max = 20)
	public String getY3xxuxxxivxxxxxxxxxxrestrict3() {
		return this.y3xxuxxxivxxxxxxxxxxrestrict3;
	}

	public void setY3xxuxxxivxxxxxxxxxxrestrict3(
			String y3xxuxxxivxxxxxxxxxxrestrict3) {
		this.y3xxuxxxivxxxxxxxxxxrestrict3 = y3xxuxxxivxxxxxxxxxxrestrict3;
	}

	@Column(name = "allow1", length = 20)
	@Size(max = 20)
	public String getY4xxuxxxivxxxxxxxxxxallow1() {
		return this.y4xxuxxxivxxxxxxxxxxallow1;
	}

	public void setY4xxuxxxivxxxxxxxxxxallow1(String y4xxuxxxivxxxxxxxxxxallow1) {
		this.y4xxuxxxivxxxxxxxxxxallow1 = y4xxuxxxivxxxxxxxxxxallow1;
	}

	@Column(name = "allow2", length = 20)
	@Size(max = 20)
	public String getY5xxuxxxivxxxxxxxxxxallow2() {
		return this.y5xxuxxxivxxxxxxxxxxallow2;
	}

	public void setY5xxuxxxivxxxxxxxxxxallow2(String y5xxuxxxivxxxxxxxxxxallow2) {
		this.y5xxuxxxivxxxxxxxxxxallow2 = y5xxuxxxivxxxxxxxxxxallow2;
	}

	@Column(name = "allow3", length = 20)
	@Size(max = 20)
	public String getY6xxuxxxivxxxxxxxxxxallow3() {
		return this.y6xxuxxxivxxxxxxxxxxallow3;
	}

	public void setY6xxuxxxivxxxxxxxxxxallow3(String y6xxuxxxivxxxxxxxxxxallow3) {
		this.y6xxuxxxivxxxxxxxxxxallow3 = y6xxuxxxivxxxxxxxxxxallow3;
	}

	@Column(name = "maxproflrow", length = 20)
	@Size(max = 20)
	public String getY6xxuxxxbvxxxxxxxxxxmaxproflrow() {
		return this.y6xxuxxxbvxxxxxxxxxxmaxproflrow;
	}

	public void setY6xxuxxxbvxxxxxxxxxxmaxproflrow(
			String y6xxuxxxbvxxxxxxxxxxmaxproflrow) {
		this.y6xxuxxxbvxxxxxxxxxxmaxproflrow = y6xxuxxxbvxxxxxxxxxxmaxproflrow;
	}

	@Column(name = "cproflrow", length = 20)
	@Size(max = 20)
	public String getY6xxuxxxbvxxxxxxxxxxcproflrow() {
		return this.y6xxuxxxbvxxxxxxxxxxcproflrow;
	}

	public void setY6xxuxxxbvxxxxxxxxxxcproflrow(
			String y6xxuxxxbvxxxxxxxxxxcproflrow) {
		this.y6xxuxxxbvxxxxxxxxxxcproflrow = y6xxuxxxbvxxxxxxxxxxcproflrow;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ucurrcalda", length = 29)
	public Date getZ3xxcxxxbvxxxxxxxxxxucurrcalda() {
		return this.z3xxcxxxbvxxxxxxxxxxucurrcalda;
	}

	public void setZ3xxcxxxbvxxxxxxxxxxucurrcalda(
			Date z3xxcxxxbvxxxxxxxxxxucurrcalda) {
		this.z3xxcxxxbvxxxxxxxxxxucurrcalda = z3xxcxxxbvxxxxxxxxxxucurrcalda;
	}

	@Column(name = "preprocess")
	public Boolean getZ4xxfxxxbvxxxxxxxxxxpreprocess() {
		return this.z4xxfxxxbvxxxxxxxxxxpreprocess;
	}

	public void setZ4xxfxxxbvxxxxxxxxxxpreprocess(
			Boolean z4xxfxxxbvxxxxxxxxxxpreprocess) {
		this.z4xxfxxxbvxxxxxxxxxxpreprocess = z4xxfxxxbvxxxxxxxxxxpreprocess;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getY7xxuxznbvxxxxxxxxxxnotes() {
		return this.y7xxuxznbvxxxxxxxxxxnotes;
	}

	public void setY7xxuxznbvxxxxxxxxxxnotes(String y7xxuxznbvxxxxxxxxxxnotes) {
		this.y7xxuxznbvxxxxxxxxxxnotes = y7xxuxznbvxxxxxxxxxxnotes;
	}

	@Column(name = "docmnt", length = 90)
	@Size(max = 90)
	public String getY8xxuzdrbvxxxxxxxxxxdocmnt() {
		return this.y8xxuzdrbvxxxxxxxxxxdocmnt;
	}

	public void setY8xxuzdrbvxxxxxxxxxxdocmnt(String y8xxuzdrbvxxxxxxxxxxdocmnt) {
		this.y8xxuzdrbvxxxxxxxxxxdocmnt = y8xxuzdrbvxxxxxxxxxxdocmnt;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZ5xxutoxlhxxxxxxxxxxowner() {
		return this.z5xxutoxlhxxxxxxxxxxowner;
	}

	public void setZ5xxutoxlhxxxxxxxxxxowner(String z5xxutoxlhxxxxxxxxxxowner) {
		this.z5xxutoxlhxxxxxxxxxxowner = z5xxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@Column(name = "signature", length = 1200)
	@Size(max = 1200)
	public String getE4xxuznrbvxxxxxxxxxxsignature() {
		return this.e4xxuznrbvxxxxxxxxxxsignature;
	}

	public void setE4xxuznrbvxxxxxxxxxxsignature(
			String e4xxuznrbvxxxxxxxxxxsignature) {
		this.e4xxuznrbvxxxxxxxxxxsignature = e4xxuznrbvxxxxxxxxxxsignature;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "yxxxuh566xwwqqwxxxxxuser")
	public Set<Yxxxch575xwwqqhxxxxxuserprofl> getYxxxch575xwwqqhxxxxxuserprofls() {
		return this.yxxxch575xwwqqhxxxxxuserprofls;
	}

	public void setYxxxch575xwwqqhxxxxxuserprofls(
			Set<Yxxxch575xwwqqhxxxxxuserprofl> yxxxch575xwwqqhxxxxxuserprofls) {
		this.yxxxch575xwwqqhxxxxxuserprofls = yxxxch575xwwqqhxxxxxuserprofls;
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
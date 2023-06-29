package com.rcomputer.genapp.model;
// Generated 28-Jun-2023 5:43:26 PM by Hibernate Tools 4.0.0

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
 * Fxxxuq111xwwqqhxxxxxaddress generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "address")
public class Fxxxuq111xwwqqhxxxxxaddress implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private String a0xxukbxbxxxxxxxxxxxaddrescode;
	private String b1pxusa1bvxxxxxxxxxxaddrl1;
	private String b2xxub2xbvxxxxxxxxxxaddrl2;
	private String y1xxub3xexxxxxxxxxxxaddrl3;
	private String b3xxh2acbv11xxxxxxxxcity;
	private String b4xxhbpxbv12xxxxxxxxprovnstate;
	private String b5xxhboxee13xxxxxxxxcountry;
	private String b6xxh3azbv14xxxxxxxxpzcode;
	private String y2xxuxzsbexxxxxxxxxxdescript;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String y4xxuznybexxxxxxxxxxnotes;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Integer z4xxzzprhexxxxxxxxxxprintmstat;
	private Date z5xxczqxlhxxxxxxxxxxprinmtfldt;
	private Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForShiptocode = new HashSet<Trexuq255xwwqqhxxxxxshipment>(
			0);
	private Set<Fxxxcq144xwwqqhxxxxxlocation> fxxxcq144xwwqqhxxxxxlocations = new HashSet<Fxxxcq144xwwqqhxxxxxlocation>(
			0);
	private Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForMailtocode = new HashSet<Jxxxuq300xwwqqhxxxxxvendor>(
			0);
	private Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForBilltocode = new HashSet<Trexuq377xwwqqhxxxxxvshipmen>(
			0);
	private Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForShiptocode = new HashSet<Trexuq377xwwqqhxxxxxvshipmen>(
			0);
	private Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForMailtocode = new HashSet<Jxxxuq21bxwwqqhxxxxxccontact>(
			0);
	private Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcode = new HashSet<Trexuq244xwwqqhxxxxxcuorders>(
			0);
	private Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForMailtocode = new HashSet<Jxxxuq201xwwqqhxxxxxcustomer>(
			0);
	private Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForShiptocode = new HashSet<Jxxxuq201xwwqqhxxxxxcustomer>(
			0);
	private Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode = new HashSet<Jxxxuq31bxwwqqhxxxxxvcontact>(
			0);
	private Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode = new HashSet<Xoxxuq399xvwwqqhxxxxvshipmendetails>(
			0);
	private Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForShiptocode = new HashSet<Jxxxbh400xwwqqhxxxxxemployee>(
			0);
	private Set<Fxxxuq89bxwwqqhxxxxxschedule> fxxxuq89bxwwqqhxxxxxschedules = new HashSet<Fxxxuq89bxwwqqhxxxxxschedule>(
			0);
	private Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode = new HashSet<Xoxxuq295xwwqqhxxxxxshipmentdetails>(
			0);
	private Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode = new HashSet<Xoxxuq295xwwqqhxxxxxshipmentdetails>(
			0);
	private Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode = new HashSet<Jxxxuq31bxwwqqhxxxxxvcontact>(
			0);
	private Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForBilltocode = new HashSet<Trexuq255xwwqqhxxxxxshipment>(
			0);
	private Set<Dxxxch1d3xwwqqhxxlxxcompany> dxxxch1d3xwwqqhxxlxxcompanies = new HashSet<Dxxxch1d3xwwqqhxxlxxcompany>(
			0);
	private Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode = new HashSet<Xoxxuq399xvwwqqhxxxxvshipmendetails>(
			0);
	private Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForShiptocode = new HashSet<Jxxxuq21bxwwqqhxxxxxccontact>(
			0);
	private Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay = new HashSet<Trexuq244xwwqqhxxxxxcuorders>(
			0);
	private Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForMailtocode = new HashSet<Jxxxbh400xwwqqhxxxxxemployee>(
			0);
	private Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForShiptocode = new HashSet<Jxxxuq300xwwqqhxxxxxvendor>(
			0);

	public Fxxxuq111xwwqqhxxxxxaddress() {
	}

	public Fxxxuq111xwwqqhxxxxxaddress(String a0xxukbxbxxxxxxxxxxxaddrescode) {
		this.a0xxukbxbxxxxxxxxxxxaddrescode = a0xxukbxbxxxxxxxxxxxaddrescode;
	}
	public Fxxxuq111xwwqqhxxxxxaddress(
			String a0xxukbxbxxxxxxxxxxxaddrescode,
			String b1pxusa1bvxxxxxxxxxxaddrl1,
			String b2xxub2xbvxxxxxxxxxxaddrl2,
			String y1xxub3xexxxxxxxxxxxaddrl3,
			String b3xxh2acbv11xxxxxxxxcity,
			String b4xxhbpxbv12xxxxxxxxprovnstate,
			String b5xxhboxee13xxxxxxxxcountry,
			String b6xxh3azbv14xxxxxxxxpzcode,
			String y2xxuxzsbexxxxxxxxxxdescript,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String y4xxuznybexxxxxxxxxxnotes,
			String z3xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Integer z4xxzzprhexxxxxxxxxxprintmstat,
			Date z5xxczqxlhxxxxxxxxxxprinmtfldt,
			Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForShiptocode,
			Set<Fxxxcq144xwwqqhxxxxxlocation> fxxxcq144xwwqqhxxxxxlocations,
			Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForMailtocode,
			Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForBilltocode,
			Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForShiptocode,
			Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForMailtocode,
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcode,
			Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForMailtocode,
			Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForShiptocode,
			Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode,
			Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode,
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForShiptocode,
			Set<Fxxxuq89bxwwqqhxxxxxschedule> fxxxuq89bxwwqqhxxxxxschedules,
			Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode,
			Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode,
			Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode,
			Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForBilltocode,
			Set<Dxxxch1d3xwwqqhxxlxxcompany> dxxxch1d3xwwqqhxxlxxcompanies,
			Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode,
			Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForShiptocode,
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay,
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForMailtocode,
			Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForShiptocode) {
		this.a0xxukbxbxxxxxxxxxxxaddrescode = a0xxukbxbxxxxxxxxxxxaddrescode;
		this.b1pxusa1bvxxxxxxxxxxaddrl1 = b1pxusa1bvxxxxxxxxxxaddrl1;
		this.b2xxub2xbvxxxxxxxxxxaddrl2 = b2xxub2xbvxxxxxxxxxxaddrl2;
		this.y1xxub3xexxxxxxxxxxxaddrl3 = y1xxub3xexxxxxxxxxxxaddrl3;
		this.b3xxh2acbv11xxxxxxxxcity = b3xxh2acbv11xxxxxxxxcity;
		this.b4xxhbpxbv12xxxxxxxxprovnstate = b4xxhbpxbv12xxxxxxxxprovnstate;
		this.b5xxhboxee13xxxxxxxxcountry = b5xxhboxee13xxxxxxxxcountry;
		this.b6xxh3azbv14xxxxxxxxpzcode = b6xxh3azbv14xxxxxxxxpzcode;
		this.y2xxuxzsbexxxxxxxxxxdescript = y2xxuxzsbexxxxxxxxxxdescript;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.y4xxuznybexxxxxxxxxxnotes = y4xxuznybexxxxxxxxxxnotes;
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.z4xxzzprhexxxxxxxxxxprintmstat = z4xxzzprhexxxxxxxxxxprintmstat;
		this.z5xxczqxlhxxxxxxxxxxprinmtfldt = z5xxczqxlhxxxxxxxxxxprinmtfldt;
		this.trexuq255xwwqqhxxxxxshipmentsForShiptocode = trexuq255xwwqqhxxxxxshipmentsForShiptocode;
		this.fxxxcq144xwwqqhxxxxxlocations = fxxxcq144xwwqqhxxxxxlocations;
		this.jxxxuq300xwwqqhxxxxxvendorsForMailtocode = jxxxuq300xwwqqhxxxxxvendorsForMailtocode;
		this.trexuq377xwwqqhxxxxxvshipmensForBilltocode = trexuq377xwwqqhxxxxxvshipmensForBilltocode;
		this.trexuq377xwwqqhxxxxxvshipmensForShiptocode = trexuq377xwwqqhxxxxxvshipmensForShiptocode;
		this.jxxxuq21bxwwqqhxxxxxccontactsForMailtocode = jxxxuq21bxwwqqhxxxxxccontactsForMailtocode;
		this.trexuq244xwwqqhxxxxxcuordersesForShipcode = trexuq244xwwqqhxxxxxcuordersesForShipcode;
		this.jxxxuq201xwwqqhxxxxxcustomersForMailtocode = jxxxuq201xwwqqhxxxxxcustomersForMailtocode;
		this.jxxxuq201xwwqqhxxxxxcustomersForShiptocode = jxxxuq201xwwqqhxxxxxcustomersForShiptocode;
		this.jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode = jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode;
		this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode = xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode;
		this.jxxxbh400xwwqqhxxxxxemployeesForShiptocode = jxxxbh400xwwqqhxxxxxemployeesForShiptocode;
		this.fxxxuq89bxwwqqhxxxxxschedules = fxxxuq89bxwwqqhxxxxxschedules;
		this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode = xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode;
		this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode = xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode;
		this.jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode = jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode;
		this.trexuq255xwwqqhxxxxxshipmentsForBilltocode = trexuq255xwwqqhxxxxxshipmentsForBilltocode;
		this.dxxxch1d3xwwqqhxxlxxcompanies = dxxxch1d3xwwqqhxxlxxcompanies;
		this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode = xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode;
		this.jxxxuq21bxwwqqhxxxxxccontactsForShiptocode = jxxxuq21bxwwqqhxxxxxccontactsForShiptocode;
		this.trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay = trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay;
		this.jxxxbh400xwwqqhxxxxxemployeesForMailtocode = jxxxbh400xwwqqhxxxxxemployeesForMailtocode;
		this.jxxxuq300xwwqqhxxxxxvendorsForShiptocode = jxxxuq300xwwqqhxxxxxvendorsForShiptocode;
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

	@Column(name = "addrescode", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getA0xxukbxbxxxxxxxxxxxaddrescode() {
		return this.a0xxukbxbxxxxxxxxxxxaddrescode;
	}

	public void setA0xxukbxbxxxxxxxxxxxaddrescode(
			String a0xxukbxbxxxxxxxxxxxaddrescode) {
		this.a0xxukbxbxxxxxxxxxxxaddrescode = a0xxukbxbxxxxxxxxxxxaddrescode;
	}

	@Column(name = "addrl1", length = 159)
	@Size(max = 159)
	public String getB1pxusa1bvxxxxxxxxxxaddrl1() {
		return this.b1pxusa1bvxxxxxxxxxxaddrl1;
	}

	public void setB1pxusa1bvxxxxxxxxxxaddrl1(String b1pxusa1bvxxxxxxxxxxaddrl1) {
		this.b1pxusa1bvxxxxxxxxxxaddrl1 = b1pxusa1bvxxxxxxxxxxaddrl1;
	}

	@Column(name = "addrl2", length = 159)
	@Size(max = 159)
	public String getB2xxub2xbvxxxxxxxxxxaddrl2() {
		return this.b2xxub2xbvxxxxxxxxxxaddrl2;
	}

	public void setB2xxub2xbvxxxxxxxxxxaddrl2(String b2xxub2xbvxxxxxxxxxxaddrl2) {
		this.b2xxub2xbvxxxxxxxxxxaddrl2 = b2xxub2xbvxxxxxxxxxxaddrl2;
	}

	@Column(name = "addrl3", length = 159)
	@Size(max = 159)
	public String getY1xxub3xexxxxxxxxxxxaddrl3() {
		return this.y1xxub3xexxxxxxxxxxxaddrl3;
	}

	public void setY1xxub3xexxxxxxxxxxxaddrl3(String y1xxub3xexxxxxxxxxxxaddrl3) {
		this.y1xxub3xexxxxxxxxxxxaddrl3 = y1xxub3xexxxxxxxxxxxaddrl3;
	}

	@Column(name = "city", length = 20)
	@Size(max = 20)
	public String getB3xxh2acbv11xxxxxxxxcity() {
		return this.b3xxh2acbv11xxxxxxxxcity;
	}

	public void setB3xxh2acbv11xxxxxxxxcity(String b3xxh2acbv11xxxxxxxxcity) {
		this.b3xxh2acbv11xxxxxxxxcity = b3xxh2acbv11xxxxxxxxcity;
	}

	@Column(name = "provnstate", length = 20)
	@Size(max = 20)
	public String getB4xxhbpxbv12xxxxxxxxprovnstate() {
		return this.b4xxhbpxbv12xxxxxxxxprovnstate;
	}

	public void setB4xxhbpxbv12xxxxxxxxprovnstate(
			String b4xxhbpxbv12xxxxxxxxprovnstate) {
		this.b4xxhbpxbv12xxxxxxxxprovnstate = b4xxhbpxbv12xxxxxxxxprovnstate;
	}

	@Column(name = "country", length = 20)
	@Size(max = 20)
	public String getB5xxhboxee13xxxxxxxxcountry() {
		return this.b5xxhboxee13xxxxxxxxcountry;
	}

	public void setB5xxhboxee13xxxxxxxxcountry(
			String b5xxhboxee13xxxxxxxxcountry) {
		this.b5xxhboxee13xxxxxxxxcountry = b5xxhboxee13xxxxxxxxcountry;
	}

	@Column(name = "pzcode", length = 20)
	@Size(max = 20)
	@Pattern(regexp = "^$|(^(?i)^[a-z0-9][a-z0-9\\- ]{0,10}[a-z0-9]$)", message = "Code must be zip or postal code, any character of: a to z, 0 to 9")
	public String getB6xxh3azbv14xxxxxxxxpzcode() {
		return this.b6xxh3azbv14xxxxxxxxpzcode;
	}

	public void setB6xxh3azbv14xxxxxxxxpzcode(String b6xxh3azbv14xxxxxxxxpzcode) {
		this.b6xxh3azbv14xxxxxxxxpzcode = b6xxh3azbv14xxxxxxxxpzcode;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getY2xxuxzsbexxxxxxxxxxdescript() {
		return this.y2xxuxzsbexxxxxxxxxxdescript;
	}

	public void setY2xxuxzsbexxxxxxxxxxdescript(
			String y2xxuxzsbexxxxxxxxxxdescript) {
		this.y2xxuxzsbexxxxxxxxxxdescript = y2xxuxzsbexxxxxxxxxxdescript;
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
	public String getY4xxuznybexxxxxxxxxxnotes() {
		return this.y4xxuznybexxxxxxxxxxnotes;
	}

	public void setY4xxuznybexxxxxxxxxxnotes(String y4xxuznybexxxxxxxxxxnotes) {
		this.y4xxuznybexxxxxxxxxxnotes = y4xxuznybexxxxxxxxxxnotes;
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

	@Column(name = "printmstat")
	public Integer getZ4xxzzprhexxxxxxxxxxprintmstat() {
		return this.z4xxzzprhexxxxxxxxxxprintmstat;
	}

	public void setZ4xxzzprhexxxxxxxxxxprintmstat(
			Integer z4xxzzprhexxxxxxxxxxprintmstat) {
		this.z4xxzzprhexxxxxxxxxxprintmstat = z4xxzzprhexxxxxxxxxxprintmstat;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "prinmtfldt", length = 29)
	public Date getZ5xxczqxlhxxxxxxxxxxprinmtfldt() {
		return this.z5xxczqxlhxxxxxxxxxxprinmtfldt;
	}

	public void setZ5xxczqxlhxxxxxxxxxxprinmtfldt(
			Date z5xxczqxlhxxxxxxxxxxprinmtfldt) {
		this.z5xxczqxlhxxxxxxxxxxprinmtfldt = z5xxczqxlhxxxxxxxxxxprinmtfldt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Trexuq255xwwqqhxxxxxshipment> getTrexuq255xwwqqhxxxxxshipmentsForShiptocode() {
		return this.trexuq255xwwqqhxxxxxshipmentsForShiptocode;
	}

	public void setTrexuq255xwwqqhxxxxxshipmentsForShiptocode(
			Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForShiptocode) {
		this.trexuq255xwwqqhxxxxxshipmentsForShiptocode = trexuq255xwwqqhxxxxxshipmentsForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddress")
	public Set<Fxxxcq144xwwqqhxxxxxlocation> getFxxxcq144xwwqqhxxxxxlocations() {
		return this.fxxxcq144xwwqqhxxxxxlocations;
	}

	public void setFxxxcq144xwwqqhxxxxxlocations(
			Set<Fxxxcq144xwwqqhxxxxxlocation> fxxxcq144xwwqqhxxxxxlocations) {
		this.fxxxcq144xwwqqhxxxxxlocations = fxxxcq144xwwqqhxxxxxlocations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Jxxxuq300xwwqqhxxxxxvendor> getJxxxuq300xwwqqhxxxxxvendorsForMailtocode() {
		return this.jxxxuq300xwwqqhxxxxxvendorsForMailtocode;
	}

	public void setJxxxuq300xwwqqhxxxxxvendorsForMailtocode(
			Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForMailtocode) {
		this.jxxxuq300xwwqqhxxxxxvendorsForMailtocode = jxxxuq300xwwqqhxxxxxvendorsForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByBilltocode")
	public Set<Trexuq377xwwqqhxxxxxvshipmen> getTrexuq377xwwqqhxxxxxvshipmensForBilltocode() {
		return this.trexuq377xwwqqhxxxxxvshipmensForBilltocode;
	}

	public void setTrexuq377xwwqqhxxxxxvshipmensForBilltocode(
			Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForBilltocode) {
		this.trexuq377xwwqqhxxxxxvshipmensForBilltocode = trexuq377xwwqqhxxxxxvshipmensForBilltocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Trexuq377xwwqqhxxxxxvshipmen> getTrexuq377xwwqqhxxxxxvshipmensForShiptocode() {
		return this.trexuq377xwwqqhxxxxxvshipmensForShiptocode;
	}

	public void setTrexuq377xwwqqhxxxxxvshipmensForShiptocode(
			Set<Trexuq377xwwqqhxxxxxvshipmen> trexuq377xwwqqhxxxxxvshipmensForShiptocode) {
		this.trexuq377xwwqqhxxxxxvshipmensForShiptocode = trexuq377xwwqqhxxxxxvshipmensForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Jxxxuq21bxwwqqhxxxxxccontact> getJxxxuq21bxwwqqhxxxxxccontactsForMailtocode() {
		return this.jxxxuq21bxwwqqhxxxxxccontactsForMailtocode;
	}

	public void setJxxxuq21bxwwqqhxxxxxccontactsForMailtocode(
			Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForMailtocode) {
		this.jxxxuq21bxwwqqhxxxxxccontactsForMailtocode = jxxxuq21bxwwqqhxxxxxccontactsForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShipcode")
	public Set<Trexuq244xwwqqhxxxxxcuorders> getTrexuq244xwwqqhxxxxxcuordersesForShipcode() {
		return this.trexuq244xwwqqhxxxxxcuordersesForShipcode;
	}

	public void setTrexuq244xwwqqhxxxxxcuordersesForShipcode(
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcode) {
		this.trexuq244xwwqqhxxxxxcuordersesForShipcode = trexuq244xwwqqhxxxxxcuordersesForShipcode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Jxxxuq201xwwqqhxxxxxcustomer> getJxxxuq201xwwqqhxxxxxcustomersForMailtocode() {
		return this.jxxxuq201xwwqqhxxxxxcustomersForMailtocode;
	}

	public void setJxxxuq201xwwqqhxxxxxcustomersForMailtocode(
			Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForMailtocode) {
		this.jxxxuq201xwwqqhxxxxxcustomersForMailtocode = jxxxuq201xwwqqhxxxxxcustomersForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Jxxxuq201xwwqqhxxxxxcustomer> getJxxxuq201xwwqqhxxxxxcustomersForShiptocode() {
		return this.jxxxuq201xwwqqhxxxxxcustomersForShiptocode;
	}

	public void setJxxxuq201xwwqqhxxxxxcustomersForShiptocode(
			Set<Jxxxuq201xwwqqhxxxxxcustomer> jxxxuq201xwwqqhxxxxxcustomersForShiptocode) {
		this.jxxxuq201xwwqqhxxxxxcustomersForShiptocode = jxxxuq201xwwqqhxxxxxcustomersForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Jxxxuq31bxwwqqhxxxxxvcontact> getJxxxuq31bxwwqqhxxxxxvcontactsForMailtocode() {
		return this.jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode;
	}

	public void setJxxxuq31bxwwqqhxxxxxvcontactsForMailtocode(
			Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode) {
		this.jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode = jxxxuq31bxwwqqhxxxxxvcontactsForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> getXoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode() {
		return this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode;
	}

	public void setXoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode(
			Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode) {
		this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode = xoxxuq399xvwwqqhxxxxvshipmendetailsesForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Jxxxbh400xwwqqhxxxxxemployee> getJxxxbh400xwwqqhxxxxxemployeesForShiptocode() {
		return this.jxxxbh400xwwqqhxxxxxemployeesForShiptocode;
	}

	public void setJxxxbh400xwwqqhxxxxxemployeesForShiptocode(
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForShiptocode) {
		this.jxxxbh400xwwqqhxxxxxemployeesForShiptocode = jxxxbh400xwwqqhxxxxxemployeesForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddress")
	public Set<Fxxxuq89bxwwqqhxxxxxschedule> getFxxxuq89bxwwqqhxxxxxschedules() {
		return this.fxxxuq89bxwwqqhxxxxxschedules;
	}

	public void setFxxxuq89bxwwqqhxxxxxschedules(
			Set<Fxxxuq89bxwwqqhxxxxxschedule> fxxxuq89bxwwqqhxxxxxschedules) {
		this.fxxxuq89bxwwqqhxxxxxschedules = fxxxuq89bxwwqqhxxxxxschedules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> getXoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode() {
		return this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode;
	}

	public void setXoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode(
			Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode) {
		this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode = xoxxuq295xwwqqhxxxxxshipmentdetailsesForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> getXoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode() {
		return this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode;
	}

	public void setXoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode(
			Set<Xoxxuq295xwwqqhxxxxxshipmentdetails> xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode) {
		this.xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode = xoxxuq295xwwqqhxxxxxshipmentdetailsesForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Jxxxuq31bxwwqqhxxxxxvcontact> getJxxxuq31bxwwqqhxxxxxvcontactsForShiptocode() {
		return this.jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode;
	}

	public void setJxxxuq31bxwwqqhxxxxxvcontactsForShiptocode(
			Set<Jxxxuq31bxwwqqhxxxxxvcontact> jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode) {
		this.jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode = jxxxuq31bxwwqqhxxxxxvcontactsForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByBilltocode")
	public Set<Trexuq255xwwqqhxxxxxshipment> getTrexuq255xwwqqhxxxxxshipmentsForBilltocode() {
		return this.trexuq255xwwqqhxxxxxshipmentsForBilltocode;
	}

	public void setTrexuq255xwwqqhxxxxxshipmentsForBilltocode(
			Set<Trexuq255xwwqqhxxxxxshipment> trexuq255xwwqqhxxxxxshipmentsForBilltocode) {
		this.trexuq255xwwqqhxxxxxshipmentsForBilltocode = trexuq255xwwqqhxxxxxshipmentsForBilltocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddress")
	public Set<Dxxxch1d3xwwqqhxxlxxcompany> getDxxxch1d3xwwqqhxxlxxcompanies() {
		return this.dxxxch1d3xwwqqhxxlxxcompanies;
	}

	public void setDxxxch1d3xwwqqhxxlxxcompanies(
			Set<Dxxxch1d3xwwqqhxxlxxcompany> dxxxch1d3xwwqqhxxlxxcompanies) {
		this.dxxxch1d3xwwqqhxxlxxcompanies = dxxxch1d3xwwqqhxxlxxcompanies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> getXoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode() {
		return this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode;
	}

	public void setXoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode(
			Set<Xoxxuq399xvwwqqhxxxxvshipmendetails> xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode) {
		this.xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode = xoxxuq399xvwwqqhxxxxvshipmendetailsesForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Jxxxuq21bxwwqqhxxxxxccontact> getJxxxuq21bxwwqqhxxxxxccontactsForShiptocode() {
		return this.jxxxuq21bxwwqqhxxxxxccontactsForShiptocode;
	}

	public void setJxxxuq21bxwwqqhxxxxxccontactsForShiptocode(
			Set<Jxxxuq21bxwwqqhxxxxxccontact> jxxxuq21bxwwqqhxxxxxccontactsForShiptocode) {
		this.jxxxuq21bxwwqqhxxxxxccontactsForShiptocode = jxxxuq21bxwwqqhxxxxxccontactsForShiptocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShipcodefrompay")
	public Set<Trexuq244xwwqqhxxxxxcuorders> getTrexuq244xwwqqhxxxxxcuordersesForShipcodefrompay() {
		return this.trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay;
	}

	public void setTrexuq244xwwqqhxxxxxcuordersesForShipcodefrompay(
			Set<Trexuq244xwwqqhxxxxxcuorders> trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay) {
		this.trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay = trexuq244xwwqqhxxxxxcuordersesForShipcodefrompay;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByMailtocode")
	public Set<Jxxxbh400xwwqqhxxxxxemployee> getJxxxbh400xwwqqhxxxxxemployeesForMailtocode() {
		return this.jxxxbh400xwwqqhxxxxxemployeesForMailtocode;
	}

	public void setJxxxbh400xwwqqhxxxxxemployeesForMailtocode(
			Set<Jxxxbh400xwwqqhxxxxxemployee> jxxxbh400xwwqqhxxxxxemployeesForMailtocode) {
		this.jxxxbh400xwwqqhxxxxxemployeesForMailtocode = jxxxbh400xwwqqhxxxxxemployeesForMailtocode;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fxxxuq111xwwqqhxxxxxaddressByShiptocode")
	public Set<Jxxxuq300xwwqqhxxxxxvendor> getJxxxuq300xwwqqhxxxxxvendorsForShiptocode() {
		return this.jxxxuq300xwwqqhxxxxxvendorsForShiptocode;
	}

	public void setJxxxuq300xwwqqhxxxxxvendorsForShiptocode(
			Set<Jxxxuq300xwwqqhxxxxxvendor> jxxxuq300xwwqqhxxxxxvendorsForShiptocode) {
		this.jxxxuq300xwwqqhxxxxxvendorsForShiptocode = jxxxuq300xwwqqhxxxxxvendorsForShiptocode;
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

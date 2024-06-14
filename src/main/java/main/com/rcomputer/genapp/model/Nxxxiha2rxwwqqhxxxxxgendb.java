package com.rcomputer.genapp.model;
// Generated 26-May-2024 9:51:06 PM by Hibernate Tools 4.0.0

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
 * Nxxxiha2rxwwqqhxxxxxgendb generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "rgendb")
public class Nxxxiha2rxwwqqhxxxxxgendb implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Nxxxiha1rxwwqqhxxxxxgenapp nxxxiha1rxwwqqhxxxxxgenapp;
	private String a0xxukxxbvxxxxxxxxxxdbname;
	private String a1xxfxxxbvxxxxxxxxxxdescript;
	private String a1xxfxxxbvxxxxxxxxxxdbtype;
	private String a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor;
	private String a3xxfxxxbvxxxxxxxxxxdbversion;
	private String a3xxfxxxbvxxxxxxxxxxdbplatform;
	private String a6xxfxxxbvxxxxxxxxxxsqldriver;
	private String a7xxfxxxbvxxxxxxxxxxsqlurl;
	private String a8xxfxxxbvxxxxxxxxxxsqluser;
	private String a9xxfxxxbvxxxxxxxxxxsqlpassword;
	private String b0xxfxxxbvxxxxxxxxxxsqlclasspath;
	private String b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript;
	private String b2xxfxxxbvxxxxxxxxxxsqldropdbscript;
	private String b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript;
	private String b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript;
	private Integer zexxzzfxhhxxxxxxxxxxstatusfl;
	private Date zfxxcztxlxxxxxxxxxxxstatusfldt;
	private String zgxxuxznbvxxxxxxxxxxnotes;
	private String zhxxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Nxxxiha3rxwwqqhxxxxxgentable> nxxxiha3rxwwqqhxxxxxgentables = new HashSet<Nxxxiha3rxwwqqhxxxxxgentable>(
			0);
	private Set<Nxxxiha4rxwwqqhxxxxxgenfields> nxxxiha4rxwwqqhxxxxxgenfieldses = new HashSet<Nxxxiha4rxwwqqhxxxxxgenfields>(
			0);

	public Nxxxiha2rxwwqqhxxxxxgendb() {
	}

	public Nxxxiha2rxwwqqhxxxxxgendb(String a0xxukxxbvxxxxxxxxxxdbname) {
		this.a0xxukxxbvxxxxxxxxxxdbname = a0xxukxxbvxxxxxxxxxxdbname;
	}
	public Nxxxiha2rxwwqqhxxxxxgendb(
			Nxxxiha1rxwwqqhxxxxxgenapp nxxxiha1rxwwqqhxxxxxgenapp,
			String a0xxukxxbvxxxxxxxxxxdbname,
			String a1xxfxxxbvxxxxxxxxxxdescript,
			String a1xxfxxxbvxxxxxxxxxxdbtype,
			String a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor,
			String a3xxfxxxbvxxxxxxxxxxdbversion,
			String a3xxfxxxbvxxxxxxxxxxdbplatform,
			String a6xxfxxxbvxxxxxxxxxxsqldriver,
			String a7xxfxxxbvxxxxxxxxxxsqlurl,
			String a8xxfxxxbvxxxxxxxxxxsqluser,
			String a9xxfxxxbvxxxxxxxxxxsqlpassword,
			String b0xxfxxxbvxxxxxxxxxxsqlclasspath,
			String b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript,
			String b2xxfxxxbvxxxxxxxxxxsqldropdbscript,
			String b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript,
			String b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript,
			Integer zexxzzfxhhxxxxxxxxxxstatusfl,
			Date zfxxcztxlxxxxxxxxxxxstatusfldt,
			String zgxxuxznbvxxxxxxxxxxnotes, String zhxxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Nxxxiha3rxwwqqhxxxxxgentable> nxxxiha3rxwwqqhxxxxxgentables,
			Set<Nxxxiha4rxwwqqhxxxxxgenfields> nxxxiha4rxwwqqhxxxxxgenfieldses) {
		this.nxxxiha1rxwwqqhxxxxxgenapp = nxxxiha1rxwwqqhxxxxxgenapp;
		this.a0xxukxxbvxxxxxxxxxxdbname = a0xxukxxbvxxxxxxxxxxdbname;
		this.a1xxfxxxbvxxxxxxxxxxdescript = a1xxfxxxbvxxxxxxxxxxdescript;
		this.a1xxfxxxbvxxxxxxxxxxdbtype = a1xxfxxxbvxxxxxxxxxxdbtype;
		this.a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor = a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor;
		this.a3xxfxxxbvxxxxxxxxxxdbversion = a3xxfxxxbvxxxxxxxxxxdbversion;
		this.a3xxfxxxbvxxxxxxxxxxdbplatform = a3xxfxxxbvxxxxxxxxxxdbplatform;
		this.a6xxfxxxbvxxxxxxxxxxsqldriver = a6xxfxxxbvxxxxxxxxxxsqldriver;
		this.a7xxfxxxbvxxxxxxxxxxsqlurl = a7xxfxxxbvxxxxxxxxxxsqlurl;
		this.a8xxfxxxbvxxxxxxxxxxsqluser = a8xxfxxxbvxxxxxxxxxxsqluser;
		this.a9xxfxxxbvxxxxxxxxxxsqlpassword = a9xxfxxxbvxxxxxxxxxxsqlpassword;
		this.b0xxfxxxbvxxxxxxxxxxsqlclasspath = b0xxfxxxbvxxxxxxxxxxsqlclasspath;
		this.b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript = b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript;
		this.b2xxfxxxbvxxxxxxxxxxsqldropdbscript = b2xxfxxxbvxxxxxxxxxxsqldropdbscript;
		this.b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript = b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript;
		this.b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript = b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript;
		this.zexxzzfxhhxxxxxxxxxxstatusfl = zexxzzfxhhxxxxxxxxxxstatusfl;
		this.zfxxcztxlxxxxxxxxxxxstatusfldt = zfxxcztxlxxxxxxxxxxxstatusfldt;
		this.zgxxuxznbvxxxxxxxxxxnotes = zgxxuxznbvxxxxxxxxxxnotes;
		this.zhxxutoxlhxxxxxxxxxxowner = zhxxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.nxxxiha3rxwwqqhxxxxxgentables = nxxxiha3rxwwqqhxxxxxgentables;
		this.nxxxiha4rxwwqqhxxxxxgenfieldses = nxxxiha4rxwwqqhxxxxxgenfieldses;
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
	@JoinColumn(name = "appcode")
	public Nxxxiha1rxwwqqhxxxxxgenapp getNxxxiha1rxwwqqhxxxxxgenapp() {
		return this.nxxxiha1rxwwqqhxxxxxgenapp;
	}

	public void setNxxxiha1rxwwqqhxxxxxgenapp(
			Nxxxiha1rxwwqqhxxxxxgenapp nxxxiha1rxwwqqhxxxxxgenapp) {
		this.nxxxiha1rxwwqqhxxxxxgenapp = nxxxiha1rxwwqqhxxxxxgenapp;
	}

	@Column(name = "dbname", nullable = false, length = 40)
	@NotNull
	@Size(max = 40)
	public String getA0xxukxxbvxxxxxxxxxxdbname() {
		return this.a0xxukxxbvxxxxxxxxxxdbname;
	}

	public void setA0xxukxxbvxxxxxxxxxxdbname(String a0xxukxxbvxxxxxxxxxxdbname) {
		this.a0xxukxxbvxxxxxxxxxxdbname = a0xxukxxbvxxxxxxxxxxdbname;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getA1xxfxxxbvxxxxxxxxxxdescript() {
		return this.a1xxfxxxbvxxxxxxxxxxdescript;
	}

	public void setA1xxfxxxbvxxxxxxxxxxdescript(
			String a1xxfxxxbvxxxxxxxxxxdescript) {
		this.a1xxfxxxbvxxxxxxxxxxdescript = a1xxfxxxbvxxxxxxxxxxdescript;
	}

	@Column(name = "dbtype", length = 20)
	@Size(max = 20)
	public String getA1xxfxxxbvxxxxxxxxxxdbtype() {
		return this.a1xxfxxxbvxxxxxxxxxxdbtype;
	}

	public void setA1xxfxxxbvxxxxxxxxxxdbtype(String a1xxfxxxbvxxxxxxxxxxdbtype) {
		this.a1xxfxxxbvxxxxxxxxxxdbtype = a1xxfxxxbvxxxxxxxxxxdbtype;
	}

	@Column(name = "dbvendor", length = 20)
	@Size(max = 20)
	public String getA2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor() {
		return this.a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor;
	}

	public void setA2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor(
			String a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor) {
		this.a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor = a2xxfxxxbvxxxxxxxxxxdbxxxxxxxxvendor;
	}

	@Column(name = "dbversion", length = 20)
	@Size(max = 20)
	public String getA3xxfxxxbvxxxxxxxxxxdbversion() {
		return this.a3xxfxxxbvxxxxxxxxxxdbversion;
	}

	public void setA3xxfxxxbvxxxxxxxxxxdbversion(
			String a3xxfxxxbvxxxxxxxxxxdbversion) {
		this.a3xxfxxxbvxxxxxxxxxxdbversion = a3xxfxxxbvxxxxxxxxxxdbversion;
	}

	@Column(name = "dbplatform", length = 20)
	@Size(max = 20)
	public String getA3xxfxxxbvxxxxxxxxxxdbplatform() {
		return this.a3xxfxxxbvxxxxxxxxxxdbplatform;
	}

	public void setA3xxfxxxbvxxxxxxxxxxdbplatform(
			String a3xxfxxxbvxxxxxxxxxxdbplatform) {
		this.a3xxfxxxbvxxxxxxxxxxdbplatform = a3xxfxxxbvxxxxxxxxxxdbplatform;
	}

	@Column(name = "sqldriver", length = 40)
	@Size(max = 40)
	public String getA6xxfxxxbvxxxxxxxxxxsqldriver() {
		return this.a6xxfxxxbvxxxxxxxxxxsqldriver;
	}

	public void setA6xxfxxxbvxxxxxxxxxxsqldriver(
			String a6xxfxxxbvxxxxxxxxxxsqldriver) {
		this.a6xxfxxxbvxxxxxxxxxxsqldriver = a6xxfxxxbvxxxxxxxxxxsqldriver;
	}

	@Column(name = "sqlurl", length = 40)
	@Size(max = 40)
	public String getA7xxfxxxbvxxxxxxxxxxsqlurl() {
		return this.a7xxfxxxbvxxxxxxxxxxsqlurl;
	}

	public void setA7xxfxxxbvxxxxxxxxxxsqlurl(String a7xxfxxxbvxxxxxxxxxxsqlurl) {
		this.a7xxfxxxbvxxxxxxxxxxsqlurl = a7xxfxxxbvxxxxxxxxxxsqlurl;
	}

	@Column(name = "sqluser", length = 20)
	@Size(max = 20)
	public String getA8xxfxxxbvxxxxxxxxxxsqluser() {
		return this.a8xxfxxxbvxxxxxxxxxxsqluser;
	}

	public void setA8xxfxxxbvxxxxxxxxxxsqluser(
			String a8xxfxxxbvxxxxxxxxxxsqluser) {
		this.a8xxfxxxbvxxxxxxxxxxsqluser = a8xxfxxxbvxxxxxxxxxxsqluser;
	}

	@Column(name = "sqlpassword", length = 20)
	@Size(max = 20)
	public String getA9xxfxxxbvxxxxxxxxxxsqlpassword() {
		return this.a9xxfxxxbvxxxxxxxxxxsqlpassword;
	}

	public void setA9xxfxxxbvxxxxxxxxxxsqlpassword(
			String a9xxfxxxbvxxxxxxxxxxsqlpassword) {
		this.a9xxfxxxbvxxxxxxxxxxsqlpassword = a9xxfxxxbvxxxxxxxxxxsqlpassword;
	}

	@Column(name = "sqlclasspath", length = 40)
	@Size(max = 40)
	public String getB0xxfxxxbvxxxxxxxxxxsqlclasspath() {
		return this.b0xxfxxxbvxxxxxxxxxxsqlclasspath;
	}

	public void setB0xxfxxxbvxxxxxxxxxxsqlclasspath(
			String b0xxfxxxbvxxxxxxxxxxsqlclasspath) {
		this.b0xxfxxxbvxxxxxxxxxxsqlclasspath = b0xxfxxxbvxxxxxxxxxxsqlclasspath;
	}

	@Column(name = "sqlcreatedbscript", length = 20)
	@Size(max = 20)
	public String getB1xxfxxxbvxxxxxxxxxxsqlcreatedbscript() {
		return this.b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript;
	}

	public void setB1xxfxxxbvxxxxxxxxxxsqlcreatedbscript(
			String b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript) {
		this.b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript = b1xxfxxxbvxxxxxxxxxxsqlcreatedbscript;
	}

	@Column(name = "sqldropdbscript", length = 20)
	@Size(max = 20)
	public String getB2xxfxxxbvxxxxxxxxxxsqldropdbscript() {
		return this.b2xxfxxxbvxxxxxxxxxxsqldropdbscript;
	}

	public void setB2xxfxxxbvxxxxxxxxxxsqldropdbscript(
			String b2xxfxxxbvxxxxxxxxxxsqldropdbscript) {
		this.b2xxfxxxbvxxxxxxxxxxsqldropdbscript = b2xxfxxxbvxxxxxxxxxxsqldropdbscript;
	}

	@Column(name = "sqlcreatetblsscript", length = 20)
	@Size(max = 20)
	public String getB3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript() {
		return this.b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript;
	}

	public void setB3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript(
			String b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript) {
		this.b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript = b3xxfxxxbvxxxxxxxxxxsqlcreatetblsscript;
	}

	@Column(name = "sqlloadtblsscript", length = 20)
	@Size(max = 20)
	public String getB4xxfxxxbvxxxxxxxxxxsqlloadtblsscript() {
		return this.b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript;
	}

	public void setB4xxfxxxbvxxxxxxxxxxsqlloadtblsscript(
			String b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript) {
		this.b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript = b4xxfxxxbvxxxxxxxxxxsqlloadtblsscript;
	}

	@Column(name = "statusfl")
	public Integer getZexxzzfxhhxxxxxxxxxxstatusfl() {
		return this.zexxzzfxhhxxxxxxxxxxstatusfl;
	}

	public void setZexxzzfxhhxxxxxxxxxxstatusfl(
			Integer zexxzzfxhhxxxxxxxxxxstatusfl) {
		this.zexxzzfxhhxxxxxxxxxxstatusfl = zexxzzfxhhxxxxxxxxxxstatusfl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "statusfldt", length = 29)
	public Date getZfxxcztxlxxxxxxxxxxxstatusfldt() {
		return this.zfxxcztxlxxxxxxxxxxxstatusfldt;
	}

	public void setZfxxcztxlxxxxxxxxxxxstatusfldt(
			Date zfxxcztxlxxxxxxxxxxxstatusfldt) {
		this.zfxxcztxlxxxxxxxxxxxstatusfldt = zfxxcztxlxxxxxxxxxxxstatusfldt;
	}

	@Column(name = "notes", length = 60)
	@Size(max = 60)
	public String getZgxxuxznbvxxxxxxxxxxnotes() {
		return this.zgxxuxznbvxxxxxxxxxxnotes;
	}

	public void setZgxxuxznbvxxxxxxxxxxnotes(String zgxxuxznbvxxxxxxxxxxnotes) {
		this.zgxxuxznbvxxxxxxxxxxnotes = zgxxuxznbvxxxxxxxxxxnotes;
	}

	@Column(name = "owner", length = 40)
	@Size(max = 40)
	public String getZhxxutoxlhxxxxxxxxxxowner() {
		return this.zhxxutoxlhxxxxxxxxxxowner;
	}

	public void setZhxxutoxlhxxxxxxxxxxowner(String zhxxutoxlhxxxxxxxxxxowner) {
		this.zhxxutoxlhxxxxxxxxxxowner = zhxxutoxlhxxxxxxxxxxowner;
	}

	@Column(name = "owner2", length = 40)
	@Size(max = 40)
	public String getZzxxu2oxxhxxxxxxxxxxowner2() {
		return this.zzxxu2oxxhxxxxxxxxxxowner2;
	}

	public void setZzxxu2oxxhxxxxxxxxxxowner2(String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nxxxiha2rxwwqqhxxxxxgendb")
	public Set<Nxxxiha3rxwwqqhxxxxxgentable> getNxxxiha3rxwwqqhxxxxxgentables() {
		return this.nxxxiha3rxwwqqhxxxxxgentables;
	}

	public void setNxxxiha3rxwwqqhxxxxxgentables(
			Set<Nxxxiha3rxwwqqhxxxxxgentable> nxxxiha3rxwwqqhxxxxxgentables) {
		this.nxxxiha3rxwwqqhxxxxxgentables = nxxxiha3rxwwqqhxxxxxgentables;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nxxxiha2rxwwqqhxxxxxgendb")
	public Set<Nxxxiha4rxwwqqhxxxxxgenfields> getNxxxiha4rxwwqqhxxxxxgenfieldses() {
		return this.nxxxiha4rxwwqqhxxxxxgenfieldses;
	}

	public void setNxxxiha4rxwwqqhxxxxxgenfieldses(
			Set<Nxxxiha4rxwwqqhxxxxxgenfields> nxxxiha4rxwwqqhxxxxxgenfieldses) {
		this.nxxxiha4rxwwqqhxxxxxgenfieldses = nxxxiha4rxwwqqhxxxxxgenfieldses;
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

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
 * Jxxxuq54exwwqqhxxxxxgroupmembers generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "groupmembers")
public class Jxxxuq54exwwqqhxxxxxgroupmembers implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee;
	private Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity;
	private Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer;
	private Fpxxuq9eexwwqqhefxxxmachine fpxxuq9eexwwqqhefxxxmachine;
	private Fxxxuq1ggxwwqqhxxxxxmembersgroup fxxxuq1ggxwwqqhxxxxxmembersgroup;
	private Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor;
	private Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem;
	private String b1xxukgmbvxxxxxxxxxxmemberid;
	private String b2xxuxzsbvxxxxxxxxxxdescript;
	private String b3xxuzyxbv46xxxxxxxxsourcetype;
	private String y5xxuzyxbv46xxxxxxxxtype;
	private String y6xxuxxxbvxxxxxxxxxxcurrpw;
	private Date y7xxcxxrlxxxxxxxxxxxexpiry;
	private Integer z1xxzzfxhhxxxxxxxxxxstatusfl;
	private Date z2xxcztxlxxxxxxxxxxxstatusfldt;
	private String z3xxutoxlhxxxxxxxxxxowner;
	private String zzxxu2oxxhxxxxxxxxxxowner2;
	private Set<Dxxxuq2drxwwqqhfxxxxresourcedetails> dxxxuq2drxwwqqhfxxxxresourcedetailses = new HashSet<Dxxxuq2drxwwqqhfxxxxresourcedetails>(
			0);
	private Set<Fxxxuq1kkxwwqqhfxxxxtask> fxxxuq1kkxwwqqhfxxxxtasks = new HashSet<Fxxxuq1kkxwwqqhfxxxxtask>(
			0);

	public Jxxxuq54exwwqqhxxxxxgroupmembers() {
	}

	public Jxxxuq54exwwqqhxxxxxgroupmembers(
			Fxxxuq1ggxwwqqhxxxxxmembersgroup fxxxuq1ggxwwqqhxxxxxmembersgroup,
			String b1xxukgmbvxxxxxxxxxxmemberid) {
		this.fxxxuq1ggxwwqqhxxxxxmembersgroup = fxxxuq1ggxwwqqhxxxxxmembersgroup;
		this.b1xxukgmbvxxxxxxxxxxmemberid = b1xxukgmbvxxxxxxxxxxmemberid;
	}
	public Jxxxuq54exwwqqhxxxxxgroupmembers(
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee,
			Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity,
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer,
			Fpxxuq9eexwwqqhefxxxmachine fpxxuq9eexwwqqhefxxxmachine,
			Fxxxuq1ggxwwqqhxxxxxmembersgroup fxxxuq1ggxwwqqhxxxxxmembersgroup,
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor,
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem,
			String b1xxukgmbvxxxxxxxxxxmemberid,
			String b2xxuxzsbvxxxxxxxxxxdescript,
			String b3xxuzyxbv46xxxxxxxxsourcetype,
			String y5xxuzyxbv46xxxxxxxxtype,
			String y6xxuxxxbvxxxxxxxxxxcurrpw,
			Date y7xxcxxrlxxxxxxxxxxxexpiry,
			Integer z1xxzzfxhhxxxxxxxxxxstatusfl,
			Date z2xxcztxlxxxxxxxxxxxstatusfldt,
			String z3xxutoxlhxxxxxxxxxxowner,
			String zzxxu2oxxhxxxxxxxxxxowner2,
			Set<Dxxxuq2drxwwqqhfxxxxresourcedetails> dxxxuq2drxwwqqhfxxxxresourcedetailses,
			Set<Fxxxuq1kkxwwqqhfxxxxtask> fxxxuq1kkxwwqqhfxxxxtasks) {
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
		this.fxxxuq188xwwqqhxxxxxactivity = fxxxuq188xwwqqhxxxxxactivity;
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
		this.fpxxuq9eexwwqqhefxxxmachine = fpxxuq9eexwwqqhefxxxmachine;
		this.fxxxuq1ggxwwqqhxxxxxmembersgroup = fxxxuq1ggxwwqqhxxxxxmembersgroup;
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
		this.b1xxukgmbvxxxxxxxxxxmemberid = b1xxukgmbvxxxxxxxxxxmemberid;
		this.b2xxuxzsbvxxxxxxxxxxdescript = b2xxuxzsbvxxxxxxxxxxdescript;
		this.b3xxuzyxbv46xxxxxxxxsourcetype = b3xxuzyxbv46xxxxxxxxsourcetype;
		this.y5xxuzyxbv46xxxxxxxxtype = y5xxuzyxbv46xxxxxxxxtype;
		this.y6xxuxxxbvxxxxxxxxxxcurrpw = y6xxuxxxbvxxxxxxxxxxcurrpw;
		this.y7xxcxxrlxxxxxxxxxxxexpiry = y7xxcxxrlxxxxxxxxxxxexpiry;
		this.z1xxzzfxhhxxxxxxxxxxstatusfl = z1xxzzfxhhxxxxxxxxxxstatusfl;
		this.z2xxcztxlxxxxxxxxxxxstatusfldt = z2xxcztxlxxxxxxxxxxxstatusfldt;
		this.z3xxutoxlhxxxxxxxxxxowner = z3xxutoxlhxxxxxxxxxxowner;
		this.zzxxu2oxxhxxxxxxxxxxowner2 = zzxxu2oxxhxxxxxxxxxxowner2;
		this.dxxxuq2drxwwqqhfxxxxresourcedetailses = dxxxuq2drxwwqqhfxxxxresourcedetailses;
		this.fxxxuq1kkxwwqqhfxxxxtasks = fxxxuq1kkxwwqqhfxxxxtasks;
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
	@JoinColumn(name = "memberem")
	public Jxxxbh400xwwqqhxxxxxemployee getJxxxbh400xwwqqhxxxxxemployee() {
		return this.jxxxbh400xwwqqhxxxxxemployee;
	}

	public void setJxxxbh400xwwqqhxxxxxemployee(
			Jxxxbh400xwwqqhxxxxxemployee jxxxbh400xwwqqhxxxxxemployee) {
		this.jxxxbh400xwwqqhxxxxxemployee = jxxxbh400xwwqqhxxxxxemployee;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberac")
	public Fxxxuq188xwwqqhxxxxxactivity getFxxxuq188xwwqqhxxxxxactivity() {
		return this.fxxxuq188xwwqqhxxxxxactivity;
	}

	public void setFxxxuq188xwwqqhxxxxxactivity(
			Fxxxuq188xwwqqhxxxxxactivity fxxxuq188xwwqqhxxxxxactivity) {
		this.fxxxuq188xwwqqhxxxxxactivity = fxxxuq188xwwqqhxxxxxactivity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "membercu")
	public Jxxxuq201xwwqqhxxxxxcustomer getJxxxuq201xwwqqhxxxxxcustomer() {
		return this.jxxxuq201xwwqqhxxxxxcustomer;
	}

	public void setJxxxuq201xwwqqhxxxxxcustomer(
			Jxxxuq201xwwqqhxxxxxcustomer jxxxuq201xwwqqhxxxxxcustomer) {
		this.jxxxuq201xwwqqhxxxxxcustomer = jxxxuq201xwwqqhxxxxxcustomer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberma")
	public Fpxxuq9eexwwqqhefxxxmachine getFpxxuq9eexwwqqhefxxxmachine() {
		return this.fpxxuq9eexwwqqhefxxxmachine;
	}

	public void setFpxxuq9eexwwqqhefxxxmachine(
			Fpxxuq9eexwwqqhefxxxmachine fpxxuq9eexwwqqhefxxxmachine) {
		this.fpxxuq9eexwwqqhefxxxmachine = fpxxuq9eexwwqqhefxxxmachine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groupid", nullable = false)
	@NotNull
	public Fxxxuq1ggxwwqqhxxxxxmembersgroup getFxxxuq1ggxwwqqhxxxxxmembersgroup() {
		return this.fxxxuq1ggxwwqqhxxxxxmembersgroup;
	}

	public void setFxxxuq1ggxwwqqhxxxxxmembersgroup(
			Fxxxuq1ggxwwqqhxxxxxmembersgroup fxxxuq1ggxwwqqhxxxxxmembersgroup) {
		this.fxxxuq1ggxwwqqhxxxxxmembersgroup = fxxxuq1ggxwwqqhxxxxxmembersgroup;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberve")
	public Jxxxuq300xwwqqhxxxxxvendor getJxxxuq300xwwqqhxxxxxvendor() {
		return this.jxxxuq300xwwqqhxxxxxvendor;
	}

	public void setJxxxuq300xwwqqhxxxxxvendor(
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor) {
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "memberit")
	public Fpxxfq1a5xwwqqhxxxxxitem getFpxxfq1a5xwwqqhxxxxxitem() {
		return this.fpxxfq1a5xwwqqhxxxxxitem;
	}

	public void setFpxxfq1a5xwwqqhxxxxxitem(
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem) {
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
	}

	@Column(name = "memberid", nullable = false, length = 32)
	@NotNull
	@Size(max = 32)
	public String getB1xxukgmbvxxxxxxxxxxmemberid() {
		return this.b1xxukgmbvxxxxxxxxxxmemberid;
	}

	public void setB1xxukgmbvxxxxxxxxxxmemberid(
			String b1xxukgmbvxxxxxxxxxxmemberid) {
		this.b1xxukgmbvxxxxxxxxxxmemberid = b1xxukgmbvxxxxxxxxxxmemberid;
	}

	@Column(name = "descript", length = 120)
	@Size(max = 120)
	public String getB2xxuxzsbvxxxxxxxxxxdescript() {
		return this.b2xxuxzsbvxxxxxxxxxxdescript;
	}

	public void setB2xxuxzsbvxxxxxxxxxxdescript(
			String b2xxuxzsbvxxxxxxxxxxdescript) {
		this.b2xxuxzsbvxxxxxxxxxxdescript = b2xxuxzsbvxxxxxxxxxxdescript;
	}

	@Column(name = "sourcetype", length = 10)
	@Size(max = 10)
	public String getB3xxuzyxbv46xxxxxxxxsourcetype() {
		return this.b3xxuzyxbv46xxxxxxxxsourcetype;
	}

	public void setB3xxuzyxbv46xxxxxxxxsourcetype(
			String b3xxuzyxbv46xxxxxxxxsourcetype) {
		this.b3xxuzyxbv46xxxxxxxxsourcetype = b3xxuzyxbv46xxxxxxxxsourcetype;
	}

	@Column(name = "type", length = 10)
	@Size(max = 10)
	public String getY5xxuzyxbv46xxxxxxxxtype() {
		return this.y5xxuzyxbv46xxxxxxxxtype;
	}

	public void setY5xxuzyxbv46xxxxxxxxtype(String y5xxuzyxbv46xxxxxxxxtype) {
		this.y5xxuzyxbv46xxxxxxxxtype = y5xxuzyxbv46xxxxxxxxtype;
	}

	@Column(name = "currpw", length = 32)
	@Size(max = 32)
	public String getY6xxuxxxbvxxxxxxxxxxcurrpw() {
		return this.y6xxuxxxbvxxxxxxxxxxcurrpw;
	}

	public void setY6xxuxxxbvxxxxxxxxxxcurrpw(String y6xxuxxxbvxxxxxxxxxxcurrpw) {
		this.y6xxuxxxbvxxxxxxxxxxcurrpw = y6xxuxxxbvxxxxxxxxxxcurrpw;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expiry", length = 29)
	public Date getY7xxcxxrlxxxxxxxxxxxexpiry() {
		return this.y7xxcxxrlxxxxxxxxxxxexpiry;
	}

	public void setY7xxcxxrlxxxxxxxxxxxexpiry(Date y7xxcxxrlxxxxxxxxxxxexpiry) {
		this.y7xxcxxrlxxxxxxxxxxxexpiry = y7xxcxxrlxxxxxxxxxxxexpiry;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jxxxuq54exwwqqhxxxxxgroupmembers")
	public Set<Dxxxuq2drxwwqqhfxxxxresourcedetails> getDxxxuq2drxwwqqhfxxxxresourcedetailses() {
		return this.dxxxuq2drxwwqqhfxxxxresourcedetailses;
	}

	public void setDxxxuq2drxwwqqhfxxxxresourcedetailses(
			Set<Dxxxuq2drxwwqqhfxxxxresourcedetails> dxxxuq2drxwwqqhfxxxxresourcedetailses) {
		this.dxxxuq2drxwwqqhfxxxxresourcedetailses = dxxxuq2drxwwqqhfxxxxresourcedetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jxxxuq54exwwqqhxxxxxgroupmembers")
	public Set<Fxxxuq1kkxwwqqhfxxxxtask> getFxxxuq1kkxwwqqhfxxxxtasks() {
		return this.fxxxuq1kkxwwqqhfxxxxtasks;
	}

	public void setFxxxuq1kkxwwqqhfxxxxtasks(
			Set<Fxxxuq1kkxwwqqhfxxxxtask> fxxxuq1kkxwwqqhfxxxxtasks) {
		this.fxxxuq1kkxwwqqhfxxxxtasks = fxxxuq1kkxwwqqhfxxxxtasks;
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

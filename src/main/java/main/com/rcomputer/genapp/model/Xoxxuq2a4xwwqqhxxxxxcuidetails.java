package com.rcomputer.genapp.model;
// Generated 26-May-2024 9:51:06 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
 * Xoxxuq2a4xwwqqhxxxxxcuidetails generated by hbm2java
 */
@Entity
@XmlRootElement
@Table(name = "cuidetails")
public class Xoxxuq2a4xwwqqhxxxxxcuidetails implements java.io.Serializable {

	private Integer a0xxuobxbxxxxxxxxxxxsid;
	private Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor;
	private Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem;
	private Trexuq266xwwqqhxxxxxcuinvoice trexuq266xwwqqhxxxxxcuinvoice;
	private Integer b1xxzo11bvlxxxxxxxxxline;
	private BigDecimal z3xxeqxxbvnxxxxxxxxxqtyordrd;
	private String z4xxuuxxbv19xxxxxxxxordunit;
	private BigDecimal z5xxzpxravxxxxxxxxxxordprice;
	private Date z6xxcxxxbxxxxxxxxxxxiodatet;
	private Date z7xxcxxxbvxxxxxxxxxxdelvdateit;
	private BigDecimal zaxxzxxxavxxxxxxxxxxqtyostnd;
	private BigDecimal zbxxzbxxavxxxxxxxxxxbaseamount;
	private BigDecimal zbxxzlxxavxxxxxxxxxxdelivchrg;
	private BigDecimal zcxxzmxxavxxxxxxxxxxmiscchrg;
	private BigDecimal zdxxzxz1avxxxxxxxxxxtax1amt;
	private BigDecimal zexxzxz2avxxxxxxxxxxtax2amt;
	private BigDecimal zfxxzxz3avxxxxxxxxxxtax3amt;
	private BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl;
	private String zzxxu2oxxhxxxxxxxxxxowner2;

	public Xoxxuq2a4xwwqqhxxxxxcuidetails() {
	}

	public Xoxxuq2a4xwwqqhxxxxxcuidetails(
			Trexuq266xwwqqhxxxxxcuinvoice trexuq266xwwqqhxxxxxcuinvoice) {
		this.trexuq266xwwqqhxxxxxcuinvoice = trexuq266xwwqqhxxxxxcuinvoice;
	}
	public Xoxxuq2a4xwwqqhxxxxxcuidetails(
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor,
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem,
			Trexuq266xwwqqhxxxxxcuinvoice trexuq266xwwqqhxxxxxcuinvoice,
			Integer b1xxzo11bvlxxxxxxxxxline,
			BigDecimal z3xxeqxxbvnxxxxxxxxxqtyordrd,
			String z4xxuuxxbv19xxxxxxxxordunit,
			BigDecimal z5xxzpxravxxxxxxxxxxordprice,
			Date z6xxcxxxbxxxxxxxxxxxiodatet,
			Date z7xxcxxxbvxxxxxxxxxxdelvdateit,
			BigDecimal zaxxzxxxavxxxxxxxxxxqtyostnd,
			BigDecimal zbxxzbxxavxxxxxxxxxxbaseamount,
			BigDecimal zbxxzlxxavxxxxxxxxxxdelivchrg,
			BigDecimal zcxxzmxxavxxxxxxxxxxmiscchrg,
			BigDecimal zdxxzxz1avxxxxxxxxxxtax1amt,
			BigDecimal zexxzxz2avxxxxxxxxxxtax2amt,
			BigDecimal zfxxzxz3avxxxxxxxxxxtax3amt,
			BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl,
			String zzxxu2oxxhxxxxxxxxxxowner2) {
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
		this.trexuq266xwwqqhxxxxxcuinvoice = trexuq266xwwqqhxxxxxcuinvoice;
		this.b1xxzo11bvlxxxxxxxxxline = b1xxzo11bvlxxxxxxxxxline;
		this.z3xxeqxxbvnxxxxxxxxxqtyordrd = z3xxeqxxbvnxxxxxxxxxqtyordrd;
		this.z4xxuuxxbv19xxxxxxxxordunit = z4xxuuxxbv19xxxxxxxxordunit;
		this.z5xxzpxravxxxxxxxxxxordprice = z5xxzpxravxxxxxxxxxxordprice;
		this.z6xxcxxxbxxxxxxxxxxxiodatet = z6xxcxxxbxxxxxxxxxxxiodatet;
		this.z7xxcxxxbvxxxxxxxxxxdelvdateit = z7xxcxxxbvxxxxxxxxxxdelvdateit;
		this.zaxxzxxxavxxxxxxxxxxqtyostnd = zaxxzxxxavxxxxxxxxxxqtyostnd;
		this.zbxxzbxxavxxxxxxxxxxbaseamount = zbxxzbxxavxxxxxxxxxxbaseamount;
		this.zbxxzlxxavxxxxxxxxxxdelivchrg = zbxxzlxxavxxxxxxxxxxdelivchrg;
		this.zcxxzmxxavxxxxxxxxxxmiscchrg = zcxxzmxxavxxxxxxxxxxmiscchrg;
		this.zdxxzxz1avxxxxxxxxxxtax1amt = zdxxzxz1avxxxxxxxxxxtax1amt;
		this.zexxzxz2avxxxxxxxxxxtax2amt = zexxzxz2avxxxxxxxxxxtax2amt;
		this.zfxxzxz3avxxxxxxxxxxtax3amt = zfxxzxz3avxxxxxxxxxxtax3amt;
		this.zgxxzlpxxvxxxxxxxxxxlinetotl = zgxxzlpxxvxxxxxxxxxxlinetotl;
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
	@JoinColumn(name = "vendor")
	public Jxxxuq300xwwqqhxxxxxvendor getJxxxuq300xwwqqhxxxxxvendor() {
		return this.jxxxuq300xwwqqhxxxxxvendor;
	}

	public void setJxxxuq300xwwqqhxxxxxvendor(
			Jxxxuq300xwwqqhxxxxxvendor jxxxuq300xwwqqhxxxxxvendor) {
		this.jxxxuq300xwwqqhxxxxxvendor = jxxxuq300xwwqqhxxxxxvendor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matcode")
	public Fpxxfq1a5xwwqqhxxxxxitem getFpxxfq1a5xwwqqhxxxxxitem() {
		return this.fpxxfq1a5xwwqqhxxxxxitem;
	}

	public void setFpxxfq1a5xwwqqhxxxxxitem(
			Fpxxfq1a5xwwqqhxxxxxitem fpxxfq1a5xwwqqhxxxxxitem) {
		this.fpxxfq1a5xwwqqhxxxxxitem = fpxxfq1a5xwwqqhxxxxxitem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cuino", nullable = false)
	@NotNull
	public Trexuq266xwwqqhxxxxxcuinvoice getTrexuq266xwwqqhxxxxxcuinvoice() {
		return this.trexuq266xwwqqhxxxxxcuinvoice;
	}

	public void setTrexuq266xwwqqhxxxxxcuinvoice(
			Trexuq266xwwqqhxxxxxcuinvoice trexuq266xwwqqhxxxxxcuinvoice) {
		this.trexuq266xwwqqhxxxxxcuinvoice = trexuq266xwwqqhxxxxxcuinvoice;
	}

	@Column(name = "line")
	public Integer getB1xxzo11bvlxxxxxxxxxline() {
		return this.b1xxzo11bvlxxxxxxxxxline;
	}

	public void setB1xxzo11bvlxxxxxxxxxline(Integer b1xxzo11bvlxxxxxxxxxline) {
		this.b1xxzo11bvlxxxxxxxxxline = b1xxzo11bvlxxxxxxxxxline;
	}

	@Column(name = "qtyordrd", precision = 14)
	public BigDecimal getZ3xxeqxxbvnxxxxxxxxxqtyordrd() {
		return this.z3xxeqxxbvnxxxxxxxxxqtyordrd;
	}

	public void setZ3xxeqxxbvnxxxxxxxxxqtyordrd(
			BigDecimal z3xxeqxxbvnxxxxxxxxxqtyordrd) {
		this.z3xxeqxxbvnxxxxxxxxxqtyordrd = z3xxeqxxbvnxxxxxxxxxqtyordrd;
	}

	@Column(name = "ordunit", length = 12)
	@Size(max = 12)
	public String getZ4xxuuxxbv19xxxxxxxxordunit() {
		return this.z4xxuuxxbv19xxxxxxxxordunit;
	}

	public void setZ4xxuuxxbv19xxxxxxxxordunit(
			String z4xxuuxxbv19xxxxxxxxordunit) {
		this.z4xxuuxxbv19xxxxxxxxordunit = z4xxuuxxbv19xxxxxxxxordunit;
	}

	@Column(name = "ordprice", precision = 14)
	public BigDecimal getZ5xxzpxravxxxxxxxxxxordprice() {
		return this.z5xxzpxravxxxxxxxxxxordprice;
	}

	public void setZ5xxzpxravxxxxxxxxxxordprice(
			BigDecimal z5xxzpxravxxxxxxxxxxordprice) {
		this.z5xxzpxravxxxxxxxxxxordprice = z5xxzpxravxxxxxxxxxxordprice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "iodatet", length = 29)
	public Date getZ6xxcxxxbxxxxxxxxxxxiodatet() {
		return this.z6xxcxxxbxxxxxxxxxxxiodatet;
	}

	public void setZ6xxcxxxbxxxxxxxxxxxiodatet(Date z6xxcxxxbxxxxxxxxxxxiodatet) {
		this.z6xxcxxxbxxxxxxxxxxxiodatet = z6xxcxxxbxxxxxxxxxxxiodatet;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "delvdateit", length = 29)
	public Date getZ7xxcxxxbvxxxxxxxxxxdelvdateit() {
		return this.z7xxcxxxbvxxxxxxxxxxdelvdateit;
	}

	public void setZ7xxcxxxbvxxxxxxxxxxdelvdateit(
			Date z7xxcxxxbvxxxxxxxxxxdelvdateit) {
		this.z7xxcxxxbvxxxxxxxxxxdelvdateit = z7xxcxxxbvxxxxxxxxxxdelvdateit;
	}

	@Column(name = "qtyostnd", precision = 14)
	public BigDecimal getZaxxzxxxavxxxxxxxxxxqtyostnd() {
		return this.zaxxzxxxavxxxxxxxxxxqtyostnd;
	}

	public void setZaxxzxxxavxxxxxxxxxxqtyostnd(
			BigDecimal zaxxzxxxavxxxxxxxxxxqtyostnd) {
		this.zaxxzxxxavxxxxxxxxxxqtyostnd = zaxxzxxxavxxxxxxxxxxqtyostnd;
	}

	@Column(name = "baseamount", precision = 14)
	public BigDecimal getZbxxzbxxavxxxxxxxxxxbaseamount() {
		return this.zbxxzbxxavxxxxxxxxxxbaseamount;
	}

	public void setZbxxzbxxavxxxxxxxxxxbaseamount(
			BigDecimal zbxxzbxxavxxxxxxxxxxbaseamount) {
		this.zbxxzbxxavxxxxxxxxxxbaseamount = zbxxzbxxavxxxxxxxxxxbaseamount;
	}

	@Column(name = "delivchrg", precision = 14)
	public BigDecimal getZbxxzlxxavxxxxxxxxxxdelivchrg() {
		return this.zbxxzlxxavxxxxxxxxxxdelivchrg;
	}

	public void setZbxxzlxxavxxxxxxxxxxdelivchrg(
			BigDecimal zbxxzlxxavxxxxxxxxxxdelivchrg) {
		this.zbxxzlxxavxxxxxxxxxxdelivchrg = zbxxzlxxavxxxxxxxxxxdelivchrg;
	}

	@Column(name = "miscchrg", precision = 14)
	public BigDecimal getZcxxzmxxavxxxxxxxxxxmiscchrg() {
		return this.zcxxzmxxavxxxxxxxxxxmiscchrg;
	}

	public void setZcxxzmxxavxxxxxxxxxxmiscchrg(
			BigDecimal zcxxzmxxavxxxxxxxxxxmiscchrg) {
		this.zcxxzmxxavxxxxxxxxxxmiscchrg = zcxxzmxxavxxxxxxxxxxmiscchrg;
	}

	@Column(name = "tax1amt", precision = 14)
	public BigDecimal getZdxxzxz1avxxxxxxxxxxtax1amt() {
		return this.zdxxzxz1avxxxxxxxxxxtax1amt;
	}

	public void setZdxxzxz1avxxxxxxxxxxtax1amt(
			BigDecimal zdxxzxz1avxxxxxxxxxxtax1amt) {
		this.zdxxzxz1avxxxxxxxxxxtax1amt = zdxxzxz1avxxxxxxxxxxtax1amt;
	}

	@Column(name = "tax2amt", precision = 14)
	public BigDecimal getZexxzxz2avxxxxxxxxxxtax2amt() {
		return this.zexxzxz2avxxxxxxxxxxtax2amt;
	}

	public void setZexxzxz2avxxxxxxxxxxtax2amt(
			BigDecimal zexxzxz2avxxxxxxxxxxtax2amt) {
		this.zexxzxz2avxxxxxxxxxxtax2amt = zexxzxz2avxxxxxxxxxxtax2amt;
	}

	@Column(name = "tax3amt", precision = 14)
	public BigDecimal getZfxxzxz3avxxxxxxxxxxtax3amt() {
		return this.zfxxzxz3avxxxxxxxxxxtax3amt;
	}

	public void setZfxxzxz3avxxxxxxxxxxtax3amt(
			BigDecimal zfxxzxz3avxxxxxxxxxxtax3amt) {
		this.zfxxzxz3avxxxxxxxxxxtax3amt = zfxxzxz3avxxxxxxxxxxtax3amt;
	}

	@Column(name = "linetotl", precision = 14)
	public BigDecimal getZgxxzlpxxvxxxxxxxxxxlinetotl() {
		return this.zgxxzlpxxvxxxxxxxxxxlinetotl;
	}

	public void setZgxxzlpxxvxxxxxxxxxxlinetotl(
			BigDecimal zgxxzlpxxvxxxxxxxxxxlinetotl) {
		this.zgxxzlpxxvxxxxxxxxxxlinetotl = zgxxzlpxxvxxxxxxxxxxlinetotl;
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

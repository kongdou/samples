package fun.deepsky.samples.canal;

import java.io.Serializable;

public class PrpCengage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3785755853169364460L;
	private String proposalno;
	private String riskcode;
	private String serialno;
	private String clausecode;
	private String clausename;
	private String engageflag;

	public String getProposalno() {
		return proposalno;
	}

	public void setProposalno(String proposalno) {
		this.proposalno = proposalno;
	}

	public String getRiskcode() {
		return riskcode;
	}

	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getClausecode() {
		return clausecode;
	}

	public void setClausecode(String clausecode) {
		this.clausecode = clausecode;
	}

	public String getClausename() {
		return clausename;
	}

	public void setClausename(String clausename) {
		this.clausename = clausename;
	}

	public String getEngageflag() {
		return engageflag;
	}

	public void setEngageflag(String engageflag) {
		this.engageflag = engageflag;
	}

	public String getMax_count() {
		return max_count;
	}

	public void setMax_count(String max_count) {
		this.max_count = max_count;
	}

	public String getClauses() {
		return clauses;
	}

	public void setClauses(String clauses) {
		this.clauses = clauses;
	}

	public String getEngagetype() {
		return engagetype;
	}

	public void setEngagetype(String engagetype) {
		this.engagetype = engagetype;
	}

	public String getInserttimeforhis() {
		return inserttimeforhis;
	}

	public void setInserttimeforhis(String inserttimeforhis) {
		this.inserttimeforhis = inserttimeforhis;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getOperatetimeforhis() {
		return operatetimeforhis;
	}

	public void setOperatetimeforhis(String operatetimeforhis) {
		this.operatetimeforhis = operatetimeforhis;
	}

	private String max_count;
	private String clauses;
	private String engagetype;
	private String inserttimeforhis;
	private String flag;
	private String operatetimeforhis;

}

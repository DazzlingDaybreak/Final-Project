package kh.spring.dto;

public class CertiImgDTO {
	private int seq;
	private int parentSeq;
	private String oriName;
	private String sysName;
	
	public CertiImgDTO() {}
	
	public CertiImgDTO(int seq, int parentSeq, String oriName, String sysName) {
		super();
		this.seq = seq;
		this.parentSeq = parentSeq;
		this.oriName = oriName;
		this.sysName = sysName;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getParentSeq() {
		return parentSeq;
	}
	public void setParentSeq(int parentSeq) {
		this.parentSeq = parentSeq;
	}
	public String getOriName() {
		return oriName;
	}
	public void setOriName(String oriName) {
		this.oriName = oriName;
	}
	public String getSysName() {
		return sysName;
	}
	public void setSysName(String sysName) {
		this.sysName = sysName;
	}
	
}

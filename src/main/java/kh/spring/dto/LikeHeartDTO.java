package kh.spring.dto;

public class LikeHeartDTO {

	private int seq;
	private int refChalSeq;
	private String refNickname;
	
	public LikeHeartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LikeHeartDTO(int seq, int refChalSeq, String refNickname) {
		super();
		this.seq = seq;
		this.refChalSeq = refChalSeq;
		this.refNickname = refNickname;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getRefChalSeq() {
		return refChalSeq;
	}

	public void setRefChalSeq(int refChalSeq) {
		this.refChalSeq = refChalSeq;
	}

	public String getRefNickname() {
		return refNickname;
	}

	public void setRefNickname(String refNickname) {
		this.refNickname = refNickname;
	}	
}

package kh.spring.dto;

public class LikeDTO {
	private int seq;
	private int refChalSeq;
	private String refNickname;
	
	public LikeDTO(int seq, int refChalSeq, String refNickname) {
		super();
		this.seq = seq;
		this.refChalSeq = refChalSeq;
		this.refNickname = refNickname;
	}

	public LikeDTO() {
		super();
		// TODO Auto-generated constructor stub
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

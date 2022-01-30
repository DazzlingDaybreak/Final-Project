package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.LikeDAO;
import kh.spring.dto.LikeDTO;

@Service
public class LikeService {

	@Autowired
	private LikeDAO ldao;
	
	public List<LikeDTO> likeCheck(String refNickname, int refChalSeq) {
		return ldao.likeCheck(refNickname, refChalSeq);
	}
	public int likeAdd(String refNickname, int refChalSeq) {
		return ldao.likeAdd(refNickname, refChalSeq);
	}
	public int likeDel(String refNickname, int refChalSeq) {
		return ldao.likeDel(refNickname, refChalSeq);
	}
}

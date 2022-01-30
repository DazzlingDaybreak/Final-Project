package kh.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.LikeDTO;
import kh.spring.dto.LikeHeartDTO;

@Repository
public class LikeDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<LikeDTO> likeCheck(String refNickname, int refChalSeq) {
		Map<String, String> map = new HashMap<>();
		map.put("refNickname", refNickname);
		map.put("refChalSeq", String.valueOf(refChalSeq));
		return mybatis.selectList("Likey.likeCheck",map);
	}

	public int likeAdd(String refNickname, int refChalSeq) {
		Map<String,String> map = new HashMap<>();
		map.put("refNickname",refNickname);
		map.put("refChalSeq", String.valueOf(refChalSeq));
		return mybatis.insert("Likey.likeAdd", map);
	}
	
	public int likeDel(String refNickname, int refChalSeq) {
		Map<String,String> map = new HashMap<>();
		map.put("refNickname",refNickname);
		map.put("refChalSeq", String.valueOf(refChalSeq));
		return mybatis.delete("Likey.likeDel", map);
	}

//	public LikeDTO likeAdd(LikeHeartDTO dto) {
//		LikeDTO ldto = new LikeDTO();
//		ldto.setRefChalSeq(dto.getRefChalSeq());
//		
//		mybatis.update("Likey.likeUp", ldto);
//		
//		int result = mybatis.insert("Likey.likeAdd", dto);
//		
//		if(result == 1) {
//			ldto = mybatis.selectOne("Likey.likeAdd", ldto);
//		}
//		return ldto;
//	}

//	public LikeDTO likeDel(LikeHeartDTO dto) {
//		LikeDTO ldto = new LikeDTO();
//		ldto.setRefChalSeq(dto.getRefChalSeq());
//		
//		mybatis.update("Likey.likeUp", ldto);
//		
//		int result = mybatis.delete("Likey.likeDel", dto);
//		
//		if(result==1) {
//			ldto = mybatis.selectOne("Likey.likeDel",ldto);
//		}
//		return ldto;
//	}
	
}

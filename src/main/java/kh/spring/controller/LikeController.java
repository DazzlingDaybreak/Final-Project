package kh.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.spring.dao.LikeDAO;
import kh.spring.dto.LikeDTO;
import kh.spring.dto.LikeHeartDTO;
import kh.spring.service.LikeService;

@RequestMapping("/like")
@Controller
public class LikeController {
	
	@Autowired
	private LikeDAO ldao;
	private LikeService lService;
	private HttpSession session;
	
	@ResponseBody
	@RequestMapping("/fill")
	public String likeCheck(@RequestParam("seq") int refChalSeq, String refNickname, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LikeHeartDTO dto = new LikeHeartDTO();
//		String id = request.getParameter("loginID");
//		String likeNum = request.getParameter("likeNum");	
//		System.out.println(id);
		dto.setSeq(refChalSeq);
		dto.setRefNickname((String)session.getAttribute("nick"));
		List<LikeDTO> likeCheck = ldao.likeCheck(refNickname, refChalSeq);
//		System.out.println("하트 체크 : "+dto);
		if(likeCheck==null) { 
			int likeAdd =  ldao.likeAdd(refNickname, refChalSeq);
			response.getWriter().append("add");
			return String.valueOf(likeAdd);
		} else {	
			int likeDel = ldao.likeDel(refNickname, refChalSeq);
			response.getWriter().append("del");
			return String.valueOf(likeDel);
		}
		
	}
}

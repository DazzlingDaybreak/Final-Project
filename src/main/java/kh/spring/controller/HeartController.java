package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kh.spring.dto.HeartDTO;
import kh.spring.dto.MemberDTO;
import kh.spring.service.HeartService;

@RequestMapping("/heart")
@Controller
public class HeartController {
	@Autowired
	private HeartService hService;
	
	@RequestMapping("/fill")
	public String detail(@RequestParam("seq") int seq, Model model, @RequestParam(value="page", required=false, defaultValue="1")int page,@RequestParam("refChalSeq") int refChalSeq) {
//		// 기존 detail 부분
//		MemberDTO dto = hService.detail(seq);
//		model.addAttribute("dto",dto);
//		model.addAttribute("page",page);
//		
		// 아래부터 좋아요 기능 시 추가되는 부분
		
		HeartDTO hdto = new HeartDTO();
		// 좋아요가 되있는지 찾기위해 게시글 번호와 회원번호를 보냄
		hdto = hService.findHeart(seq,refChalSeq);
		// 찾은 정보를 heart로 담아서 보냄
		model.addAttribute("hdto",hdto);
		return "member/detail";
	}
	
	@RequestMapping("/heart")
	public @ResponseBody int heart(@ModelAttribute HeartDTO hdto) {
		int result = hService.insertHeart(hdto);
		return result;
	}
	
}
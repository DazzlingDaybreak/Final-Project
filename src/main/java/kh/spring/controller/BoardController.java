package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/board/")
@Controller
public class BoardController {

	@RequestMapping("main")
	public String board() {
		return "board/boardMain";
	}
	@RequestMapping("writeForm")
	public String boardWrite() {
		return "board/boardWrite";
	}
}

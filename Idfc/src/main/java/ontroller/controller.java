package ontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import dao.Stddao;
import dto.Stddto;
@Controller
public class controller {
	@RequestMapping("/signup")
 public ModelAndView signup(){
	 ModelAndView view=new ModelAndView("insert.jsp");
	 Stddto dto=new Stddto();
	 view.addObject("idfc",dto);
	return view; 
 }
	@ResponseBody
	@RequestMapping("/insert")
	public void insert(Stddto dto){
		Stddao stddao=new Stddao();
		stddao.insert(dto);	
	}
	
	@RequestMapping("/fu")
	public ModelAndView fetch() {
		ModelAndView view =new ModelAndView("fetch.jsp");
		Stddto dto=new Stddto();
		view.addObject("RJ",dto);
		return view;
	}
	@ResponseBody
	@RequestMapping("/fetch")
	public ModelAndView fetch(int id) {
		Stddao dao=new Stddao();
		Stddto dto=dao.fetch(id);
		ModelAndView view=new ModelAndView("fetched.jsp");
		view.addObject("null",dto);
		return view;
		
}
}

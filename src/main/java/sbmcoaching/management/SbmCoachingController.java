package sbmcoaching.management;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/")
public class SbmCoachingController{
	@RequestMapping(method=RequestMethod.GET)
public String index(ModelMap model){
	model.addAttribute("message","Hello Spring Web MVC");
	return "mainpage";
}

}

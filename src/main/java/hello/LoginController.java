package hello;

/**
 * Created by anantoni on 2/12/2014.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String loginForm(Model model) {
        model.addAttribute("login", new User());
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("login", user);
        return "result";
    }

}

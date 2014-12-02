package hello;

/**
 * Created by anantoni on 2/12/2014.
 */
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class LoginController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String showLoginForm(Login login) {
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String checkPersonInfo(@Valid Login login,
                                  BindingResult bindingResult)
    {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "redirect:/results";
    }

}

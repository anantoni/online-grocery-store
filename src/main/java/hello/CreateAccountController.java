package hello;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import javax.validation.Valid;

/**
 * Created by anantoni on 2/12/2014.
 */

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class CreateAccountController extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/results").setViewName("results");
    }

    @RequestMapping(value="/create_account", method= RequestMethod.GET)
    public String showCreateAccountForm(User user) {
        return "create_account";
    }

    @RequestMapping(value="/create_account", method=RequestMethod.POST)
    public String checkPersonInfo(@Valid User user,
                                  BindingResult bindingResult)
    {
        if (bindingResult.hasErrors())
            return "create_account";

        return "redirect:/results";
    }

}

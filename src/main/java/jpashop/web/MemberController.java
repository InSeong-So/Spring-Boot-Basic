package jpashop.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jpashop.domain.Address;
import jpashop.domain.Member;
import jpashop.service.ItemService;
import jpashop.service.MemberService;

@Controller
public class MemberController
{
    
    @Autowired
    MemberService memberService;
    
    @Autowired
    ItemService itemService;
    
    @RequestMapping(value = "/members/new", method = RequestMethod.GET)
    public String createForm()
    {
        return "members/createMemberForm";
    }
    
    @RequestMapping(value = "/members/new", method = RequestMethod.POST)
    public String create(Member member, String city, String street, String zipcode)
    {
        
        Address address = new Address(city, street, zipcode);
        member.setAddress(address);
        memberService.join(member);
        return "redirect:/";
    }
    
    @RequestMapping(value = "/members", method = RequestMethod.GET)
    public String list(Model model)
    {
        
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
    
}

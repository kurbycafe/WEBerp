package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/personal")
@RequiredArgsConstructor
public class PersonalController {
  
    @GetMapping("/list")
    public String personal() {
        return "personal/list";
    }

    @GetMapping("/view")
    public String personalView() {
        return "personal/view";
    }

}

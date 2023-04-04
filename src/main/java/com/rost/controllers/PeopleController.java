package com.rost.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rost.service.PeopleService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/people")
public class PeopleController {
    private final PeopleService service;

    @GetMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("index", "people", service.index());
    }
}

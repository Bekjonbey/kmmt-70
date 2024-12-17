package org.example.kmmt70.telegramBot.controller;

import lombok.RequiredArgsConstructor;
import org.example.kmmt70.telegramBot.service.ProblemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/problem")
@RequiredArgsConstructor
public class ProblemController {
    private final ProblemService service;
}

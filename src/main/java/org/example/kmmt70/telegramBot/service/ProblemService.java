package org.example.kmmt70.telegramBot.service;

import lombok.RequiredArgsConstructor;
import org.example.kmmt70.telegramBot.repo.ProblemRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProblemService {
    private final ProblemRepo repo;
}

package org.example.kmmt70.telegramBot.sevice;

import org.example.kmmt70.telegramBot.component.TelegramUpdateHandle;
import org.example.kmmt70.telegramBot.repository.GroupRepository;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChat;
import org.telegram.telegrambots.meta.api.methods.groupadministration.GetChatMember;
import org.telegram.telegrambots.meta.api.objects.chatmember.ChatMember;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class BotService {

    private final TelegramUpdateHandle botConfig;

    public BotService(TelegramUpdateHandle botConfig) {
        this.botConfig = botConfig;
    }
}

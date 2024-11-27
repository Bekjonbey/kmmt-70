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

    public StringBuilder findGroupByUser(Long userId) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> groupList = new ArrayList<>();
        for (Map.Entry<Long, String> entry : getAllGroupIds().entrySet()) {
            try {
                ChatMember member = botConfig.execute(new GetChatMember(entry.getKey().toString(), userId));
                if (member != null) {
                    groupList.add(entry.getValue());
                }
            } catch (TelegramApiException e) {
                // Continue to the next group if user not found
            }
        }
        if (!groupList.isEmpty()) {
            for (String s : groupList) {
                result.append(s).append(", ");
            }
            return new StringBuilder("user found in these groups: " + result);
        }
        else
            return new StringBuilder("User not found in any groups.");
    }
}

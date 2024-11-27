package org.example.kmmt70.telegramBot.component;

import org.example.kmmt70.telegramBot.repository.GroupRepository;
import org.example.kmmt70.telegramBot.sevice.BotService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class TelegramUpdateHandle extends TelegramLongPollingBot {

    private final BotService botService;
    private final GroupRepository groupRepository;

    public TelegramUpdateHandle(@Lazy BotService botService, GroupRepository groupRepository) {
        this.botService = botService;
        this.groupRepository = groupRepository;
    }

    @Override
    public String getBotUsername() {
        return "musy_vadakanalBot";
    }

    @Override
    public String getBotToken() {
        return "8097379815:AAGZdOC5j4LquTw7LK6q2vKFIIHXOA6NZxQ";
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage()) {
            Message message = update.getMessage();
            Chat chat = message.getChat();
        }

        if (update.hasMyChatMember()) {
            ChatMemberUpdated myChatMemberUpdate = update.getMyChatMember();
            Long groupId = myChatMemberUpdate.getChat().getId();
            String groupName = myChatMemberUpdate.getChat().getUserName();
            String newStatus = myChatMemberUpdate.getNewChatMember().getStatus();

            Long addedByUserId = myChatMemberUpdate.getFrom().getId();
        }
    }

    public void sendMessage(String chatId, String text) {
        try {
            execute(new org.telegram.telegrambots.meta.api.methods.send.SendMessage(chatId, text));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}

package com.example.demo.telegram;

//import com.pengrad.telegrambot.TelegramBot;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import com.pengrad.telegrambot.model.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotLogic extends TelegramLongPollingBot {
    private final String token = "5341553227:AAG7XsVi0md0ynPf3j3O61exp6OpC99nR1A";

        @Override
        public String getBotUsername() {
            return "Table_show bot";
        }

        @Override
        public String getBotToken() {
            return token;
        }

    @Override
    public void onUpdateReceived(org.telegram.telegrambots.meta.api.objects.Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());
            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}

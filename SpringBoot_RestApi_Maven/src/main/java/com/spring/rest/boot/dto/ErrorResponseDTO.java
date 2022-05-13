package com.spring.rest.boot.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
public class ErrorResponseDTO {

    private List<String> messages = new ArrayList<>();
    private String message;
    private String localizedMessage;
    private String detailMessage;

    public ErrorResponseDTO(List<String> messages, String localizedMessage) {
        super();
        this.messages = messages;
        this.localizedMessage = localizedMessage;
    }

    public ErrorResponseDTO(String message, String localizedMessage) {
        super();
        this.message=message;
        this.localizedMessage =localizedMessage;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }


    public void setMessage(List<String> messages) {
        this.messages =messages;
    }
    public List<String> getMessages() {
        return messages;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage =detailMessage;
    }

    public void setLocalizedMessage(String localizedMessage) {
        this.localizedMessage =localizedMessage;
    }
}

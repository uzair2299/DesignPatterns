package org.example;

import java.util.List;

public class EmailMessage {
    private String sender;
    private String recipient;
    private String subject;
    private String body;
    private List<String> attachments;

    // Constructor (private to enforce the use of the builder)
    private EmailMessage() {
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    public static EmailMessageBuilder builder() {
        return new EmailMessageBuilder();
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    public static class EmailMessageBuilder {
        private EmailMessage emailMessage;

        public EmailMessageBuilder setSender(String sender) {
            emailMessage.sender = sender;
            return this;
        }

        public EmailMessageBuilder setRecipient(String recipient) {
            emailMessage.recipient = recipient;
            return this;
        }

        public EmailMessageBuilder setSubject(String subject) {
            emailMessage.subject = subject;
            return this;
        }

        public EmailMessageBuilder setBody(String body) {
            emailMessage.body = body;
            return this;
        }

        public EmailMessageBuilder setAttachments(List<String> attachments) {
            emailMessage.attachments = attachments;
            return this;
        }

        public EmailMessage build(){
            return emailMessage;
        }


        public EmailMessageBuilder() {
            emailMessage = new EmailMessage();
        }


    }

}

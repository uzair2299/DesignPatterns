package FieldsInTheBuilderClass;

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

    public EmailMessage(String sender, String recipient, String subject, String body, List<String> attachments) {

        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.attachments = attachments;
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
        private String sender;
        private String recipient;
        private String subject;
        private String body;
        private List<String> attachments;


        public EmailMessageBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public EmailMessageBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public EmailMessageBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailMessageBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public EmailMessageBuilder setAttachments(List<String> attachments) {
            this.attachments = attachments;
            return this;
        }

        public EmailMessage build() {
            return new EmailMessage(sender, recipient, subject, body, attachments);
        }
    }
}



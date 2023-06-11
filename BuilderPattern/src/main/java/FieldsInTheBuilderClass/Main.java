package FieldsInTheBuilderClass;

import FieldsInTheClassBeingBuilt.EmailMessage;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EmailMessage emailMessage = EmailMessage
                .builder()
                .setSender("sender")
                .setBody("body")
                .setRecipient("recipient")
                .build();
        System.out.println(emailMessage);
    }


}
package controller;

public class Style {
    public static  String stlye(String s){
        String style="0";
        switch (s) {
            case "0" -> {
                style="-fx-background-color: grey;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "2" -> {
                style="-fx-background-color: #EEE4DA;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "4" -> {
                style="-fx-background-color: #EDE0C8;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "8" -> {
                style="-fx-background-color:#F2B179;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "16" -> {
                style="-fx-background-color: #F59563;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "32" -> {
                style="-fx-background-color: #F67C5F;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "64" -> {
                style="-fx-background-color: #F65E3B;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "128" -> {
                style="-fx-background-color: #EDCF72;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "256" -> {
                style="-fx-background-color: #EDCC61;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "512" -> {
                style="-fx-background-color: #EDC850;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "1024" -> {
                style="-fx-background-color: #EDC53F;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "2048" -> {
                style="-fx-background-color: #EDC22E;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "4096" -> {
                style="-fx-background-color: #3C3A32;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "8192" -> {
                style="-fx-background-color: #3C3A32;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "16384" -> {
                style="-fx-background-color: #3C3A32;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "32768" -> {
                style="-fx-background-color: #3C3A32;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "65536" -> {
                style="-fx-background-color: #3C3A32;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }

        }
        return style;
    }
}

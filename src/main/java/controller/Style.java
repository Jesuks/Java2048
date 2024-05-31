package controller;

public class Style {
    public static  String stlye(String s){
        String style="0";
        switch (s) {
            case "0" -> {
                style="-fx-background-color:#FFF5EE;" +
                        "-fx-background-radius: 3;" +
                         "-fx-font-size: 0px";

            }
            case "2" -> {
                style="-fx-background-color: #F0FFF0 ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "4" -> {
                style="-fx-background-color: #F5FFFA;" +
                        "-fx-background-radius: 3;" ;
            }
            case "8" -> {
                style="-fx-background-color:#F0F8FF ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "16" -> {
                style="-fx-background-color: #E6E6FA ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "32" -> {
                style="-fx-background-color: #FFF0F5 ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "64" -> {
                style="-fx-background-color: #FFF0F5;" +
                        "-fx-background-radius: 3;" ;
            }
            case "128" -> {
                style="-fx-background-color: #FFE4E1 ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "256" -> {
                style="-fx-background-color:#AFEEEE ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "512" -> {
                style="-fx-background-color: #40E0D0 ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "1024" -> {
                style="-fx-background-color:#00CED1;" +
                        "-fx-background-radius: 3;" ;
            }
            case "2048" -> {
                style="-fx-background-color:#4682B4;" +
                        "-fx-background-radius: 3;" ;
            }
            case "4096" -> {
                style="-fx-background-color: #000080 ;" +
                        "-fx-background-radius: 3;" ;
            }
            case "8192" -> {
                style = "-fx-background-color: #000080;" +
                        "-fx-background-radius: 3;";
            }

        }
        return style;
    }
}

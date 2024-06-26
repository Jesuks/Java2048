package controller;

public class Style {
    public static String style(String s) {
        String style = "0";
        switch (s) {
            case "0" -> {
                style = "-fx-background-color: #CDC1B4;" + // 空白格子颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #776E65;";
            }
            case "2" -> {
                style = "-fx-background-color: #EEE4DA;" + // 数字2的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #776E65;";
            }
            case "4" -> {
                style = "-fx-background-color: #EDE0C8;" + // 数字4的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #776E65;";
            }
            case "8" -> {
                style = "-fx-background-color: #F2B179;" + // 数字8的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "16" -> {
                style = "-fx-background-color: #F59563;" + // 数字16的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "32" -> {
                style = "-fx-background-color: #F67C5F;" + // 数字32的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "64" -> {
                style = "-fx-background-color: #F65E3B;" + // 数字64的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "128" -> {
                style = "-fx-background-color: #EDCF72;" + // 数字128的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "256" -> {
                style = "-fx-background-color: #EDCC61;" + // 数字256的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "512" -> {
                style = "-fx-background-color: #EDC850;" + // 数字512的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "1024" -> {
                style = "-fx-background-color: #EDC53F;" + // 数字1024的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "2048" -> {
                style = "-fx-background-color: #EDC22E;" + // 数字2048的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "4096" -> {
                style = "-fx-background-color: #3C3A32;" + // 数字4096的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "8192" -> {
                style = "-fx-background-color: #3C3A32;" + // 数字8192的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "16384" -> {
                style = "-fx-background-color: #3C3A32;" + // 数字16384的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "32768" -> {
                style = "-fx-background-color: #3C3A32;" + // 数字32768的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
            case "65536" -> {
                style = "-fx-background-color: #3C3A32;" + // 数字65536的背景颜色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #F9F6F2;";
            }
        }
        return style;
    }
}

package controller;

public class Style3 {
    public static String style(String s) {
        String style = "0";
        switch (s) {
            case "0" -> {
                style = "-fx-background-color: white;" +
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #333333;"; // 深灰色
            }
            case "2" -> {
                style = "-fx-background-color: #2C3E50;" + // 深蓝灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #566573;"; // 浅深蓝灰色
            }
            case "4" -> {
                style = "-fx-background-color: #95A5A6;" + // 灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #B0BEC5;"; // 浅灰色
            }
            case "8" -> {
                style = "-fx-background-color: #ECF0F1;" + // 浅灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #BFC9CA;"; // 深灰色
            }
            case "16" -> {
                style = "-fx-background-color: #7F8C8D;" + // 中灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #95A5A6;"; // 浅中灰色
            }
            case "32" -> {
                style = "-fx-background-color: #BDC3C7;" + // 银灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #D5DBDB;"; // 浅银灰色
            }
            case "64" -> {
                style = "-fx-background-color: #D5D8DC;" + // 灰白色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #AAB7B8;"; // 深灰白色
            }
            case "128" -> {
                style = "-fx-background-color: #AAB7B8;" + // 浅蓝灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #BFC9CA;"; // 深浅蓝灰色
            }
            case "256" -> {
                style = "-fx-background-color: #566573;" + // 青灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #85929E;"; // 浅青灰色
            }
            case "512" -> {
                style = "-fx-background-color: #1C2833;" + // 深黑色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #34495E;"; // 浅深黑色
            }
            case "1024" -> {
                style = "-fx-background-color: #ABB2B9;" + // 灰白色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #D5DBDB;"; // 浅灰白色
            }
            case "2048" -> {
                style = "-fx-background-color: #85929E;" + // 石板灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #AAB7B8;"; // 浅石板灰色
            }
            case "4096" -> {
                style = "-fx-background-color: #D0D3D4;" + // 浅灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #E5E8E8;"; // 浅浅灰色
            }
            case "8192" -> {
                style = "-fx-background-color: #E5E8E8;" + // 白灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #BDC3C7;"; // 深白灰色
            }
            case "16384" -> {
                style = "-fx-background-color: #17202A;" + // 黑色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #2C3E50;"; // 浅黑色
            }
            case "32768" -> {
                style = "-fx-background-color: #283747;" + // 黑灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #566573;"; // 浅黑灰色
            }
            case "65536" -> {
                style = "-fx-background-color: #2E4053;" + // 深灰色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #566573;"; // 浅深灰色
            }
        }
        return style;
    }
}

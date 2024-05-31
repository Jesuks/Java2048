package controller;

public class Style2 {
    public static String style(String s) {
        String style = "0";
        switch (s) {
            case "0" -> {
                style = "-fx-background-color: white;" +
                        "-fx-text-fill: black;" + // 黑色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "2" -> {
                style = "-fx-background-color: #3498DB;" + // 天蓝色
                        "-fx-text-fill: #A9CCE3;" + // 浅蓝色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "4" -> {
                style = "-fx-background-color: #2ECC71;" + // 浅绿色
                        "-fx-text-fill: #ABEBC6;" + // 淡绿色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "8" -> {
                style = "-fx-background-color: #9B59B6;" + // 紫色
                        "-fx-text-fill: #E8DAEF;" + // 淡紫色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "16" -> {
                style = "-fx-background-color: #1ABC9C;" + // 绿松石色
                        "-fx-text-fill: #D1F2EB;" + // 浅绿松石色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "32" -> {
                style = "-fx-background-color: #2980B9;" + // 青蓝色
                        "-fx-text-fill: #AED6F1;" + // 浅青蓝色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "64" -> {
                style = "-fx-background-color: #16A085;" + // 碧绿色
                        "-fx-text-fill: #A3E4D7;" + // 浅碧绿色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "128" -> {
                style = "-fx-background-color: #8E44AD;" + // 紫水晶色
                        "-fx-text-fill: #D7BDE2;" + // 淡紫水晶色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "256" -> {
                style = "-fx-background-color: #27AE60;" + // 绿松石色
                        "-fx-text-fill: #A9DFBF;" + // 浅绿松石色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "512" -> {
                style = "-fx-background-color: #2C3E50;" + // 深蓝灰色
                        "-fx-text-fill: #85929E;" + // 浅灰蓝色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "1024" -> {
                style = "-fx-background-color: #34495E;" + // 湛蓝色
                        "-fx-text-fill: #AEB6BF;" + // 淡湛蓝色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "2048" -> {
                style = "-fx-background-color: #5DADE2;" + // 浅蓝色
                        "-fx-text-fill: #1B4F72;" + // 深蓝色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "4096" -> {
                style = "-fx-background-color: #48C9B0;" + // 薄荷色
                        "-fx-text-fill: #0E6251;" + // 深薄荷色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "8192" -> {
                style = "-fx-background-color: #AF7AC5;" + // 丁香色
                        "-fx-text-fill: #512E5F;" + // 深丁香色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "16384" -> {
                style = "-fx-background-color: #F39C12;" + // 金橘色
                        "-fx-text-fill: #784212;" + // 深金橘色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "32768" -> {
                style = "-fx-background-color: #D35400;" + // 深橙色
                        "-fx-text-fill: #A04000;" + // 深红橙色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
            case "65536" -> {
                style = "-fx-background-color: #E74C3C;" + // 番茄红色
                        "-fx-text-fill: #B03A2E;" + // 深番茄红色字体
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;";
            }
        }
        return style;
    }
}

// Background colors: #3498DB, #2ECC71

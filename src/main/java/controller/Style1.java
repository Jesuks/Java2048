package controller;

public class Style1 {
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
                style = "-fx-background-color: #FF5733;" + // 橙红色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FFB199;"; // 浅橙色
            }
            case "4" -> {
                style = "-fx-background-color: #FFC300;" + // 金黄色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #CC9A00;"; // 深金黄色
            }
            case "8" -> {
                style = "-fx-background-color: #DAF7A6;" + // 浅绿色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #A3C473;"; // 深绿色
            }
            case "16" -> {
                style = "-fx-background-color: #C70039;" + // 深红色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #E94F6D;"; // 浅红色
            }
            case "32" -> {
                style = "-fx-background-color: #FF6F61;" + // 珊瑚色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FFAAA0;"; // 浅珊瑚色
            }
            case "64" -> {
                style = "-fx-background-color: #FFD700;" + // 金色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #CCAA00;"; // 深金色
            }
            case "128" -> {
                style = "-fx-background-color: #F0E68C;" + // 卡其色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #BDB76B;"; // 深卡其色
            }
            case "256" -> {
                style = "-fx-background-color: #E9967A;" + // 鲑鱼色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #D66551;"; // 深鲑鱼色
            }
            case "512" -> {
                style = "-fx-background-color: #FFA07A;" + // 浅鲑鱼色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #CD7051;"; // 深浅鲑鱼色
            }
            case "1024" -> {
                style = "-fx-background-color: #FFDAB9;" + // 桃色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #E6AC8F;"; // 深桃色
            }
            case "2048" -> {
                style = "-fx-background-color: #FFB6C1;" + // 淡粉色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FF889A;"; // 深淡粉色
            }
            case "4096" -> {
                style = "-fx-background-color: #FF69B4;" + // 热粉色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FF8CCB;"; // 浅热粉色
            }
            case "8192" -> {
                style = "-fx-background-color: #FF6347;" + // 番茄色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FF8269;"; // 浅番茄色
            }
            case "16384" -> {
                style = "-fx-background-color: #FF4500;" + // 橙红色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FF7433;"; // 浅橙红色
            }
            case "32768" -> {
                style = "-fx-background-color: #FF1493;" + // 深粉红色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FF6ABF;"; // 浅深粉红色
            }
            case "65536" -> {
                style = "-fx-background-color: #FFA500;" + // 橙色
                        "-fx-background-radius: 10;" +
                        "-fx-padding: 10;" +
                        "-fx-text-fill: #FFBB33;"; // 浅橙色
            }
        }
        return style;
    }
}

module holyg.project2048 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens controller to javafx.fxml;
    exports controller;

    exports Test;
}
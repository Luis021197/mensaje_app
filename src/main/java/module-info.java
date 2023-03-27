module com.example.mensaje_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.mensaje_app to javafx.fxml;
    exports com.example.mensaje_app;
}
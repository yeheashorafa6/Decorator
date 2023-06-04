module com.example.thedecoratorpattern {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.thedecoratorpattern to javafx.fxml;
    exports com.example.thedecoratorpattern;
}
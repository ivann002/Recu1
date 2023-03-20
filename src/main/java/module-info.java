module com.example.recu1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recu1 to javafx.fxml;
    exports com.example.recu1;
}
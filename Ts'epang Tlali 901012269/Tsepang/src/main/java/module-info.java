module com.example.tsepang {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.tsepang to javafx.fxml;
    exports com.example.tsepang;
}
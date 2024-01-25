module com.example.comboboxtest {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.comboboxtest to javafx.fxml;
    exports com.example.comboboxtest;
}
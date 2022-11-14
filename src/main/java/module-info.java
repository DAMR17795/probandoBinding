module com.example.probandobinding {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.probandobinding to javafx.fxml;
    exports com.example.probandobinding;
}
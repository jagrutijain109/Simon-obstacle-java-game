module com.example.demo11 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires net.synedra.validatorfx;
                    
    opens com.example.demo11 to javafx.fxml;
    exports com.example.demo11;
}
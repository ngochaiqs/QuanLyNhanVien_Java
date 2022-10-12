module com.edu.java.assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.edu.java.assignment to javafx.fxml;
    exports com.edu.java.assignment;
}
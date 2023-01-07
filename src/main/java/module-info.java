module com.kensoftph.contextmenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.contextmenu to javafx.fxml;
    exports com.kensoftph.contextmenu;
}
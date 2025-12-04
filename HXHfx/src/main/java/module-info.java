module com.example.hxhfx {
    requires javafx.controls;
    requires javafx.fxml;
//    requires com.example.hxhfx;
    requires javafx.graphics;
    //requires com.example.hxhfx;

    opens com.example.hxhfx to javafx.fxml;
    opens com.example.hxhfx.controller to javafx.fxml;

    exports com.example.hxhfx;
    exports com.example.hxhfx.controller;
    exports com.example.hxhfx.helper;
    opens com.example.hxhfx.helper to javafx.fxml;
}

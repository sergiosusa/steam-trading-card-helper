module com.sergiosusa.steamtradingcardshelper {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.sergiosusa.steamtradingcardshelper to javafx.fxml;
    exports com.sergiosusa.steamtradingcardshelper;
}
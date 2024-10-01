module appli.todolistjx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens appli.todolistjx to javafx.fxml;
    exports accueil;
    opens accueil to javafx.fxml;
    exports controller;
    opens controller to javafx.fxml;
}
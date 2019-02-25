module MusicUI {

    requires javafx.fxml;
    requires javafx.controls;

    opens sample;
    //it's still "opens sample" even though we refactored the sample
    //file to be main.fxml
}


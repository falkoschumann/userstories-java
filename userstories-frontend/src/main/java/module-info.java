module de.muspellheim.userstories.frontend {
  requires static lombok;
  requires de.muspellheim.userstories.contract;
  requires javafx.controls;
  requires javafx.fxml;

  exports de.muspellheim.userstories.frontend;

  opens de.muspellheim.userstories.frontend;
}

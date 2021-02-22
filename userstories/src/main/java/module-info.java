module de.muspellheim.userstories {
  requires static lombok;
  requires de.muspellheim.userstories.backend;
  requires de.muspellheim.userstories.contract;
  requires de.muspellheim.userstories.frontend;
  requires javafx.graphics;

  exports de.muspellheim.userstories;
}

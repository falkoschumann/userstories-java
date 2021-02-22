module de.muspellheim.userstories.backend {
  requires static java.naming;
  requires static lombok;
  requires de.muspellheim.userstories.contract;
  requires com.google.gson;

  exports de.muspellheim.userstories.backend;
  exports de.muspellheim.userstories.backend.adapters;
  exports de.muspellheim.userstories.backend.messagehandlers;
}

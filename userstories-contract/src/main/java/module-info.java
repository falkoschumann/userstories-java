module de.muspellheim.userstories.contract {
  requires static lombok;

  exports de.muspellheim.userstories.contract;
  exports de.muspellheim.userstories.contract.data;
  exports de.muspellheim.userstories.contract.messages.commands;
  exports de.muspellheim.userstories.contract.messages.queries;
}

/*
 * User Stories - Contract
 * Copyright (c) 2021 Falko Schumann <falko.schumann@muspellheim.de>
 */

package de.muspellheim.userstories.contract.messages.commands;

import lombok.NonNull;
import lombok.Value;

@Value
public class Failure implements CommandStatus {
  @NonNull String errorMessage;
}

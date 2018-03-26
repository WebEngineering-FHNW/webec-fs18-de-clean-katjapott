// Validating an input field that accepts numerical values between 1.0 and 6.0

function validate(inputField) {
  // todo: if inputField.value < 1.0 -> ' value needs to be at least 1.0'
  // todo: if inputField.value > 6.0 -> ' value needs to be at most 6.0'

  // todo: all fine: set class to empty
}

function handledError(check, inputField, msg) {
  if (check) {
      // todo: set error class
      // todo: alert

      inputField.focus();
  }
  return check;
}

%{--
  This needs as input attribute:
  calculatorInstance
--}%


<%@ page import="static mvc.FieldUtil.*" %>

<div>
  <label for="en">En</label>
  <input type="number decimal" name="en" value="${calculatorInstance.getProperty("en")}"
         required="true" min="1.0" max="6.0" id="en"
         class="${hasError(calculatorInstance, "en") ? 'error' : ''}"
         title="${g.message(error: findError(calculatorInstance, "en")) }"
  />
</div>
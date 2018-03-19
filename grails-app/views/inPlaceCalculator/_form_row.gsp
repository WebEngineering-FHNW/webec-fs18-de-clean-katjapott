%{--Params:
  calculatorInstance: the command object
  name: name, id
  label: for display
--}%


<%@ page import="static mvc.FieldUtil.*" %>

<div>
  <label for="${name}">En</label>
  <input type="number decimal" name="${name}" value="${calculatorInstance[${name}]}"
         required="true" min="1.0" max="6.0" id="${name}"
         class="${hasError(calculatorInstance, "${name}") ? 'error' : ''}"
         title="${g.message(error: findError(calculatorInstance, "${name}")) }"
  />
</div>
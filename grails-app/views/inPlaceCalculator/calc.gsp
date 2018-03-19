<html>
<head>
  <meta name="layout" content="main"/>
  <title>
    In-Place Calculator
  </title>
</head>

<body>


<%@ page import="static mvc.FieldUtil.*" %>

<form action="/inPlaceCalculator/calc" method="get">
  <fieldset class="form padded">

    <div>
      <label for="en">En</label>
      <input type="number decimal" name="en" value="${calculatorInstance.en}"
             required="true" min="1.0" max="6.0" id="en"
             class="${hasError(calculatorInstance, "en") ? 'error' : ''}"
             title="${g.message(error: findError(calculatorInstance, "en")) }"
      />
    </div>


    <div>
      <label for="exam">Exam</label>
      <input type="number decimal" name="exam" value="${calculatorInstance.exam}"
             required="true" min="1.0" max="6.0" id="exam"
             class="${hasError(calculatorInstance, "exam") ? 'error' : ''}"
             title="${g.message(error: findError(calculatorInstance, "exam")) }"
      />
    </div>


    <div>
      <label>&nbsp;</label>
      <input type="submit" value="Calculate"/>
    </div>
  </fieldset>
</form>


<div class="padded">
    <label>Result</label>
    <output>${calculatorInstance.result}</output>
</div>


</body>
</html>


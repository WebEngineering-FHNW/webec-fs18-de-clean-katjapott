<html>
<head>
  <meta name="layout" content="form"/>
  <title>
    In-Place Calculator
  </title>
</head>

<body>


<%@ page import="static mvc.FieldUtil.*" %>


<form action="/inPlaceCalculator/calc" method="get">
  <fieldset class="form padded">

    <tmpl:form_row calculatorInstance="${calculatorInstance}" name="en" label="En"/>


    <tmpl:form_row calculatorInstance="${calculatorInstance}" name="exam" label="Exam" />


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


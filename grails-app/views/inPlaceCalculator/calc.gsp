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


    <tmpl:form_row name="en"   label="En"   calculatorInstance="${calculatorInstance}"/>

    <tmpl:form_row name="exam" label="Exam" calculatorInstance="${calculatorInstance}"/>

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


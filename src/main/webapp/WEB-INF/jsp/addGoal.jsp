<%@ include file="/WEB-INF/jsp/shared/header.jsp" %>
    <div class="container">
      <div>
        <h1>
          Add Goal
        </h1>
        <p>
          Add your workout goal in minutes for the day.
          <br>
          &nbsp;
        </p>
      </div>
      
      <form:form commandName="goal">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<label for="textinput1">
	          Enter Minutes:
	        </label>	
			<form:input path="minutes" cssErrorClass="error" cssClass="form-control" />
			<form:errors path="minutes" cssClass="error" />
			<br/>
			<input type="submit" class="btn" value="Enter Goal Minutes"/>
	  </form:form>
     
      <div class="control-group">
      </div>
    </div>
    <%@ include file="/WEB-INF/jsp/shared/foot.jsp" %>
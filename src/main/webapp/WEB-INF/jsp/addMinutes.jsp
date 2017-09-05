<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<div>
		<h1>
			<spring:message code="minutes.exercised" />
		</h1>
	</div>
	<a class="btn btn-default" href="?language=en"> English </a> <a
		class="btn btn-default" href="?language=es"> Spanish </a> <br /> <br />

	<form:form commandName="exercise">
		<form:errors path="*" cssClass="errorblock" element="div" />
			<div class="form-group">
				<label for="textinput1"> <spring:message code="minutes.text" /></label>
				<form:input path="minutes" cssClass="form-control" />
				<form:errors path="minutes" cssClass="error" />
			</div>
			<div class="form-group">
				<label for="selectinput1"> <spring:message code="minutes.activity" /> </label>
				<form:select id="activities" path="activity" cssClass="form-control" />
			</div>
		<div class="row">
		<input type="submit" class="btn btn-primary"
			value="<spring:message code="minutes.button.enter"/>" />
</div>
	</form:form>

	<span class="label"> <spring:message code="minutes.goal" />
		${goal.minutes}
	</span>
</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
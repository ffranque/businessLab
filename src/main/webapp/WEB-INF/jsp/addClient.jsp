<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="modal-content">
	<form:form modelAttribute="client" action="addClient.html">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title" id="gridSystemModalLabel">Add Client</h4>
		</div>

		<div class="modal-body">

			<div class="form-group">
				<label for="textinput1">Name</label>
				<form:input path="name" cssClass="form-control" />
				<form:errors path="name" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput2">Sector</label>
				<form:input path="sector" cssClass="form-control" />
				<form:errors path="sector" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput3">Number of employee</label>
				<form:input path="numberOfEmployee" cssClass="form-control" />
				<form:errors path="numberOfEmployee" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput4">Contact Name</label>
				<form:input path="contactName" cssClass="form-control" />
				<form:errors path="contactName" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput5">Contact email</label>
				<form:input path="emailAddres" cssClass="form-control" />
				<form:errors path="emailAddres" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput6">Contact phone</label>
				<form:input path="phoneNumber" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label for="textinput7">Address</label>
				<form:input path="address" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label for="textinput8">City</label>
				<form:input path="city" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label for="textinput9">country</label>
				<form:input path="country" cssClass="form-control" />
			</div>

		</div>

		<div class="modal-footer">
			<input type="submit" class="btn btn-primary" value="Save"/>
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		</div>
	</form:form>
</div>
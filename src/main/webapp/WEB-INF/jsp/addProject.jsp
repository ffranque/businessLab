<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="modal-content">
	<form:form modelAttribute="project" action="addProject.html">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title" id="gridSystemModalLabel">Add Project</h4>
		</div>

		<div class="modal-body">

			<div class="form-group">
				<label for="textinput1">Name</label>
				<form:input path="name" cssClass="form-control" />
				<form:errors path="name" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput2">Client</label>
				<form:select path="clientName" cssClass="form-control">
					<form:option value="NONE" label="--Please Select One--" />
					<form:options items="${clientNames}" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="textinput3">Project Manager</label>
				<form:input path="projectManager" cssClass="form-control" />
				<form:errors path="projectManager" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput4">Status</label>
				<form:select path="status" cssClass="form-control">
					<form:option value="Won" label="Won" />
					<form:option value="Started" label="Started" />
					<form:option value="Ended" label="Ended" />
					<form:option value="Cancelled" label="Cancelled" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="textinput5">Type</label>
				<form:select path="type" cssClass="form-control">
					<form:option value="Time and Material" label="Time and Material" />
					<form:option value="Fixed Price" label="Fixed Price" />
				</form:select>
			</div>
			<div class="form-group">
				<label for="textinput6">Sector</label>
				<form:input path="sector" cssClass="form-control" />
				<form:errors path="sector" cssClass="label label-danger" />
			</div>
			<div class="form-group">
				<label for="textinput7">Beginning Date</label>
				<form:input path="beginningDate" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label for="textinput8">End Date</label>
				<form:input path="endDate" cssClass="form-control" />
			</div>
			<div class="form-group">
				<label for="textinput9">Forcasted End Date</label>
				<form:input path="forcastedEndDate" cssClass="form-control" />
			</div>
		</div>

		<div class="modal-footer">
			<input type="submit" class="btn btn-primary" value="Save"/>
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
		</div>
	</form:form>
</div>
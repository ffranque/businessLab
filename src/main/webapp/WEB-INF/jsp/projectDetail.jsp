<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<h3>${project.name}</h3>

	<div class="row margin-top-15">
		<div class="col-md-6">
			<div class="col-md-4">Current Status</div>
			<div class="col-md-5">######</div>
		</div>
	</div>
	<div class="row margin-top-15">
		<div class="col-md-10">
			<div class="panel panel-info">
				<div class="panel-heading">General Information</div>
				<div class="panel-body">
					<div class="row margin-top-10">
						<div class="col-md-6">
							<div class="col-md-3">Type</div>
							<div class="col-md-9">${project.type}</div>
						</div>
						<div class="col-md-6">
							<div class="col-md-3">Manager</div>
							<div class="col-md-9">${project.projectManager}</div>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-6">
							<div class="col-md-3">Client</div>
							<div class="col-md-9">${project.clientName}</div>
						</div>
						<div class="col-md-6">
							<div class="col-md-3">Sector</div>
							<div class="col-md-9">${project.sector}</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row margin-top-15">
		<div class="col-md-5">
			<div class="panel panel-info">
				<div class="panel-heading">Dates Information</div>
				<div class="panel-body">
					<div class="row margin-top-10">
						<div class="col-md-4">Beginning Date</div>
						<div class="col-md-8">${project.beginningDate}</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-4">End Date</div>
						<div class="col-md-8">${project.endDate }</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-4">Forecasted End Date</div>
						<div class="col-md-8">${project.forcastedEndDate}</div>
					</div>
				</div>
			</div>
		</div>

		<div class="col-md-4 col-md-offset-1">
			<div class="panel panel-info">
				<div class="panel-heading">
					Consultants Information <a href="#" data-toggle="modal"
						data-target=".consultant-modal-lg"><span
						class="glyphicon glyphicon-plus glyphicon-user" aria-hidden="true">
							<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
					</span></a>
				</div>
				<div class="panel-body">
					<div class="row margin-top-10">
						<div class="col-md-6">${project.consultant.name}</div>
						<div class="col-md-6">
							<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade consultant-modal-lg" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<div class="modal-content">
				<form:form modelAttribute="consultant" action="addConsultant.html">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="gridSystemModalLabel">Consultant</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label for="textinput1">Name</label>
						<form:input path="name" cssClass="form-control" />
						<input type="hidden" name="projectId" value="${project.id}"/>
					</div>
				</div>
				<div class="modal-footer">
					<input type="submit" class="btn btn-primary" value="Save" />
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
				</form:form>
			</div>
		</div>
	</div>
</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
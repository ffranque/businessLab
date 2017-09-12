<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<h3>
		<a href="#" id="nameP" class="editable editable-click"
			data-type="text" data-pk="${project.id}"
			data-url="/BusinessLab01/project/updateName.html">${project.name}</a>
	</h3>

	<div class="row margin-top-15">
		<div class="col-md-6">
			<div class="col-md-4">Current Status</div>
			<div class="col-md-5">######</div>
		</div>
		<div class="col-md-4 col-md-offset-2">
			<a
				href="/BusinessLab01/cancelProject.html?id=${project.id}"
				class="btn btn-danger cancelProject" data-type="post"> <span
				class="glyphicon glyphicon-remove" aria-hidden="true"></span> Delete
				Project
			</a>
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
							<div class="col-md-9">
								<a href="#" id="type" class="editable editable-click"
									data-type="text" data-pk="${project.id}"
									data-url="/BusinessLab01/project/updateType.html">${project.type}</a>
							</div>
						</div>
						<div class="col-md-6">
							<div class="col-md-3">Manager</div>
							<div class="col-md-9">
								<a href="#" id="projectManager" class="editable editable-click"
									data-type="text" data-pk="${project.id}"
									data-url="/BusinessLab01/project/updateManager.html">${project.projectManager}</a>
							</div>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-6">
							<div class="col-md-3">Client</div>
							<div class="col-md-9">
								<a href="#" id="clientName" class="editable editable-click"
									data-type="text" data-pk="${project.id}"
									data-url="/BusinessLab01/project/updateClientName.html">${project.clientName}</a>
							</div>
						</div>
						<div class="col-md-6">
							<div class="col-md-3">Sector</div>
							<div class="col-md-9">
								<a href="#" id="sectorP" class="editable editable-click"
									data-type="text" data-pk="${project.id}"
									data-url="/BusinessLab01/project/updateSector.html">${project.sector}</a>
							</div>
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
						<div class="col-md-8">
							<a href="#" id="beginningDate" class="editable editable-click"
								data-type="text" data-pk="${project.id}"
								data-url="/BusinessLab01/project/updateBeginningDate.html">${project.beginningDate}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-4">End Date</div>
						<div class="col-md-8">
							<a href="#" id="endDate" class="editable editable-click"
								data-type="text" data-pk="${project.id}"
								data-url="/BusinessLab01/project/updateEndDate.html">${project.endDate}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-4">Forecasted End Date</div>
						<div class="col-md-8">
							<a href="#" id="forcastedEndDate" class="editable editable-click"
								data-type="text" data-pk="${project.id}"
								data-url="/BusinessLab01/project/updateForcastedEndDate.html">${project.forcastedEndDate}</a>
						</div>
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
						<c:if test="${project.consultant.isCanceled == false}">
							<div class="col-md-6">${project.consultant.name}</div>
							<div class="col-md-6">
								<a
									href="/BusinessLab01/cancelConsultant.html?id=${project.consultant.id}&pid=${project.id}"
									class="cancelConsultant" data-type="post"> <span
									class="glyphicon glyphicon-trash" aria-hidden="true"></span>
								</a>
							</div>
						</c:if>
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
							<input type="hidden" name="projectId" value="${project.id}" />
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
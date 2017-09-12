<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<h1>Project List</h1>

	<div>
		<div class="row">
			<div class="col-md-2">
				<button type="button" class="btn btn-success" data-toggle="modal"
					data-target=".project-modal-lg">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Add
					Project
				</button>
			</div>
			<div class="col-md-8">
				<input type="text" class="form-control" placeholder="Seach">
			</div>
		</div>
		<div class="row"></div>
	</div>

	<div class="modal fade project-modal-lg" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<%@ include file="/WEB-INF/jsp/addProject.jsp"%>
		</div>
	</div>

	<table class="table">
		<thead>
			<tr>
				<th>Actions</th>
				<th>ID</th>
				<th>Name</th>
				<th>Client</th>
				<th>Project Manager</th>
				<th>FED</th>
				<th>Status</th>
				<th>Type</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach items="${projectList}" var="project">
				<c:if test="${project.isCanceled == false}">
					<tr>
						<td><a href="projectDetail.html?id=${project.id}"
							class="btn btn-md"><span class="glyphicon glyphicon-eye-open"
								aria-hidden="true"></span></a></td>
						<td>#${project.id}</td>
						<td>${project.name}</td>
						<td>${project.clientName}</td>
						<td>${project.projectManager}</td>
						<td>${project.forcastedEndDate}</td>
						<td>#</td>
						<td>${project.type}</td>
					</tr>
				</c:if>
			</c:forEach>

		</tbody>
	</table>
</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
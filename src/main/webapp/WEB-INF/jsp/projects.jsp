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
				<div class="typeahead__container">
					<div class="typeahead__field">

						<span class="typeahead__query"> <input
							class="form-control js-typeahead-project" type="search" placeholder="Search" autocomplete="off">
						</span> <span class="typeahead__button">
							<button type="submit">
								<i class="typeahead__search-icon"></i>
							</button>
						</span>

					</div>
				</div>
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
				<tr>
					<td><a href="projectDetail.html?id=${project.id}"
						class="btn btn-md"><span class="glyphicon glyphicon-eye-open"
							aria-hidden="true"></span></a></td>
					<td>#${project.id}</td>
					<td>${project.name}</td>
					<td>${project.clientName}</td>
					<td>${project.projectManager}</td>
					<td><fmt:formatDate pattern="dd-MM-yyyy" value="${project.forcastedEndDate}" /></td>
					<td>#</td>
					<td>${project.type}</td>
				</tr>
			</c:forEach>
			
		</tbody>
	</table>
</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
<script src="assets/js/projectSearchBar.js"></script>
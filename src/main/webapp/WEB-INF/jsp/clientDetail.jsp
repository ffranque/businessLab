<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<h3>
		<a href="#" id="nameD" class="editable editable-click"
			data-type="text" data-pk="${client.id}"
			data-url="/BusinessLab01/client/updateName.html">${client.name}</a>
	</h3>

	<div class="row margin-top-15">
		<div class="col-md-2">
			<div class="col-md-4">Status</div>
			<div class="col-md-8">######</div>
		</div>
		<div class="col-md-2">
			<div class="col-md-4">Sector</div>
			<div class="col-md-8">
				<a href="#" id="sectorD" class="editable editable-click"
					data-type="text" data-pk="${client.id}"
					data-url="/BusinessLab01/client/updateSector.html"
					data-title="Enter Sector">${client.sector}</a>
			</div>
		</div>
		<div class="col-md-6 col-md-offset-1">
			<div class="col-md-5">Number of employee</div>
			<div class="col-md-7">
				<a href="#" id="nEmployeeD" class="editable editable-click"
					data-type="text" data-pk="${client.id}"
					data-url="/BusinessLab01/client/updateEmployeeNumber.html">${client.numberOfEmployee}</a>
			</div>
		</div>
	</div>

	<div class="row margin-top-15">
		<div class="col-md-4">
			<div class="panel panel-info">
				<div class="panel-heading">Contact Information</div>
				<div class="panel-body">
					<div class="row margin-top-10">
						<div class="col-md-3">Name</div>
						<div class="col-md-9">
							<a href="#" id="cNameD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updateContactName.html"
								data-title="Enter Name">${client.contactName}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-3">E-mail</div>
						<div class="col-md-9">
							<a href="#" id="emailD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updateEmail.html">${client.emailAddres}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-3">Phone</div>
						<div class="col-md-9">
							<a href="#" id="phoneD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updatePhone.html">${client.phoneNumber}</a>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="col-md-4 col-md-offset-1">
			<div class="panel panel-info">
				<div class="panel-heading">Company Information</div>
				<div class="panel-body">
					<div class="row margin-top-10">
						<div class="col-md-3">Address</div>
						<div class="col-md-9">
							<a href="#" id="addressD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updateAddress.html">${client.address}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-3">City</div>
						<div class="col-md-9">
							<a href="#" id="cityD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updateCity.html">${client.city}</a>
						</div>
					</div>
					<div class="row margin-top-10">
						<div class="col-md-3">Country</div>
						<div class="col-md-9">
							<a href="#" id="countryD" class="editable editable-click"
								data-type="text" data-pk="${client.id}"
								data-url="/BusinessLab01/client/updateCountry.html">${client.country}</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<h3>Projects</h3>
	<div class="row margin-top-15">
		<div class="col-md-10">
			<table class="table">
				<thead>
					<tr>
						<th>Actions</th>
						<th>ID</th>
						<th>Name</th>
						<th>Project Manager</th>
						<th>FED</th>
						<th>Status</th>
						<th>Type</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${client.projects}" var="project">
						<tr>
							<td><a href="projectDetail.html?id=${project.id}"
								class="btn btn-md"><span
									class="glyphicon glyphicon-eye-open" aria-hidden="true"></span></a></td>
							<td>#${project.id}</td>
							<td>${project.name}</td>
							<td>${project.projectManager}</td>
							<td>${project.forcastedEndDate}</td>
							<td>${project.status}</td>
							<td>${project.type}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>



</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
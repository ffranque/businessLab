
<%@ include file="/WEB-INF/jsp/shared/header.jsp"%>
<div class="container">
	<h1>Client List</h1>

	<div>
		<div class="row">
			<div class="col-md-2">
				<button type="button" class="btn btn-success" data-toggle="modal"
					data-target=".client-modal-lg">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Add
					Client
				</button>
			</div>
			<div class="col-md-8">
				<input type="text" class="form-control" placeholder="Seach">
			</div>
		</div>
		<div class="row"></div>
	</div>

	<div class="modal fade client-modal-lg" role="dialog"
		aria-labelledby="myLargeModalLabel">
		<div class="modal-dialog modal-lg" role="document">
			<%@ include file="/WEB-INF/jsp/addClient.jsp"%>
		</div>
	</div>


	<table class="table">
		<thead>
			<tr>
				<th>Action</th>
				<th>Name</th>
				<th>Sector</th>
				<th>Contact Name</th>
				<th>Contact E-mail</th>
				<th>Contact Phone</th>
				<th>Number of Project</th>
			</tr>
		</thead>
		<tbody id="clientx">
			<c:forEach items="${clientList}" var="client">
				<tr>
					<td><a href="clientDetail.html?id=${client.id}"
						class="btn btn-md"><span class="glyphicon glyphicon-eye-open"
							aria-hidden="true"></span></a></td>
					<td>${client.name}</td>
					<td>${client.sector}</td>
					<td>${client.contactName}</td>
					<td>${client.emailAddres}</td>
					<td>${client.phoneNumber}</td>
					<td style="text-align:center">${client.projects.size()}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>

</div>
<%@ include file="/WEB-INF/jsp/shared/foot.jsp"%>
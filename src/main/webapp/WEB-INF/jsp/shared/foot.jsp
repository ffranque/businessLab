
<script src="assets/js/jquery-3.2.1.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/bootstrap-editable.js"></script>
<script src="assets/js/bootstrap-confirm-delete.js"></script>
</body>
</html>
<script type="text/javascript">
$.fn.editable.defaults.mode = 'inline';
	$(document).ready(function() {
		//console.log("Here...");
	    $('#clientx a.editable').editable();
	    $('#sectorD').editable();
	    $('#nEmployeeD').editable();
	    $('#cNameD').editable();
	    $('#nameD').editable();
	    $('#emailD').editable();
	    $('#phoneD').editable();
	    $('#addressD').editable();
	    $('#cityD').editable();
	    $('#countryD').editable();
	    
	    $('#sectorP').editable();
	    $('#forcastedEndDate').editable();
	    $('#endDate').editable();
	    $('#beginningDate').editable();
	    $('#clientName').editable();
	    $('#projectManager').editable();
	    $('#type').editable();
	    $('#nameP').editable();
	    
	    $('.cancelConsultant').bootstrap_confirm_delete(
	            {
	                debug:              false,
	                heading:            'Delete',
	                message:            'Are you sure you want to delete?',
	                btn_ok_label:       'Yes',
	                btn_cancel_label:   'Cancel'
	            }
	        );
		
// 			$.getJSON('<spring:url value="activities.json"/>', {
// 				ajax : 'true'
// 			}, function(data){
// 				var html = '<option value="">--Please select one--</option>';
// 				var len = data.length;
// 				for (var i = 0; i < len; i++) {
// 					html += '<option value="' + data[i].desc + '">'
// 							+ data[i].desc + '</option>';
// 				}
// 				html += '</option>';
				
// 				$('#activities').html(html);
// 			});
			
		});
</script>

<script src="assets/js/jquery-3.2.1.js"></script>
<script src="assets/js/bootstrap.js"></script>
<script src="assets/js/bootstrap-editable.js"></script>
<script src="assets/js/jquery.typeahead.js"></script>
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

	});
	//		$.getJSON('<spring:url value="activities.json"/>', {
	//		ajax : 'true'
	//	}, function(data){
	//		var html = '<option value="">--Please select one--</option>';
	//		var len = data.length;
	//		for (var i = 0; i < len; i++) {
	//			html += '<option value="' + data[i].desc + '">'
	//					+ data[i].desc + '</option>';
	//		}
	//		html += '</option>';

	//		$('#activities').html(html);
	//	});

	$.typeahead({
		input : '.js-typeahead-client',
		minLength : 2,
		maxItem : 15,
		order : "asc",
		hint : true,
		group : {
			template : "{{group}}"
		},
		maxItemPerGroup : 5,
		backdrop : {
			"background-color" : "#fff"
		},
		href : "/beers/{{group|slugify}}/{{display|slugify}}/",
		emptyTemplate : 'No result for "{{query}}"',
		source : {
			"Name" : {
				ajax : {
					url : "/BusinessLab01/getClientNames.json",
				}
			},
			"Sector" : {
				ajax : {
					url : "/BusinessLab01/findAllSectors.json",
				}
			},
			"Contact Name" : {
				ajax : {
					url : "/BusinessLab01/findAllContactNames.json",
				}
			},
			"E-mail" : {
				ajax : {
					url : "/BusinessLab01/findAllEmails.json",
				}
			},
			"Contact Phone" : {
				ajax : {
					url : "/BusinessLab01/findAllPhones.json",
				}
			}
		},
		callback : {
			onInit : function(node) {
				console.log('Typeahead Initiated on ' + node.selector);
			}
		}
	});
</script>


//client search bar
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
	href : "/BusinessLab01/csearch.html?group={{group|slugify}}&query={{display}}",
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

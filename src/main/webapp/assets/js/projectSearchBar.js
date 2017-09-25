//project search bar
$.typeahead({
	input : '.js-typeahead-project',
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
				url : "/BusinessLab01/getProjectNames.json",
			}
		},
		"Project Manager" : {
			ajax : {
				url : "/BusinessLab01/findAllProjectManagers.json",
			}
		},
		"Type" : {
			ajax : {
				url : "/BusinessLab01/findAllTypes.json",
			}
		},
		"FED" : {
			ajax : {
				url : "/BusinessLab01/findAllForcastedEndDates.json",
			}
		},
		"Client" : {
			ajax : {
				url : "/BusinessLab01/findAllClientNames.json",
			}
		}
	},
	callback : {
		onInit : function(node) {
			console.log('Typeahead Initiated on ' + node.selector);
		}
	}
});
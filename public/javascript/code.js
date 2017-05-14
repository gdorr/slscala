/**
 * 
 */
var getLAFromPostcode = function(pcode) {
	$.getJSON("https://mapit.mysociety.org/postcode/" + pcode, "", function(
			data, status, xhr) {
		var mylist="<ul>"
		var y=data.areas[data.shortcuts.council.district].name
		mylist+='<li><a href="/landlords/'+encodeURI(y)+'">'+y+'</a></li>'
		var y=data.areas[data.shortcuts.council.county].name
		mylist+='<li><a href="/landlords/'+encodeURI(y)+'">'+y+'</a></li>'
		$("#localauthority").append(mylist+"</ul>")
	});
}

var searchforLA_clicked = function () {
	var data=$('#dataentry').val()
	getLAFromPostcode(data)
}

var findnName = function(jsoncache) {
	for ( let i in jsoncache.areas) {
		if (jsoncache.areas[i].type === 'WMC') {
			return jsoncache.areas[i].name;
		}
		;
	}
	;
	return "";
}

var example = {
	"wgs84_lat" : 53.74319770106918,
	"coordsyst" : "G",
	"shortcuts" : {
		"WMC" : 65899,
		"ward" : {
			"county" : 150811,
			"district" : 5505
		},
		"council" : {
			"county" : 2230,
			"district" : 2370
		}
	},
	"wgs84_lon" : -2.3872016532048446,
	"postcode" : "BB5 3AE",
	"easting" : 374560,
	"areas" : {
		"900000" : {
			"parent_area" : null,
			"generation_high" : 19,
			"all_names" : {},
			"id" : 900000,
			"codes" : {},
			"name" : "House of Commons",
			"country" : "",
			"type_name" : "UK Parliament",
			"generation_low" : 1,
			"country_name" : "-",
			"type" : "WMP"
		},
		"5505" : {
			"parent_area" : 2370,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 5505,
			"codes" : {
				"ons" : "30UGGB",
				"gss" : "E05005213",
				"unit_id" : "4650"
			},
			"name" : "Immanuel",
			"country" : "E",
			"type_name" : "District council ward",
			"generation_low" : 1,
			"country_name" : "England",
			"type" : "DIW"
		},
		"2370" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 2370,
			"codes" : {
				"ons" : "30UG",
				"gss" : "E07000120",
				"unit_id" : "4627",
				"local-authority-eng" : "HYN"
			},
			"name" : "Hyndburn Borough Council",
			"country" : "E",
			"type_name" : "District council",
			"generation_low" : 1,
			"country_name" : "England",
			"type" : "DIS"
		},
		"150811" : {
			"parent_area" : 2230,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 150811,
			"codes" : {
				"unit_id" : "42978"
			},
			"name" : "Oswaldtwistle",
			"country" : "E",
			"type_name" : "County council electoral division",
			"generation_low" : 31,
			"country_name" : "England",
			"type" : "CED"
		},
		"125575" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 125575,
			"codes" : {
				"ons" : "E01025056"
			},
			"name" : "Hyndburn 009B",
			"country" : "E",
			"type_name" : "2001 Lower Layer Super Output Area (Generalised)",
			"generation_low" : 13,
			"country_name" : "England",
			"type" : "OLG"
		},
		"65899" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 65899,
			"codes" : {
				"gss" : "E14000758",
				"unit_id" : "24781"
			},
			"name" : "Hyndburn",
			"country" : "E",
			"type_name" : "UK Parliament constituency",
			"generation_low" : 13,
			"country_name" : "England",
			"type" : "WMC"
		},
		"148781" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 148781,
			"codes" : {
				"nhse" : "01A"
			},
			"name" : "East Lancashire",
			"country" : "E",
			"type_name" : "Clinical Commissioning Group",
			"generation_low" : 29,
			"country_name" : "England",
			"type" : "CCG"
		},
		"900001" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 900001,
			"codes" : {},
			"name" : "European Parliament",
			"country" : "",
			"type_name" : "European Parliament",
			"generation_low" : 1,
			"country_name" : "-",
			"type" : "EUP"
		},
		"46293" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 46293,
			"codes" : {
				"ons" : "E02005220"
			},
			"name" : "Hyndburn 009",
			"country" : "E",
			"type_name" : "2001 Middle Layer Super Output Area (Generalised)",
			"generation_low" : 13,
			"country_name" : "England",
			"type" : "OMG"
		},
		"2230" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 2230,
			"codes" : {
				"ons" : "30",
				"gss" : "E10000017",
				"unit_id" : "5156",
				"local-authority-eng" : "LAN"
			},
			"name" : "Lancashire County Council",
			"country" : "E",
			"type_name" : "County council",
			"generation_low" : 1,
			"country_name" : "England",
			"type" : "CTY"
		},
		"39099" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 39099,
			"codes" : {
				"ons" : "E02005220"
			},
			"name" : "Hyndburn 009",
			"country" : "E",
			"type_name" : "2001 Middle Layer Super Output Area (Full)",
			"generation_low" : 13,
			"country_name" : "England",
			"type" : "OMF"
		},
		"149468" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 149468,
			"codes" : {},
			"name" : "Oswaldtwistle",
			"country" : "E",
			"type_name" : "Forward-dated ward boundaries",
			"generation_low" : 31,
			"country_name" : "England",
			"type" : "16W"
		},
		"91197" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 91197,
			"codes" : {
				"ons" : "E01025056"
			},
			"name" : "Hyndburn 009B",
			"country" : "E",
			"type_name" : "2001 Lower Layer Super Output Area (Full)",
			"generation_low" : 13,
			"country_name" : "England",
			"type" : "OLF"
		},
		"11807" : {
			"parent_area" : null,
			"generation_high" : 31,
			"all_names" : {},
			"id" : 11807,
			"codes" : {
				"ons" : "02",
				"gss" : "E15000002",
				"unit_id" : "41431"
			},
			"name" : "North West",
			"country" : "E",
			"type_name" : "European region",
			"generation_low" : 1,
			"country_name" : "England",
			"type" : "EUR"
		}
	},
	"northing" : 427494
}
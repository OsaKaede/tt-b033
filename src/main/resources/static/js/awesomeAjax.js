// Petición AJAX
function awesomeAjax(params, url) {
	return $.ajax({
		url:  url,
		type: "POST",
		dataType: "JSON",
		data: params,
		headers: {
			"X-CSRF-TOKEN": $("meta[name='_csrf']").attr("content")
		}
	});
}
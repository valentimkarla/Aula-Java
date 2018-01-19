$(function(){
	$("#pwd").change(function(){
		$("#confirm_pwd").keyup(function() {
			
			var password = document.querySelector("#pwd");
			var confirm_password = document.querySelector("#confirm_pwd");
			
			if (password.value != confirm_password.value) {
				password.setCustomValidity("Senhas nao conferem.");
			} else {
				password.setCustomValidity("");
			}
		})
	})
});
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%response.setContentType("text/html"); %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<script type="text/javascript">
	$(document).ready(function(){
		
		$("#mobile").change(function(){
			
			var data = "mobile="+$("#mobile").val();
			
			$.ajax({
				
				url:'Fatchdata',
				data:data,
				type:'post',
				success:function(eid){
				//	alert(eid);
					$("#mid").html(eid);
				}
				
			});
			
		});
		
	});

</script>



</head>
<body>
<h2>Register Your Mobile</h2>

				Mobile:<input type="text" name="mobile" id="mobile"/>
	
	<div id="mid"></div>


${msg}
	
</body>
</html>
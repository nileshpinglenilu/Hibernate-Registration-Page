<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-light">
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-md-3 mt-2">
				<div class="card">
				<div class="crad-header text-center fs-3">
					Employee Register
				</div>
					<div class="card-body">
						<form method="post" action="register">
							  <div class="mb-3 mt-2">
							    <label for="exampleInputEmail1" class="form-label">Name</label>
							    <input type="text" class="form-control" name="name">
							  </div>
							  <div class="mb-3 mt-2">
							    <label for="exampleInputEmail1" class="form-label">Department</label>
							    <input type="text" class="form-control" name="department">
							  </div>
							  <div class="mb-3 mt-2">
							    <label for="exampleInputEmail1" class="form-label">Salary</label>
							    <input type="text" class="form-control" name="salary">
							  </div>
							  <div class="mb-3 mt-2">
							    <label for="exampleInputEmail1" class="form-label">Email</label>
							    <input type="email" class="form-control" name="email">
							  </div>
							   <div class="mb-3 mt-2">
							    <label for="exampleInputEmail1" class="form-label">Password</label>
							    <input type="password" class="form-control" name="password">
							  </div>
							  <button type="submit" class="btn btn-primary col-md-12" >Register</button>
							</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>

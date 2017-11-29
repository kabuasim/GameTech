<link href="resources/css/navbar.css" rel="stylesheet">
<%@ taglib uri="http://www.springframework.org/tags" prefix="url"%>
<body>
	<div class="container-fluid top_bar">
		<div class="container">
			<div class="row">
				<div class="col-sm-4 ">
					<a href="#" class="social_icons"><i
						class="fa fa-facebook-square"
						style="font-size: 18px; color: #fff;"></i></a> <a href="#"
						class="social_icons"><i class="fa fa-twitter"
						style="font-size: 18px; color: #fff;"></i></a> <a href="#"
						class="social_icons"><i class="fa fa-google-plus"
						style="font-size: 18px; color: #fff;"></i></a>

				</div>
				<!--col 5 end-->
				<div class="col-sm-8 contact text-right">
					<span class="glyphicon glyphicon-envelope "></span>
					gametechinfo@gmail.com, <span class="glyphicon glyphicon-earphone "></span>
					+91-1234509999
				</div>
				<!--col 7 end-->
			</div>
			<!--row ends-->
		</div>
		<!--container ends-->
	</div>
	<!--container fluid ends-->

	<!--navbar starts-->
	<nav class="nav navbar-default" id="gametech-navbar">
		<div class="container">
			<div class="row">
				<div class="col-sm-4">
					<url:url value="/resources/images/gamelogof.png" var="url"></url:url>
					<img src="${url }" height="80" width="250">
				</div>
				<div class="col-sm-8">
					<ul class="nav navbar-nav pull-right">
						<li><a href="signup" class="text-white">SignUp</a></li>
						<li><a href="login" class="text-white">Login</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Account<span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#" class="text-white">My Account</a></li>
								<li><a href="#" class="text-white">Wishlist</a></li>
								<li><a href="#" class="text-white">Settings</a></li>
							</ul></li>
					</ul>

				</div>
			</div>
		</div>
		<!--container ends-->

	</nav>
	<!--navbar end-->


</body>
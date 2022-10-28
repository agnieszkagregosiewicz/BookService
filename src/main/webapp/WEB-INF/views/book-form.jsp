<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Add book</title>

    <!-- Custom fonts for this template-->
    <link href="/theme/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="/theme/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">

<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Enter data</h1>
                                </div>
                                <form:form class="user/edit" method="post" modelAttribute="book">

                                    <div class="form-group">
                                        <form:hidden path="id"/>
                                        <form:input path="title" class="form-control form-control-user"
                                                    placeholder="Enter title"/>
                                        <form:errors path="title" cssStyle="color: red" element="div"/>
                                    </div>
                                    <div class="form-group">
                                        <form:input path="author" class="form-control form-control-user"
                                                    placeholder="Enter author"/>
                                        <form:errors path="author" cssStyle="color: red" element="div"/>
                                    </div>
                                    <div class="form-group">
                                        <form:input path="isbn" class="form-control form-control-user"
                                                    placeholder="Enter isbn"/>
                                        <form:errors path="isbn" cssStyle="color: red" element="div"/>
                                    </div>
                                    <div class="form-group">
                                        <form:input path="publisher" class="form-control form-control-user"
                                                    placeholder="Enter publisher"/>
                                        <form:errors path="publisher" cssStyle="color: red" element="div"/>
                                    </div>
                                    <div class="form-group">
                                        <form:input path="type" class="form-control form-control-user"
                                                    placeholder="Enter type"/>
                                        <form:errors path="type" cssStyle="color: red" element="div"/>
                                    </div>

                                    <input class="btn btn-primary btn-user btn-block" type="submit" value="Save"/>
                                </form:form>

                                <hr>
                                </a>
                                </form>
                                <hr>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>

</body>

</html>

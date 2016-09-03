<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main"/>
		<title>Students</title>
	</head>
	<body>
        <g:each in="${students}" var="student" status="i">
            <h3>${i+1}. ${student.stdName}, ${student.stdEmail}</h3>
            <br/>
        </g:each>
	</body>
</html>
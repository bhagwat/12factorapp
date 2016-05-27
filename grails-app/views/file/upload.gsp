<!doctype html>
<html>
<head>
    <title>HTTP Session</title>
    <meta name="layout" content="main">
</head>

<body>
<div class="container">
    <g:uploadForm action="upload">
        <div class="row">
            <div class="col-md-8">
                <input type="file" name="file"/>
            </div>

            <div class="col-md-4">
                <input type="submit" value="Upload"/>
            </div>
        </div>
    </g:uploadForm>
    <g:if test="${downloadLink}">
        <a href="${downloadLink}">View last uploaded file</a>
        <br/>
        <img src="${downloadLink}"/>
    </g:if>
</div>
</body>
</html>

<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Knowledge sharing meet: TO THE NEW Digital</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>

<body>
<div id="content" role="main">
    <section class="row colset-2-its">
        <h1 class="uppercase">The twelve-factor app</h1>

        <div class="row">
            <div class="col-md-4">
                <ol>
                    <li>Codebase</li>
                    <li>Dependencies</li>
                    <li>Backing services</li>
                    <li>Build, Release, Run</li>
                    <li>Processes</li>
                    <li>Port Binding</li>
                </ol>
            </div>

            <div class="col-md-4">
                <ol start="7">
                    <li>Concurrency</li>
                    <li>Disposability</li>
                    <li>Backing services</li>
                    <li>Dev/Prod parity</li>
                    <li>Logs</li>
                    <li>Admin processes</li>
                </ol>
            </div>

            <div class="col-md-4">
                <div style="padding: 25px;">
                    <div class="arrow_box">
                        <h1 class="logo" id="quote"></h1>
                    </div>
                </div>
            </div>

        </div>
    </section>
</div>
<script type="text/javascript">
    (function poll() {
        jQuery.ajax({
            url: "${createLink(controller:'message')}",
            type: "GET",
            success: function (data) {
                jQuery('#quote').text(data.description);
            },
            dataType: "json",
            complete: setTimeout(function () {
                poll()
            }, 20000),
            timeout: 4000
        })
    })();
</script>
</body>
</html>

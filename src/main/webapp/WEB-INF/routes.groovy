get "/datetime", 	forward: "/datetime.groovy"
get "/", 			forward: "/index.html"
get "/ad",      	forward: "WEB-INF/pages/test.adoc"
get "/readme",      	forward: "WEB-INF/pages/README.adoc"
get "/test", 	forward: "/test.groovy"

get "/formdata", 	forward: "/formdata.groovy"

get "/render",      	forward: "WEB-INF/pages/render.gtpl"

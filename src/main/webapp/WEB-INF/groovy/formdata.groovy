log.info "Setting formdata attribute firstname"

String firstname = request.getParameter('firstname');
request.setAttribute 'firstname', firstname.toString()

log.info "Forwarding to formdata.adoc template"

forward '/WEB-INF/pages/formdata.adoc'
log.info "Setting formdata attribute firstname and adoc"

String firstname = request.getParameter('firstname');
request.setAttribute 'firstname', firstname.toString()

String adoc = request.getParameter('adoc');
request.setAttribute 'adoc', adoc.toString()

log.info "Forwarding to formdata.adoc template"

forward '/WEB-INF/pages/formdata.adoc'
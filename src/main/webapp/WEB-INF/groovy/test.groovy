
log.info "Setting attribute payload"

request.setAttribute 'payload', new Date().toString()

String source = "TIP: This is a tip.";

request.setAttribute 'payload2', source.toString()

log.info "Forwarding to datetime.adoc template"

forward '/WEB-INF/pages/datetime.adoc'
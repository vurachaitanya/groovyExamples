import hudson.model.*
def q = Jenkins.instance.queue
q.items.findAll { it.task.name.startsWith('VD_') }.each { q.cancel(it.task) }
// Find the builds N days old
// delete from the workspace directory

MIN_BUILD_LOGS = 1

sixMonthsAgo = new Date() - 10

Jenkins.instance.getAllItems(Job).each { job ->
  println job.getFullDisplayName()

  recent = job.builds.limit(MIN_BUILD_LOGS)

  buildsToDelete = job.builds.findAll { build ->
    !recent.contains(build) && !(build.getTime() > sixMonthsAgo)
  }

  for (build in buildsToDelete) {
    println "Preparing to delete: ${build} - ${build.getTime()}"
    ['bash', '-c', 'rm -r ' + build.getRootDir()].execute()
  //build.delete()
  }
}

'done'

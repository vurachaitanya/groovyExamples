// use the Jenkins Script Console to iterate through all jobs,
// get a list of the N most

MAX_BUILDS = 1

for (job in Jenkins.instance.items) {
  if (job instanceof jenkins.branch.MultiBranchProject) {
    job = job.getJob('master')
    def recent = job.builds.limit(MAX_BUILDS)
    for (build in job.builds) {
      if (!recent.contains(build)) {
        println "Preparing to delete: ${build}"
        //build.delete()
        println "Deleted : ${build}"
      }
    }
  }
}

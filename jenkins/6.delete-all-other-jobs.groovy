for (job in jenkins.model.Jenkins.theInstance.getAllItems()) {
    if (!((job.fullName).startsWith('Kangs_')
      || (job.fullName).startsWith('KS_')
      || (job.fullName).startsWith('KP_')
      )) {
         println "Preparing to delete: ${job.name}"
      try {
         //job.delete()
         println "deleted ${job.name}"
      }
      catch (error) {
        println "Issue to delete: ${job.name}"
      }
    }
}

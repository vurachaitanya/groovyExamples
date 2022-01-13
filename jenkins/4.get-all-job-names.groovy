// print the name of all jobs including jobs
// inside of a folder and the folders

Jenkins.instance.getAllItems(AbstractItem).each { job ->
    println job.fullName + ' - ' + job.class
}

// print the name of all jobs including jobs inside of a folder,
// but not the folders themselves
Jenkins.instance.getAllItems(Job).each { job ->
    println job.name + ' - ' + job.class
}

// print the name of all jobs implementing the AbstractProject class, i.e.
// Freestyle and Maven jobs
Jenkins.instance.getAllItems(AbstractProject).each { job ->
    println job.fullName
}

// print the name of all the Multibranch jobs
multiBranch = org.jenkinsci.plugins.workflow.multibranch.WorkflowMultiBranchProject
Jenkins.instance.getAllItems(multiBranch).each { job ->
    println job.fullName
}

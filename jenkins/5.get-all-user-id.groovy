import hudson.model.User

/* groovylint-disable-next-line UnnecessaryGetter */
for (user in User.getAll()) {
    println(user.id)
}

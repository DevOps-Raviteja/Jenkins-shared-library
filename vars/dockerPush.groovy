def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
        credentialsId: 'docker',
        usernameVariable: 'docker_acc',
        passwordVariable: 'docker_pass'
    )]) {
        sh "docker login '$docker_acc'"
    }
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}

// withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'docker-pass', usernameVariable: 'docker-acc')]) {
//     some block
// }
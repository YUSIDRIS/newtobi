def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker_psw', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build --file=web-tier/Dockerfile -t yusidris/web-tier:2.0 .'
        sh 'docker build --file=app-tier/Dockerfile -t yusidris/app-tier:2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push yusidris/app-tier:1.0'
        sh 'docker push yusidris/webtier:1.0'

    }
} 

return this

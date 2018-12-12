node {
    stage('checkout'){
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/sweathagulabi/happy.git']]])

    }
    stage('build'){
         echo "building"
    }
}

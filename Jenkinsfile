pipeline {
  agent any
  stages {
    stage('1. Commit') {
      steps {
        echo 'Build de project'
      }
    }

    stage('2. Edge Text') {
      parallel {
        stage('Edge Text') {
          steps {
            echo 'Run en Edge'
          }
        }

        stage('2. Firefox Test') {
          steps {
            echo 'Run en Firefox'
          }
        }

        stage('2. Opera Test') {
          steps {
            echo 'Run en Opera'
          }
        }

      }
    }

    stage('3. Deploy') {
      steps {
        echo 'Esta concluida la construcción'
      }
    }

  }
  environment {
    ChromeDriverPath = 'C:\\Driver\\Path\\Chrome'
    driverManager_type = 'CHROME'
  }
}
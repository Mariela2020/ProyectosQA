<<<<<<< HEAD
pipeline{

    agent any

    tools {
             maven "MAVEN_HOME"
           }

    stages {

        stage ('Compile') {
            steps {
                //withMaven(maven: 'maven_3_6_3') {
                    bat 'mvn clean install'
                }
        }

    stage ('Test Chrome') {
            steps {
              //  withMaven(maven: 'maven_3_6_3') {
                    bat 'mvn test'
                }
            }

    stage ('Test Firefox') {
           environment {
               Properties properties = new Properties();
               properties.load(new FileReader("src/test/resources/config.properties"));
               properties.replace("driverManager_type","CHROME" , "FIREFOX");
              }
              steps {
                  //  withMaven(maven: 'maven_3_6_3') {
                        bat 'mvn test'
                    }
                }

    stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber_report.json",
                    jsonReportDirectory: 'target'
                  }
            }

    }
=======
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
>>>>>>> origin/main
}
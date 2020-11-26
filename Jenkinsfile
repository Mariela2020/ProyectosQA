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
}
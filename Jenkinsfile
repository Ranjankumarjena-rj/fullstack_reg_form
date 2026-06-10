pipeline{
agent any
tools{
 jdk 'JAVA_HOME'
 maven 'M2_HOME'
 }
  stages{
    stage("checkout"){
	   steps{
	      git branch: 'main', url: 'https://github.com/Ranjankumarjena-rj/fullstack_reg_form.git'
			}
		}
	stage("maven build"){
	   steps{
	     sh 'mvn clean package'
			}
		}
    stage("docker build"){
		steps{
		 sh "docker build -t ranjankumarjena/saroj-fullstack-project:${BUILD_NUMBER}  ."
		 }
	   }
	stage("docker push"){
	    steps{
		withCredentials([string(credentialsId: 'ranjankumarjena', variable: 'password')]) {
        sh "echo \$password | docker login -u ranjankumarjena --password-stdin"
		sh 'docker push ranjankumarjena/saroj-fullstack-project:${BUILD_NUMBER}'
	     }
    	}
	}
  }
}

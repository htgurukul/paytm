pipeline {
                agent any
                triggers {
		        githubPush()
            }
              stages {
                        

                        stage('Build Now') {
                                steps {
                                        
                                        echo "Inside Dir component"
                                        echo "Treating Workspaces as $WORKSPACE"
                                        sh """ pwd;ls -l ;echo back ; ls -l ../ ; cat README.md """
                                                

                                }
                                

                                }
                  
                }
}

pipeline {
                agent any
	       options { disableConcurrentBuilds() }
                triggers {
		        githubPush()
            }
              stages {
                        

                        stage('Build Now') {
                                steps {
                                        
                                        echo "Inside Dir component"
                                        echo "Treating Workspaces as $WORKSPACE"
                                        sh """  env ; cat README.md ; sleep 60 """
                                                

                                }
                                

                                }
                  
                }
        }


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
                                        sh """ pwd; cat README.md """
                                                

                                }
                                

                                }
                  
                }
}

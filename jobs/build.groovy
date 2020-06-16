pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                script{
                    
                    def name = "jeff"
                    
                    if(name =="jeff")
                        println("Hello ${name}")
                    else
                        println("Hello Human")
                    
                    sleep 2
                    echo "end of the script"
                }
            }
        }
    }
}

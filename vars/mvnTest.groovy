def call(){
    sh 'mvn clean'
    sh 'mvn compile'
    sh 'mvn install'
    sh 'mvn clean install -e'
    sh 'mvn clean install -X'
    sh 'mvn validate'
    sh 'mvn test'
}

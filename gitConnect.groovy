def call(String gitUrl,String gitBranch){
    echo "Cloning Repository ..."
    git url:"${gitUrl}" , branch:"${gitBranch}"
    echo "Cloning Successful"
}

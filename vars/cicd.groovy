def newDownload(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newBuild()
{
  sh "mvn package"
}
def newDeploy(jobname,ip,appname)
{
  

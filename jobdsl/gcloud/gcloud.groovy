pipelineJob('AQA/gcloud') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('git@github.com:vanelin/configuration-as-code-jenkins-k8s-pipeline.git')
              credentials('jenkins-ssh-key')
            }
          }
        }
        scriptPath("gcloud/Jenkinsfile")
    }
  }
}

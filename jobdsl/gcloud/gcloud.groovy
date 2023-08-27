pipelineJob('AQA/gcloud') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/vanelin/configuration-as-code-jenkins-k8s-pipeline.git')
            }
          }
        }
        scriptPath("gcloud/Jenkinsfile")
    }
  }
}

pipelineJob('AQA/auth') {
  definition {
    cpsScm {
        scm {
          git {
            remote {
              url ('https://github.com/figaw/configuration-as-code-jenkins-k8s-pipeline.git')
            }
          }
        }
        scriptPath("auth/Jenkinsfile")
    }
  }
}

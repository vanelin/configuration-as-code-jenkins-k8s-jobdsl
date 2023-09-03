job('AQA/super-seed') {
  scm {
    git {
      remote {
        url ('git@github.com:vanelin/configuration-as-code-jenkins-k8s-jobdsl.git')
        credentials('jenkins-ssh-key')
      }
    }
  }
  steps {
    dsl {
      external('jobdsl/**/*.groovy')
      removeAction('DELETE')
    }
  }
}

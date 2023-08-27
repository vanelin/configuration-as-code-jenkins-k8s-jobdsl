job('AQA/super-seed') {
  scm {
    git {
      remote {
        url ('https://github.com/vanelin/configuration-as-code-jenkins-k8s-jobdsl.git')
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

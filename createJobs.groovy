pipelineJob('book-store') {
    definition {
        cpsScm {
            scm{
                git {
                    remote {
                        url 'https://github.com/jordanthomas761/BookStore.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('book-store') {
    definition {
        cpsScm {
            git {
                remote {
                    url 'https://github.com/jordanthomas761/BookStore.git'
                }
                branch 'master'
            }
        }
    }
}
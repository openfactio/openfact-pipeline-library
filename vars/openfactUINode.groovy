#!/usr/bin/groovy
def call(Map parameters = [:], body) {

    def defaultLabel = buildId('ui')
    def label = parameters.get('label', defaultLabel)

    openfactUITemplate(parameters) {
        node(label) {
            body()
        }
    }
}

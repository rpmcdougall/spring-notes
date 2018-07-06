
import groovyx.net.http.HttpBuilder

def dostuff() {
    def http = HttpBuilder.configure {
        request.uri = 'localhost:8081'
    }

    String text = http.get(String) {
        request.uri.path = '/api/notes'
    }

    println text
}

dostuff()
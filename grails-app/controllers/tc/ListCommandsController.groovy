package tc

import grails.dev.commands.ApplicationContextCommandRegistry

class ListCommandsController {

    def index() {
        render ApplicationContextCommandRegistry.findCommands()*.name.join(',')
    }
}

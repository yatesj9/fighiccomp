# fighiccomp

A Compojure/Fighweel/Reagent template, servied with Clojure

## Installation

Download/Clone the repo, change into the *fighiccomp* directory and run the below command
```clojure
lein new fighicomp <project name>
```

## Usage
```clojure
;Require repl namespace
(require '[<project name>.repl :refer [start-server stop-server]])

;Start webserver with specified environment config - check config.clj defautl port is 5566
(start-server :development)

;Stop webserver
(stop-server)
```


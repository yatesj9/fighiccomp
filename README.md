# fighiccomp

A Compojure/Fighweel/Reagent template

## Installation

Download/Clone the repo, change into the *fighiccomp* directory and run the below command
```clojure
lein new fighiccomp <project name>
```

## Usage
```clojure
;Require repl namespace, note repl.clj will be added to the project name -clj folder
(require '[<project name>-clj.repl :refer [start-server stop-server]])

;Start webserver with specified environment config - check config.clj defautl port is 5566
(start-server :development)

;Stop webserver
(stop-server)
```


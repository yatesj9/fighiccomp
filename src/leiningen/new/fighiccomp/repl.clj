(ns {{ns-name}}-clj.repl
  (:require [{{ns-name}}-clj.config :refer [set-mode! get-settings]]
            [{{ns-name}}-clj.handler :refer [app]])
  (:use [ring.server.standalone]))

(defonce server (atom nil))

(defn get-handler
  []
  (-> #'app))

(defn start-server
  [mode]
  (reset! server
    (do
      (set-mode! mode)
      (serve (get-handler) {:port (get-settings :server :port)
                            :open-browser? false}))))

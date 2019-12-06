(ns leiningen.new.fighiccomp
  (:require [leiningen.new.templates :refer [renderer name-to-path sanitize-ns ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "fighiccomp"))

(defn fighiccomp
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' fighiccomp project.")
    (->files data
             ["src/{{sanitized}}_clj/config.cljc" (render "config.cljc" data)]
             ["src/{{sanitized}}_cljs/core.cljs" (render "core.cljs" data)]
             ["src/{{sanitized}}_clj/handler.clj" (render "handler.clj" data)]
             ["src/{{sanitized}}_clj/repl.clj" (render "repl.clj" data)]
             ["public/index.html" (render "index.html" data)]
             ["public/css/site.css" (render "site.css" data)]
             ["env/dev/clj/{{sanitized}}/user.clj" (render "user.clj" data)]
             ["env/dev/cljs/{{sanitized}}/dev.cljs" (render "dev.cljs" data)]
             ["env/prod/cljs/{{sanitized}}/prod.cljs" (render "prod.cljs" data)]
             ["project.clj" (render "project.clj" data)])))

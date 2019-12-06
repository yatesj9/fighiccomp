(ns {{ns-name}}-clj.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.format :refer [wrap-restful-format]]))

(defroutes app-routes
  (route/files "/" {:root "public"})
  (route/not-found "Not Found"))

(def app
  (-> (routes app-routes)
      (wrap-defaults (assoc site-defaults :security {:anti-forgery false}))
      (wrap-restful-format :format [:json-kw])))

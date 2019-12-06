(ns {{ns-name}}.prod
  (:require
    [{{ns-name}}.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)

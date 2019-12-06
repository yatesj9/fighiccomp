(ns {{ns-name}}-clj.config)

(def default-mode (atom :development))

(defn get-mode
  []
  @default-mode)

(defn set-mode!
  [new-mode]
  (reset! default-mode new-mode))

(def ^:private dsettings {
     :server {
       :port 5566}})

(def ^:private opts {
  :development dsettings})

(defn get-settings
  "Returns values in private settings defined by OPTS key"
  [& selections]
  (let [choices (if ((first selections) opts)
                  selections
                  (cons @default-mode selections))]
    (get-in opts choices)))

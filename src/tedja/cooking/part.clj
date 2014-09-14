(ns tedja.cooking.part
  (:require [compojure.core :refer :all]
            [tedja.layout :as layout]
            [tedja.util :as util]
            [tedja.html-part.part :as part]))

(defn login-post [username password]
  (str "HAH!!! you're scamed, username = " username " password = " password))

(ns tedja.html-part.part
  (:require [selmer.parser :as parser]
            [clojure.string :as s]
            [ring.util.response :refer [content-type response]]
            [compojure.response :refer [Renderable]]
            [environ.core :refer [env]]
            [hiccup.core :as h]
            [hiccup.form :as f]))

(defn the-calvin []
  (h/html [:span.funde "lebron james"]))

(defn curhatan []
  (h/html [:div.curhatan "curhatan akuuuu {{curhat}}"]))

(defn curhat []
  (h/html [:div.curhat "jadi aku tuh sebel sama si x bla bla bla"]))


(defn login-form []
  (f/form-to [:post "/login"]
             (f/text-field {:placeholder "username su" :required true} :username)[:br]
             (f/password-field {:placeholder "passwordcok" :required true} :password)[:br]
             (f/radio-button :kelamin false "bencis")[:br]
             (f/radio-button :kelamin false "bancong")"bancong"[:br]
             (f/submit-button :login)
             [:p
              (f/label "radio"  "radio")
              (f/radio-button 1 false 1)
              (f/radio-button 1 true 2)]
             [:input {:type "text"
                      :name "hasu"
                      :id "hasu"
                      :value 42} "lebron"]))

(defn login-container []
  (h/html [:div#login (login-form) ]))


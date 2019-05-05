(ns clj-ftd.cards
  (:gen-class))

(require '[cats.core :as m])
(require '[cats.builtin])

(def all-ranks [:ctwo :cthree :cfour :cfive :csix :cseven :ceight
                :cnine :cten :jack :queen :king :ace])

(def all-suits [:diamonds :clubs :hearts :spades])

(defn card [suit rank] {:suit suit :rank rank})

(def all-cards ((m/lift-m 2 card) all-suits all-ranks))

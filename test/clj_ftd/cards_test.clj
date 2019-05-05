(ns clj-ftd.cards-test
  (:require [clojure.test :refer :all]
            [clj-ftd.cards :refer :all]))

(deftest cards-test

  (testing "all-cards right length"
    (is (= 52 (count all-cards))))

  (testing "all-cards right format"
    (def test-card (get all-cards 0))
    (is (= false (nil? (:suit test-card))))
    (is (= false (nil? (:rank test-card))))))    

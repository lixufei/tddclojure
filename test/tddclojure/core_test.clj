(ns tddclojure.core-test
  (:require [clojure.test :refer :all]
            [tddclojure.core :refer :all]))

(deftest a-test
  (testing "return accounts of opportunities."
    (let [opportunities [{:name "hello1" :account "cc1"}]]
      (is (= ["cc1"] (get-accounts opportunities)))
      ))
  (testing "Should sort account list"
    (let [oppotunities [{:name "opp1" :account "acc2"}
                        {:name "opp1" :account "acc2"}
                        {:name "opp1" :account "acc1"}]]
      (is (= ["acc1" "acc2"]
             (get-accounts oppotunities)))
      )
    )

  (testing "should show revenue data"
    (let [salary [{:region "China" :revenue [
                                            {:name "project1" :amount 200}]}
                  {:region "US" :revenue [
                                          {:name "project2" :amount 200}]}]]
      (is (= [{:name "project1" :amount 200 :region "China"}
              {:name "project2" :amount 200 :region "US"}]
             (get-revenue-table salary)))
      )

    )
  )

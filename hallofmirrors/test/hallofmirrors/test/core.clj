(ns hallofmirrors.test.core
  (:use [hallofmirrors.core])
  (:use [hallofmirrors.examples])
  (:use [clojure.test]))

(deftest example-test-1
  (is (= 4 (count (get-reflections example-1)))))

(deftest example-test-2
  (is (= 8 (count (get-reflections example-2)))))

(deftest example-test-3
  (is (= 68 (count (get-reflections example-3)))))

(deftest example-test-4
  (is (= 32 (count (get-reflections example-4)))))

(deftest example-test-5
  (is (= 3 (count (get-reflections example-5)))))

(deftest example-test-6
  (is (= 16 (count (get-reflections example-6)))))
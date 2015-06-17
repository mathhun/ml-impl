#!/usr/bin/env python

from sklearn.datasets import load_iris
from sklearn.cross_validation import train_test_split
from sklearn.metrics import confusion_matrix
from decision_tree import DecisionTree

def main():
    iris = load_iris()
    data_train, data_test, label_train, label_test = train_test_split(iris.data, iris.target)

    dt = DecisionTree()
    dt.fit(data_train, label_train)
    pred = dt.predict(data_test)
    #dt.print_tree()

    #print(iris)
    print(data_train)
    print(label_train)
    print(data_test)
    print(label_test)
    print(pred)
    print(confusion_matrix(label_test, pred))

if __name__ == '__main__':
    main()

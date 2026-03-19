import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report, f1_score
import pickle

games = pd.read_csv('/ProblemTwo/prediction.csv')


# i would make a function that takes first argument, goub by all the relatives, and then check if the second argument matches, if yes the third and ghive an outpute based on that
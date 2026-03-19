import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, classification_report, f1_score
import pickle

games = pd.read_csv('/ProblemTwo/prediction.csv')

num_games_with_spades = (games['Card Suit'] == 'Spades').sum()
total_games = len(games)

print('games as spade = {}'.format(num_games_with_spades / total_games))
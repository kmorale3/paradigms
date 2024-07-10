#!/usr/bin/env python3

# Katie Morales
# Programming Paradigms Homework 6

import random
import sys

class GameState:
    def __init__(self):
        self.good_letters    = []
        self.bad_letters     = []
        self.correct_letters = [""] * 5

    def print(self):
        print(f'Good letters = {self.good_letters}')
        print(f'Bad letters = {self.bad_letters}')
        print(f'Correct letters = {self.correct_letters}')

words = []
word_file = open("words.txt", "r") 
# add words to word array
for word in word_file:
    words.append(word.rstrip())     # get rid of new line character
word_file.close()

# randomly select a word
word = words[random.randint(0, len(words) - 1)]

# write the word to the outut file, answer.txt
output_file = open("answer.txt", "w")
output_file.write(word)
output_file.close()

guesses = 1
game    = GameState()   # initialize gameState
# gets 6 guesses
while (guesses <= 6):
    print("Please enter a 5-letter word:")
    guess = sys.stdin.readline().rstrip()   # get rid of new line character
    guess = guess.upper()                   # convert to uppercase
    if len(guess) != 5:
        print("ERROR: not a 5-letter word! Please try again!")
        continue    # does not increment guesses
    elif guess not in words:
        print("ERROR: not a valid word! Please try again!")
        continue    # does not increment guesses
    else:
        # enumerate allows us to index the word and get the letter
        for i, letter in enumerate(guess):
            if letter in word:
                # duplicate letters only added once
                if letter not in game.good_letters: 
                    game.good_letters += [letter] 
                if letter == word[i]:
                    game.correct_letters[i] = letter
            if letter not in word and letter not in game.bad_letters:
                game.bad_letters += [letter]
        if guess == word:
            print(f'“Congratulations, you correctly identified the word after {guesses} attempts')
            break       # does not increment guesses
        game.print()    # call built-in method 
        guesses += 1
if guesses == 7:        # guesses will only be 6 if it was not correctly guessed
    print(f'The answer is {word}. You did not correctly guess it within 6 tries.')
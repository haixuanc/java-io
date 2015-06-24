#!/bin/bash

INPUT=input.txt
CLASS=$1

javac ${CLASS}.java && \
cat $INPUT | java $CLASS

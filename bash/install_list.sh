#! /bin/bash
echo "brew installs"
brew list
echo "ruby installs (includes defaults)"
gem list --local
echo "python installs"
pip3 list
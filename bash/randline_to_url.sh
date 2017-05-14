#!/bin/sh
#usage ./randline_to_url.sh ~/Documents/txt_files/bookmarks_12_18_16.txt
# note input file must only be urls and no spaces at the end of the line , unix line ending 
randline="$(head -$((${RANDOM} % `wc -l < "$1"` + 1)) "$1" | tail -1)"
open $randline
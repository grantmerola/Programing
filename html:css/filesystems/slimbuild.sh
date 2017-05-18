# !bin/bash
#markdown filesystems.md | place in slim file
slimrb -p filesystems.slim > index.html
open -a "Google Chrome" index.html
slimrb filesystems.slim > index_min.html
echo "index_min size"
wc -c index_min.html
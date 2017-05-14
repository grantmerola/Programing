import os
import sys
os.system("mkdir %s" % sys.argv[1])
os.chdir(sys.argv[1])
os.system("wget %s" %  sys.argv[2])
os.system("wget -i  _all.m3u")
os.system("rm _all.m3u")
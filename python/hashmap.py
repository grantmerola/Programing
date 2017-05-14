#hashmap

# creates function that requires the var num_buckets which is defined in the statement 
def new(num_buckets = 256):
#creates list that equals aMap ?
	aMap = []
#for loop that loops i over, through 0 and num buckets(how num_buckets is defined in the function i don't know presume 256)
	for i in range(0, num_buckets):
# appends aMap with a list possibly for each i iteration with in the for loop possible result  aMap is a list [] containing 256 lists []
		aMap.append([])
# return aMap where, what, to who unknown, user calls function, passed to who unknown  
	return aMap
# defines a function called hash key with required vars aMap(presume fetching from news aMap some how return put in to different functions almost like glob var but it is not) and key (unclear where key comes from perhaps passed by user)	
def hash_key(aMap, key):
# returns the hash(hash is a cryptography term not sure why used here but it generates a number based on an input) of key divided(?) by the length of aMap, i think the goal of this line is to generate a either random number or (speculative)o create a key to reference entrees with in the list with in the list
	return hash(key) % len(aMap)
#defines a function called get_bucket that must be passed aMap and key, same concerns as last defined function
def get_bucket(aMap, key):
#bucket id is a var that calls the hash key function should return int
	bucket_id = hash_key(aMap, key)
#returns aMaps item bucket_id(unsure when assigned to aMap, does that make aMap 256 or 257	
	return aMap[bucket_id]
	n?
#defines function called get_slot requiring vars aMap key and default, aMap and key are of the same concerns as in previous functions does not extend to default because it is a assigned value none(what none means or does i don't know not string or int i think primitive or function of the language? is guess)  
def get_slot(aMap, key, default = None):
# bucket calls get_bucket function passing it aMap and key, it gets those vars from parent get_slot unclear where get slot gets vars
	bucket = get_bucket(aMap, key)
#for loop counts with two vars(not sure how exactly this works with two guess done one after another) i and kv in enumerate(bucket) i don't know enumerate is a it is not a function defined in this script and i don't think it's part of the language(impossible to tell what bucket is doing or is having done to it, without enumerate)   	
	for i, kv in enumerate(bucket):
#every time loop runs vars k and v = kv unclear details and use
		k, v = kv
# if statement where if key is equal to k then run
		if key == k:
#code run on condition is to return i(same as for loop i ?) k and v  
			return i, k, v
#full function returns -1, key(num?) , default(none?)
	return -1, key, default
#defines a function that requires the same vars as get_slot	
def get(aMap, key, default = None):
#runs i k and v equal to get slot with vars required, unsure why default needs to pass gets default when get_slot defines default it's self  
	i, k, v = get_slot (aMap,key, default = default)
#returns v
	return v
#defines a fucntion called set that requires amap  key and value
def set(aMap, key, value):
# bucket = get bucket function that gets passd amap and key
	bucket = get_bucket(aMap, key)
# i k and v equals get_slot which is passed a map and key 
	i, k, v, = get_slot(aMap, key)
# if i  is greater than or equal to 0 	
	if i >= 0:
# if i is greater of equal to 0 add a item i to bucket which calls get slot maybe?
		bucket[i] = (key, value)
	else:
#else append bucket which calls get slot passes key and value 
		bucket.append((key, value))
#define function called delete which is passed amap and key
def delete(aMap, key):
# bucket equals get bucket passed amap and key
	bucket = get_bucket(aMap, key)
#for loop i in xrange which is length bucket or get_bucket
	for i in xrange(len(bucket)):
#k and v equal bucket list item i 
		k, v = bucket[i]
# if key equals k (unclear where k comes from)
		if key == k:
# if it does deleate? bucket list item i 
			del bucket[i]
#break out of the loop
			break
#defines function called list that is passed amap
def list(aMap):
#for loop that counts buckets in amap
	for bucket in aMap:
# if bucket (what does this do)
		if bucket:
#if true for loop that counts k and v in buckets
			for k, v in bucket:
#print k and v
				print k,v
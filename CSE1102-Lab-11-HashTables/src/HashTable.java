
public class HashTable {
	private int _numBuckets = 7;
	private Node[] _buckets = new Node[_numBuckets];
	private int _count = 0;
	private double _loadFactor = 0.0;
	private double _madXloadFactor = 0.7;

	public void add(Object key, Object value)
	{
		Node node1 = _locate(key);
		if(node1 == null)
		{
			int hashCode = key.hashCode();
			int bucketNum = hashCode % _numBuckets;
			Node newBucket = new Node(key, value, _buckets[bucketNum]);
			newBucket = 
		}
	}
	//computes the bucket number and then calls _locate in
	//order to locate the key in a specific bucket (a bucket
	//may have multiple nodes chained together)
	private Node _locate(Object key)
	{
		int hashCode = key.hashCode();
		int bucketNum = hashCode % _numBuckets;
		return _locate(key, bucketNum);
	}
	//locates a key in a specific bucket
	//searches the chain of nodes if necessary
	private Node _locate(Object key, int bucketNum)
	{
		Node bucketList = _buckets[bucketNum];
		while(bucketList != null)
		{
			// If the key matches the key of the current node
			// in bucketList, then return the bucketList.
			// (See the return statement below? You could just break
			// out of the loop and the bucketList will be returned.)
			// Otherwise move to the next node.
			if(bucketList._key == key)
			{
				return bucketList;
			}
			bucketList = bucketList._next;
		}
		return bucketList;
	}
}

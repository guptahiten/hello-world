private static int eq(int[] array) {
	
	int sum = 0;
	int leftsum = 0;
		
	//Sum of total array elements
	for(int i = 0; i<array.length; i++) {
		sum += array[i];
	}
	
	//finding equilibrium index
	for(int i = 0; i<array.length; i++){
		sum -= array[i];
		
		if(leftsum == sum){
			return i;
		}
		leftsum += array[i];
	}
	
	return -1;
}

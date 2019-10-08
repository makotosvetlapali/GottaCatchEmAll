package src.main.java;

public class Berry {
	
	int id;
	int growthTime;
	int size;
	
	
	public Berry (int id, int growthTime, int size) {
		this.id = id;
		this.growthTime = growthTime;
		this.size = size;
		
	}
	
	public int getId() {
		return id;
		
	}
	
	public int getGrowthTime() {
		return growthTime;
	}
	
	public int getSize() {
		return size;
	
	}
	
	@Override 
	public String toString() {
		return "Berry: id =" + id + ", size = " + size + ", growth time = " + growthTime;
				
		
		
		
	}

}

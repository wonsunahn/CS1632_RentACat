package edu.pitt.cs;

import org.mockito.Mockito;

public interface RentACat {
	public static RentACat createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return new RentACatImpl();
			case BUGGY:
				return new RentACatBuggy();
			case SOLUTION:
				return new RentACatSolution();
			case MOCK:
				return Mockito.mock(RentACat.class);
			default:
				assert(false);
				return null;
		}
	}
	
	public boolean returnCat(int id);
	public boolean rentCat(int id);
	public boolean renameCat(int id, String name);
	public String listCats();
	public boolean catExists(int id);
	public boolean catAvailable(int id);
	public Cat getCat(int id);
	public void addCat(Cat c);
}

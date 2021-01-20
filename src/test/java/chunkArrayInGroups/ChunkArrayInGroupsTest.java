package chunkArrayInGroups;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ChunkArrayInGroupsTest {
	
	@Test
	public void test01() {
		List actual = new ChunkArrayInGroups().chunkArrayInGroups(Arrays.asList("a", "b", "c", "d"), 2);
		List expected = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"));
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test02() {
		List actual = new ChunkArrayInGroups().chunkArrayInGroups(Arrays.asList(0, 1, 2, 3, 4, 5), 3);
		List expected = Arrays.asList(Arrays.asList(0, 1, 2), Arrays.asList(3, 4, 5));
		
		assertEquals(expected, actual);
	}

	@Test
	public void test03() {
		List actual = new ChunkArrayInGroups().chunkArrayInGroups(Arrays.asList(0, 1, 2, 3, 4, 5), 2);
		List expected = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(2, 3), Arrays.asList(4, 5));
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test04() {
		List actual = new ChunkArrayInGroups().chunkArrayInGroups(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8), 4);
		List expected = Arrays.asList(Arrays.asList(0, 1, 2, 3), Arrays.asList(4, 5, 6, 7), Arrays.asList(8));
		
		assertEquals(expected, actual);
	}
}

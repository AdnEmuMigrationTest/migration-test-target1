package ch.adnovum.migrationtest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FooTest {

	@Test
	void shouldAdd() {
		assertEquals(Foo.add(1, 2), 3);
	}

}

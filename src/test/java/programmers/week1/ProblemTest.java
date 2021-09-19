package programmers.week1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProblemTest {

	private Problem problem;

	@BeforeEach
	void setup() {
		problem = new Problem();
	}

	@Test
	void 돈이_부족하지_않은_경우() {
		long result = problem.solution(3, 100, 4);
		assertEquals(0, result);
	}

	@Test
	void count_짝수_테스트() {
		long result = problem.solution(3, 20, 4);
		assertEquals(10, result);
	}

	@Test
	void count_홀수_테스트() {
		long result = problem.solution(3, 20, 5);
		assertEquals(25, result);
	}
}
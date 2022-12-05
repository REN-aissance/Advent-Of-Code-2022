package day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import main.Challenge;

public class Day1 extends Challenge {

	public Day1() {
		super("resources/1.txt");
	}

	public PriorityQueue<Integer> pq;

	@Override
	public void setup() throws Exception {
		pq = buildPQ();
	}
	
	@Override
	public String challenge1() {
		return pq.poll().toString();
	}

	@Override
	public String challenge2() {
		Integer out = 0;
		for (int i = 0; i < 3; i++) {
			out += pq.poll();
		}
		return out.toString();
	}

	private PriorityQueue<Integer> buildPQ() throws Exception {
		String l;
		Integer elfCals = 0;
		pq = new PriorityQueue<>(Collections.reverseOrder());
		while ((l = reader.readLine()) != null) {
			if (l.isBlank()) {
				pq.add(elfCals);
				elfCals = 0;
			} else {
				elfCals += Integer.parseInt(l);
			}
		}
		return pq;
	}
}

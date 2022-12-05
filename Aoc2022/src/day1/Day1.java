package day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import main.Challenge;

public class Day1 extends Challenge {

	public Day1() {
		super("resources/1.txt");
	}

	public ArrayList<Integer> totals;
	public PriorityQueue<Integer> pq;

	@Override
	public void setup() throws Exception {
		totals = getTotals();
		pq = buildPQ();
	}
	
	@Override
	public String challenge1() {
		for (Integer i : totals)
			pq.add(i);
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

	private ArrayList<Integer> getTotals() throws Exception {
		String l;
		Integer elfCals = 0;
		ArrayList<Integer> totals = new ArrayList<>();
		while ((l = reader.readLine()) != null) {
			if (l.isBlank()) {
				totals.add(elfCals);
				elfCals = 0;
			} else {
				elfCals += Integer.parseInt(l);
			}
		}
		return totals;
	}

	private PriorityQueue<Integer> buildPQ() {
		pq = new PriorityQueue<>(totals.size(), Collections.reverseOrder());
		for (Integer i : totals)
			pq.add(i);
		return pq;
	}
}

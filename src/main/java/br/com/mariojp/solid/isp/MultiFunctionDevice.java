package br.com.mariojp.solid.isp;

public class MultiFunctionDevice implements Printer, Scanner {

	@Override
	public void print(String content) {
		System.out.println("Printing: " + content);
	}

	@Override
	public void scan(String fileName) {
		System.out.println("Scanning to: " + fileName);
	}
}

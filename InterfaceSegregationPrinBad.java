/**
* Interface Segreation Principle (Bad example)
* Source: www.oodesign.com
*
*/

interface IWorker {
	public void work();
	public void eat();
}

class Worker implements IWorker {
	public void work() {
		// work ....
	}

	public void eat() {
		// eat ....
	}
}

class SuperWorker implements IWorker {
	public void work() {
		// work ....
	}

	public void eat() {
		// eat ....
	}
}

class Manager {
	IWorker worker;

	public setWorker(IWorker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
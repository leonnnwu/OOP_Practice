/**
* Dependency Iversion Principle -- Bad example
* Source: www.oodesign.com
*/

class Worker {
	public void work() {
		// working...
	}
}

class Manager {
	Worker worker;

	public void setWorker(Worker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}

public SuperWorker {
	public void work() {
		// working much more....
	}
}


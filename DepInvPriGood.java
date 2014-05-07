/**
* Dependency Iversion Principle -- Good example
* Source: www.oodesign.com
* Design Pattern: Template Design Pattern
*/

interface IWorker {
	public void work();
}

class Worker implements IWorker {
	public void work() {

	}
}

class SuperWorker implements IWorker {
	public void work() {

	}
}

class Manager {
	IWorker worker;

	public void setWorker(IWorker w) {
		worker = w;
	}

	public void manage() {
		worker.work();
	}
}
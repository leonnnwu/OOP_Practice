/**
* Interface Segreation Principle (Good example)
* Source: www.oodesign.com
*
*/

interface IWorker extends IFeedable, IWorkerable {

}

interface IWorkerable {
	public void work();
}

interface IFeedable {
	public void eat();
}

class Worker implements IWorkerable, IFeedable  {
	public void work() {
		// work ....
	}

	public void eat() {
		// eat ....
	}
}

class Robot implements IWorkerable {
	public void work() {
		// work ...
	}
}

class SuperWorker implements IWorkerable, IFeedable {
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
		IWorker = w;
	}

	public void manage() {
		worker.work();
	}
}
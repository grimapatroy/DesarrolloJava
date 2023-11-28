package src.masterEscuelaIT.java.modulo1.ListaAcotadaYNoAcotada;

class UnboundedStack {

	private Node entrance;

	public UnboundedStack() {
		this.entrance = null;
	}

	public void add(Interval element) {assert element != null;

		this.entrance = new Node(element, this.entrance);
	}

	public boolean isEmpty() {
		return this.entrance == null;
	}

	public Interval remove() {
		assert !this.isEmpty();

		Interval element = entrance.getElement();
		entrance = entrance.getNext();
		return element;
	}

	public Interval[] getElements() {
		int size = 0;
		Node node = this.entrance;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		Interval[] elements = new Interval[size];
		node = this.entrance;
		for(int position = 0; position < size; position++){
			elements[position] = node.getElement();
			node = node.getNext();
		}
		return elements;
	}

//	Esto es iterativo
	public void writln(String title){
		Console console = new Console();
		console.writeln(title);
//		referencia que me poermite ir apuntando a cada uno de los nodos, para recorrer la lista dinamica
		Node current = this.entrance;
		int position = 0;
		while (current != null){
			console.writeln((position+1)+" " + current.getElement());
			current = current.getNext();
		}
	}
}

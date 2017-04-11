package utn.frd.action;

import utn.frd.bean.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

/* todos los actions de struts2 tienen que heredar de ActionSupport */
public class HelloWorldAction extends ActionSupport {
	/* este campo es requerido por un tema de serializaci�n */
	private static final long serialVersionUID = 1L;

	/* este es el campo del Action que va a ser visible en el JSP */
	private MessageStore messageStore;

	/* metodo que se ejecuta en la acci�n "hello" definida en el struts.xml */
	public String execute() throws Exception {
		//creo una instancia del objeto MessageStore
		messageStore = new MessageStore();
		
		//devuelvo la constante SUCCESS (esta viene heredada de la clase ActionSupport)
		//tambi�n hay otras constantes como ERROR, INPUT o LOGIN
		return SUCCESS;
	}

	/* Getters y Setters de los campos que ser�n visibles en el JSP */
	public MessageStore getMessageStore() {
		return messageStore;
	}
	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
}

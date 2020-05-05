package test.data_structures;

import static org.junit.Assert.assertEquals;

import model.data_structures.Queue;

import org.junit.Before;
import org.junit.Test;


public class TestQueue 
{
	private Queue<String> cola;
	private String elemento1;
	private String elemento2;
	private String elemento3;
	private Integer tama�o;

	@Before
	public void setUp1()
	{
		tama�o = 0;
		elemento1 = "Numero 1";
		elemento2 = "Nuemro 2";
		elemento3 = "Numero 3";

		cola = new Queue<String>();
	}

	@Test
	public void QueueTest()
	{
		assertEquals( "El tama�o de la cola no es correcto.", cola.getSize() , tama�o);
		assertEquals("No deberia estar vacia", cola.isEmpty(), true );
		assertEquals("Ese no es el primer elemeto", cola.getElement(), null);
	}

	@Test
	public void testeEnqueue()
	{
		setUp1();

		cola.enqueue(elemento2);
		tama�o = 1;
		assertEquals(cola.getSize(), tama�o);

		cola.enqueue(elemento3);
		tama�o = 2;
		assertEquals(cola.getSize(), tama�o);
		
		setUp1();
		
		cola.enqueue(elemento1);
		tama�o = 1;
		assertEquals(cola.getSize(), tama�o);
		
	}

	@Test
	public void testDequeue()
	{
		setUp1();
		tama�o = 0;

		assertEquals( "El tama�o de la cola no es correcto.", cola.getSize() , tama�o);

		cola.enqueue(elemento1);
		cola.enqueue(elemento2);
		cola.enqueue(elemento3);
		tama�o = 3;

		assertEquals( "El tama�o de la cola no es correcto.", cola.getSize() , tama�o);

		String momento = cola.dequeue();
		assertEquals(momento, elemento1);

		momento = cola.dequeue();
		assertEquals(momento, elemento2);

		momento = cola.dequeue();
		assertEquals(momento, elemento3);

		tama�o = 0;
		assertEquals(cola.isEmpty(), true);
		assertEquals(cola.getSize(), tama�o);	
	}

	@Test
	public void testGetSize()
	{
		setUp1();

		tama�o = 0;
		assertEquals(cola.getSize(), tama�o);

		cola.enqueue(elemento2);
		tama�o = 1;
		assertEquals(cola.getSize(), tama�o);

		cola.enqueue(elemento3);
		tama�o = 2;
		assertEquals(cola.getSize(), tama�o);

		for(int i = 0; i<1000; i++)
		{
			cola.enqueue(i+"");
		}
		tama�o = 2 + 1000;
		assertEquals(cola.getSize(), tama�o);		
	}

	@Test
	public void testIsEmpty()
	{
		setUp1();

		assertEquals(cola.getSize(), tama�o);	
		assertEquals(cola.isEmpty(), true);	
	}

	@Test
	public void testGetElement()
	{
		setUp1();
		
		assertEquals(cola.getElement(), null);
		assertEquals(cola.isEmpty(), true);	
		
		for(int i = 0; i<1000; i++)
		{
			cola.enqueue(i+"");
		}
		assertEquals(cola.getElement(), "0");
		
		for(int i = 0; i<500; i++)
		{
			cola.dequeue();
		}
		assertEquals(cola.getElement(), "500");
	}

}

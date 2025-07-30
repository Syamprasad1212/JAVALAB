class DataPri
{
	byte byteVar;
	short shortVar;
	long longVar;
	int intVar;
	float floatVar;
	boolean boolVar;
	double doubleVar;
	char charVar;
	void getdefaultvalues()
	{
		System.out.println("Byte default:"+byteVar);
		System.out.println("short default:"+shortVar);
		System.out.println("int default:"+intVar);
		System.out.println("long default:"+longVar);
		System.out.println("float default:"+floatVar);
		System.out.println("double default:"+doubleVar);
		System.out.println("char default:"+charVar);
		System.out.println("Boolean default:"+boolVar);
	}
}

class Defaultvalues
{
	public static void main(String[] args)
	{
		DataPri p=new DataPri();
		p.getdefaultvalues();
	}
}

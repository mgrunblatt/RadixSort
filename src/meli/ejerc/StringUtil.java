package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n) {
		String cadena="";

		for (int i =0; i<n;i++){
			cadena +=c;
		}
		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String cadena=s;
		cadena=replicate(c,n-s.length())+cadena;

		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y sucedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "500"
	public static String rpad(String s, int n, char c)
	{
		String cadena=s;
		cadena=cadena+replicate(c,n-s.length());

		return cadena;
	}

	//Retorna una cadena indentica a s pero sin espacios a la izquierda.
	public static String ltrim(String s)
	{
		boolean band = false;
		int posicion = 0;
		while (band == false && s.length() > posicion)
		{
			if(s.charAt(posicion) != ' ')
			{
				band = true;
			}else {
				posicion++;
			}
		}


		return band ? s.substring(posicion, s.length()) : s;
	}

	//Retorna una cadena indentica a s pero sin espacios a la derecha.
	public static String rtrim(String s)
	{
		boolean band = false;
		int posicion = s.length()-1;
		while (band == false && 0 < posicion)
		{
			if(s.charAt(posicion) != ' ')
			{
				band = true;
			}else {
				posicion--;
			}
		}


		return band ? s.substring(0, posicion+1) : s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String stringArray[]=new String[arr.length];
		for (int i=0; i<arr.length;i++){

			stringArray[i]=new String(""+arr[i]);
		}
		return stringArray;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int intArray[]=new int[arr.length];
		for (int i=0; i<arr.length;i++){

			intArray[i]= Integer.parseInt(arr[i]);
		}
		return intArray;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int numMax=0;
		for (int i=0; i<arr.length;i++){
			if(arr[i].length()>numMax){
				numMax=arr[i].length();
			}
		}
		return numMax;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int longituMax=maxLength(arr);

		for (int i=0; i<arr.length;i++){
			arr[i]=lpad(arr[i],longituMax,c);
		}
	}


}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Data{
	
	private String name;

	public Data(String name) {
		this.name = name;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}
	
}





public class LambdaDemo2 {

	public static void main(String[] args) {
	
			List<Data> list = new ArrayList<>();
		list.add(new Data("Shailesh"));
		list.add(new Data("Ajay"));
		list.add(new Data("Ganesh"));
		list.add(new Data("Sachin"));
		list.add(new Data("Sanket"));
		
		Collections.sort(list,(Data d1,Data d2)-> d1.getName().compareTo(d2.getName()));
		
		for(Data data:list)
			System.out.println(data.getName());
		
	}

}

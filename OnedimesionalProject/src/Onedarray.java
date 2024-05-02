
public class Onedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {100,105,108,205,206};
for(int i = 0;i<a.length;i++) {  // 1d array
	System.out.println(a[3]);
}

int b[][] = {{20,30,40,50},{10,25,35,45}};
for(int i=0;i<2;i++) {   // 2d array
	for(int j=0;j<5;j++) {
		System.out.println(b[i][j]);
	}
}

	}

}

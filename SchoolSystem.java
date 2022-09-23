import java.util.ArrayList;

public class SchoolSystem  implements ISignUp{

	public static void main(String[] args) throws Exception {
		SchoolSystem schoolSystem = new SchoolSystem (1, 1, 0); // 初始化有1个大班名额，1个中班名额，0个小班名额
		schoolSystem. addStudent (1); // 返回 true ，因为有 1 个剩余的大班名额
		schoolSystem. addStudent (2); // 返回 true ，因为有 1 个剩余的中班名额
		schoolSystem. addStudent (3); // 返回 false ，因为没有剩余的小班名额
		schoolSystem. addStudent (1); // 返回 false ，因为没有剩余的大班名额，唯一1个大班名额已经被占据了

		IParams params =ISignUp.parse();
		SchoolSystem sc = new SchoolSystem (params.getBig(),params.getMedium(),params.getSmall());
		ArrayList<Integer> plan = params. getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
            sc. addStudent (plan.get(i));
        }
        sc.print();
    }


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addStudent(int stuType) {
		// TODO Auto-generated method stub
		return false;
	}

}

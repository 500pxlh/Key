import java.util.ArrayList;

public class SchoolSystem  implements ISignUp{

	public static void main(String[] args) throws Exception {
		SchoolSystem schoolSystem = new SchoolSystem (1, 1, 0); // ��ʼ����1��������1���а����0��С������
		schoolSystem. addStudent (1); // ���� true ����Ϊ�� 1 ��ʣ��Ĵ������
		schoolSystem. addStudent (2); // ���� true ����Ϊ�� 1 ��ʣ����а�����
		schoolSystem. addStudent (3); // ���� false ����Ϊû��ʣ���С������
		schoolSystem. addStudent (1); // ���� false ����Ϊû��ʣ��Ĵ�����Ψһ1����������Ѿ���ռ����

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

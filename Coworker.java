�������� ����� ��� ������ ������ � ���������  (����: �������, ���, ��������, ���� ��������, ���, �����������, ����� ��������� �� �����������, ������� ��������� �������� ��������, ���� ����������� �� ������, �������� �����).

public class Coworker {

enum Salary { BAD, AVG, GOOD, PERFECT }

        private String surname;
	private String name;
	private String secondName;
	private String dateOfBirth;
	private boolean sex;
	private String education;
	private int certificateId;
	private String university
	private String dateOfJobStart;
	private String homeAddress;

	// construsctor here
	// getters here
	// setters here

@Override
	public boolean equals(Coworker c) {
		if (this == c)
			return true;
		if (c == null)
			return false;
		
	}
@Override
	public int hashCode() {
		return certificateId;
	}
}
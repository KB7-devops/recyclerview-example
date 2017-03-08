package fr.esilv.recyclerviewexample.students.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.students.models.Student;

public class StudentViewHolder extends RecyclerView.ViewHolder {

	private TextView firstName;
	private TextView lastName;

	public StudentViewHolder(View itemView) {
		super(itemView);
		firstName = (TextView) itemView.findViewById(R.id.firstName);
		lastName = (TextView) itemView.findViewById(R.id.lastName);
	}

	public void bind(Student student) {
		firstName.setText(student.getFirstName());
		lastName.setText(student.getLastName());
	}
}

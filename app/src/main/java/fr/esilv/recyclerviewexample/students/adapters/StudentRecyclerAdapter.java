package fr.esilv.recyclerviewexample.students.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.students.models.Student;
import fr.esilv.recyclerviewexample.students.viewholders.StudentViewHolder;

public class StudentRecyclerAdapter extends RecyclerView.Adapter<StudentViewHolder> {
	private final List<Student> students;

	public StudentRecyclerAdapter(List<Student> students) {
		this.students = students;
	}

	@Override
	public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		return new StudentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_student, parent, false));
	}

	@Override
	public void onBindViewHolder(StudentViewHolder holder, int position) {
		holder.bind(students.get(position));
	}

	@Override
	public int getItemCount() {
		return students != null ? students.size() : 0;
	}
}

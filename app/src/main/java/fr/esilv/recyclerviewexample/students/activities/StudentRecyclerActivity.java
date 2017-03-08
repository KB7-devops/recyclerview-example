package fr.esilv.recyclerviewexample.students.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fr.esilv.recyclerviewexample.R;
import fr.esilv.recyclerviewexample.students.adapters.StudentRecyclerAdapter;
import fr.esilv.recyclerviewexample.students.models.Student;

public class StudentRecyclerActivity extends AppCompatActivity {

	private RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initializeRecyclerView();
		initializeAdapter();
	}

	private void initializeRecyclerView() {
		recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
	}

	private void initializeAdapter() {
		StudentRecyclerAdapter adapter = new StudentRecyclerAdapter(generateStudents(36));
		recyclerView.setAdapter(adapter);
	}

	private List<Student> generateStudents(int size) {
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			Student student = new Student("FirstName " + i, "LastName " + i);
			students.add(student);
		}
		return students;
	}
}

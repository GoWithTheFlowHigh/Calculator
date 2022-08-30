import com.kata.calculator.expression_printer.ExpressionPrinter;
import com.kata.calculator.expression_reader.ExpressionReader;
import com.kata.calculator.expression_solver.ExpressionSolver;
import com.kata.calculator.model.Expression;

public class Calculator {
	private final ExpressionReader reader;
	private final ExpressionSolver solver;
	private final ExpressionPrinter printer;

	public Calculator(ExpressionReader reader, ExpressionSolver solver, ExpressionPrinter printer) {
		this.reader = reader;
		this.solver = solver;
		this.printer = printer;
	}

	public void calculate() {
		try {
			Expression expression = reader.read();
			solver.solve(expression);
			printer.print(expression);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}
}

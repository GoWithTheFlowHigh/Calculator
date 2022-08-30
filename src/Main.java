import com.kata.calculator.expression_printer.ExpressionPrinter;
import com.kata.calculator.expression_printer.ExpressionPrinterImpl;
import com.kata.calculator.expression_reader.ExpressionReader;
import com.kata.calculator.expression_reader.OperandExpressionReader;
import com.kata.calculator.expression_solver.ExpressionSolver;
import com.kata.calculator.expression_solver.OperandExpressionSolver;
import com.kata.calculator.number_handler.NumberHandler;
import com.kata.calculator.number_handler.RomanNumberHandler;

public class Main {

	public static void main(String[] args) {
		NumberHandler handler = new RomanNumberHandler();
        ExpressionReader reader = new OperandExpressionReader(handler);
        ExpressionSolver solver = new OperandExpressionSolver();
        ExpressionPrinter printer = new ExpressionPrinterImpl(handler);
        Calculator calculator = new Calculator(reader, solver, printer);
        calculator.calculate();

	}

}

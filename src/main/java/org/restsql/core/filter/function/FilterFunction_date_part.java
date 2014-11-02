package org.restsql.core.filter.function;

import static org.geotools.filter.capability.FunctionNameImpl.parameter;

import java.sql.Timestamp;
import java.util.List;

import org.geotools.filter.FunctionExpressionImpl;
import org.geotools.filter.capability.FunctionNameImpl;
import org.opengis.feature.type.Name;
import org.opengis.filter.capability.FunctionName;
import org.opengis.filter.expression.Expression;
import org.opengis.filter.expression.Literal;

public class FilterFunction_date_part extends FunctionExpressionImpl {

	public static FunctionName NAME = new FunctionNameImpl("date_part",
			Integer.class, parameter("text", String.class), parameter(
					"timestamp", Timestamp.class));

	public FilterFunction_date_part() {
		super(NAME);
	}

	public FilterFunction_date_part(Name name, List<Expression> args,
			Literal fallback) {

		super(NAME);
		this.setFallbackValue(fallback);
		this.setParameters(args);

	}
}

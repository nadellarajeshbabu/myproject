package userDefinedException;

import java.util.Arrays;

public class EmployeeDetailsException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "UserDefinedException.EmployeeDetailsException : DetailsNotMatching Enter as per requirement";
		
	}
}

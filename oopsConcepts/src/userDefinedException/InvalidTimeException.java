package userDefinedException;

public class InvalidTimeException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "UserDefinedException.InvalidTimeException : This time is out of hour[0-23] min[0-59] sec[0-59]";
	}
}

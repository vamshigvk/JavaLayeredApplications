package com.capgemini.doctors.exceptions;

public class QASExceptions extends Exception
{
	//generating exceptions using source
	public QASExceptions() 
	{
		super();
	}

	public QASExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public QASExceptions(String message, Throwable cause)
	{
		super(message, cause);
	}

	public QASExceptions(String message) 
	{
		super(message);
	}

	public QASExceptions(Throwable cause) 
	{
		super(cause);
	}

}

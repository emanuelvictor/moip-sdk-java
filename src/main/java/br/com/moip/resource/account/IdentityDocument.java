package br.com.moip.resource.account;

import lombok.Data;

/**
 * Created by Emanuel Victor on 25/07/17.
 */
@Data
public class IdentityDocument
{
	private static final String DEFAULT_IDENTITY_DOCUMENT = "RG";
	private String type = DEFAULT_IDENTITY_DOCUMENT;
	private String number;

	public IdentityDocument()
	{
	}

	public IdentityDocument( String number )
	{
		this.number = number;
	}
}

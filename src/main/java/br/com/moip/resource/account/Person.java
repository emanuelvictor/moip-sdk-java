package br.com.moip.resource.account;

import br.com.moip.resource.Phone;
import br.com.moip.resource.ShippingAddress;
import br.com.moip.resource.TaxDocument;
import lombok.Data;

/**
 * Created by Emanuel Victor on 25/07/17.
 */
@Data
public class Person
{
	private String name;
	private String lastName;
	private TaxDocument taxDocument;
	private String birthDate;
	private IdentityDocument identityDocument;
	private Phone phone;

	private ShippingAddress address;

	public Person()
	{
	}

	public Person( String name, String lastName, TaxDocument taxDocument, String birthDate, IdentityDocument identityDocument, Phone phone, ShippingAddress address )
	{
		this.name = name;
		this.lastName = lastName;
		this.taxDocument = taxDocument;
		this.birthDate = birthDate;
		this.identityDocument = identityDocument;
		this.phone = phone;
		this.address = address;
	}
}

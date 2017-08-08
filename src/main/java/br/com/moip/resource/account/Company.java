package br.com.moip.resource.account;

import br.com.moip.resource.Phone;
import br.com.moip.resource.ShippingAddress;
import br.com.moip.resource.TaxDocument;
import lombok.Data;

/**
 * Created by Emanuel Victor on 25/07/17.
 */
@Data
public class Company
{
	private String name;
	private String businessName;
	private TaxDocument taxDocument;
	private Phone phone;
	private ShippingAddress address;

	public Company()
	{
		this.taxDocument = new TaxDocument();
		this.taxDocument.setType( TaxDocument.Type.CNPJ );
	}
}

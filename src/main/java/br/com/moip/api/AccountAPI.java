package br.com.moip.api;

import br.com.moip.Client;
import br.com.moip.request.AccountRequest;
import br.com.moip.resource.account.Account;

public class AccountAPI
{
	private final Client client;

	public AccountAPI( final Client client )
	{
		this.client = client;
	}

	public Account get()
	{
		return client.get( "/v2/accounts", Account.class );
	}

	public Account create( final AccountRequest account )
	{
		return client.post( "v2/accounts", account, Account.class );
	}
}

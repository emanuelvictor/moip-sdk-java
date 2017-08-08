package br.com.moip.request;

import br.com.moip.resource.account.Account;
import br.com.moip.resource.account.Company;
import br.com.moip.resource.account.Person;
import br.com.moip.resource.account.TypeAccount;
import lombok.Data;

@Data
public class AccountRequest
{
	private String id;

	private boolean transparentAccount = true;

	private String accessToken;

	private Account.Email email;

	private Person person;

	private TypeAccount typeAccount = TypeAccount.MERCHANT;

	private Company company;

	public AccountRequest transparentAccount( final boolean transparentAccount )
	{
		this.transparentAccount = transparentAccount;
		return this;
	}

	public AccountRequest id( final String id )
	{
		this.id = id;
		return this;
	}

	public AccountRequest accessToken( final String accessToken )
	{
		this.accessToken = accessToken;
		return this;
	}

	public AccountRequest typeAccount( final TypeAccount typeAccount )
	{
		this.typeAccount = typeAccount;
		return this;
	}

	public AccountRequest email( final Account.Email email )
	{
		this.email = email;
		return this;
	}

	public AccountRequest person( final Person person )
	{
		this.person = person;
		return this;
	}

	public AccountRequest company( final Company company )
	{
		this.company = company;
		return this;
	}


}

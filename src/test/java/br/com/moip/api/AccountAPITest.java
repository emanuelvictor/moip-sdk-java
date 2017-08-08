package br.com.moip.api;

import br.com.moip.request.AccountRequest;
import br.com.moip.request.CreditCardRequest;
import br.com.moip.request.FundingInstrumentRequest;
import br.com.moip.request.HolderRequest;
import br.com.moip.request.PhoneRequest;
import br.com.moip.request.TaxDocumentRequest;
import br.com.moip.resource.account.Account;
import com.rodrigosaito.mockwebserver.player.Play;
import com.rodrigosaito.mockwebserver.player.Player;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountAPITest
{

	@Rule
	public Player player = new Player();

	private AccountAPI api;

	@Before
	public void setUp()
	{
		ClientFactory clientFactory = new ClientFactory();

		api = new AccountAPI( clientFactory.client( player.getURL( "" ).toString() ) );
	}

	@Play("accounts/get")
	@Test
	public void doReturnAccount()
	{
		Account account = api.get();

		assertEquals( "MPA-AE2OAL41CBB1", account.getId() );
		assertEquals( "iori@labs.moip.com.br", account.getLogin() );
		assertEquals( "iorilabsmoip", account.getSoftDescriptor() );
		assertEquals( "iori@labs.moip.com.br", account.getEmail().getAddress() );
		assertEquals( false, account.isTransparentAccount() );
	}

	@Play("accounts/create")
	@Test
	public void doCreateAccount()
	{
//		Account createdAccount= api.create(
//				new AccountRequest()
//						.transparentAccount( true )
//						.
//						.fundingInstrument(
//								new FundingInstrumentRequest()
//										.creditCard(
//												new CreditCardRequest()
//														.hash( CC_HASH )
//														.holder(
//																new HolderRequest()
//																		.fullname( "Jose Portador da Silva" )
//																		.birthdate( "1988-10-10" )
//																		.phone(
//																				new PhoneRequest()
//																						.setAreaCode( "11" )
//																						.setNumber( "55667788" )
//																		)
//																		.taxDocument( TaxDocumentRequest.cpf( "22222222222" ) )
//														)
//										)
//						)
//		);
//
//		assertTrue( createdAccount.getId().startsWith( "PAY-KY4QPKGHZAC4" ) );
	}
}
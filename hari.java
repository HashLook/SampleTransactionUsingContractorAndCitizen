public HederaTransactionResult create(
	long realmNum, //realmNum for the new account
	byte[] publickey,
	long intialBalance,
	HederaAccountCreateDefaults defaults 
)

//examplesUtilities.java is used to retrive the details of the transferring account to the transferred account

//setup a default query and transacrtions

HederaTransactionAndQueryDefaults txQueryDefaults=new HederaTransactionAndQueryDefaults();

txQueryDefaults = ExamplesUtilities.getTxQueryDefaults();

//TO create a hedera account link it to the createad account using HederaAccount

HedereaAccount contractor= new HederaAccount();

//link it to the transaction defaults

contractor.txQueryDefaults = txQueryDefaults;

//Create  public and private keys to the genereted account

contractor.txQueryDefaults.generetedRecord = false ;
HederaCryptoKeyPair contractor = new HederaCryptoKeyPair(KeyType.ED25519)

//populate the contractors account with hbars

account1 = AccountCreate.create(account1, account1Key, 100000);

// to retrieve the balance of a given account

long balance1= contractor.getBalance();

//TO tranasfer h bars Bw accounts 

//create a second account 

HederaAccount citizen = new HederaAccount();

//intilize the default values 

citizen.txQueryDefaults = txQueryDefaults;

//create public and private keys 

citizen.txQueryDefaults.generetedRecord = false ;

//now we have to transfer hbars from contractor to the citizen

// populate the getTxQueryDefaults to the necessary values 

contractor.txQueryDefaults.payingAccountID = contractor.getHederaAccountID();
contractor.txQueryDefaults.payingKeyPair = contractorKey;

//send hbars from contractor to the citizen

AccountSend.send(contractor,citizen,10000);


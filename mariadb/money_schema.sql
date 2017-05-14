USE money;

CREATE TABLE IF NOT EXISTS categories (
	id INT UNSIGNED AUTO_INCREMENT, 
	category_name VARCHAR(40), 
	PRIMARY KEY (id) 
);


CREATE TABLE IF NOT EXISTS income ( 
    paycheck_id INT UNSIGNED AUTO_INCREMENT , 
    company_name VARCHAR(80),
    ammount DECIMAL(10,2),
    before_deductions_paycheck DECIMAL(10,2),
    pay_range_start DATE,
    pay_range_end DATE,
    fk_person_id INT, 
    PRIMARY KEY (paycheck_id)
);

CREATE TABLE IF NOT EXISTS expenses (
	purchase_id BIGINT UNSIGNED AUTO_INCREMENT,
	item_name VARCHAR(160),
	secondary_name VARCHAR(320),
	cost DECIMAL(10,2),
	purchase_date DATE,
	fk_payment_type_id INT,
	fk_categories_id INT,
	fk_person_id INT,
	PRIMARY KEY (purchase_id)

); 

CREATE TABLE IF NOT EXISTS person (
	person_id INT UNSIGNED AUTO_INCREMENT,
	name VARCHAR(40),
	active BOOLEAN,
	PRIMARY KEY (person_id)
);

CREATE TABLE IF NOT EXISTS payment_type (
	payment_type_id INT UNSIGNED AUTO_INCREMENT,
	payment_type_name VARCHAR(40),
	fk_account_id INT,
	PRIMARY KEY (payment_type_id)
);

CREATE TABLE IF NOT EXISTS accounts (
	primary_key_account INT UNSIGNED AUTO_INCREMENT,
	account_id INT,
	bank_name VARCHAR(80),
	PRIMARY KEY (primary_key_account)
);
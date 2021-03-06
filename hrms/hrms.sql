create table users(
	id integer generated by default as identity  (increment 1 start 1 maxvalue 214783647 cache 1),
	email character varying(100) Not Null,
	password character varying(20) not null,
	CONSTRAINT pk_users primary key(id),
	CONSTRAINT uk_users_email Unique(email)
);

Create table employees(
	id int not null,
	first_name character varying(25) not null,
	last_name character varying(25) not null,
	CONSTRAINT pk_employees primary key(id),
	CONSTRAINT fk_employees_users foreign key(id) references users(id)
);

Create table candidates(
	id int not null,
	first_name character varying(25) not null,
	last_name character varying(25) not null,
	identity_number character varying(11) not null,
	birth_of_year int not null,
	CONSTRAINT pk_candidates primary key(id),
	CONSTRAINT fk_candidates_users foreign key(id) references users(id),
	CONSTRAINT uk_candidates_dentity_number unique(identity_number)
);


create table employers(
	id int not null,
	company_name character varying(100) not null,
	web_adress character varying(50) not null,
	phone_number character varying(12) not null,
	CONSTRAINT pk_employers primary key(id),
	CONSTRAINT fk_employers_users foreign key(id) references users(id)
);

create table verification_codes(
	id int not null,
	code character varying(38) not null,
	is_verified boolean not null,
	verified_date Date,
	CONSTRAINT pk_verification_codes primary key (id),
	CONSTRAINT uk_verification_codes_code unique(code)
);

create table verification_code_candidates(
	id int not null,
	candidate_id int not null,
	CONSTRAINT pk_verification_code_candidates primary key(id),
	CONSTRAINT fk_verification_code_candidates_verification_codes foreign key(id) references verification_codes(id),
	CONSTRAINT fk_verification_code_candidates_candidates foreign key(candidate_id) references users(id)
);

create table verification_code_employers(
	id int not null,
	employer_id int not null,
	CONSTRAINT pk_verification_code_employers primary key(id),
	CONSTRAINT fk_verification_code_employers_verification_codes foreign key(id) references verification_codes(id),
	CONSTRAINT fk_verification_code_employers_employers foreign key(employer_id) references employers(id)
);

create table employee_confirms(
	id int generated by default as identity  (increment 1 start 1 maxvalue 214783647 cache 1), 
	employee_id int not null,
	is_confirmed boolean not null,
	confirm_date Date,
	CONSTRAINT pk_employee_confirms primary key(id),
	CONSTRAINT fk_employee_confirms_employee_id foreign key(employee_id) references employers(id)
);

create table employee_confirm_employers(
	id int not null,
	employer_id int not null,
	CONSTRAINT pk_employee_confirm_employers primary key(id),
	CONSTRAINT fk_employee_confirm_employers_employee_confirms foreign key(id) references employee_confirms(id),
	CONSTRAINT fk_employee_confirm_employers_employers foreign key(employer_id) references employers(id)
);

create table job_titles(
	id integer generated by default as identity  (increment 1 start 1 maxvalue 214783647 cache 1),
	title character varying(50),
	CONSTRAINT pk_job_titles primary key(id),
	CONSTRAINT uk_job_titles_title unique(title)
);
}

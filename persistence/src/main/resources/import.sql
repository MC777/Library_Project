INSERT INTO AUTHOR (first_name, last_name) VALUES ('Czeslaw', 'Milosz');
INSERT INTO AUTHOR (first_name, last_name) VALUES ('Witold', 'Gombrowicz');
INSERT INTO AUTHOR (first_name, last_name) VALUES ('Adam', 'Mickiewicz');
INSERT INTO AUTHOR (first_name, last_name) VALUES ('Henryk', 'Sienkiewicz');

INSERT INTO BORROWER_DETAILS (borrower_home_address, borrower_phone_number, borrower_email) VALUES ('Prosta 2, Warszawa', '234567895', 'andrzej.kowal@gmail.com');
INSERT INTO BORROWER_DETAILS (borrower_home_address, borrower_phone_number, borrower_email) VALUES ('Slowackiego 5, Krakow', '234567895', 'julia.m123@op.pl');

INSERT INTO BORROWER (borrower_first_name, borrower_last_name, borrower_details) VALUES ('Andrzej', 'Kowalczyk', 1);
INSERT INTO BORROWER (borrower_first_name, borrower_last_name, borrower_details) VALUES ('Julia', 'Malinowska', 2);
INSERT INTO BORROWER (borrower_first_name, borrower_last_name, borrower_details) VALUES ('Stefan', 'Was', null);
INSERT INTO BORROWER (borrower_first_name, borrower_last_name, borrower_details) VALUES ('Maria', 'Raczkowska', null);

INSERT INTO BOOK(book_type, is_borrow, isbn, pages, release_date, summary, title, author_id) VALUES ('FANTASY', FALSE,'2364576896573', 345, '1994-01-01', 'A brilliant, semiautobiographical satirical novel from one of the foremost figures in twentieth-century Polish literature.', 'Trans-Atlantyk', 1);
INSERT INTO BOOK(book_type, is_borrow, isbn, pages, release_date, summary, title, author_id) VALUES ('HISTORY', FALSE,'2864576896573', 245, '1994-01-01', 'The article is an attempt at accounting for the apparent differences in meaning between the Polish word umysł and its English dictionary equivalent.', 'Zniewolony Umysl', 1);
INSERT INTO BOOK(book_type, is_borrow, isbn, pages, release_date, summary, title, author_id) VALUES ('HISTORY', FALSE,'3164576896522', 567, '1971-06-01', 'In this bitterly funny novel by the renowned Polish author Witold Gombrowicz. a writer finds himself tossed into a chaotic world of schoolboys by a diabolical professor who wishes to reduce him to childishness. Originally published in Poland in 1937.', 'Ferdydurke', 2);
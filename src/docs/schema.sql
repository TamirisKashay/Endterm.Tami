CREATE TABLE IF NOT EXISTS authors (
                                       id SERIAL PRIMARY KEY,
                                       name VARCHAR(100) NOT NULL,
    nationality VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS books (
                                     id SERIAL PRIMARY KEY,
                                     title VARCHAR(255) NOT NULL,
    author_id INT REFERENCES authors(id),
    book_type VARCHAR(50),
    price DECIMAL(10, 2)
    );

INSERT INTO authors (name, nationality) VALUES ('George Orwell', 'British');
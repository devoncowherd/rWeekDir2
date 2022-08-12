# Notes W3D4

### Indexes

- `CREATE INDEX <index_name> ON <table_name>(name);`
- `DROP INDEX <index_name> ON <table_name>;`
- `SHOW INDEXES;`
- Cardinality 
    - gives estimated number of unique values
- Sub_part
    - prefix of an index
- Null
    - it contains blank of the column does not have null value, otherwise it returns true
- index_type: contains the name of an indexed method like BTREE, HASH, FULLTEXT, etc.
- comment
    - contains index information where not described
- visible
    - contains yes sif the index is visisble to query optimizer otherwise no
-  expression
    - contains some expression

### Types of Indexes

- unique
    - indexing is a process to find an ordered list into an ordered list that allows fast retrieval of records
    - creates value for each in a given column
    - `create unique index <index_name> on <table_name>(col1,col2);`
- clustered
- non-clustered
# Workshop 23
## ER diagrams
- 1 to 1 Relationship eg Users , User details
- 1 to Many Relationship eg Authors, Books
- Many to Many Relationship eg Students and Courses
	- each student can have multiple courses
	- each course can have multiple students 
- How do we relate tables to each other? Via **Foreign keys**
## Primary, Foreign keys

- Primary key of one table is the foreign key of another table
- Referential Integrity
	- ensure that a record cannot be deleted if a foreign key references it
	- cannot insert values in a foreign key field if the primary field does not have that value
- For episodes to tv_shows
```
	primary key(ep_id),
	constraint fk_prog_id foreign key(show_id)
	references tv_shows(show_id)
	
```
## Joins
- Combine 2 or more tables > new table
	- used if there are some common fields
	- by default inner join used
- Left join, left side data is intact, right partial
```
select tv.name, tv.lang, ep.season, ep.episode, ep.title,
	from tv_shows as tv
	left join episodes as ep
	on tv.tv_id = ep.tv_id
	where tv.name like “%New%”
```
- can set behaviour *on delete , on update*
	- set null
	- restrict
	- cascade
## Views
- Temporary tables
	- computed when accessed, no data is stored
	- Can use to Aggregate results from a Join

## Normalization
- Framework to improve data integrity, eliminate redundancy
- Only have to update data once, easier to update information
### First Normal Form - No Repeating Groups
- All attributes must have a unique name
- If a user has multiple contacts, we must create a new entity for contacts (Atomicity)
- Make it easier to search for data
### Second Normal Form - Eliminate Redundant Data
- First Normal form achieved
- All attributes depend on the primary key
	- if it does not, then new table needs to be created so that the attributes are dependent on the primary key
### Third Normal Form - Eliminate Transistive Dependency
- Second Normal Form Achieved
- Non key columns must **ONLY** depend on primary key
	- if not, create new table
## Subqueries
- Nested Query
-  Inner query is a select statement
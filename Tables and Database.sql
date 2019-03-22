mysql> create database sharlin;
Query OK, 1 row affected (0.09 sec)

mysql> use sharlin;
Database changed
mysql> create table bank(bank_id varchar(20),bank_name varchar(20),bank_address varchar(30), primary key (bank_id));
Query OK, 0 rows affected (0.55 sec)


mysql> create table branch(branch_id varchar(20),bank_id varchar(20),branch_name varchar(20),branch_address varchar(30), primary key (branch_id),foreign key (bank_id) references bank(bank_id));
Query OK, 0 rows affected (0.94 sec)

mysql> create table clientmanager(manager_id varchar(20),bank_id varchar(20),cm_name varchar(20), primary key (manager_id),foreign key (bank_id) references bank(bank_id));
Query OK, 0 rows affected (0.85 sec)

mysql> create table account(account_id varchar(20),acc_date date,acc_type varchar(20),branch_id varchar(20),amount int,primary key (account_id),foreign key (branch_id) references branch(branch_id));
Query OK, 0 rows affected (0.63 sec)

mysql> create table client(client_id varchar(20),name varchar(20),c_address varchar(20),manager_id varchar(20),account_id varchar(20),c_phone varchar(20),pin varchar(20),primary key (client_id),foreign key (manager_id) references clientmanager(manager_id), foreign key (account_id) references account(account_id));
Query OK, 0 rows affected (0.81 sec)

mysql> show tables;
+-------------------+
| Tables_in_sharlin |
+-------------------+
| account           |
| bank              |
| branch            |
| client            |
| clientmanager     |
+-------------------+
5 rows in set (0.62 sec)

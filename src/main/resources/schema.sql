create table projects (
    id integer identity primary key,
    title varchar(36) not null,
    description varchar(150) not null,
    state varchar(12) not null,
    icon varchar(36)
);
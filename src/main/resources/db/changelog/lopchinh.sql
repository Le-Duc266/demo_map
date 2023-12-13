create table lop_chinh
(
    "id"         bigserial primary key,
    "code"       varchar(25),
    "name"       varchar(255),
    "company_id" BIGINT,
    "branch_id"  BIGINT,
    "created_at" TIMESTAMP,
    "updated_at" TIMESTAMP,
    "deleted_at" TIMESTAMP,
    "created_by" BIGINT,
    "updated_by" BIGINT,
    "deleted_by" BIGINT
);
alter sequence lop_chinh_id_seq increment by 50;

create table lop_2
(
    "id"           bigserial primary key,
    "code"         varchar(25),
    "name"         varchar(255),
    "lop_chinh_id" bigint references lop_chinh (id),
    "company_id"   BIGINT,
    "branch_id"    BIGINT,
    "created_at"   TIMESTAMP,
    "updated_at"   TIMESTAMP,
    "deleted_at"   TIMESTAMP,
    "created_by"   BIGINT,
    "updated_by"   BIGINT,
    "deleted_by"   BIGINT
);
alter sequence lop_2_id_seq increment by 50;

create table lop_3
(
    "id"         bigserial primary key,
    "code"       varchar(25),
    "name"       varchar(255),
    "lop_2_id"   bigint references lop_2 (id),
    "company_id" BIGINT,
    "branch_id"  BIGINT,
    "created_at" TIMESTAMP,
    "updated_at" TIMESTAMP,
    "deleted_at" TIMESTAMP,
    "created_by" BIGINT,
    "updated_by" BIGINT,
    "deleted_by" BIGINT
);
alter sequence lop_3_id_seq increment by 50;
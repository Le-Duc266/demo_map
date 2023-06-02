create table "color"
(
    "id"         bigserial primary key,
    "code"       varchar(25)  not null,
    "name"       varchar(255) not null,
    "company_id" BIGINT,
    "branch_id"  BIGINT,
    "created_at" TIMESTAMP,
    "updated_at" TIMESTAMP,
    "deleted_at" TIMESTAMP,
    "created_by" BIGINT,
    "updated_by" BIGINT,
    "deleted_by" BIGINT
);

alter sequence color_id_seq increment by 50;

create table "size"
(
    "id"         bigserial primary key,
    "code"       varchar(25)  not null,
    "name"       varchar(255) not null,
    "company_id" BIGINT,
    "branch_id"  BIGINT,
    "created_at" TIMESTAMP,
    "updated_at" TIMESTAMP,
    "deleted_at" TIMESTAMP,
    "created_by" BIGINT,
    "updated_by" BIGINT,
    "deleted_by" BIGINT
);

alter sequence size_id_seq increment by 50;

create table "shoe"
(
    "id"          bigserial PRIMARY KEY,
    "code"        varchar(25)  NOT NULL,
    "name"        varchar(255) NOT NULL,
    "image_url"   varchar(4095),
    "description" text,
    "activated"   boolean,
    "company_id"  bigint,
    "branch_id"   bigint,
    "created_at"  timestamp,
    "updated_at"  timestamp,
    "deleted_at"  timestamp,
    "created_by"  bigint,
    "updated_by"  bigint,
    "deleted_by"  bigint
);

alter sequence shoe_id_seq increment by 50;

create table "shoe_color_map"
(
    "id"         bigserial PRIMARY KEY,
    "shoe_id"    bigint references shoe (id),
    "color_id"   bigint references color (id),
    "created_at" timestamp,
    "updated_at" timestamp,
    "deleted_at" timestamp,
    "created_by" bigint,
    "updated_by" bigint,
    "deleted_by" bigint
);

alter sequence shoe_color_map_id_seq increment by 50;

create table "shoe_size_map"
(
    "id"         bigserial PRIMARY KEY,
    "shoe_id"    bigint references shoe (id),
    "size_id"    bigint references size (id),
    "created_at" timestamp,
    "updated_at" timestamp,
    "deleted_at" timestamp,
    "created_by" bigint,
    "updated_by" bigint,
    "deleted_by" bigint
);

alter sequence shoe_size_map_id_seq increment by 50;
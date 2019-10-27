CREATE TABLE comment
(
	id BIGINT auto_increment,
	parent_id BIGINT NOT NULL,
	type int NOT NULL,
	commentator int NOT NULL,
	gmt_create BIGINT NOT NULL,
	gmt_modified BIGINT NOT NULL,
	like_count BIGINT DEFAULT 0,
	constraint comment_pk
		primary key (id)
);
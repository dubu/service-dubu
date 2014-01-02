create table mz_profile_tournament_entry (
    battle_id int not null ,
    battle_rank int NOT NULL ,
    tournament_id int NOT NULL ,
    selected_mz_user_id int NOT NULL ,
    opened int NOT NULL ,
    regdttm date,
    pkey_regdttm varchar

);


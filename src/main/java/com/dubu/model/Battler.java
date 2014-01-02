package com.dubu.model;

import java.io.Serializable;

public class Battler extends BattlerKey  implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_profile_tournament_entry.tournament_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    private Integer tournamentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_profile_tournament_entry.selected_mz_user_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    private Integer selectedMzUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_profile_tournament_entry.opened
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    private Boolean opened;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mz_profile_tournament_entry.pkey_regdttm
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    private String pkeyRegdttm;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_profile_tournament_entry.tournament_id
     *
     * @return the value of mz_profile_tournament_entry.tournament_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public Integer getTournamentId() {
        return tournamentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_profile_tournament_entry.tournament_id
     *
     * @param tournamentId the value for mz_profile_tournament_entry.tournament_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_profile_tournament_entry.selected_mz_user_id
     *
     * @return the value of mz_profile_tournament_entry.selected_mz_user_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public Integer getSelectedMzUserId() {
        return selectedMzUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_profile_tournament_entry.selected_mz_user_id
     *
     * @param selectedMzUserId the value for mz_profile_tournament_entry.selected_mz_user_id
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public void setSelectedMzUserId(Integer selectedMzUserId) {
        this.selectedMzUserId = selectedMzUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_profile_tournament_entry.opened
     *
     * @return the value of mz_profile_tournament_entry.opened
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public Boolean getOpened() {
        return opened;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_profile_tournament_entry.opened
     *
     * @param opened the value for mz_profile_tournament_entry.opened
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mz_profile_tournament_entry.pkey_regdttm
     *
     * @return the value of mz_profile_tournament_entry.pkey_regdttm
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public String getPkeyRegdttm() {
        return pkeyRegdttm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mz_profile_tournament_entry.pkey_regdttm
     *
     * @param pkeyRegdttm the value for mz_profile_tournament_entry.pkey_regdttm
     *
     * @mbggenerated Tue Dec 24 17:24:28 KST 2013
     */
    public void setPkeyRegdttm(String pkeyRegdttm) {
        this.pkeyRegdttm = pkeyRegdttm == null ? null : pkeyRegdttm.trim();
    }
}
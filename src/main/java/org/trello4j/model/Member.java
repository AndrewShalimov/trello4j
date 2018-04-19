package org.trello4j.model;

import java.util.List;
import java.util.Objects;

/**
 * <code>
 * {
 * "id":"4e918355e52581aa44eb0754",
 * "avatarHash":"8880c87b91499ae0c4051bd1c7bcc4a7",
 * "fullName":"Joel Söderström",
 * "initials":"JS",
 * "status":"disconnected",
 * "url":"https://trello.com/joelsoderstrom",
 * "username":"joelsoderstrom",
 * "idOrganizations":[],
 * "idBoards":[]
 * }
 * </code>
 *
 * @author joel
 */
public class Member extends TrelloObject {

    public enum Status {
        disconnected,
        active,
        idle
    }

    private String avatarHash;

    private String fullName;

    private String initials;

    private Status status;

    private String url;

    private String username;

    private List<String> idOrganizations;

    private List<String> idBoards;


    public String getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getIdOrganizations() {
        return idOrganizations;
    }

    public void setIdOrganizations(List<String> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    public List<String> getIdBoards() {
        return idBoards;
    }

    public void setIdBoards(List<String> idBoards) {
        this.idBoards = idBoards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(avatarHash, member.avatarHash) &&
                Objects.equals(fullName, member.fullName) &&
                Objects.equals(initials, member.initials) &&
                status == member.status &&
                Objects.equals(url, member.url) &&
                Objects.equals(username, member.username) &&
                Objects.equals(idOrganizations, member.idOrganizations) &&
                Objects.equals(idBoards, member.idBoards);
    }

    @Override
    public int hashCode() {

        return Objects.hash(avatarHash, fullName, initials, status, url, username, idOrganizations, idBoards);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + getId() + '\'' +
                ", avatarHash='" + avatarHash + '\'' +
                ", fullName='" + fullName + '\'' +
                ", initials='" + initials + '\'' +
                ", status=" + status +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", idOrganizations=" + idOrganizations +
                ", idBoards=" + idBoards +
                '}';
    }
}

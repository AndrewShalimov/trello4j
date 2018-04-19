package org.trello4j.model;

import java.util.Objects;

public class Webhook extends TrelloObject {

    private String description;
    private String callbackURL;
    private String idModel;
    private Boolean active;

    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    public String getCallbackURL() {
        return callbackURL;
    }

    public void setCallbackURL(String callbackURL) {
        this.callbackURL = callbackURL;
    }

    public String getIdModel() {
        return idModel;
    }

    public void setIdModel(String idModel) {
        this.idModel = idModel;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Webhook webhook = (Webhook) o;
        return Objects.equals(description, webhook.description) &&
                Objects.equals(callbackURL, webhook.callbackURL) &&
                Objects.equals(idModel, webhook.idModel) &&
                Objects.equals(active, webhook.active);
    }

    @Override
    public int hashCode() {

        return Objects.hash(description, callbackURL, idModel, active);
    }

    @Override
    public String toString() {
        return "Webhook{" +
                "id='" + getId() + '\'' +
                ", description='" + description + '\'' +
                ", callbackURL='" + callbackURL + '\'' +
                ", idModel='" + idModel + '\'' +
                ", active=" + active +
                '}';
    }
}


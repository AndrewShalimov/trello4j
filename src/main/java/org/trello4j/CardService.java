package org.trello4j;

import com.google.gson.JsonElement;
import org.trello4j.model.*;
import org.trello4j.model.Card.Attachment;
import org.trello4j.model.Checklist.CheckItem;

import java.util.List;
import java.util.Map;

/**
 * The Interface CardService.
 *
 * @author
 */
public interface CardService {

    Card getCard(String cardId);

    List<Action> getActionsByCard(String cardId);

    List<Attachment> getAttachmentsByCard(String cardId);

    Board getBoardByCard(String cardId, String... filter);

    List<CheckItem> getCheckItemStatesByCard(String cardId);

    List<Checklist> getChecklistByCard(String cardId);

    org.trello4j.model.List getListByCard(String cardId, String... filter);

    List<Member> getMembersByCard(String cardId);

    /**
     * Add a new {@link Card} with the optional keyValue pairs.
     *
     * @param idList     Id of the {@link org.trello4j.model.List}
     *                   the card should be added to.
     * @param name       Name of the new card.
     * @param keyValeMap Map of the optional key-value-pairs.
     */
    Card createCard(String idList, String name, Map<String, String> keyValeMap);

    String getCustomFieldValue(String cardId, String customFieldId);

    JsonElement setCustomFieldValue(String idCard, CustomFieldItem customField, String value) throws TrelloException;

    JsonElement setCustomFieldValue(String idCard, String idCustomField, String value) throws TrelloException;

    List<CustomFieldItem> getCustomFields(String idCard);

    CustomFieldItem getCustomField(String idCard, String idCustomField);

}

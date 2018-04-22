package org.trello4j.model;

import java.util.List;

import static org.trello4j.TrelloImpl.isEmpty;

public class CustomFieldItem extends TrelloObject {

    private Value value;
    private String idCustomField;
    private String idValue;
    private List<Option> options;
    private String type;

    public enum Type {
        text,
        date,
        number,
        checkbox,
        list;

        public static String getVal(Type type) {
            if (checkbox.equals(type)) {
                return "checked";
            } else {
                return type.toString();
            }
        }

    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public String getIdCustomField() {
        return idCustomField;
    }

    public void setIdCustomField(String idCustomField) {
        this.idCustomField = idCustomField;
    }

    public String getIdValue() {
        return idValue;
    }

    public void setIdValue(String idValue) {
        this.idValue = idValue;
    }

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public class Option extends TrelloObject {
        private String idCustomField;
        private Value value;
        private String color;
        private String pos;

        public String getIdCustomField() {
            return idCustomField;
        }

        public void setIdCustomField(String idCustomField) {
            this.idCustomField = idCustomField;
        }

        public Value getValue() {
            return value;
        }

        public void setValue(Value value) {
            this.value = value;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public class Value {
        private String text;
        private String date;
        private String checked;
        private String number;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getChecked() {
            return checked;
        }

        public void setChecked(String checked) {
            this.checked = checked;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getContent() {
            String val = (isEmpty(text) ? "" : text)
                    + (isEmpty(date) ? "" : date)
                    + (isEmpty(checked) ? "" : checked)
                    + (isEmpty(number) ? "" : number);
            return val;
        }
    }

}


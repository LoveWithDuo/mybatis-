package com.dw.demo.mail;

/**
 * json转table类型
 *
 * @author fufei
 *
 */
public class JsonTable extends MailType {
    private String title;
    private String data;
    private String formatPath;

    public JsonTable(String title, String data) {
        super();
        this.title = title;
        this.data = data;
    }

    public JsonTable(String title, String data, String formatPath) {
        super();
        this.title = title;
        this.data = data;
        this.formatPath = formatPath;
    }

    public JsonTable() {
        super();
    }

    @Override
    public char getType() {
        return MailType.TYPE_JSON;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormatPath() {
        return formatPath;
    }

    public void setFormatPath(String formatPath) {
        this.formatPath = formatPath;
    }

}
package com.openclassrooms.savemytrip.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Lamine MESSACI on 08/04/2020.
 */
@Entity(foreignKeys = @ForeignKey (entity = User.class,
        parentColumns = "id",
        childColumns= "userId"))
public class Item {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String text;
    private int category;
    private Boolean isSelected;
    private long userId;

    public Item() { }

    public Item(String text, int category, long userID) {
        this.text = text;
        this.category = category;
        this.userId = userID;
        this.isSelected = false;
    }

    // --- GETTER ---
    public long getId() { return id; }
    public String getText() { return text; }
    public int getCategory() { return category; }
    public Boolean getSelected() { return isSelected; }
    public long getUserId() { return userId; }

    // --- SETTER ---
    public void setId(long id) { this.id = id; }
    public void setText(String text) { this.text = text; }
    public void setCategory(int category) { this.category = category; }
    public void setSelected(Boolean selected) { isSelected = selected; }
    public void setUserId(long userId) { this.userId = userId; }
}

package com.example.jpa;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int hp;

    @Column
    private int stamina;

    @Column
    private int atk;

    @Column
    private int def;

    @Column
    private int agi;

    public User(long id, int hp, int stamina, int atk, int def, int agi) {
        this.id = id;
        this.hp = hp;
        this.stamina = stamina;
        this.atk = atk;
        this.def = def;
        this.agi = agi;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAgi() {
        return agi;
    }

    public void setAgi(int agi) {
        this.agi = agi;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", hp=" + hp +
                ", stamina=" + stamina +
                ", atk=" + atk +
                ", def=" + def +
                ", agi=" + agi +
                '}';
    }
}

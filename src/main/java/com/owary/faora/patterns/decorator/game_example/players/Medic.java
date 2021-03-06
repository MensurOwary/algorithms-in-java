/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.owary.faora.patterns.decorator.game_example.players;

import com.owary.faora.patterns.decorator.game_example.model.Player;

/**
 *
 * @author Mensur Owary
 */
public class Medic extends Player {
    
    private final double heal = .23;

    public Medic(String name) {
        super(name);
    }
    
    @Override
    public double attack() {
        return this.attack;
    }

    @Override
    public double protect() {
        return this.defence;
    }
    
    @Override
    public double heal(){
        return this.heal;
    }
}

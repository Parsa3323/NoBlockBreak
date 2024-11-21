package me.parsa.noblocks.Events;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import javax.xml.bind.Unmarshaller;

public class NoBlockBreak implements Listener {
    @EventHandler
    public void onBreakBlock(BlockBreakEvent e) {
        Player p = e.getPlayer();

        System.out.println(Color.RED + "You can't breakblocks Sorry");


    }
}


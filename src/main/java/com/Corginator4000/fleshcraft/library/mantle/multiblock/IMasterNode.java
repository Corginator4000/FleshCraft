package com.Corginator4000.fleshcraft.library.mantle.multiblock;

public interface IMasterNode {

    boolean isCurrentlyMaster();

    boolean isEquivalentMaster(IMasterLogic master);
}

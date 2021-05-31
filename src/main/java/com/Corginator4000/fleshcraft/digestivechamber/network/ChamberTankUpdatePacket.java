package com.Corginator4000.fleshcraft.digestivechamber.network;

//import lombok.AllArgsConstructor;
import net.minecraft.client.Minecraft;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.network.NetworkEvent.Context;
import com.Corginator4000.fleshcraft.library.mantle.network.packet.IThreadsafePacket;
import com.Corginator4000.fleshcraft.library.mantle.util.TileEntityHelper;
import com.Corginator4000.fleshcraft.digestivechamber.tileentity.tank.IChamberTankHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Packet sent whenever the contents of the digestive tank change
 */
//@AllArgsConstructor
public class ChamberTankUpdatePacket implements IThreadsafePacket {
    private final BlockPos pos;
    private final List<FluidStack> fluids;

    public ChamberTankUpdatePacket(PacketBuffer buffer) {
        pos = buffer.readBlockPos();
        int size = buffer.readVarInt();
        fluids = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            fluids.add(buffer.readFluidStack());
        }
    }

    //@Override
    public void encode(PacketBuffer buffer) {
        buffer.writeBlockPos(pos);
        buffer.writeVarInt(fluids.size());
        for (FluidStack fluid : fluids) {
            buffer.writeFluidStack(fluid);
        }
    }

    //@Override
    public void handleThreadsafe(Context context) {
        HandleClient.handle(this);
    }

    private static class HandleClient {
        private static void handle(ChamberTankUpdatePacket packet) {
            TileEntityHelper.getTile(IChamberTankHandler.class, Minecraft.getInstance().world, packet.pos).ifPresent(te -> te.updateFluidsFromPacket(packet.fluids));
        }
    }
}

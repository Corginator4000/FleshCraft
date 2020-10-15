package com.Corginator4000.fleshcraft.client.gui;

import com.Corginator4000.fleshcraft.FleshCraft;
import com.Corginator4000.fleshcraft.container.EndothermicFurnaceContainer;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class EndothermicFurnaceScreen extends ContainerScreen<EndothermicFurnaceContainer> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(FleshCraft.MOD_ID,
            "textures/gui/endothermic_furnace.png");

    public EndothermicFurnaceScreen(EndothermicFurnaceContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
        super(screenContainer, inv, titleIn);

        this.guiLeft = 0;
        this.guiTop = 0;
        this.xSize = 176;
        this.ySize = 166;
    }

    @Override
    public void render(MatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        this.renderBackground(matrixStack);
        super.render(matrixStack, mouseX, mouseY, partialTicks);
        this.renderHoveredTooltip(matrixStack, mouseX, mouseY);

        getTitle();
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
        RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.minecraft.getTextureManager().bindTexture(TEXTURE);
        this.blit(matrixStack, this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

        this.blit(matrixStack,this.guiLeft + 79, this.guiTop + 35, 176, 0, this.container.getSmeltProgressionScaled(), 16);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mouseX, int mouseY) {
        //this.font.drawString(matrixStack, this.title.getString(), 8.0f, 8.0f, 0x404040);
        this.font.drawString(matrixStack, "Endothermic Furnace", 8.0f, 8.0f, 0x404040);
        this.font.drawString(matrixStack, this.playerInventory.getDisplayName().getString(), 8.0f, 69.0f, 0x404040);
    }
}

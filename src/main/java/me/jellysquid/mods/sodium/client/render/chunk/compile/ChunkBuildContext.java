package me.jellysquid.mods.sodium.client.render.chunk.compile;

import me.jellysquid.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import me.jellysquid.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderCache;

public class ChunkBuildContext {
    public final ChunkBuildBuffers buffers;
    public final BlockRenderCache cache;

    public ChunkBuildContext(ClientLevel world, ChunkVertexType vertexType) {
        this.buffers = new ChunkBuildBuffers(vertexType);
        this.cache = new BlockRenderCache(Minecraft.getInstance(), world);
    }

    public void cleanup() {
        this.buffers.destroy();
        this.cache.cleanup();
    }
}

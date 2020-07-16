package draylar.magna.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "magna")
public class MagnaConfig implements ConfigData {
    @Comment(value = "Whether an extended hitbox should show air blocks (or other blocks without hitboxes).")
    public boolean highlightAirBlocks = false;

    @Comment(value = "Whether non-full blocks (stairs, slabs) should be represented by a full cube in extended hitboxes.")
    public boolean fullBlockShapes = false;

    @Comment(value = "Whether extended hitboxes should be enabled for the appropriate tools.")
    public boolean enableExtendedHitbox = true;

    @Comment(value = "Whether extended hitboxes should be disabled when the player is sneaking.")
    public boolean disableExtendedHitboxWhileSneaking = true;

    @Comment(value = "Whether only a single block should be disabled when the player is sneaking.")
    public boolean breakSingleBlockWhenSneaking = true;

    @Comment(value = "Whether each block in an extended hitbox should show its outline separately.")
    public boolean individualBlockOutlines = false;
}
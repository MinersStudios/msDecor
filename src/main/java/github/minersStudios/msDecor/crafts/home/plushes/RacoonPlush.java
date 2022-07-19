package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class RacoonPlush {

    public static void addRecipes() {
        Bukkit.addRecipe(craftRacoonPlush());
    }

    @Nonnull
    public static ShapedRecipe craftRacoonPlush() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.RACOON_PLUSH;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "   ",
                "WWW",
                "WWW"
        );
        shapedRecipe.setIngredient('W', Material.GRAY_WOOL);
        return shapedRecipe;
    }
}

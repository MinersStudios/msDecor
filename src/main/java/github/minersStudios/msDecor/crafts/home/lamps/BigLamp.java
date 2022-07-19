package github.minersStudios.msDecor.crafts.home.lamps;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BigLamp {

    public static void addRecipes() {
        Bukkit.addRecipe(craftBigLamp());
    }

    @Nonnull
    public static ShapedRecipe craftBigLamp() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BIG_LAMP;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                " L ",
                " S ",
                " S "
        );
        shapedRecipe.setIngredient('S', Material.STICK);
        shapedRecipe.setIngredient('L', Material.LEATHER);
        return shapedRecipe;
    }
}

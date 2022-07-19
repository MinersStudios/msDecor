package github.minersStudios.msDecor.crafts.street.trashcans;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class IronTrashcan {

    public static void addRecipes() {
        Bukkit.addRecipe(craftIronTrashcan());
    }

    @Nonnull
    public static ShapedRecipe craftIronTrashcan() {
        CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.IRON_TRASHCAN;
        ShapedRecipe shapedRecipe = new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack());
        shapedRecipe.shape(
                "III",
                "I I",
                "III"
        );
        shapedRecipe.setIngredient('I', Material.IRON_INGOT);
        return shapedRecipe;
    }
}

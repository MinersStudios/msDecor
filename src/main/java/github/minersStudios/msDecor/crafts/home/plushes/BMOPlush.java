package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BMOPlush {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBMOPlush());
	}

	@Nonnull
	public static ShapedRecipe craftBMOPlush() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BMO_PLUSH;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("II", "DI")
				.setIngredient('D', Material.LIGHT_BLUE_DYE)
				.setIngredient('I', Material.IRON_INGOT);
	}
}
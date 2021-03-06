package github.minersStudios.msDecor.crafts.home.plushes;

import github.minersStudios.msDecor.Main;
import github.minersStudios.msDecor.enums.CustomDecorMaterial;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

import javax.annotation.Nonnull;

public class BrownBearPlush {

	public static void addRecipes() {
		Bukkit.addRecipe(craftBrownBearPlush());
	}

	@Nonnull
	public static ShapedRecipe craftBrownBearPlush() {
		CustomDecorMaterial customDecorMaterial = CustomDecorMaterial.BROWN_BEAR_PLUSH;
		return new ShapedRecipe(new NamespacedKey(Main.plugin, customDecorMaterial.name()), customDecorMaterial.getItemStack())
				.shape("AWA", "WAW")
				.setIngredient('W', Material.BROWN_WOOL)
				.setIngredient('A', Material.AIR);
	}
}
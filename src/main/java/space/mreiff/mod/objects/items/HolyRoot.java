package space.mreiff.mod.objects.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import space.mreiff.mod.Main;
import space.mreiff.mod.init.ItemInit;
import space.mreiff.mod.util.interfaces.IHasModel;

public class HolyRoot extends ItemFood implements IHasModel {

	public HolyRoot(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		
		ItemInit.ITEMS.add(this);


	}

	@Override
	public void registerModels() {
		// TODO Auto-generated method stub
		Main.proxy.registerItemRenderer(this, 0, "inventory");

	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
//		player.addPotionEffect(new PotionEffect(Potion.jump.id, 900, 3));
//		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 900, 3));
//		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 900, 3));
		
		if(!worldIn.isRemote) {
			player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 900, 3, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 900, 3, false, true));
			player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 900, 3, false, true));

		}
	}

}

package ramog.firstmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ramog.firstmod.init.BlockInit;

public class TutorialTab extends CreativeTabs {
	public TutorialTab(String lable) {
		super("tutorialtab");
		this.setBackgroundImageName("tutorial.png");
	}
	public ItemStack getTabIconItem(){
		return new ItemStack(Item.getItemFromBlock(BlockInit.tutorial_ore));
	}	
}

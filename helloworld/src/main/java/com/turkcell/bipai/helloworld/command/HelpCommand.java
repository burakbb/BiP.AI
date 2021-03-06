package com.turkcell.bipai.helloworld.command;

import java.util.List;

/**
 * "/yardım" veya "/help" komutunu modellemek için kullanılacak sınıf.
 * 
 * @author BIP AI
 *
 */
public class HelpCommand implements Command {
	
	public static final String NAME		=	"help";
	
	
	@Override
	public String handle(String sender, List<Object> params) {
		return	" Kullanabileceğiniz komutlar:\n" +
				" '/yardım' \n" +
				" 'rmm tekil' \n" + 
				" 'rmm çoğul' \n"+ 
				" 'rmm anket";
	}

	
	@Override
	public String getName() {
		return NAME;
	}
	
}
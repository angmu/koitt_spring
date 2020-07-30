package com.javalec.ex.bcommand;

import org.springframework.ui.Model;

public interface BCommand {
	// jsp때와 달리 model만 넘긴다.
	void execute(Model model);
}

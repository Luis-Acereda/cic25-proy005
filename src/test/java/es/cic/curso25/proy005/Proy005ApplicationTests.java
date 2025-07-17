package es.cic.curso25.proy005;

import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class Proy005ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testTelefonoDelete() throws Exception {
		mockMvc
			.perform(delete("/telefono/4"))
			.andDo(print())
			.andExpect(status().isOk())
			.andReturn();
	}

	@Test
	void testLista(){		
	}

}

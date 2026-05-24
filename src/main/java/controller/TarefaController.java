import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TarefaController {

    @GetMapping("/tarefas")
    public List<String> listarTarefas() {
        return List.of("Tarefa 1", "Tarefa 2");
    }
}
package calendula.leaf;

import calendula.starter.MyComponent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Runner {

    private final MyComponent myComponent;

    @EventListener(ApplicationReadyEvent.class)
    public void run() {
        log.info(">> {}", myComponent.get());
    }
}

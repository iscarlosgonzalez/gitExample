import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

private static final Logger log = LoggerFactory.getLogger(App.class);

public static void main(String[] args) {
    try{
        SpringApplication.run(App.class,args);
    }catch (Exception e){
        log.error("Exception error: {0}", e);
    }
}

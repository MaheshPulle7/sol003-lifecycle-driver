package com.accantosystems.stratoss.vnfmdriver;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import com.accantosystems.stratoss.vnfmdriver.config.VNFMDriverProperties;

@SpringBootApplication
@EnableConfigurationProperties(VNFMDriverProperties.class)
public class VNFMDriverApplication {
    private static final Logger log = LoggerFactory.getLogger(VNFMDriverApplication.class);

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     * @throws UnknownHostException if the local host name could not be resolved into an address
     */
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(VNFMDriverApplication.class);
        Environment env = app.run(args).getEnvironment();
        log.info("\n----------------------------------------------------------\n\t"
                         + "Application '{}' is running! Access URLs:\n\t"
                         + "Local: \t\thttp://localhost:{}\n\t"
                         + "External: \thttp://{}:{}\n"
                         + "\n----------------------------------------------------------",
                 env.getProperty("spring.application.name"),
                 env.getProperty("server.port"),
                 InetAddress.getLocalHost().getHostAddress(),
                 env.getProperty("server.port"));
    }

}

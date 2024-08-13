package org.boot.config;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import jakarta.annotation.PreDestroy;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Properties;

@Slf4j
@Component
@Validated
@Setter
public class SshTunnelingInitializer {
    private String host = "ec2-3-38-169-41.ap-northeast-2.compute.amazonaws.com";
    private int sshPort = 22;
    private String user = "ubuntu";
    private String privateKey = "D://my-webServer-key.pem";
    private int databasePort = 3306;


    private Session session;

    @PreDestroy
    public void closeSSH() {
        if (session != null && session.isConnected())
            session.disconnect();
    }

    public Integer buildSshConnection() {
        System.out.println(22222222);
        Integer forwardedPort = null;

        try {
            log.info("{}@{}:{}:{} with privateKey",user, host, sshPort, databasePort);

            log.info("start ssh tunneling..");
            JSch jSch = new JSch();

            log.info("creating ssh session");

            jSch.addIdentity(privateKey);  // 개인키
            System.out.println(33333333);
            System.out.println(jSch);
            session = jSch.getSession(user, host, sshPort);  // 세션 설정
            System.out.println(44444444);
            System.out.println(session);
            Properties config = new Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            System.out.println(55555555);
            System.out.println(session);
            log.info("complete creating ssh session");

            log.info("start connecting ssh connection");

            log.info("success connecting ssh connection ");

            // 로컬pc의 남는 포트 하나와 원격 접속한 pc의 db포트 연결
            log.info("start forwarding");
            forwardedPort = session.setPortForwardingL(33306, "localhost", databasePort);
            System.out.println(666666666);
            System.out.println(forwardedPort);
            log.info("successfully connected to database");
            session.connect();  // ssh 연결
            System.out.println(7777777);
        } catch (JSchException e){
            System.out.println(8888888);
            this.closeSSH();
            e.printStackTrace();
            log.error("fail to make ssh tunneling : {}", e.getMessage());
        }
        System.out.println(9999999);
        return forwardedPort;
    }
}
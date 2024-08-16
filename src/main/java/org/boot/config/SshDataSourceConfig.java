package org.boot.config;

//@Slf4j
//@Configuration
//@RequiredArgsConstructor
public class SshDataSourceConfig {
//
//    @Value("${spring.datasource.url}")
//    private String furl;
//
//    @Value("${spring.datasource.username}")
//    private String username;
//
//    @Value("${spring.datasource.password}")
//    private String password;
//
//    @Value("${spring.datasource.driver}")
//    private String driverClassName;
//    private final SshTunnelingInitializer initializer;
//
//    @Bean("dataSource")
//    @Primary
//    public DataSource dataSource(DataSourceProperties properties) {
//        System.out.println(11111111);
//        Integer forwardedPort = initializer.buildSshConnection();  // ssh 연결 및 터널링 설정
//        System.out.println(forwardedPort);
//        String url = furl.replace("[forwardedPort]", Integer.toString(forwardedPort));
//        log.info(url);
//        System.out.println("---------------------");
//        return DataSourceBuilder.create()
//                .url(url)
//                .username(username)
//                .password(password)
//                .driverClassName(driverClassName)
//                .build();
//    }
}

//package com.qs.config;
//
//import com.qs.config.JwtTokenEnhancer;
//import com.qs.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancer;
//import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * 认证服务器配置
// * Created by macro on 2019/9/30.
// */
//@Configuration
//@EnableAuthorizationServer
//public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Value("${wechat.appId}")
//    private String appId;
//
//    @Autowired
//    @Qualifier("UserWXDetailService")
//    private UserDetailsService userDetailsService;
//
//    @Autowired
//    @Qualifier("jwtTokenStore")
//    private TokenStore tokenStore;
//    @Autowired
//    private JwtAccessTokenConverter jwtAccessTokenConverter;
//    @Autowired
//    private JwtTokenEnhancer jwtTokenEnhancer;
//
//    /**
//     * 使用密码模式需要配置
//     */
//    @Override
//    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
//        TokenEnhancerChain enhancerChain = new TokenEnhancerChain();
//        List<TokenEnhancer> delegates = new ArrayList<>();
//        delegates.add(jwtTokenEnhancer); //配置JWT的内容增强器
//        delegates.add(jwtAccessTokenConverter);
//        enhancerChain.setTokenEnhancers(delegates);
//        endpoints.authenticationManager(authenticationManager)
//                .userDetailsService(userDetailsService)
//                .tokenStore(tokenStore) //配置令牌存储策略
//                .accessTokenConverter(jwtAccessTokenConverter)
//                .tokenEnhancer(enhancerChain);;
//    }
//
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//            clients.inMemory()
//                    .withClient("myclient")
//                    .authorizedGrantTypes("authorization_code", "refresh_token") //授权模式为password和refresh_token两种
//                    .accessTokenValiditySeconds(1800) // 配置access_token的过期时间
//                    .resourceIds("rid") //配置资源id
//                    .redirectUris("http://www.baidu.com")
//                    .scopes("all")
//                    .secret(passwordEncoder.encode("123")); //123加密后的密码
//    }
//}
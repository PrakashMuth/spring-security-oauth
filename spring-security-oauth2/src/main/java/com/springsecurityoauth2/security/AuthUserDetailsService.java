package com.springsecurityoauth2.security;

import com.springsecurityoauth2.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service("userDetailsService")
@RequiredArgsConstructor
public class AuthUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return getUserDetails(username);
    }

    AuthUserDetails getUserDetails(String usernameOrEmail) {
        var userInfo = userRepository.fetchUsernameOrEmail(usernameOrEmail.trim().toLowerCase());
        if (userInfo.isEmpty()) {
            throw new UsernameNotFoundException("userNameNotFound" + usernameOrEmail);
        }
        var user = userInfo.get();
        return new AuthUserDetails(user.getUserName(), user.getPassword(), true, true,
                true, true, getAuthorities(user.getId()), user.getId());
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Integer userId) {
        var roles = userRepository.findRolesByUserId(userId);
        var permission = userRepository.findPrivilegesByUserId(userId);
        return Stream.concat(roles.stream().map(r -> new SimpleGrantedAuthority("Role_" + r.getName())),
                permission.stream().map(p -> new SimpleGrantedAuthority(p.getName())))
                .collect(Collectors.toList());
    }
}

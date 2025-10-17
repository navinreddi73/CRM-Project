package in.crm.Author.Service.services;

import io.jsonwebtoken.*;
import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.Date;

@Data
public class JwtUtil {
    private static final String SECRET = "crm-secret-key";
    private static final long EXPIRATION_MS = 86400000; // 1 day

    public String generateToken(String username, String role) {
        return Jwts.builder()
                .setSubject(username)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_MS))
                .signWith(SignatureAlgorithm.HS256, SECRET.getBytes())
                .compact();
    }

    public Claims validateToken(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET.getBytes())
                .parseClaimsJws(token)
                .getBody();
    }
}

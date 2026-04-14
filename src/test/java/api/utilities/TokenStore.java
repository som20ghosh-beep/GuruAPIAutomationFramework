package api.utilities;

import java.util.concurrent.ConcurrentHashMap; // Thread-safe HashMap implementation
import java.util.Map; // Interface for key-value structure

public class TokenStore {

    // 🔐 Static Map to store tokens for multiple users
    // Key   → client_id (unique user identifier)
    // Value → access_token generated from API
    // ConcurrentHashMap ensures thread safety when tests run in parallel
    private static Map<String, String> tokenMap = new ConcurrentHashMap<>();


    // ✅ Method to store token for a specific user
    // This will be called after generating token from API
    public static void setToken(String clientId, String token) {

        // Put clientId-token pair into the map
        // If same clientId is used again, token will be overwritten (latest token wins)
        tokenMap.put(clientId, token);
    }


    // ✅ Method to fetch token using clientId
    // This will be used in other test classes or API calls
    public static String getToken(String clientId) {

        // Returns token mapped to given clientId
        // If clientId not found → returns null
        return tokenMap.get(clientId);
    }


    // ✅ Method to fetch all stored tokens (useful for debugging/logging)
    public static Map<String, String> getAllTokens() {

        // Returns entire token map
        // Example:
        // {
        //   "GCLI03572832T" : "token123",
        //   "GCLI06976585T" : "token456"
        // }
        return tokenMap;
    }
}
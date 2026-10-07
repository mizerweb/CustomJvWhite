package org.apache.http.auth;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AuthSchemeRegistry {
    private final Map<String, AuthSchemeFactory> registeredSchemes = new LinkedHashMap();

    public synchronized AuthScheme getAuthScheme(String str, HttpParams httpParams) throws IllegalStateException {
        AuthSchemeFactory authSchemeFactory;
        try {
            if (str == null) {
                throw new IllegalArgumentException("Name may not be null");
            }
            authSchemeFactory = this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
            if (authSchemeFactory == null) {
                throw new IllegalStateException("Unsupported authentication scheme: ".concat(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return authSchemeFactory.newInstance(httpParams);
    }

    public synchronized List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    public synchronized void register(String str, AuthSchemeFactory authSchemeFactory) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Name may not be null");
            }
            if (authSchemeFactory == null) {
                throw new IllegalArgumentException("Authentication scheme factory may not be null");
            }
            this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setItems(Map<String, AuthSchemeFactory> map) {
        if (map == null) {
            return;
        }
        this.registeredSchemes.clear();
        this.registeredSchemes.putAll(map);
    }

    public synchronized void unregister(String str) {
        try {
            if (str == null) {
                throw new IllegalArgumentException("Name may not be null");
            }
            this.registeredSchemes.remove(str.toLowerCase(Locale.ENGLISH));
        } catch (Throwable th) {
            throw th;
        }
    }
}

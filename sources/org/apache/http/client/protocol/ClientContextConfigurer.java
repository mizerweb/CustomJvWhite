package org.apache.http.client.protocol;

import defpackage.ore;
import java.util.List;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ClientContextConfigurer implements ClientContext {
    private final HttpContext context;

    public ClientContextConfigurer(HttpContext httpContext) {
        if (httpContext != null) {
            this.context = httpContext;
        } else {
            ore.p("HTTP context may not be null");
            throw null;
        }
    }

    public void setAuthSchemePref(List<String> list) {
        this.context.setAttribute(ClientContext.AUTH_SCHEME_PREF, list);
    }

    public void setAuthSchemeRegistry(AuthSchemeRegistry authSchemeRegistry) {
        this.context.setAttribute(ClientContext.AUTHSCHEME_REGISTRY, authSchemeRegistry);
    }

    public void setCookieSpecRegistry(CookieSpecRegistry cookieSpecRegistry) {
        this.context.setAttribute(ClientContext.COOKIESPEC_REGISTRY, cookieSpecRegistry);
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.context.setAttribute(ClientContext.COOKIE_STORE, cookieStore);
    }

    public void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.context.setAttribute(ClientContext.CREDS_PROVIDER, credentialsProvider);
    }
}

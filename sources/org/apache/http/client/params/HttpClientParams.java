package org.apache.http.client.params;

import defpackage.ore;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpClientParams {
    private HttpClientParams() {
    }

    public static String getCookiePolicy(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter(ClientPNames.COOKIE_POLICY);
            return str == null ? CookiePolicy.BEST_MATCH : str;
        }
        ore.p("HTTP parameters may not be null");
        return null;
    }

    public static boolean isAuthenticating(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, true);
        }
        ore.p("HTTP parameters may not be null");
        return false;
    }

    public static boolean isRedirecting(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter(ClientPNames.HANDLE_REDIRECTS, true);
        }
        ore.p("HTTP parameters may not be null");
        return false;
    }

    public static void setAuthenticating(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter(ClientPNames.HANDLE_AUTHENTICATION, z);
        } else {
            ore.p("HTTP parameters may not be null");
        }
    }

    public static void setCookiePolicy(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter(ClientPNames.COOKIE_POLICY, str);
        } else {
            ore.p("HTTP parameters may not be null");
        }
    }

    public static void setRedirecting(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, z);
        } else {
            ore.p("HTTP parameters may not be null");
        }
    }
}

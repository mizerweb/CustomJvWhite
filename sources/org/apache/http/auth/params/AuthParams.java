package org.apache.http.auth.params;

import defpackage.ore;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class AuthParams {
    private AuthParams() {
    }

    public static String getCredentialCharset(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter(AuthPNames.CREDENTIAL_CHARSET);
            return str == null ? "US-ASCII" : str;
        }
        ore.p("HTTP parameters may not be null");
        return null;
    }

    public static void setCredentialCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter(AuthPNames.CREDENTIAL_CHARSET, str);
        } else {
            ore.p("HTTP parameters may not be null");
        }
    }
}

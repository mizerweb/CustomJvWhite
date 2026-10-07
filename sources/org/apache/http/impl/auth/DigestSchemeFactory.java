package org.apache.http.impl.auth;

import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeFactory;
import org.apache.http.params.HttpParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DigestSchemeFactory implements AuthSchemeFactory {
    @Override // org.apache.http.auth.AuthSchemeFactory
    public AuthScheme newInstance(HttpParams httpParams) {
        return new DigestScheme();
    }
}

package org.apache.http.auth;

import java.security.Principal;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}

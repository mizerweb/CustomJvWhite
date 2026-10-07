package org.apache.http.auth;

import defpackage.ore;
import defpackage.zo5;
import java.security.Principal;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class BasicUserPrincipal implements Principal {
    private final String username;

    public BasicUserPrincipal(String str) {
        if (str != null) {
            this.username = str;
        } else {
            ore.p("User name may not be null");
            throw null;
        }
    }

    @Override // java.security.Principal
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof BasicUserPrincipal) && LangUtils.equals(this.username, ((BasicUserPrincipal) obj).username);
    }

    @Override // java.security.Principal
    public String getName() {
        return this.username;
    }

    @Override // java.security.Principal
    public int hashCode() {
        return LangUtils.hashCode(17, this.username);
    }

    @Override // java.security.Principal
    public String toString() {
        return zo5.w(new StringBuilder("[principal: "), this.username, "]");
    }
}

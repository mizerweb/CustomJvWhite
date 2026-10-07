package org.apache.http.auth;

import defpackage.ore;
import java.security.Principal;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class UsernamePasswordCredentials implements Credentials {
    private final String password;
    private final BasicUserPrincipal principal;

    public UsernamePasswordCredentials(String str) {
        if (str == null) {
            ore.p("Username:password string may not be null");
            throw null;
        }
        int iIndexOf = str.indexOf(58);
        if (iIndexOf >= 0) {
            this.principal = new BasicUserPrincipal(str.substring(0, iIndexOf));
            this.password = str.substring(iIndexOf + 1);
        } else {
            this.principal = new BasicUserPrincipal(str);
            this.password = null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof UsernamePasswordCredentials) && LangUtils.equals(this.principal, ((UsernamePasswordCredentials) obj).principal);
    }

    @Override // org.apache.http.auth.Credentials
    public String getPassword() {
        return this.password;
    }

    public String getUserName() {
        return this.principal.getName();
    }

    @Override // org.apache.http.auth.Credentials
    public Principal getUserPrincipal() {
        return this.principal;
    }

    public int hashCode() {
        return this.principal.hashCode();
    }

    public String toString() {
        return this.principal.toString();
    }

    public UsernamePasswordCredentials(String str, String str2) {
        if (str != null) {
            this.principal = new BasicUserPrincipal(str);
            this.password = str2;
        } else {
            ore.p("Username may not be null");
            throw null;
        }
    }
}

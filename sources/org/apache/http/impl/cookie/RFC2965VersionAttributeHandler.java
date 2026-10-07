package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RFC2965VersionAttributeHandler implements CookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        return true;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        int i;
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (str == null) {
            ahc.g("Missing value for version attribute");
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i >= 0) {
            setCookie.setVersion(i);
        } else {
            ahc.g("Invalid cookie version.");
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            ore.p("Cookie may not be null");
        } else if ((cookie instanceof SetCookie2) && (cookie instanceof ClientCookie) && !((ClientCookie) cookie).containsAttribute("version")) {
            ahc.g("Violates RFC 2965. Version attribute is required.");
        }
    }
}

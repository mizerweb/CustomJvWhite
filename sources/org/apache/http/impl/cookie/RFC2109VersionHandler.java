package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RFC2109VersionHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (str == null) {
            ahc.g("Missing value for version attribute");
            return;
        }
        if (str.trim().length() == 0) {
            ahc.g("Blank value for version attribute");
            return;
        }
        try {
            setCookie.setVersion(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            throw new MalformedCookieException("Invalid version: " + e.getMessage());
        }
    }

    @Override // org.apache.http.impl.cookie.AbstractCookieAttributeHandler, org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            ore.p("Cookie may not be null");
        } else {
            if (cookie.getVersion() >= 0) {
                return;
            }
            ahc.g("Cookie version may not be negative");
        }
    }
}

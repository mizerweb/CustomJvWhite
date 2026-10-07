package org.apache.http.impl.cookie;

import defpackage.ore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicSecureHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.impl.cookie.AbstractCookieAttributeHandler, org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            ore.p("Cookie may not be null");
            return false;
        }
        if (cookieOrigin != null) {
            return !cookie.isSecure() || cookieOrigin.isSecure();
        }
        ore.p("Cookie origin may not be null");
        return false;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie != null) {
            setCookie.setSecure(true);
        } else {
            ore.p("Cookie may not be null");
        }
    }
}

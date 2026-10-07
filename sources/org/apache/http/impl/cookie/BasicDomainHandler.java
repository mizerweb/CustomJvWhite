package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.nbh;
import defpackage.ore;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicDomainHandler implements CookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            ore.p("Cookie may not be null");
            return false;
        }
        if (cookieOrigin == null) {
            ore.p("Cookie origin may not be null");
            return false;
        }
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            return false;
        }
        if (host.equals(domain)) {
            return true;
        }
        if (!domain.startsWith(".")) {
            domain = ".".concat(domain);
        }
        return host.endsWith(domain) || host.equals(domain.substring(1));
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (str == null) {
            ahc.g("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            setCookie.setDomain(str);
        } else {
            ahc.g("Blank value for domain attribute");
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (cookieOrigin == null) {
            ore.p("Cookie origin may not be null");
            return;
        }
        String host = cookieOrigin.getHost();
        String domain = cookie.getDomain();
        if (domain == null) {
            ahc.g("Cookie domain may not be null");
            return;
        }
        if (!host.contains(".")) {
            if (!host.equals(domain)) {
                throw new MalformedCookieException(nbh.w("Illegal domain attribute \"", domain, "\". Domain of origin: \"", host, "\""));
            }
        } else {
            if (host.endsWith(domain)) {
                return;
            }
            if (domain.startsWith(".")) {
                domain = domain.substring(1, domain.length());
            }
            if (!host.equals(domain)) {
                throw new MalformedCookieException(nbh.w("Illegal domain attribute \"", domain, "\". Domain of origin: \"", host, "\""));
            }
        }
    }
}

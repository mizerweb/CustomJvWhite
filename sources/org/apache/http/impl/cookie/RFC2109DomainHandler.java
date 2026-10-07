package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.c0a;
import defpackage.nbh;
import defpackage.ore;
import java.util.Locale;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RFC2109DomainHandler implements CookieAttributeHandler {
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
        return domain.startsWith(".") && host.endsWith(domain);
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
        if (domain.equals(host)) {
            return;
        }
        if (domain.indexOf(46) == -1) {
            throw new MalformedCookieException(nbh.w("Domain attribute \"", domain, "\" does not match the host \"", host, "\""));
        }
        if (!domain.startsWith(".")) {
            throw new MalformedCookieException(c0a.o("Domain attribute \"", domain, "\" violates RFC 2109: domain must start with a dot"));
        }
        int iIndexOf = domain.indexOf(46, 1);
        if (iIndexOf < 0 || iIndexOf == domain.length() - 1) {
            throw new MalformedCookieException(c0a.o("Domain attribute \"", domain, "\" violates RFC 2109: domain must contain an embedded dot"));
        }
        String lowerCase = host.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.endsWith(domain)) {
            throw new MalformedCookieException(nbh.w("Illegal domain attribute \"", domain, "\". Domain of origin: \"", lowerCase, "\""));
        }
        if (lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) != -1) {
            throw new MalformedCookieException(c0a.o("Domain attribute \"", domain, "\" violates RFC 2109: host minus domain may not contain any dots"));
        }
    }
}

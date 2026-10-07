package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RFC2965DomainAttributeHandler implements CookieAttributeHandler {
    public boolean domainMatch(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str2.startsWith(".") && str.endsWith(str2);
    }

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
        String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
        String domain = cookie.getDomain();
        return domainMatch(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (str == null) {
            ahc.g("Missing value for domain attribute");
            return;
        }
        if (str.trim().length() == 0) {
            ahc.g("Blank value for domain attribute");
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (!lowerCase.startsWith(".")) {
            lowerCase = ".".concat(lowerCase);
        }
        setCookie.setDomain(lowerCase);
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
        Locale locale = Locale.ENGLISH;
        String lowerCase = host.toLowerCase(locale);
        if (cookie.getDomain() == null) {
            ahc.g("Invalid cookie state: domain not specified");
            return;
        }
        String lowerCase2 = cookie.getDomain().toLowerCase(locale);
        if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
            if (cookie.getDomain().equals(lowerCase)) {
                return;
            }
            throw new MalformedCookieException("Illegal domain attribute: \"" + cookie.getDomain() + "\".Domain of origin: \"" + lowerCase + "\"");
        }
        if (!lowerCase2.startsWith(".")) {
            throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2109: domain must start with a dot");
        }
        int iIndexOf = lowerCase2.indexOf(46, 1);
        if ((iIndexOf < 0 || iIndexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
            throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
        }
        if (!domainMatch(lowerCase, lowerCase2)) {
            throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
        }
        if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) == -1) {
            return;
        }
        throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
    }
}

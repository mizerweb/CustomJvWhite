package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import java.util.StringTokenizer;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;
import org.apache.http.cookie.SetCookie2;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RFC2965PortAttributeHandler implements CookieAttributeHandler {
    private static int[] parsePortAttribute(String str) throws MalformedCookieException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                int i2 = Integer.parseInt(stringTokenizer.nextToken().trim());
                iArr[i] = i2;
                if (i2 < 0) {
                    throw new MalformedCookieException("Invalid Port attribute.");
                }
                i++;
            } catch (NumberFormatException e) {
                throw new MalformedCookieException("Invalid Port attribute: " + e.getMessage());
            }
        }
        return iArr;
    }

    private static boolean portMatch(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
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
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR)) {
            return cookie.getPorts() != null && portMatch(port, cookie.getPorts());
        }
        return true;
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (setCookie instanceof SetCookie2) {
            SetCookie2 setCookie2 = (SetCookie2) setCookie;
            if (str == null || str.trim().length() <= 0) {
                return;
            }
            setCookie2.setPorts(parsePortAttribute(str));
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
        int port = cookieOrigin.getPort();
        if ((cookie instanceof ClientCookie) && ((ClientCookie) cookie).containsAttribute(ClientCookie.PORT_ATTR) && !portMatch(port, cookie.getPorts())) {
            ahc.g("Port attribute violates RFC 2965: Request port not found in cookie's port list.");
        }
    }
}

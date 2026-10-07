package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class CookieSpecBase extends AbstractCookieSpec {
    public static String getDefaultDomain(CookieOrigin cookieOrigin) {
        return cookieOrigin.getHost();
    }

    public static String getDefaultPath(CookieOrigin cookieOrigin) {
        String path = cookieOrigin.getPath();
        int iLastIndexOf = path.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            return path;
        }
        if (iLastIndexOf == 0) {
            iLastIndexOf = 1;
        }
        return path.substring(0, iLastIndexOf);
    }

    @Override // org.apache.http.cookie.CookieSpec
    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            ore.p("Cookie may not be null");
            return false;
        }
        if (cookieOrigin == null) {
            ore.p("Cookie origin may not be null");
            return false;
        }
        Iterator<CookieAttributeHandler> it = getAttribHandlers().iterator();
        while (it.hasNext()) {
            if (!it.next().match(cookie, cookieOrigin)) {
                return false;
            }
        }
        return true;
    }

    public List<Cookie> parse(HeaderElement[] headerElementArr, CookieOrigin cookieOrigin) throws MalformedCookieException {
        ArrayList arrayList = new ArrayList(headerElementArr.length);
        for (HeaderElement headerElement : headerElementArr) {
            String name = headerElement.getName();
            String value = headerElement.getValue();
            if (name == null || name.length() == 0) {
                ahc.g("Cookie name may not be empty");
                return null;
            }
            BasicClientCookie basicClientCookie = new BasicClientCookie(name, value);
            basicClientCookie.setPath(getDefaultPath(cookieOrigin));
            basicClientCookie.setDomain(getDefaultDomain(cookieOrigin));
            NameValuePair[] parameters = headerElement.getParameters();
            for (int length = parameters.length - 1; length >= 0; length--) {
                NameValuePair nameValuePair = parameters[length];
                String lowerCase = nameValuePair.getName().toLowerCase(Locale.ENGLISH);
                basicClientCookie.setAttribute(lowerCase, nameValuePair.getValue());
                CookieAttributeHandler cookieAttributeHandlerFindAttribHandler = findAttribHandler(lowerCase);
                if (cookieAttributeHandlerFindAttribHandler != null) {
                    cookieAttributeHandlerFindAttribHandler.parse(basicClientCookie, nameValuePair.getValue());
                }
            }
            arrayList.add(basicClientCookie);
        }
        return arrayList;
    }

    @Override // org.apache.http.cookie.CookieSpec
    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            ore.p("Cookie may not be null");
        } else {
            if (cookieOrigin == null) {
                ore.p("Cookie origin may not be null");
                return;
            }
            Iterator<CookieAttributeHandler> it = getAttribHandlers().iterator();
            while (it.hasNext()) {
                it.next().validate(cookie, cookieOrigin);
            }
        }
    }
}

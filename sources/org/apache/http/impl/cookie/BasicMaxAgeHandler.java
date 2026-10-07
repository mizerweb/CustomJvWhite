package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
            return;
        }
        if (str == null) {
            ahc.g("Missing value for max-age attribute");
            return;
        }
        try {
            int i = Integer.parseInt(str);
            if (i < 0) {
                throw new MalformedCookieException("Negative max-age attribute: ".concat(str));
            }
            setCookie.setExpiryDate(new Date((((long) i) * 1000) + System.currentTimeMillis()));
        } catch (NumberFormatException unused) {
            throw new MalformedCookieException("Invalid max-age attribute: ".concat(str));
        }
    }
}

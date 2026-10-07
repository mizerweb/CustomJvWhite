package org.apache.http.impl.cookie;

import defpackage.ahc;
import defpackage.ore;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicExpiresHandler extends AbstractCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        if (strArr != null) {
            this.datepatterns = strArr;
        } else {
            ore.p("Array of date patterns may not be null");
            throw null;
        }
    }

    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            ore.p("Cookie may not be null");
        } else if (str == null) {
            ahc.g("Missing value for expires attribute");
        } else {
            try {
                setCookie.setExpiryDate(DateUtils.parseDate(str, this.datepatterns));
            } catch (DateParseException unused) {
                throw new MalformedCookieException("Unable to parse expires attribute: ".concat(str));
            }
        }
    }
}

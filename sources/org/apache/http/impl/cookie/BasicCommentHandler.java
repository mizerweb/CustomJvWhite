package org.apache.http.impl.cookie;

import defpackage.ore;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicCommentHandler extends AbstractCookieAttributeHandler {
    @Override // org.apache.http.cookie.CookieAttributeHandler
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie != null) {
            setCookie.setComment(str);
        } else {
            ore.p("Cookie may not be null");
        }
    }
}

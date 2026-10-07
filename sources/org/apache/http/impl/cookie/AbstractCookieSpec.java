package org.apache.http.impl.cookie;

import defpackage.c0a;
import defpackage.ore;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractCookieSpec implements CookieSpec {
    private final Map<String, CookieAttributeHandler> attribHandlerMap = new HashMap(10);

    public CookieAttributeHandler findAttribHandler(String str) {
        return this.attribHandlerMap.get(str);
    }

    public CookieAttributeHandler getAttribHandler(String str) {
        CookieAttributeHandler cookieAttributeHandlerFindAttribHandler = findAttribHandler(str);
        if (cookieAttributeHandlerFindAttribHandler != null) {
            return cookieAttributeHandlerFindAttribHandler;
        }
        ore.k(c0a.o("Handler not registered for ", str, " attribute."));
        return null;
    }

    public Collection<CookieAttributeHandler> getAttribHandlers() {
        return this.attribHandlerMap.values();
    }

    public void registerAttribHandler(String str, CookieAttributeHandler cookieAttributeHandler) {
        if (str == null) {
            ore.p("Attribute name may not be null");
        } else if (cookieAttributeHandler != null) {
            this.attribHandlerMap.put(str, cookieAttributeHandler);
        } else {
            ore.p("Attribute handler may not be null");
        }
    }
}

package org.apache.http.protocol;

import defpackage.ore;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicHttpContext implements HttpContext {
    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext(HttpContext httpContext) {
        this.map = null;
        this.parentContext = httpContext;
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object getAttribute(String str) {
        HttpContext httpContext;
        if (str == null) {
            ore.p("Id may not be null");
            return null;
        }
        Map map = this.map;
        Object obj = map != null ? map.get(str) : null;
        return (obj != null || (httpContext = this.parentContext) == null) ? obj : httpContext.getAttribute(str);
    }

    @Override // org.apache.http.protocol.HttpContext
    public Object removeAttribute(String str) {
        if (str == null) {
            ore.p("Id may not be null");
            return null;
        }
        Map map = this.map;
        if (map != null) {
            return map.remove(str);
        }
        return null;
    }

    @Override // org.apache.http.protocol.HttpContext
    public void setAttribute(String str, Object obj) {
        if (str == null) {
            ore.p("Id may not be null");
            return;
        }
        if (this.map == null) {
            this.map = new HashMap();
        }
        this.map.put(str, obj);
    }

    public BasicHttpContext() {
        this(null);
    }
}

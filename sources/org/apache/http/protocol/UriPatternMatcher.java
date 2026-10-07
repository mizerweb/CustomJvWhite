package org.apache.http.protocol;

import defpackage.ore;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class UriPatternMatcher {
    private final Map handlerMap = new HashMap();

    public Object lookup(String str) {
        String str2 = null;
        if (str == null) {
            ore.p("Request URI may not be null");
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        Object obj = this.handlerMap.get(str);
        if (obj == null) {
            for (String str3 : this.handlerMap.keySet()) {
                if (matchUriRequestPattern(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith("*")))) {
                    obj = this.handlerMap.get(str3);
                    str2 = str3;
                }
            }
        }
        return obj;
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        return (str.endsWith("*") && str2.startsWith(str.substring(0, str.length() - 1))) || (str.startsWith("*") && str2.endsWith(str.substring(1, str.length())));
    }

    public void register(String str, Object obj) {
        if (str == null) {
            ore.p("URI request pattern may not be null");
        } else if (obj != null) {
            this.handlerMap.put(str, obj);
        } else {
            ore.p("HTTP request handelr may not be null");
        }
    }

    public void setHandlers(Map map) {
        if (map == null) {
            ore.p("Map of handlers may not be null");
        } else {
            this.handlerMap.clear();
            this.handlerMap.putAll(map);
        }
    }

    public void unregister(String str) {
        if (str == null) {
            return;
        }
        this.handlerMap.remove(str);
    }
}

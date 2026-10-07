package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qxl {
    public static final Map a(Map map) {
        Object poeVar;
        try {
            poeVar = map.keySet();
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (poeVar instanceof poe) {
            poeVar = c76.a;
        }
        zo7 zo7Var = new zo7(29, (Iterable) poeVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((Iterable) zo7Var.b).iterator();
        while (it.hasNext()) {
            Thread.State state = ((Thread) it.next()).getState();
            Object ufeVar = linkedHashMap.get(state);
            if (ufeVar == null && !linkedHashMap.containsKey(state)) {
                ufeVar = new ufe();
            }
            ufe ufeVar2 = (ufe) ufeVar;
            ufeVar2.a++;
            linkedHashMap.put(state, ufeVar2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if ((entry instanceof uv8) && !(entry instanceof rl9)) {
                e9i.I0(entry, "kotlin.collections.MutableMap.MutableEntry");
                throw null;
            }
            entry.setValue(Integer.valueOf(((ufe) entry.getValue()).a));
        }
        e9i.j(linkedHashMap);
        return linkedHashMap;
    }

    public static File[] b(Context context) {
        return context.getExternalMediaDirs();
    }
}

package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class lw8 implements Serializable {
    public final Object a;

    public lw8() {
        this.a = new LinkedHashMap();
    }

    public void a(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        List arrayList = (List) linkedHashMap.get(obj);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public int b() {
        Iterator it = ((LinkedHashMap) this.a).values().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) it.next()).size();
        }
        return size;
    }

    public lw8(jw8 jw8Var) {
        this.a = jw8Var.a;
    }
}

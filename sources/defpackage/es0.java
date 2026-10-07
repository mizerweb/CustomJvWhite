package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class es0 implements HasExtraData {
    public static final v98 m;
    public static final Object n;
    public final v78 a;
    public final String b;
    public final pjd c;
    public final Object d;
    public final u78 e;
    public final HashMap f;
    public boolean g;
    public whd h;
    public boolean i;
    public boolean j;
    public final ArrayList k;
    public final d78 l;

    static {
        String[] strArr = {"id", HasExtraData.KEY_URI_SOURCE};
        int i = v98.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        m = new v98(hashSet);
        n = new Object();
    }

    public es0(v78 v78Var, String str, String str2, pjd pjdVar, Object obj, u78 u78Var, boolean z, boolean z2, whd whdVar, d78 d78Var) {
        this.a = v78Var;
        this.b = str;
        HashMap map = new HashMap();
        this.f = map;
        map.put("id", str);
        map.put(HasExtraData.KEY_URI_SOURCE, v78Var == null ? "null-request" : v78Var.b);
        this.c = pjdVar;
        this.d = obj == null ? n : obj;
        this.e = u78Var;
        this.g = z;
        this.h = whdVar;
        this.i = z2;
        this.j = false;
        this.k = new ArrayList();
        this.l = d78Var;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fs0) it.next()).b();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fs0) it.next()).c();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fs0) it.next()).d();
        }
    }

    public final void a(fs0 fs0Var) {
        boolean z;
        synchronized (this) {
            this.k.add(fs0Var);
            z = this.j;
        }
        if (z) {
            fs0Var.a();
        }
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.j) {
                arrayList = null;
            } else {
                this.j = true;
                arrayList = new ArrayList(this.k);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fs0) it.next()).a();
        }
    }

    public final synchronized boolean f() {
        return this.i;
    }

    public final synchronized boolean g() {
        return this.g;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.f.get(str);
        return obj2 == null ? obj : obj2;
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Map getExtras() {
        return this.f;
    }

    public final void h(String str, String str2) {
        HashMap map = this.f;
        map.put(HasExtraData.KEY_ORIGIN, str);
        map.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtra(String str, Object obj) {
        if (m.contains(str)) {
            return;
        }
        this.f.put(str, obj);
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final void putExtras(Map map) {
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            putExtra((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.facebook.fresco.middleware.HasExtraData
    public final Object getExtra(String str) {
        return this.f.get(str);
    }
}

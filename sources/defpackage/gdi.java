package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import scout.exception.IllegalOverridesException;
import scout.exception.ScopeInitializationException;

/* JADX INFO: loaded from: classes.dex */
public class gdi {
    public final String a;
    public final x3f b = ch3.h;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet g = new HashSet();
    public final ArrayList h = new ArrayList();

    public gdi(String str) {
        this.a = str;
    }

    public r3f a() {
        x3f x3fVar = this.b;
        String str = this.a;
        if (x3fVar != null) {
            try {
                if (qt4.d(2, x3fVar.a) >= 0) {
                    x3f.a(x3fVar, "Start initialization of scope \"" + str + '\"');
                }
            } catch (Exception e) {
                throw new ScopeInitializationException(str, e);
            }
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            throw new IllegalOverridesException(str, arrayList);
        }
        r3f r3fVar = new r3f(str, this.c, this.d, this.e, this.f, this.g);
        if (x3fVar != null) {
            if (qt4.d(2, x3fVar.a) >= 0) {
                x3f.a(x3fVar, "Finish initialization of \"" + str + '\"');
            }
        }
        return r3fVar;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(int i, si8 si8Var) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.e;
        Object arrayList = map.get(numValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(numValueOf, arrayList);
        }
        ((List) arrayList).add(si8Var);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void d(int i, si8 si8Var) {
        if (this.d.put(Integer.valueOf(i), si8Var) != null) {
            this.h.add(Integer.valueOf(i));
        }
    }
}

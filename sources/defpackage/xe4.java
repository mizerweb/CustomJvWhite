package defpackage;

import android.content.res.Resources;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public class xe4 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public to a() {
        if (((i18) this.e) == null) {
            if (((l18) this.c) == null) {
                this.c = new glh();
            }
            i18 i18Var = new i18((l18) this.c);
            this.d = i18Var;
            this.e = i18Var;
        }
        return (i18) this.e;
    }

    public long b(we4 we4Var) {
        long[] jArr = (long[]) ((Map) ((ifh) this.f).getValue()).getOrDefault(we4Var, wk8.a);
        int i = ((AtomicInteger) this.c).get();
        if (i >= 0 && i < jArr.length) {
            return jArr[i];
        }
        if (i < jArr.length) {
            return a.Z0(jArr);
        }
        if (jArr.length != 0) {
            return jArr[jArr.length - 1];
        }
        ore.f("Array is empty.");
        return 0L;
    }

    public long c() {
        je9 je9Var = je9.d;
        we4 we4VarA = ((wd4) ((ny8) this.b).getValue()).a();
        boolean z = false;
        if (((we4) ((AtomicReference) this.d).getAndSet(we4VarA)) != we4VarA) {
            String name = xe4.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "reset timeoutIndex", null);
            }
            ((AtomicInteger) this.c).set(0);
            z = true;
        }
        long jB = b(we4VarA);
        if (z) {
            String name2 = xe4.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, "connType=" + we4VarA + ", timeout = " + jB, null);
            }
        }
        return jB;
    }

    public s1d d(Resources resources, ag5 ag5Var, ot5 ot5Var, Executor executor, taa taaVar, b50 b50Var) {
        return new s1d(resources, ag5Var, ot5Var, executor, taaVar, b50Var);
    }
}

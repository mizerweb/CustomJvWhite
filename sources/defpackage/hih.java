package defpackage;

import java.util.List;
import java.util.Map;
import one.me.mods.Mods;

/* JADX INFO: loaded from: classes.dex */
public abstract class hih {
    public final mw a = new mw(0);
    public final kfc b;

    public hih(kfc kfcVar) {
        this.b = kfcVar;
    }

    public final void a(String str, boolean z) {
        if (str.equals("interactive") && Mods.get("offline")) {
            return;
        }
        this.a.put(str, Boolean.valueOf(z));
    }

    public final void b(byte b, String str) {
        this.a.put(str, Byte.valueOf(b));
    }

    public final void c(int i, String str) {
        this.a.put(str, Integer.valueOf(i));
    }

    public final void d(String str, List list) {
        this.a.put(str, list);
    }

    public final void e(String str, long[] jArr) {
        this.a.put(str, jArr);
    }

    public final void f(long j, String str) {
        this.a.put(str, Long.valueOf(j));
    }

    public final void g(String str, Map map) {
        this.a.put(str, map);
    }

    public final void h(String str, String str2) {
        this.a.put(str, str2);
    }

    public boolean i() {
        return this instanceof y4b;
    }

    public boolean j() {
        return this instanceof nu2;
    }

    public short k() {
        return this.b.a;
    }

    public int l() {
        return this.a.hashCode();
    }

    public te9 m() {
        return cy5.l;
    }

    public iih n() {
        return iih.R0;
    }

    public boolean o() {
        return !(this instanceof ed0);
    }

    public int p() {
        return -1;
    }

    public final String toString() {
        return tre.q0(this.a, m());
    }
}

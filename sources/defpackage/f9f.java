package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f9f implements Serializable, Comparable {
    public final int a;
    public final String b;
    public final List c;
    public final rt2 d;
    public final vg4 e;
    public final gda f;
    public final long g;
    public final zxd h;
    public final String i;

    public f9f(int i, String str, List list, rt2 rt2Var, vg4 vg4Var, gda gdaVar, long j, zxd zxdVar, String str2) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = rt2Var;
        this.e = vg4Var;
        this.f = gdaVar;
        this.g = j;
        this.h = zxdVar;
        this.i = str2;
    }

    public static f9f a(rt2 rt2Var, List list, String str) {
        return new f9f(1, null, list, rt2Var, null, null, 0L, null, str);
    }

    public static f9f b(vg4 vg4Var, List list) {
        return new f9f(4, null, list, null, vg4Var, null, 0L, null, null);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f9f f9fVar = (f9f) obj;
        if (f9fVar == null) {
            return 0;
        }
        rt2 rt2Var = f9fVar.d;
        rt2 rt2Var2 = this.d;
        if (rt2Var2 == null || rt2Var == null) {
            return (rt2Var2 == null || rt2Var != null) ? 0 : -1;
        }
        return Long.compare(rt2Var.x(), rt2Var2.x());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(pye.p(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.d);
        sb.append(", contact=");
        sb.append(this.e);
        sb.append(", message=");
        sb.append(this.f);
        sb.append(", chatId=");
        sb.append(this.g);
        sb.append(", queryId=");
        return x05.i(sb, this.i, '}');
    }
}

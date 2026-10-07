package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nf9 extends kih implements xe9 {
    public final ujd c;
    public final List d;
    public final List e;
    public final String f;
    public final long g;
    public final ia4 h;
    public final HashMap i;
    public final long j;
    public final ArrayList k;
    public final boolean l;
    public final long m;
    public final int n;
    public final ff9 o;

    public nf9(ujd ujdVar, List list, List list2, String str, long j, ia4 ia4Var, HashMap map, long j2, ArrayList arrayList, boolean z, long j3, int i, ff9 ff9Var) {
        this.c = ujdVar;
        this.d = list;
        this.e = list2;
        this.f = str;
        this.g = j;
        this.h = ia4Var;
        this.i = map;
        this.j = j2;
        this.k = arrayList;
        this.l = z;
        this.m = j3;
        this.n = i;
        this.o = ff9Var;
        this.a = Math.abs(System.nanoTime() - j3) / 1000000;
    }

    @Override // defpackage.xe9
    public final String a(boolean z, boolean z2) {
        String string;
        v56 v56Var;
        v56 v56Var2;
        ia4 ia4Var = this.h;
        if (ia4Var != null && (v56Var2 = ia4Var.b) != null) {
            Map map = (Map) v56Var2.b;
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            } else {
                z = false;
            }
        }
        if (ia4Var != null && (v56Var = ia4Var.b) != null) {
            Map map2 = (Map) v56Var.b;
            if (map2.containsKey("log-sensitive")) {
                Object obj2 = map2.get("log-sensitive");
                z2 = Boolean.parseBoolean(obj2 != null ? obj2.toString() : null);
            } else {
                z2 = false;
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(login2Flags=");
        sb.append(this.o);
        sb.append(",profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str = this.f;
        sb.append(z2 ? str != null ? str.toString() : "NULL" : ch3.y(str));
        sb.append(",time=");
        sb.append(this.g);
        sb.append(",chatMarker=");
        sb.append(this.j);
        sb.append(",videoChatHistory=");
        sb.append(this.l);
        sb.append(",contactInfos=");
        sb.append(f55.s(this.e, z, z2));
        sb.append(",config=");
        sb.append(ia4Var);
        sb.append(",messages=");
        HashMap map3 = this.i;
        if (z) {
            StringBuilder sb2 = new StringBuilder("{");
            for (Map.Entry entry : map3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                sb2.append(String.valueOf(key));
                sb2.append('=');
                sb2.append(f55.H(value, z, z2));
                sb2.append(',');
            }
            sb2.append('}');
            string = sb2.toString();
        } else {
            string = String.valueOf(map3.size());
        }
        sb.append(string);
        sb.append(",chats=");
        sb.append(f55.s(this.d, z, z2));
        sb.append(",calls=");
        sb.append(f55.s(this.k, z, z2));
        sb.append(",updates=");
        return zo5.t(sb, this.n, ",)");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf9)) {
            return false;
        }
        nf9 nf9Var = (nf9) obj;
        return cqk.d(this.c, nf9Var.c) && cqk.d(this.d, nf9Var.d) && cqk.d(this.e, nf9Var.e) && cqk.d(this.f, nf9Var.f) && this.g == nf9Var.g && cqk.d(this.h, nf9Var.h) && this.i.equals(nf9Var.i) && this.j == nf9Var.j && this.k.equals(nf9Var.k) && this.l == nf9Var.l && this.m == nf9Var.m && this.n == nf9Var.n && cqk.d(this.o, nf9Var.o);
    }

    public final ia4 h() {
        return this.h;
    }

    public final int hashCode() {
        ujd ujdVar = this.c;
        int iC = qv1.c(qv1.c((ujdVar == null ? 0 : ujdVar.hashCode()) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iG = qt4.g((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        ia4 ia4Var = this.h;
        int iC2 = zo5.c(this.n, qt4.g(nbh.n(x05.b(this.k, qt4.g((this.i.hashCode() + ((iG + (ia4Var == null ? 0 : ia4Var.hashCode())) * 31)) * 31, 31, this.j), 31), 31, this.l), 31, this.m), 31);
        ff9 ff9Var = this.o;
        return iC2 + (ff9Var != null ? ff9Var.hashCode() : 0);
    }

    public final ArrayList i() {
        List list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pj4) obj) != oj4.t) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.sq0
    public final String toString() {
        return a(false, false);
    }
}

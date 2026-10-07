package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class haf {
    public ldf a;
    public String b;
    public String c;
    public List d;
    public List e;
    public List f;
    public long g;
    public int h;
    public boolean i;
    public long j;
    public List k;
    public List l;
    public String m;
    public List n;

    public final void A(int i) {
        this.h = i;
    }

    public final void B(ldf ldfVar) {
        this.a = ldfVar;
    }

    public final void C(long j) {
        this.j = j;
    }

    public final iaf o() {
        if (this.d == null) {
            this.d = Collections.EMPTY_LIST;
        }
        if (this.e == null) {
            this.e = Collections.EMPTY_LIST;
        }
        if (this.k == null) {
            this.k = Collections.EMPTY_LIST;
        }
        if (this.l == null) {
            this.l = Collections.EMPTY_LIST;
        }
        if (this.f == null) {
            this.f = Collections.EMPTY_LIST;
        }
        if (this.n == null) {
            this.n = Collections.EMPTY_LIST;
        }
        return new iaf(this);
    }

    public final void p(b50 b50Var) {
        this.n = b50Var;
    }

    public final void q(boolean z) {
        this.i = z;
    }

    public final void r(String str) {
        this.b = str;
    }

    public final void s(long j) {
        this.g = j;
    }

    public final void t(String str) {
        this.m = str;
    }

    public final void u(b50 b50Var) {
        this.f = b50Var;
    }

    public final void v(List list) {
        this.k = list;
    }

    public final void w(ArrayList arrayList) {
        this.l = arrayList;
    }

    public final void x(b50 b50Var) {
        this.e = b50Var;
    }

    public final void y(b50 b50Var) {
        this.d = b50Var;
    }

    public final void z(String str) {
        this.c = str;
    }
}

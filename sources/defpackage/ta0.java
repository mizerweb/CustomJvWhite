package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ta0 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final p70 g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public ta0(sa0 sa0Var) {
        this.a = sa0Var.a;
        this.b = sa0Var.b;
        this.c = sa0Var.c;
        this.d = sa0Var.d;
        this.e = sa0Var.e;
        this.f = sa0Var.f;
        this.g = sa0Var.g;
        this.h = sa0Var.h;
        this.i = sa0Var.i;
        this.j = sa0Var.j;
        this.k = sa0Var.k;
    }

    public final sa0 a() {
        sa0 sa0Var = new sa0();
        sa0Var.a = this.a;
        sa0Var.b = this.b;
        sa0Var.c = this.c;
        sa0Var.d = this.d;
        sa0Var.e = this.e;
        sa0Var.f = this.f;
        sa0Var.g = this.g;
        sa0Var.h = this.h;
        sa0Var.i = this.i;
        sa0Var.j = this.j;
        sa0Var.k = this.k;
        return sa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ta0.class != obj.getClass()) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        return this.a == ta0Var.a && this.b == ta0Var.b && this.c == ta0Var.c && this.d == ta0Var.d && this.e == ta0Var.e && this.f == ta0Var.f && this.h == ta0Var.h && this.i == ta0Var.i && this.j == ta0Var.j && this.k == ta0Var.k && this.g.equals(ta0Var.g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f), this.g, Integer.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.j));
    }
}

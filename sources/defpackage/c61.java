package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class c61 implements Serializable {
    public final String a;
    public final j61 b;
    public final int c;
    public final String d;
    public final String e;
    public final boolean f;
    public final long g;
    public final boolean h;

    public c61(y51 y51Var) {
        this.a = y51Var.a;
        this.b = y51Var.b;
        this.c = y51Var.c;
        this.d = y51Var.d;
        this.e = y51Var.e;
        this.f = y51Var.f;
        this.h = y51Var.g;
        this.g = y51Var.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c61)) {
            return false;
        }
        c61 c61Var = (c61) obj;
        if (ch3.a(this.a, c61Var.a) && ch3.a(this.e, c61Var.e) && this.b == c61Var.b && this.f == c61Var.f && this.c == c61Var.c && this.g == c61Var.g) {
            return ch3.a(this.d, c61Var.d);
        }
        return false;
    }
}

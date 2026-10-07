package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class px7 extends qx7 {
    public final String l;
    public final c98 m;

    public px7(String str, px7 px7Var, String str2, long j, int i, long j2, wu5 wu5Var, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, px7Var, j, i, j2, wu5Var, str3, str4, j3, j4, z);
        this.l = str2;
        this.m = c98.n(list);
    }

    public final px7 a(int i, long j) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j2 = j;
        while (true) {
            c98 c98Var = this.m;
            if (i2 >= c98Var.size()) {
                return new px7(this.a, this.b, this.l, this.c, i, j, this.f, this.g, this.h, this.i, this.j, this.k, arrayList);
            }
            nx7 nx7Var = (nx7) c98Var.get(i2);
            arrayList.add(new nx7(nx7Var.a, nx7Var.b, nx7Var.c, i, j2, nx7Var.f, nx7Var.g, nx7Var.h, nx7Var.i, nx7Var.j, nx7Var.k, nx7Var.l, nx7Var.m));
            j2 += nx7Var.c;
            i2++;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public px7(long j, long j2, String str, String str2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, ghe.e);
        a98 a98Var = c98.b;
    }
}

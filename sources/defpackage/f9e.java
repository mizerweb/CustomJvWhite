package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f9e {
    public final y8e a;
    public final ArrayList b;
    public final int c;
    public final yf2 d;
    public final dle e;
    public final int f;
    public final int g;
    public final int h;
    public int i;

    public f9e(y8e y8eVar, ArrayList arrayList, int i, yf2 yf2Var, dle dleVar, int i2, int i3, int i4) {
        this.a = y8eVar;
        this.b = arrayList;
        this.c = i;
        this.d = yf2Var;
        this.e = dleVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static f9e a(f9e f9eVar, int i, yf2 yf2Var, dle dleVar, int i2) {
        if ((i2 & 1) != 0) {
            i = f9eVar.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            yf2Var = f9eVar.d;
        }
        yf2 yf2Var2 = yf2Var;
        if ((i2 & 4) != 0) {
            dleVar = f9eVar.e;
        }
        int i4 = f9eVar.f;
        int i5 = f9eVar.g;
        int i6 = f9eVar.h;
        return new f9e(f9eVar.a, f9eVar.b, i3, yf2Var2, dleVar, i4, i5, i6);
    }

    public final pne b(dle dleVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            ore.k("Check failed.");
            return null;
        }
        this.i++;
        yf2 yf2Var = this.d;
        if (yf2Var != null) {
            kd6 kd6Var = (kd6) yf2Var.d;
            k28 k28Var = dleVar.a;
            k28 k28Var2 = kd6Var.b.h;
            if (k28Var.e != k28Var2.e || !cqk.d(k28Var.d, k28Var2.d)) {
                c.p(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.i != 1) {
                c.p(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        f9e f9eVarA = a(this, i2, null, dleVar, 58);
        tj8 tj8Var = (tj8) arrayList.get(i);
        pne pneVarA = tj8Var.a(f9eVarA);
        if (pneVarA == null) {
            throw new NullPointerException("interceptor " + tj8Var + " returned null");
        }
        if (yf2Var != null && i2 < arrayList.size() && f9eVarA.i != 1) {
            c.p(tj8Var, " must call proceed() exactly once", "network interceptor ");
            return null;
        }
        if (pneVarA.g != null) {
            return pneVarA;
        }
        c.p(tj8Var, " returned a response with no body", "interceptor ");
        return null;
    }
}

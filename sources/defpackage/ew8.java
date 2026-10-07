package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ew8 implements bw8 {
    public final bw8 a;

    public ew8(bw8 bw8Var) {
        this.a = bw8Var;
    }

    @Override // defpackage.bw8
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.bw8
    public final rv8 c() {
        return this.a.c();
    }

    @Override // defpackage.bw8
    public final List e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        ew8 ew8Var = obj instanceof ew8 ? (ew8) obj : null;
        bw8 bw8Var = ew8Var != null ? ew8Var.a : null;
        bw8 bw8Var2 = this.a;
        if (!cqk.d(bw8Var2, bw8Var)) {
            return false;
        }
        rv8 rv8VarC = bw8Var2.c();
        if (!(rv8VarC instanceof rv8)) {
            return false;
        }
        bw8 bw8Var3 = obj instanceof bw8 ? (bw8) obj : null;
        rv8 rv8VarC2 = bw8Var3 != null ? bw8Var3.c() : null;
        if (rv8VarC2 == null || !(rv8VarC2 instanceof rv8)) {
            return false;
        }
        return cqk.d(((qr3) rv8VarC).d(), ((qr3) rv8VarC2).d());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}

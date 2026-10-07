package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f9i implements bw8 {
    public final rv8 a;
    public final List b;
    public final int c;

    public f9i(rv8 rv8Var, List list, int i) {
        this.a = rv8Var;
        this.b = list;
        this.c = i;
    }

    @Override // defpackage.bw8
    public final boolean a() {
        return (this.c & 1) != 0;
    }

    @Override // defpackage.bw8
    public final rv8 c() {
        return this.a;
    }

    public final String d(boolean z) {
        String name;
        rv8 rv8Var = this.a;
        rv8 rv8Var2 = rv8Var instanceof rv8 ? rv8Var : null;
        Class clsD = rv8Var2 != null ? ((qr3) rv8Var2).d() : null;
        if (clsD == null) {
            name = rv8Var.toString();
        } else if ((this.c & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (!clsD.isArray()) {
            name = (z && clsD.isPrimitive()) ? wk8.q(rv8Var).getName() : clsD.getName();
        } else if (clsD.equals(boolean[].class)) {
            name = "kotlin.BooleanArray";
        } else if (clsD.equals(char[].class)) {
            name = "kotlin.CharArray";
        } else if (clsD.equals(byte[].class)) {
            name = "kotlin.ByteArray";
        } else if (clsD.equals(short[].class)) {
            name = "kotlin.ShortArray";
        } else if (clsD.equals(int[].class)) {
            name = "kotlin.IntArray";
        } else if (clsD.equals(float[].class)) {
            name = "kotlin.FloatArray";
        } else if (clsD.equals(long[].class)) {
            name = "kotlin.LongArray";
        } else {
            name = clsD.equals(double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
        }
        List list = this.b;
        return zo5.p(name, list.isEmpty() ? "" : ww3.z1(list, ", ", "<", ">", new u8h(15, this), 24), a() ? "?" : "");
    }

    @Override // defpackage.bw8
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9i)) {
            return false;
        }
        f9i f9iVar = (f9i) obj;
        return cqk.d(this.a, f9iVar.a) && cqk.d(this.b, f9iVar.b) && this.c == f9iVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + qv1.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return d(false).concat(" (Kotlin reflection is not available)");
    }
}

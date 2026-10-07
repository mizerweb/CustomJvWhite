package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class jp7 implements aoh {
    public final String a;
    public final int[] b;
    public final tri c;

    public jp7(String str, int[] iArr, tri triVar) {
        this.a = str;
        this.b = iArr;
        this.c = triVar;
    }

    @Override // defpackage.aoh
    public final int[] a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jp7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jp7 jp7Var = (jp7) obj;
        return cqk.d(this.a, jp7Var.a) && Arrays.equals(this.b, jp7Var.b) && this.c.equals(jp7Var.c);
    }

    @Override // defpackage.aoh
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("GradientBackgroundItem(name=", this.a, ", gradientColors=", Arrays.toString(this.b), ", model=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}

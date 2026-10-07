package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class wr3 {
    public final int a;
    public final Method b;

    public wr3(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3)) {
            return false;
        }
        wr3 wr3Var = (wr3) obj;
        return this.a == wr3Var.a && this.b.getName().equals(wr3Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}

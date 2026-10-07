package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class thd implements fif {
    public final String a;
    public final rhd b;

    public thd(String str, rhd rhdVar) {
        this.a = str;
        this.b = rhdVar;
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.fif
    public final lvb d() {
        return this.b;
    }

    @Override // defpackage.fif
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thd)) {
            return false;
        }
        thd thdVar = (thd) obj;
        return this.a.equals(thdVar.a) && this.b.equals(thdVar.b);
    }

    @Override // defpackage.fif
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.fif
    public final List g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return r66.a;
    }

    @Override // defpackage.fif
    public final fif h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.fif
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fif
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final String toString() {
        return x05.i(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}

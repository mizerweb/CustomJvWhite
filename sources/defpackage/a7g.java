package defpackage;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class a7g implements Provider {
    public final Object a;

    public a7g(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a7g) && cqk.d(this.a, ((a7g) obj).a);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SimpleProvider(value=" + this.a + ")";
    }
}

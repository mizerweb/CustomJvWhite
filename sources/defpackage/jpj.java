package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jpj {
    public static final ipj Companion = new ipj();
    public final boolean a;

    public /* synthetic */ jpj(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            shl.b(i, 1, hpj.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpj) && this.a == ((jpj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return qv1.m("WebAppSetupClosingBehaviorRequest(needConfirmation=", ")", this.a);
    }
}

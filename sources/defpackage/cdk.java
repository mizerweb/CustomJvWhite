package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cdk {
    public final String a;

    public /* synthetic */ cdk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cdk) {
            return cqk.d(this.a, ((cdk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv1.g(')', "VersionName(value=", this.a);
    }
}

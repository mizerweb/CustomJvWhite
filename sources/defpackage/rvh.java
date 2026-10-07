package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rvh extends eyl {
    public final String a;

    public rvh(String str) {
        this.a = str;
    }

    @Override // defpackage.eyl
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rvh) && this.a.equals(((rvh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LostConnection(text=" + ((Object) this.a) + ")";
    }
}

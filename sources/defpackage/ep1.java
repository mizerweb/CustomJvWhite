package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ep1 extends fp1 {
    public final npi a;

    public ep1(npi npiVar) {
        this.a = npiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep1) && this.a.equals(((ep1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}

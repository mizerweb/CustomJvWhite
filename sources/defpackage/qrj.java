package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qrj extends es8 {
    public final boolean c;

    public qrj(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qrj) && this.c == ((qrj) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return qv1.m("ScreenCaptureBehavior(isEnabled=", ")", this.c);
    }
}

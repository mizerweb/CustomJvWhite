package defpackage;

import android.graphics.Point;

/* JADX INFO: loaded from: classes2.dex */
public final class f1i {
    public final Point a;
    public final boolean b;

    public f1i(Point point, boolean z) {
        this.a = point;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1i)) {
            return false;
        }
        f1i f1iVar = (f1i) obj;
        return this.a.equals(f1iVar.a) && this.b == f1iVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TranscriptionOnboardingEvent(position=" + this.a + ", isIncomingMessage=" + this.b + ")";
    }
}

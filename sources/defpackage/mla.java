package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class mla {
    public final fbe a;
    public final MotionEvent b;

    public mla(fbe fbeVar, MotionEvent motionEvent) {
        this.a = fbeVar;
        this.b = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mla)) {
            return false;
        }
        mla mlaVar = (mla) obj;
        return this.a == mlaVar.a && cqk.d(this.b, mlaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecordControlMotionEvent(type=" + this.a + ", motionEvent=" + this.b + ")";
    }
}

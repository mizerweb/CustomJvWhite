package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class bh0 {
    public final String a;
    public final Class b;
    public final Object c;

    public bh0(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls == null) {
            ore.n("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bh0)) {
            return false;
        }
        bh0 bh0Var = (bh0) obj;
        if (!this.a.equals(bh0Var.a) || !this.b.equals(bh0Var.b)) {
            return false;
        }
        Object obj2 = bh0Var.c;
        Object obj3 = this.c;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}

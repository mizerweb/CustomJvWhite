package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hf2 extends jf2 {
    public final String a;
    public final List b;

    public hf2(String str, List list) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.jf2
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf2)) {
            return false;
        }
        hf2 hf2Var = (hf2) obj;
        return this.a.equals(hf2Var.a) && this.b.equals(hf2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Front(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}

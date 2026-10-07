package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gf2 extends jf2 {
    public final String a;
    public final List b;

    public gf2(String str, List list) {
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
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2Var = (gf2) obj;
        return this.a.equals(gf2Var.a) && this.b.equals(gf2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Back(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}

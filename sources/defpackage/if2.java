package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class if2 extends jf2 {
    public final String a;
    public final List b;

    public if2(String str, List list) {
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
        if (!(obj instanceof if2)) {
            return false;
        }
        if2 if2Var = (if2) obj;
        return this.a.equals(if2Var.a) && this.b.equals(if2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(cameraId=" + this.a + ", cameraParameterList=" + this.b + ")";
    }
}

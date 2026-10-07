package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ve2 {
    public final se2 a;
    public final Map b;

    public ve2(se2 se2Var, Map map) {
        this.a = se2Var;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve2)) {
            return false;
        }
        ve2 ve2Var = (ve2) obj;
        return this.a.equals(ve2Var.a) && this.b.equals(ve2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraGraphCreationResult(config=" + this.a + ", streamConfigMap=" + this.b + ')';
    }
}

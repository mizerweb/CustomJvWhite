package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ff2 {
    public final ArrayList a;
    public final qh0 b;

    public ff2(ArrayList arrayList, qh0 qh0Var) {
        this.a = arrayList;
        this.b = qh0Var;
        qyj.h("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        qyj.l("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) ww3.r1(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff2)) {
            return false;
        }
        ff2 ff2Var = (ff2) obj;
        return this.a.equals(ff2Var.a) && cqk.d(this.b, ff2Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qh0 qh0Var = this.b;
        return iHashCode + (qh0Var != null ? qh0Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(ww3.z1(this.a, ",", null, null, null, 62));
        qh0 qh0Var = this.b;
        if (qh0Var != null) {
            str = ", compatId=" + qh0Var;
        } else {
            str = "";
        }
        return x05.i(sb, str, '}');
    }
}

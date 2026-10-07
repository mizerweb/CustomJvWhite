package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ze1 {
    public final Bundle a;
    public final List b;
    public final LinkedHashMap c;
    public final Point d;

    public ze1(Bundle bundle, c79 c79Var, LinkedHashMap linkedHashMap, Point point) {
        this.a = bundle;
        this.b = c79Var;
        this.c = linkedHashMap;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ze1)) {
            return false;
        }
        ze1 ze1Var = (ze1) obj;
        return this.a.equals(ze1Var.a) && cqk.d(this.b, ze1Var.b) && this.c.equals(ze1Var.c) && cqk.d(this.d, ze1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + qv1.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        Point point = this.d;
        return iHashCode + (point == null ? 0 : point.hashCode());
    }

    public final String toString() {
        return "CallContextMenuInfo(bundle=" + this.a + ", actions=" + this.b + ", statParam=" + this.c + ", anchor=" + this.d + ")";
    }
}

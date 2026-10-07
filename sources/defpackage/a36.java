package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a36 {
    public final ArrayList a;
    public final RectF b;

    public a36(ArrayList arrayList, RectF rectF) {
        this.a = arrayList;
        this.b = rectF;
    }

    public final RectF a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a36)) {
            return false;
        }
        a36 a36Var = (a36) obj;
        return this.a.equals(a36Var.a) && cqk.d(this.b, a36Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        RectF rectF = this.b;
        return iHashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "EditorStateModel(layers=" + this.a + ", bounds=" + this.b + ")";
    }
}

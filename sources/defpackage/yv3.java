package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class yv3 implements iq9 {
    public final float[] a;
    public final ArrayList b;
    public final r8e c;
    public final u8b d;
    public final boolean e;

    public yv3(float[] fArr, ArrayList arrayList, r8e r8eVar, u8b u8bVar, boolean z) {
        this.a = fArr;
        this.b = arrayList;
        this.c = r8eVar;
        this.d = u8bVar;
        this.e = z;
    }

    @Override // defpackage.iq9
    public final boolean d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yv3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        yv3 yv3Var = (yv3) obj;
        return this.e == yv3Var.e && Arrays.equals(this.a, yv3Var.a) && this.b.equals(yv3Var.b) && this.d.equals(yv3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x05.b(this.b, (Arrays.hashCode(this.a) + (Boolean.hashCode(this.e) * 31)) * 31, 31);
    }
}

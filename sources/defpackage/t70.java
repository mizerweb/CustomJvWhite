package defpackage;

import android.os.Build;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class t70 {
    public static final t70 d;
    public final int a;
    public final int b;
    public final u98 c;

    static {
        t70 t70Var;
        if (Build.VERSION.SDK_INT >= 33) {
            t98 t98Var = new t98();
            for (int i = 1; i <= 10; i++) {
                t98Var.h(Integer.valueOf(vqi.u(i)));
            }
            t70Var = new t70(2, t98Var.j());
        } else {
            t70Var = new t70(2, 10);
        }
        d = t70Var;
    }

    public t70(int i, Set set) {
        this.a = i;
        u98 u98VarM = u98.m(set);
        this.c = u98VarM;
        pci it = u98VarM.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
        }
        this.b = iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t70)) {
            return false;
        }
        t70 t70Var = (t70) obj;
        return this.a == t70Var.a && this.b == t70Var.b && Objects.equals(this.c, t70Var.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        u98 u98Var = this.c;
        return i + (u98Var == null ? 0 : u98Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public t70(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}

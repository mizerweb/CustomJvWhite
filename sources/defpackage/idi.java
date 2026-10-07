package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class idi extends kdi {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idi(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.kdi
    public final boolean c(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (ldi.h) {
                    if (ldi.g(j, obj) == 0) {
                        return false;
                    }
                } else if (ldi.h(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (ldi.h) {
                    if (ldi.g(j, obj) == 0) {
                        return false;
                    }
                } else if (ldi.h(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.kdi
    public final byte d(long j, Object obj) {
        switch (this.b) {
            case 0:
                return ldi.h ? ldi.g(j, obj) : ldi.h(j, obj);
            default:
                return ldi.h ? ldi.g(j, obj) : ldi.h(j, obj);
        }
    }

    @Override // defpackage.kdi
    public final double e(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.kdi
    public final float f(long j, Object obj) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.kdi
    public final void k(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!ldi.h) {
                    ldi.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ldi.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!ldi.h) {
                    ldi.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    ldi.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.kdi
    public final void l(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!ldi.h) {
                    ldi.l(obj, j, b);
                } else {
                    ldi.k(obj, j, b);
                }
                break;
            default:
                if (!ldi.h) {
                    ldi.l(obj, j, b);
                } else {
                    ldi.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.kdi
    public final void m(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                p(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                p(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.kdi
    public final void n(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                o(j, obj, Float.floatToIntBits(f));
                break;
            default:
                o(j, obj, Float.floatToIntBits(f));
                break;
        }
    }
}

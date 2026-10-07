package defpackage;

import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* JADX INFO: loaded from: classes2.dex */
public final class sc8 implements mcg, nsi {
    public static final sc8 c;
    public static final sc8 d;
    public final /* synthetic */ int a;
    public final boolean b;

    static {
        int i = 0;
        c = new sc8(true, i);
        d = new sc8(false, i);
    }

    public sc8() {
        this.a = 1;
        this.b = rk5.a.b(SurfaceOrderQuirk.class) != null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return qt4.r(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        return rx8.q(0, this.b ? kbcVar.s().c : -1);
    }

    public /* synthetic */ sc8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}

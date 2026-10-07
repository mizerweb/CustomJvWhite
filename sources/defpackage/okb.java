package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class okb extends kih {
    public long c;
    public rfd d;

    public okb(fka fkaVar) {
        super(fkaVar);
    }

    @Override // defpackage.kih
    public final void b(fka fkaVar, String str) {
        str.getClass();
        if (str.equals("presence")) {
            this.d = p90.I(fkaVar);
        } else if (str.equals("userId")) {
            this.c = fkaVar.I0();
        } else {
            fkaVar.x();
        }
    }

    public final rfd h() {
        return this.d;
    }

    public final long i() {
        return this.c;
    }

    @Override // defpackage.sq0
    public final String toString() {
        StringBuilder sbT = qt4.t(this.c, "{userId=", ", presence=", String.valueOf(this.d));
        sbT.append("}");
        return sbT.toString();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u74 extends s74 {
    public final boolean c;

    public u74(qf4 qf4Var, boolean z) {
        super(qf4Var);
        this.c = z;
    }

    @Override // defpackage.s74
    public final void f(byte b) {
        if (this.c) {
            l(String.valueOf(b & 255));
        } else {
            j(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.s74
    public final void h(int i) {
        boolean z = this.c;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            l(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // defpackage.s74
    public final void i(long j) {
        boolean z = this.c;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            l(unsignedString);
        } else {
            j(unsignedString);
        }
    }

    @Override // defpackage.s74
    public final void k(short s) {
        if (this.c) {
            l(String.valueOf(s & 65535));
        } else {
            j(String.valueOf(s & 65535));
        }
    }
}

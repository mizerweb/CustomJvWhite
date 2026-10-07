package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hg8 extends t4d {
    public final boolean l;

    public hg8(String str, oj7 oj7Var) {
        super(str, oj7Var, 1);
        this.l = true;
    }

    @Override // defpackage.t4d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hg8) {
            fif fifVar = (fif) obj;
            if (this.a.equals(fifVar.i())) {
                hg8 hg8Var = (hg8) obj;
                if (hg8Var.l && Arrays.equals((fif[]) this.j.getValue(), (fif[]) hg8Var.j.getValue())) {
                    int iE = fifVar.e();
                    int i = this.c;
                    if (i == iE) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (cqk.d(h(i2).i(), fifVar.h(i2).i()) && cqk.d(h(i2).d(), fifVar.h(i2).d())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.t4d
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // defpackage.t4d, defpackage.fif
    public final boolean isInline() {
        return this.l;
    }
}

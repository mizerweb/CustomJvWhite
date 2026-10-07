package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m55 extends p55 {
    public final nvd j;
    public final t3a k;

    public m55(q55 q55Var, lq0 lq0Var, es0 es0Var, nvd nvdVar, t3a t3aVar, int i) {
        super(q55Var, lq0Var, es0Var, i);
        this.j = nvdVar;
        this.k = t3aVar;
        this.h = 0;
    }

    @Override // defpackage.p55
    public final int n(p76 p76Var) {
        return this.j.f;
    }

    @Override // defpackage.p55
    public final s98 o() {
        int i = this.j.e;
        Object obj = this.k.a;
        boolean z = i >= 0;
        s98 s98Var = new s98();
        s98Var.a = i;
        s98Var.b = z;
        s98Var.c = false;
        return s98Var;
    }

    @Override // defpackage.p55
    public final synchronized boolean s(p76 p76Var, int i) {
        int iIntValue;
        if (p76Var == null) {
            return false;
        }
        try {
            boolean zD = this.g.d(p76Var, i);
            if (lq0.b(i) || lq0.l(i, 8)) {
                if (!lq0.l(i, 4) && p76.P(p76Var)) {
                    p76Var.Y();
                    if (p76Var.b == kb5.a) {
                        if (!this.j.b(p76Var)) {
                            return false;
                        }
                        int i2 = this.j.e;
                        int i3 = this.h;
                        if (i2 <= i3) {
                            return false;
                        }
                        Object obj = this.k.a;
                        List list = Collections.EMPTY_LIST;
                        if (list != null && !list.isEmpty()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= list.size()) {
                                    iIntValue = Integer.MAX_VALUE;
                                    break;
                                }
                                if (((Integer) list.get(i4)).intValue() > i3) {
                                    iIntValue = ((Integer) list.get(i4)).intValue();
                                    break;
                                }
                                i4++;
                            }
                        } else {
                            iIntValue = i3 + 1;
                        }
                        if (i2 < iIntValue && !this.j.g) {
                            return false;
                        }
                        this.h = i2;
                    }
                }
            }
            return zD;
        } catch (Throwable th) {
            throw th;
        }
    }
}

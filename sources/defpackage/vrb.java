package defpackage;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class vrb {
    public final hl8 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public vrb(hl8 hl8Var, int[] iArr, String[] strArr) {
        this.a = hl8Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : c76.a;
        } else {
            ore.k("Check failed.");
            throw null;
        }
    }

    public final int[] a() {
        return this.b;
    }

    public final void b(Set set) {
        int[] iArr = this.b;
        int length = iArr.length;
        Set setE = c76.a;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                gof gofVar = new gof();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        gofVar.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                setE = p90.e(gofVar);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                setE = this.d;
            }
        }
        if (setE.isEmpty()) {
            return;
        }
        this.a.b(setE);
    }
}

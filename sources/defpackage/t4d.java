package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t4d implements fif, j81 {
    public final String a;
    public final oj7 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;

    public t4d(String str, oj7 oj7Var, int i) {
        this.a = str;
        this.b = oj7Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = s66.a;
        af7 af7Var = new af7(this) { // from class: s4d
            public final /* synthetic */ t4d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i5 = i2;
                t4d t4dVar = this.b;
                switch (i5) {
                    case 0:
                        oj7 oj7Var2 = t4dVar.b;
                        return oj7Var2 != null ? oj7Var2.b() : h1h.a;
                    case 1:
                        return wk8.j(t4dVar.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(vhl.b(t4dVar, (fif[]) t4dVar.j.getValue()));
                }
            }
        };
        final int i5 = 2;
        this.i = rx8.P(2, af7Var);
        final int i6 = 1;
        this.j = rx8.P(2, new af7(this) { // from class: s4d
            public final /* synthetic */ t4d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i6;
                t4d t4dVar = this.b;
                switch (i7) {
                    case 0:
                        oj7 oj7Var2 = t4dVar.b;
                        return oj7Var2 != null ? oj7Var2.b() : h1h.a;
                    case 1:
                        return wk8.j(t4dVar.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(vhl.b(t4dVar, (fif[]) t4dVar.j.getValue()));
                }
            }
        });
        this.k = rx8.P(2, new af7(this) { // from class: s4d
            public final /* synthetic */ t4d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i7 = i5;
                t4d t4dVar = this.b;
                switch (i7) {
                    case 0:
                        oj7 oj7Var2 = t4dVar.b;
                        return oj7Var2 != null ? oj7Var2.b() : h1h.a;
                    case 1:
                        return wk8.j(t4dVar.b != null ? new ArrayList(0) : null);
                    default:
                        return Integer.valueOf(vhl.b(t4dVar, (fif[]) t4dVar.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.j81
    public final Set a() {
        return this.h.keySet();
    }

    @Override // defpackage.fif
    public final boolean b() {
        return false;
    }

    @Override // defpackage.fif
    public final int c(String str) {
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.fif
    public lvb d() {
        return c6h.f;
    }

    @Override // defpackage.fif
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t4d) {
            fif fifVar = (fif) obj;
            if (this.a.equals(fifVar.i()) && Arrays.equals((fif[]) this.j.getValue(), (fif[]) ((t4d) obj).j.getValue())) {
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
        return false;
    }

    @Override // defpackage.fif
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.fif
    public final List g(int i) {
        List list = this.f[i];
        return list == null ? r66.a : list;
    }

    @Override // defpackage.fif
    public final List getAnnotations() {
        return r66.a;
    }

    @Override // defpackage.fif
    public fif h(int i) {
        return ((aw8[]) this.i.getValue())[i].d();
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.fif
    public final String i() {
        return this.a;
    }

    @Override // defpackage.fif
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.fif
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return ww3.z1(oc9.f0(0, this.c), ", ", this.a.concat("("), ")", new lh9(28, this), 24);
    }
}

package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nk5 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public nk5(int i, int i2, int i3, qg7 qg7Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = qg7Var;
    }

    public void a(int i, int i2) {
        if (i < 0) {
            ore.p("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            ore.p("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public ok5 b() {
        lvb.R(this.b <= this.c);
        return new ok5(this);
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        vee veeVar = recyclerView.n;
        if (recyclerView.m == null || veeVar == null || !veeVar.i) {
            return;
        }
        if (z) {
            if (!recyclerView.e.s()) {
                veeVar.j(recyclerView.m.l(), this);
            }
        } else if (!recyclerView.W()) {
            veeVar.i(this.a, this.b, recyclerView.G1, this);
        }
        int i = this.c;
        if (i > veeVar.j) {
            veeVar.j = i;
            veeVar.k = z;
            recyclerView.c.m();
        }
    }

    public int d() {
        return this.a;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.c;
    }

    public nk5(int i) {
        this.a = i;
    }
}

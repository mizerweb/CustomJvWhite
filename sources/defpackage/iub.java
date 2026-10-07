package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class iub extends afe {
    public int a = -1;
    public int b = -1;

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        if (linearLayoutManagerE0 == null) {
            ore.k("Only linear layout manger supported");
            return;
        }
        int iX0 = linearLayoutManagerE0.X0();
        int iZ0 = linearLayoutManagerE0.Z0();
        if (iX0 == -1 || iZ0 == -1) {
            return;
        }
        if (iX0 == this.a && iZ0 == this.b) {
            return;
        }
        this.a = iX0;
        this.b = iZ0;
        c(iX0, iZ0);
    }

    public abstract void c(int i, int i2);
}

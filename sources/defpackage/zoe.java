package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zoe implements z09 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zoe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z09
    public final void l(g19 g19Var, m09 m09Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bpe bpeVar = (bpe) obj;
                WeakReference weakReference = bpeVar.e;
                int i2 = ape.$EnumSwitchMapping$0[m09Var.ordinal()];
                RecyclerView recyclerView = null;
                if (i2 == 1) {
                    bpeVar.g = true;
                    RecyclerView recyclerView2 = (RecyclerView) weakReference.get();
                    if (recyclerView2 != null) {
                        recyclerView = recyclerView2.getAdapter() != null ? recyclerView2 : null;
                        if (recyclerView != null) {
                            bpeVar.b(recyclerView);
                        }
                    }
                    break;
                } else if (i2 == 2) {
                    bpeVar.g = false;
                    RecyclerView recyclerView3 = (RecyclerView) weakReference.get();
                    if (recyclerView3 != null) {
                        if (recyclerView3.getAdapter() == null && recyclerView3.s) {
                            recyclerView = recyclerView3;
                        }
                        if (recyclerView != null) {
                            bpeVar.a(recyclerView);
                        }
                    }
                    break;
                }
                break;
            default:
                b1f b1fVar = (b1f) obj;
                if (m09Var == m09.ON_START) {
                    b1fVar.f = true;
                } else if (m09Var == m09.ON_STOP) {
                    b1fVar.f = false;
                }
                break;
        }
    }
}

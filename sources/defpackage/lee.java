package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class lee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ lee(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.x) {
                        recyclerView.q();
                    } else {
                        recyclerView.w = true;
                    }
                    break;
                }
                break;
            default:
                see seeVar = recyclerView.o1;
                if (seeVar != null) {
                    seeVar.h();
                }
                recyclerView.M1 = false;
                break;
        }
    }
}

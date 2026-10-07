package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tyc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ tyc(RecyclerView recyclerView, int i) {
        this.a = i;
        this.b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RecyclerView recyclerView = this.b;
        switch (i) {
            case 0:
                recyclerView.X();
                break;
            case 1:
                recyclerView.X();
                break;
            default:
                recyclerView.X();
                break;
        }
    }
}

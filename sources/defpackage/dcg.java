package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class dcg extends afe {
    public boolean a = false;
    public final /* synthetic */ ecg b;

    public dcg(ecg ecgVar) {
        this.b = ecgVar;
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.a) {
            this.a = false;
            this.b.g();
        }
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.a = true;
    }
}

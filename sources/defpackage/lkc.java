package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class lkc extends ree {
    public final int a;
    public final float b = 0.5f;
    public final float c = 0.5f;

    public lkc(int i) {
        this.a = i;
    }

    @Override // defpackage.ree
    public final EdgeEffect a(RecyclerView recyclerView, int i) {
        return new kkc(i, this, recyclerView, recyclerView.getContext());
    }
}

package defpackage;

import android.view.View;
import androidx.fragment.app.a;

/* JADX INFO: loaded from: classes.dex */
public final class sa7 extends qe7 {
    public final /* synthetic */ a g;

    public sa7(a aVar) {
        this.g = aVar;
    }

    @Override // defpackage.qe7
    public final View A(int i) {
        throw new IllegalStateException(zo5.n("Fragment ", this.g, " does not have a view"));
    }

    @Override // defpackage.qe7
    public final boolean B() {
        return false;
    }
}

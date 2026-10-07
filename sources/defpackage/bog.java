package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class bog extends g6g {
    public final ExecutorService f;
    public final dj9 g;
    public final vog h;
    public final wmg i;

    public bog(ExecutorService executorService, dj9 dj9Var, vog vogVar) {
        super(executorService);
        this.f = executorService;
        this.g = dj9Var;
        this.h = vogVar;
        this.i = new wmg(this, 1);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new zng(viewGroup.getContext(), this.g, this.f, this.i);
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gyd extends g6g {
    public final uik f;
    public final a8d g;

    public gyd(uik uikVar, ExecutorService executorService, a8d a8dVar) {
        super(executorService);
        this.f = uikVar;
        this.g = a8dVar;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(iyd iydVar, int i) {
        hyd hydVar = (hyd) ((k79) F(i));
        if (iydVar instanceof fvj) {
            ((fvj) iydVar).B(hydVar);
        } else if (iydVar instanceof gz0) {
            ore.m();
        } else {
            iydVar.B(hydVar);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        a8d a8dVar = this.g;
        if (i == R.id.oneme_stories_preset_whitelist_item) {
            return new fvj(viewGroup.getContext(), this.f, (kbc) a8dVar.invoke());
        }
        if (i != R.id.oneme_stories_preset_blacklist_item) {
            ahc.b(i, "!", "Unknown view type ");
            return null;
        }
        Context context = viewGroup.getContext();
        kbc kbcVar = (kbc) a8dVar.invoke();
        izb izbVar = new izb(context, false);
        izbVar.setCustomTheme(kbcVar);
        return new gz0(izbVar);
    }
}

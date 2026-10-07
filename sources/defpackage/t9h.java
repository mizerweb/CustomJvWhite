package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t9h extends g6g {
    public final SuggestionsWidget f;
    public final boolean g;

    public t9h(SuggestionsWidget suggestionsWidget, boolean z, ExecutorService executorService) {
        super(executorService);
        this.f = suggestionsWidget;
        this.g = z;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N */
    public final void u(v9h v9hVar, int i) {
        u9h u9hVar = (u9h) ((k79) F(i));
        izb izbVar = (izb) v9hVar.a;
        izbVar.setId(R.id.writebar__suggestion_item);
        CharSequence charSequence = u9hVar.b;
        izbVar.setTitle(charSequence);
        izbVar.setSubtitle(u9hVar.d);
        int i2 = u9hVar.g;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            izbVar.j(u9hVar.a, charSequence, u9hVar.c);
        } else {
            ny8 ny8Var = izbVar.b;
            if (ny8Var.d()) {
                ((kwb) ny8Var.getValue()).setVisibility(8);
            }
        }
        boolean zIsEmpty = u9hVar.f.isEmpty();
        SuggestionsWidget suggestionsWidget = this.f;
        if (zIsEmpty) {
            izbVar.n(null, (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, null);
        } else {
            izbVar.n(Integer.valueOf(R.drawable.icon_chevron_down), (6 & 2) != 0 ? zxb.SECONDARY : zxb.GHOST, null, new i8f(suggestionsWidget, izbVar, u9hVar, 5));
        }
        qe7.H(izbVar, 300L, new jvf(suggestionsWidget, 13, u9hVar));
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        izb izbVar = new izb(viewGroup.getContext(), false);
        v9h v9hVar = new v9h(izbVar);
        kbc kbcVar = pq3.j.e(izbVar.getContext()).j().b;
        if (!this.g) {
            kbcVar = null;
        }
        izbVar.setCustomTheme(kbcVar);
        return v9hVar;
    }
}

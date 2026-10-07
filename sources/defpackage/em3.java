package defpackage;

import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class em3 extends nee implements g96 {
    public boolean d;

    public em3() {
        D(true);
    }

    @Override // defpackage.g96
    public final void g() {
        this.d = true;
        o();
    }

    @Override // defpackage.g96
    public final void i() {
        this.d = false;
        o();
    }

    @Override // defpackage.nee
    public final int l() {
        return this.d ? 1 : 0;
    }

    @Override // defpackage.nee
    public final long m(int i) {
        return R.id.oneme_chat_list_loading_id;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        return R.id.oneme_chat_list_loading_view_type;
    }

    @Override // defpackage.nee
    public final /* bridge */ /* synthetic */ void u(lfe lfeVar, int i) {
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        return new gm3(new fm3(viewGroup.getContext()));
    }
}

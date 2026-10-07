package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ac8 extends wod {
    public final ctf u;

    public ac8(Context context) {
        super(new atf(context));
        this.u = new ctf(64L, 0, ynh.b, null, null, null, null, fsf.a, null, false, new tnh(R.string.oneme_profile_edit_inactive_ttl_title), 632);
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        ((atf) this.a).setModelItem(ctf.i(this.u, ((zb8) k79Var).a, null, null, 2043));
    }
}

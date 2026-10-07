package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class osi extends EnhancedVectorDrawable implements eph {
    public final int a;
    public final nsi b;

    /* JADX WARN: Illegal instructions before constructor call */
    public osi(Context context, int i, nsi nsiVar) {
        int i2;
        int i3 = psi.$EnumSwitchMapping$0[qt4.D(i)];
        if (i3 == 1) {
            i2 = R.drawable.verification_mark_12;
        } else {
            if (i3 != 2 && i3 != 3) {
                ore.o();
                throw null;
            }
            i2 = R.drawable.verification_mark_16;
        }
        super(context, i2);
        this.a = i;
        this.b = nsiVar;
        onThemeChanged(pq3.j.e(context).m());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        long jV = this.b.v(kbcVar);
        lvb.A0(this, "mark_path", (int) (jV >> 32));
        lvb.A0(this, "background_path", (int) (jV & 4294967295L));
    }
}

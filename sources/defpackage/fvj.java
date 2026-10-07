package defpackage;

import android.content.Context;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class fvj extends iyd {
    public final uik u;

    public fvj(Context context, uik uikVar, kbc kbcVar) {
        izb izbVar = new izb(context, false);
        izbVar.setCustomTheme(kbcVar);
        super(izbVar);
        this.u = uikVar;
        izbVar.setRadioSelectionEnabled(true);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(hyd hydVar) {
        boolean z = hydVar.e;
        Integer numValueOf = z ? Integer.valueOf(R.drawable.icon_chevron_right) : null;
        izb izbVar = (izb) this.a;
        izbVar.setRadioButtonClickListener(null);
        izbVar.setRadioItemSelected(hydVar.c);
        izbVar.setTitle(hydVar.b.b(izbVar.getContext()));
        ynh ynhVar = hydVar.d;
        izbVar.setSubtitle(ynhVar != null ? ynhVar.b(izbVar.getContext()) : null);
        izbVar.setFirstTrailingIcon(numValueOf);
        qe7.H(izbVar, 300L, new x62(this, 4, hydVar));
        if (z) {
            izbVar.setFirstTrailingIconClickListener(new gb3(this, 7, hydVar));
        }
        izbVar.setRadioButtonClickListener(new zd(this, hydVar, izbVar, 5));
    }
}

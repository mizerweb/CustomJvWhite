package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class s6c extends fs implements eph {
    public kbc e;

    public s6c(Context context) {
        super(context, null, 0);
        setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
        a(isChecked(), pq3.j.h(this));
    }

    public final void a(boolean z, kbc kbcVar) {
        setButtonTintList(ColorStateList.valueOf(z ? kbcVar.getIcon().h : kbcVar.B().b));
    }

    public final kbc getCustomTheme() {
        return this.e;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        boolean zIsChecked = isChecked();
        kbc kbcVar2 = this.e;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        a(zIsChecked, kbcVar);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        kbc kbcVarH = this.e;
        if (kbcVarH == null) {
            kbcVarH = pq3.j.h(this);
        }
        a(z, kbcVarH);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.e = kbcVar;
        boolean zIsChecked = isChecked();
        if (kbcVar == null) {
            kbcVar = pq3.j.h(this);
        }
        a(zIsChecked, kbcVar);
    }
}

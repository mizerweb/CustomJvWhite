package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hh5 extends wod {
    public hh5(Context context) {
        cyb cybVar = new cyb(context);
        super(cybVar);
        cybVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cybVar.setSize(ayb.h);
        cybVar.setAppearance(zxb.GHOST);
        cybVar.setTextColor(Integer.valueOf(R.attr.text_negative));
        cybVar.setIconColor(Integer.valueOf(R.attr.icon_negative));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        View view = this.a;
        cyb cybVar = (cyb) view;
        CharSequence charSequenceB = ((ih5) k79Var).a.b(view.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        cybVar.setText(charSequenceB);
    }
}

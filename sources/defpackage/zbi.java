package defpackage;

import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zbi extends LinearLayout {
    public xbi a;

    private final void setBlockReasonButtons(List<wbi> list) {
        zxb zxbVar;
        removeAllViews();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            CharSequence charSequence = "";
            zxbVar = zxb.GHOST;
            if (!zHasNext) {
                break;
            }
            wbi wbiVar = (wbi) it.next();
            cyb cybVar = new cyb(getContext());
            cybVar.setId(wbiVar.a);
            cybVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            cybVar.setAppearance(zxbVar);
            cybVar.setSize(ayb.g);
            CharSequence charSequenceD = wbiVar.b.d(cybVar);
            if (charSequenceD != null) {
                charSequence = charSequenceD;
            }
            cybVar.setText(charSequence);
            qe7.H(cybVar, 300L, new sk6(this, wbiVar, 2, 4));
            addView(cybVar);
        }
        tnh tnhVar = new tnh(R.string.unknown_call_block_reason_close);
        wbi wbiVar2 = new wbi(R.id.unknown_call_bottom_sheet_close_button, tnhVar);
        cyb cybVar2 = new cyb(getContext());
        cybVar2.setId(R.id.unknown_call_bottom_sheet_close_button);
        cybVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cybVar2.setAppearance(zxbVar);
        cybVar2.setSize(ayb.g);
        CharSequence charSequenceD2 = tnhVar.d(cybVar2);
        cybVar2.setText(charSequenceD2 != null ? charSequenceD2 : "");
        qe7.H(cybVar2, 300L, new sk6(this, wbiVar2, 2, 4));
        addView(cybVar2);
    }

    private final void setCallStatusButtons(List<wbi> list) {
        removeAllViews();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            wbi wbiVar = (wbi) obj;
            hb8 hb8Var = new hb8(i, 8);
            cyb cybVar = new cyb(getContext());
            cybVar.setId(wbiVar.a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            hb8Var.invoke(layoutParams);
            cybVar.setLayoutParams(layoutParams);
            cybVar.setAppearance(zxb.SECONDARY);
            cybVar.setSize(ayb.g);
            CharSequence charSequenceD = wbiVar.b.d(cybVar);
            if (charSequenceD == null) {
                charSequenceD = "";
            }
            cybVar.setText(charSequenceD);
            qe7.H(cybVar, 300L, new sk6(this, wbiVar, 1, 4));
            addView(cybVar);
            i = i2;
        }
    }

    public final void a(int i, List list) {
        int i2 = ybi.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            setCallStatusButtons(list);
        } else if (i2 == 2) {
            setBlockReasonButtons(list);
        } else {
            ore.o();
        }
    }

    public final void setListener(xbi xbiVar) {
        this.a = xbiVar;
    }
}

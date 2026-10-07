package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class obg implements TextWatcher {
    public final /* synthetic */ pbg a;
    public final /* synthetic */ int b;

    public obg(pbg pbgVar, int i) {
        this.a = pbgVar;
        this.b = i;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        cc4 cc4Var;
        tg8 tg8VarH0;
        gc4 gc4Var = this.a.v;
        boolean z = false;
        int length = charSequence != null ? charSequence.length() : 0;
        String string = charSequence != null ? charSequence.subSequence(i, i3 + i).toString() : null;
        String strConcat = "";
        if (string == null) {
            string = "";
        }
        int i4 = this.b;
        if (length == 2 && string.length() == 1) {
            if (i4 < 0) {
                gc4Var.getClass();
            } else if (i4 <= gc4Var.getCountCells()) {
                z = true;
            }
            if (z && string.length() == 1) {
                tg8 tg8VarH1 = gc4Var.H0(i4);
                if (tg8VarH1 != null) {
                    ((pbg) tg8VarH1).C(string);
                }
                tg8 tg8VarH2 = gc4Var.H0(i4 + 1);
                if (tg8VarH2 != null) {
                    ((pbg) tg8VarH2).w.requestFocus();
                    return;
                }
                return;
            }
            return;
        }
        if (length > 1) {
            gc4Var.I0(i4, String.valueOf(charSequence));
            return;
        }
        String strValueOf = String.valueOf(charSequence);
        if (i4 < 0) {
            gc4Var.getClass();
        } else if (i4 <= gc4Var.getCountCells()) {
            z = true;
        }
        if (z && strValueOf.length() == 1) {
            if (i4 < gc4Var.getCountCells() - 1 && (tg8VarH0 = gc4Var.H0(i4 + 1)) != null) {
                ((pbg) tg8VarH0).w.requestFocus();
            }
            Iterator it = gc4.G0(gc4Var).iterator();
            while (it.hasNext()) {
                strConcat = strConcat.concat(((pbg) ((tg8) it.next())).B());
            }
            if (strConcat.length() <= 0 || strConcat.length() != gc4Var.getCountCells() || !TextUtils.isDigitsOnly(strConcat) || (cc4Var = gc4Var.k2) == null) {
                return;
            }
            cc4Var.a(strConcat);
        }
    }
}

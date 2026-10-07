package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class dl5 extends qe7 {
    public final /* synthetic */ DialogFragment g;

    public dl5(DialogFragment dialogFragment, sa7 sa7Var) {
        this.g = dialogFragment;
    }

    @Override // defpackage.qe7
    public final View A(int i) {
        Dialog dialog = this.g.F1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.qe7
    public final boolean B() {
        return this.g.J1;
    }
}

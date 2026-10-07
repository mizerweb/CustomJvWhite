package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class bl5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public bl5(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.F1;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}

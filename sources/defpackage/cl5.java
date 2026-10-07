package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes2.dex */
public final class cl5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public cl5(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.F1;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}

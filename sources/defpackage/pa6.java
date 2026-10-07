package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class pa6 extends DialogFragment {
    public Dialog a;
    public DialogInterface.OnCancelListener b;
    public AlertDialog c;

    public static pa6 a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        pa6 pa6Var = new pa6();
        yab.t(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        pa6Var.a = dialog;
        pa6Var.b = onCancelListener;
        return pa6Var;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.c == null) {
            Activity activity = getActivity();
            yab.s(activity);
            this.c = new AlertDialog.Builder(activity).create();
        }
        return this.c;
    }
}

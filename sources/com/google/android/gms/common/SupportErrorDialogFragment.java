package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import defpackage.tl0;
import defpackage.yab;

/* JADX INFO: loaded from: classes2.dex */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog K1;
    public DialogInterface.OnCancelListener L1;
    public AlertDialog M1;

    public static SupportErrorDialogFragment R(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        yab.t(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        supportErrorDialogFragment.K1 = dialog;
        supportErrorDialogFragment.L1 = onCancelListener;
        return supportErrorDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog Q() {
        Dialog dialog = this.K1;
        if (dialog != null) {
            return dialog;
        }
        this.B1 = false;
        if (this.M1 == null) {
            Context contextJ = j();
            yab.s(contextJ);
            this.M1 = new AlertDialog.Builder(contextJ).create();
        }
        return this.M1;
    }

    public final void S(c cVar, String str) {
        this.H1 = false;
        this.I1 = true;
        cVar.getClass();
        tl0 tl0Var = new tl0(cVar);
        tl0Var.o = true;
        tl0Var.e(0, this, str);
        tl0Var.d(false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.L1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}

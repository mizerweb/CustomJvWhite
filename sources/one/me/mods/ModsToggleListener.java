package one.me.mods;

import android.content.DialogInterface;

/* JADX INFO: compiled from: ModsToggleListener.smali */
/* JADX INFO: loaded from: classes.dex */
public final class ModsToggleListener implements DialogInterface.OnMultiChoiceClickListener {
    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        Mods.set(i == 0 ? "noread" : "offline", z);
    }
}

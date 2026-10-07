package one.me.mods;

import android.view.View;

/* JADX INFO: compiled from: ModsClickListener.smali */
/* JADX INFO: loaded from: classes.dex */
public final class ModsClickListener implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Mods.showDialog(view.getContext());
    }
}

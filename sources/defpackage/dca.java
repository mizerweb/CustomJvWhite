package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: classes2.dex */
public final class dca implements ActionProvider.VisibilityListener {
    public xva a;
    public final ActionProvider b;

    public dca(gca gcaVar, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        xva xvaVar = this.a;
        if (xvaVar != null) {
            yba ybaVar = ((cca) xvaVar.b).n;
            ybaVar.h = true;
            ybaVar.q(true);
        }
    }
}

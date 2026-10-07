package defpackage;

import java.util.List;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class t33 extends kve {
    public final ChatMediaTabWidget k;
    public final long l;
    public final mg5 m;
    public final ha9 n;
    public final List o;

    public t33(ChatMediaTabWidget chatMediaTabWidget, long j, mg5 mg5Var, ha9 ha9Var) {
        super(chatMediaTabWidget);
        this.k = chatMediaTabWidget;
        this.l = j;
        this.m = mg5Var;
        this.n = ha9Var;
        this.o = ww3.T1(i43.d);
    }

    @Override // defpackage.kve
    public final void G(hve hveVar, int i) {
        if (hveVar.o()) {
            return;
        }
        i43 i43Var = (i43) this.o.get(i);
        ChatMediaListWidget chatMediaListWidget = new ChatMediaListWidget(this.l, this.m, i43Var, this.n);
        chatMediaListWidget.setTargetController(this.k);
        chatMediaListWidget.setRetainViewMode(xq4.b);
        hveVar.T(new lve(chatMediaListWidget, null, null, null, false, -1));
    }

    @Override // defpackage.nee
    public final int l() {
        return this.o.size();
    }

    @Override // defpackage.kve, defpackage.nee
    public final long m(int i) {
        return ((i43) this.o.get(i)).ordinal();
    }
}

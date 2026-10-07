package defpackage;

import one.me.devmenu.DevMenuScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class uj5 extends t8j {
    public final /* synthetic */ y8j a;
    public final /* synthetic */ DevMenuScreen b;

    public uj5(y8j y8jVar, DevMenuScreen devMenuScreen) {
        this.a = y8jVar;
        this.b = devMenuScreen;
    }

    @Override // defpackage.t8j
    public final void j(int i) {
        y8j y8jVar = this.a;
        y8jVar.post(new ai(y8jVar, i, this.b));
    }
}

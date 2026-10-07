package defpackage;

import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class nvj implements ny8 {
    public a8j a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ y7j d;

    public nvj(Widget widget, Class cls, y7j y7jVar) {
        this.b = widget;
        this.c = cls;
        this.d = y7jVar;
    }

    @Override // defpackage.ny8
    public final boolean d() {
        return this.a != null;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        a8j a8jVar = this.a;
        if (a8jVar != null) {
            return a8jVar;
        }
        a8j a8jVarA = this.b.viewModelStore.a(this.c, this.d);
        if (a8jVarA != null) {
            this.a = a8jVarA;
            return a8jVarA;
        }
        ore.p("Required value was null.");
        return null;
    }
}

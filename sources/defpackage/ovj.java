package defpackage;

import one.me.sdk.arch.NoSharedViewModelException;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final class ovj implements ny8 {
    public a8j a;
    public final /* synthetic */ Widget b;
    public final /* synthetic */ t3f c;
    public final /* synthetic */ Class d;
    public final /* synthetic */ af7 e;

    public ovj(Widget widget, t3f t3fVar, Class cls, af7 af7Var) {
        this.b = widget;
        this.c = t3fVar;
        this.d = cls;
        this.e = af7Var;
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
        je9 je9Var = je9.d;
        lvj[] lvjVarArr = lvj.a;
        a8j a8jVarA = null;
        for (int i = 0; i < 3; i++) {
            Widget widgetFindWidgetByScopeId$arch = this.b.findWidgetByScopeId$arch(this.c, lvjVarArr[i]);
            Widget widget = this.b;
            if (widgetFindWidgetByScopeId$arch != null) {
                String str = widget.tag;
                Class cls = this.d;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, c0a.o("Found vm=", cls.getCanonicalName(), " in parent scope, trying to access it"), null);
                }
                a8jVarA = widgetFindWidgetByScopeId$arch.viewModelStore.a(this.d, null);
            } else {
                String str2 = widget.tag;
                Class cls2 = this.d;
                af7 af7Var = this.e;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "Not found vm=" + cls2.getCanonicalName() + " in parent scope, trying to create it via fabric=" + af7Var, null);
                }
                af7 af7Var2 = this.e;
                a8jVarA = af7Var2 != null ? (a8j) af7Var2.invoke() : null;
            }
            if (a8jVarA != null) {
                break;
            }
        }
        if (a8jVarA != null) {
            this.a = a8jVarA;
            return a8jVarA;
        }
        boolean zIsDestroyed = this.b.isDestroyed();
        boolean zIsBeingDestroyed = this.b.isBeingDestroyed();
        boolean z = this.b.getView() == null;
        StringBuilder sbB = zo5.B("destroyed=", zIsDestroyed, ", beingDestroyed=", zIsBeingDestroyed, ", viewNull=");
        sbB.append(z);
        throw new NoSharedViewModelException(this.c, this.d, sbB.toString());
    }
}

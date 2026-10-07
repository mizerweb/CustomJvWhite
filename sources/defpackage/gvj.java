package defpackage;

import android.view.View;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvj implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ gvj(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                return Widget.viewBinding$lambda$1(widget, (View) obj, (yr3) obj2);
            default:
                return Widget.binding$lambda$1(widget, obj, (yr3) obj2);
        }
    }
}

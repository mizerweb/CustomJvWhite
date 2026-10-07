package defpackage;

import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class veh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeWidget b;

    public /* synthetic */ veh(SwipeWidget swipeWidget, int i) {
        this.a = i;
        this.b = swipeWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        boolean zS1;
        int i = this.a;
        SwipeWidget swipeWidget = this.b;
        switch (i) {
            case 0:
                zS1 = swipeWidget.s1();
                break;
            case 1:
                zS1 = swipeWidget.A1();
                break;
            default:
                zS1 = swipeWidget.o1();
                break;
        }
        return Boolean.valueOf(zS1);
    }
}

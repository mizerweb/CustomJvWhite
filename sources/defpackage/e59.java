package defpackage;

import one.me.android.deeplink.LinkInterceptorWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e59 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkInterceptorWidget b;

    public /* synthetic */ e59(LinkInterceptorWidget linkInterceptorWidget, int i) {
        this.a = i;
        this.b = linkInterceptorWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        LinkInterceptorWidget linkInterceptorWidget = this.b;
        switch (i) {
            case 0:
                return (d59) linkInterceptorWidget.a.getAccessor().c(1117);
            case 1:
                return vd7.o(linkInterceptorWidget.b, new ifh(new e59(linkInterceptorWidget, 2)), linkInterceptorWidget);
            default:
                return linkInterceptorWidget.getRouter();
        }
    }
}

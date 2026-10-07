package defpackage;

import one.me.chatscreen.mediabar.MediaBarWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ds9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ ds9(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        Object value;
        s50 s50Var;
        int i = this.a;
        MediaBarWidget mediaBarWidget = this.b;
        zv8[] zv8VarArr = MediaBarWidget.u1;
        switch (i) {
            case 0:
                mjg mjgVar = mediaBarWidget.C1().p;
                do {
                    value = mjgVar.getValue();
                    int iOrdinal = ((s50) value).ordinal();
                    if (iOrdinal == 0) {
                        s50Var = s50.b;
                    } else {
                        if (iOrdinal != 1) {
                            ore.o();
                            return null;
                        }
                        s50Var = s50.a;
                    }
                } while (!mjgVar.h(value, s50Var));
                return sbi.a;
            default:
                mediaBarWidget.x1().j(true);
                String str = mediaBarWidget.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "toolbar: popupLayoutChangeType=hide, scrollState=" + mediaBarWidget.x1().getScrollState(), null);
                    }
                }
                return sbi.a;
        }
    }
}

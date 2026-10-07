package defpackage;

import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xvg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StoriesWriteBarWidget b;

    public /* synthetic */ xvg(StoriesWriteBarWidget storiesWriteBarWidget, int i) {
        this.a = i;
        this.b = storiesWriteBarWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        StoriesWriteBarWidget storiesWriteBarWidget = this.b;
        switch (i) {
            case 0:
                wtc wtcVar = storiesWriteBarWidget.b;
                oma omaVar = (oma) wtcVar.getAccessor().c(796);
                ifh ifhVarD = wtcVar.getAccessor().d(136);
                mjg mjgVarA = p90.a(null);
                t73 t73Var = t73.e;
                omaVar.getClass();
                return new nma(null, null, false, omaVar.a, omaVar.b, omaVar.c, omaVar.d, ifhVarD, omaVar.e, omaVar.f, omaVar.g, omaVar.h, omaVar.i, omaVar.j, omaVar.k, omaVar.l, omaVar.m, omaVar.n, mjgVarA, o66.a, t73Var, null, omaVar.o);
            case 1:
                zv8[] zv8VarArr = StoriesWriteBarWidget.n;
                nma.L(storiesWriteBarWidget.s1(), false, 1);
                storiesWriteBarWidget.q1(storiesWriteBarWidget.r1());
                return sbi.a;
            case 2:
                zv8[] zv8VarArr2 = StoriesWriteBarWidget.n;
                return pq3.j.e(storiesWriteBarWidget.getContext()).m();
            case 3:
                wtc wtcVar2 = storiesWriteBarWidget.b;
                return ((fz9) wtcVar2.getAccessor().c(354)).a((vw8) wtcVar2.getAccessor().c(361));
            case 4:
                y9h y9hVar = (y9h) storiesWriteBarWidget.b.getAccessor().c(797);
                mjg mjgVarA2 = p90.a(null);
                t73 t73Var2 = t73.e;
                xvg xvgVar = storiesWriteBarWidget.e;
                return y9hVar.a(mjgVarA2, t73Var2, xvgVar, new fik(xvgVar));
            default:
                zv8[] zv8VarArr3 = StoriesWriteBarWidget.n;
                MessageWriteWidget messageWriteWidgetT1 = storiesWriteBarWidget.t1();
                if (messageWriteWidgetT1 == null || messageWriteWidgetT1.getViewLifecycleOwner().f().d.compareTo(n09.d) < 0) {
                    return null;
                }
                return messageWriteWidgetT1;
        }
    }
}

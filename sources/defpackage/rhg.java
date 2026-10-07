package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import one.me.startconversation.StartConversationScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rhg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartConversationScreen b;

    public /* synthetic */ rhg(StartConversationScreen startConversationScreen, int i) {
        this.a = i;
        this.b = startConversationScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        int i3 = 0;
        StartConversationScreen startConversationScreen = this.b;
        switch (i) {
            case 0:
                return startConversationScreen.c.g();
            case 1:
                zv8[] zv8VarArr = StartConversationScreen.A;
                return startConversationScreen.getRouter();
            case 2:
                return vd7.o(startConversationScreen.h, new ifh(new rhg(startConversationScreen, i2)), startConversationScreen);
            case 3:
                zv8[] zv8VarArr2 = StartConversationScreen.A;
                return new uj4(new ifh(new rhg(startConversationScreen, i3)));
            case 4:
                wtc wtcVar = startConversationScreen.c;
                return new xhg(wtcVar.getAccessor().d(23), wtcVar.getAccessor().d(7), wtcVar.getAccessor().d(133), (hk4) wtcVar.getAccessor().c(942), wtcVar.getAccessor().d(125), wtcVar.getAccessor().d(144), wtcVar.getAccessor().d(132), (xu1) startConversationScreen.i.getValue(), wtcVar.getAccessor().d(175), wtcVar.getAccessor().d(85), wtcVar.g(), wtcVar.getAccessor().d(48), wtcVar.getAccessor().d(353), wtcVar.getAccessor().d(751), wtcVar.getAccessor().d(350), ((Boolean) ((e5d) wtcVar.getAccessor().d(26).getValue()).n6.a(e5d.S6[379]).i()).booleanValue());
            case 5:
                wtc wtcVar2 = startConversationScreen.c;
                return ((ap0) wtcVar2.getAccessor().c(936)).a(wtcVar2.getAccessor().d(931), true, new irf(19));
            default:
                vv vvVar = startConversationScreen.d;
                zv8[] zv8VarArr3 = StartConversationScreen.A;
                zv8 zv8Var = zv8VarArr3[0];
                if (((Boolean) vvVar.a(startConversationScreen)).booleanValue()) {
                    ((RecyclerView) startConversationScreen.m.m(startConversationScreen, zv8VarArr3[3])).w0(0);
                    zv8 zv8Var2 = zv8VarArr3[0];
                    vvVar.b(startConversationScreen, Boolean.FALSE);
                }
                return sbi.a;
        }
    }
}

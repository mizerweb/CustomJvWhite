package defpackage;

import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bjf implements vf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ bjf(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (i) {
            case 0:
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) bottomSheetWidget;
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                ((cyb) serverHostBottomSheet.C.m(serverHostBottomSheet, ServerHostBottomSheet.D[4])).setEnabled(!(charSequence == null || charSequence.length() == 0));
                break;
            case 1:
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) bottomSheetWidget;
                CharSequence charSequence2 = (CharSequence) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                ((cyb) serverPortBottomSheet.x.m(serverPortBottomSheet, ServerPortBottomSheet.y[1])).setEnabled(!(charSequence2 == null || charSequence2.length() == 0));
                break;
            default:
                ValueBottomSheet valueBottomSheet = (ValueBottomSheet) bottomSheetWidget;
                CharSequence charSequence3 = (CharSequence) obj;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                ((Integer) obj4).getClass();
                ((cyb) valueBottomSheet.y.m(valueBottomSheet, ValueBottomSheet.z[3])).setEnabled(!(charSequence3 == null || charSequence3.length() == 0));
                break;
        }
        return sbiVar;
    }
}

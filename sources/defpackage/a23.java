package defpackage;

import android.content.Context;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a23 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaDownloadBottomSheet b;

    public /* synthetic */ a23(ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet, int i) {
        this.a = i;
        this.b = chatMediaDownloadBottomSheet;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = this.b;
        switch (i) {
            case 0:
                wtc wtcVar = chatMediaDownloadBottomSheet.u;
                ifh ifhVarD = wtcVar.getAccessor().d(136);
                ifh ifhVarD2 = wtcVar.getAccessor().d(317);
                vze vzeVar = (vze) wtcVar.getAccessor().c(263);
                ifh ifhVarD3 = wtcVar.getAccessor().d(146);
                ifh ifhVarD4 = wtcVar.getAccessor().d(138);
                ifh ifhVarD5 = wtcVar.getAccessor().d(318);
                Context context = (Context) wtcVar.getAccessor().c(7);
                xhh xhhVar = (xhh) wtcVar.getAccessor().c(23);
                return new n23(ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ifhVarD5, wtcVar.getAccessor().d(144), wtcVar.getAccessor().d(17), wtcVar.getAccessor().d(26), context, (wo6) wtcVar.getAccessor().c(54), xhhVar, vzeVar);
            default:
                zv8[] zv8VarArr = ChatMediaDownloadBottomSheet.B;
                v50 v50Var = new v50();
                v50Var.c = gm0.K(52.0f * yl5.d().getDisplayMetrics().density);
                v50Var.b = true;
                v50Var.invalidateSelf();
                kbc kbcVarT1 = chatMediaDownloadBottomSheet.t1();
                if (kbcVarT1 == null) {
                    kbcVarT1 = pq3.j.e(chatMediaDownloadBottomSheet.getContext()).m();
                }
                v50Var.c(kbcVarT1.getIcon().b);
                v50Var.b();
                return v50Var;
        }
    }
}

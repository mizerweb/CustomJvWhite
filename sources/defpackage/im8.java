package defpackage;

import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class im8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InviteByQrBottomSheet b;

    public /* synthetic */ im8(InviteByQrBottomSheet inviteByQrBottomSheet, int i) {
        this.a = i;
        this.b = inviteByQrBottomSheet;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = InviteByQrBottomSheet.H;
                h8c h8cVar = new h8c(inviteByQrBottomSheet);
                h8cVar.n(inviteByQrBottomSheet.getContext().getString(R.string.oneme_action_share_qr_code_error));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                return h8cVar;
            case 1:
                nm8 nm8Var = (nm8) inviteByQrBottomSheet.u.getAccessor().c(768);
                b0e b0eVarF1 = inviteByQrBottomSheet.F1();
                nm8Var.getClass();
                return new mm8(b0eVarF1, 0, nm8Var.a, nm8Var.b, nm8Var.c);
            default:
                return new uj4(inviteByQrBottomSheet.u.getAccessor().d(97));
        }
    }
}

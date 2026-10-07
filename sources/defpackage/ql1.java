package defpackage;

import android.content.Context;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ql1 implements oa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ql1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.oa4
    public final void a(Context context) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                CallHistoryScreen callHistoryScreen = (CallHistoryScreen) obj;
                zv8[] zv8VarArr = CallHistoryScreen.D;
                callHistoryScreen.u1((k92) callHistoryScreen.r1().l.getValue());
                rq rqVar = callHistoryScreen.x;
                if (rqVar != null) {
                    rqVar.setExpanded(true);
                }
                break;
            case 1:
                u92 u92Var = (u92) obj;
                u92Var.f.a();
                u92Var.g.a();
                u92Var.h.a();
                u92Var.i.a();
                break;
            case 2:
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) obj;
                zv8[] zv8VarArr2 = InviteByQrBottomSheet.H;
                String name = InviteByQrBottomSheet.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "Recreate qr code due to display config change", null);
                    }
                }
                if (inviteByQrBottomSheet.getView() != null) {
                    ((cs) inviteByQrBottomSheet.x.m(inviteByQrBottomSheet, InviteByQrBottomSheet.H[1])).setImageBitmap(null);
                }
                mm8 mm8Var = (mm8) inviteByQrBottomSheet.C.getValue();
                b0e b0eVarF1 = inviteByQrBottomSheet.F1();
                zv8[] zv8VarArr3 = mm8.j;
                mm8Var.B(b0eVarF1, true, 0);
                break;
            default:
                ((vxb) obj).c.a();
                break;
        }
    }
}

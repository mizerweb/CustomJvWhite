package defpackage;

import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class va4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConfirmAddOpponentToCallBottomSheet b;

    public /* synthetic */ va4(ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet, int i) {
        this.a = i;
        this.b = confirmAddOpponentToCallBottomSheet;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = this.b;
        switch (i) {
            case 0:
                ya4 ya4Var = (ya4) confirmAddOpponentToCallBottomSheet.u.getAccessor().c(842);
                return new xa4(ya4Var.a, ya4Var.b, ya4Var.c);
            default:
                int i2 = ConfirmAddOpponentToCallBottomSheet.x;
                return so2.F(confirmAddOpponentToCallBottomSheet.getContext(), 6);
        }
    }
}

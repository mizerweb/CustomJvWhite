package defpackage;

import android.view.View;
import one.me.settings.devices.hintdialog.QrAuthHintBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class aq4 extends wq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aq4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wq4
    public final void k(br4 br4Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ri) obj).dismiss();
                break;
            case 1:
                QrAuthHintBottomSheet qrAuthHintBottomSheet = (QrAuthHintBottomSheet) obj;
                if (!qrAuthHintBottomSheet.a) {
                    hrf.b.b().f();
                    qrAuthHintBottomSheet.a = false;
                }
                break;
            default:
                ((hve) obj).d.remove(br4Var);
                break;
        }
    }

    @Override // defpackage.wq4
    public void s(br4 br4Var, View view) {
        switch (this.a) {
            case 0:
                ((ri) this.b).dismiss();
                break;
        }
    }
}

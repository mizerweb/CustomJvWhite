package defpackage;

import android.view.View;
import one.me.sdk.bottomsheet.info.InfoBottomSheetWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class nd8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ InfoBottomSheetWidget b;

    public /* synthetic */ nd8(InfoBottomSheetWidget infoBottomSheetWidget, int i) {
        this.a = i;
        this.b = infoBottomSheetWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        InfoBottomSheetWidget infoBottomSheetWidget = this.b;
        switch (i) {
            case 0:
                infoBottomSheetWidget.O1();
                break;
            default:
                infoBottomSheetWidget.P1();
                break;
        }
    }
}

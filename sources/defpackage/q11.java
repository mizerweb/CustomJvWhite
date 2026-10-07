package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q11 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetWidget b;

    public /* synthetic */ q11(BottomSheetWidget bottomSheetWidget, int i) {
        this.a = i;
        this.b = bottomSheetWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Window window;
        View currentFocus;
        int i = this.a;
        View view = null;
        sbi sbiVar = sbi.a;
        BottomSheetWidget bottomSheetWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = BottomSheetWidget.t;
                Activity activity = bottomSheetWidget.getActivity();
                if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
                    currentFocus.clearFocus();
                    int i2 = uw8.a;
                    if (uw8.b(uw8.c)) {
                        boolean b = bottomSheetWidget.getB();
                        vv vvVar = bottomSheetWidget.q;
                        zv8 zv8Var = BottomSheetWidget.t[0];
                        vvVar.b(bottomSheetWidget, Boolean.valueOf(b));
                        ml9.d(currentFocus);
                    }
                    view = currentFocus;
                }
                bottomSheetWidget.p = view;
                break;
            case 1:
                View view2 = bottomSheetWidget.p;
                if (view2 != null) {
                    view2.requestFocus();
                    vv vvVar2 = bottomSheetWidget.q;
                    zv8 zv8Var2 = BottomSheetWidget.t[0];
                    if (((Boolean) vvVar2.a(bottomSheetWidget)).booleanValue()) {
                        ml9.e(view2);
                    }
                }
                bottomSheetWidget.p = null;
                break;
            default:
                h8c h8cVar = new h8c(bottomSheetWidget);
                h8cVar.m(new tnh(R.string.error_no_browser));
                h8cVar.a(new tnh(R.string.error_no_browser_desc));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                h8cVar.p();
                break;
        }
        return sbiVar;
    }
}

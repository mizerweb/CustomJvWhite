package defpackage;

import android.view.View;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rk6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FakeInAppReviewBottomSheet b;

    public /* synthetic */ rk6(FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet, int i) {
        this.a = i;
        this.b = fakeInAppReviewBottomSheet;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = this.b;
        switch (i) {
            case 0:
                fakeInAppReviewBottomSheet.D = false;
                gm0.n(fakeInAppReviewBottomSheet.m, "Click notNowBtn)");
                ia8 ia8Var = (ia8) fakeInAppReviewBottomSheet.u.getAccessor().f();
                if (ia8Var != null) {
                    ia8Var.b(3);
                }
                fakeInAppReviewBottomSheet.v1(true);
                break;
            default:
                zv8[] zv8VarArr = FakeInAppReviewBottomSheet.E;
                fakeInAppReviewBottomSheet.v1(true);
                break;
        }
    }
}

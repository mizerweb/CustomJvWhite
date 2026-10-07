package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hc4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;

    public /* synthetic */ hc4(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mc4 mc4Var;
        Bundle bundleH1;
        Bundle bundleH2;
        int i = this.a;
        int i2 = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) obj;
                zv8[] zv8VarArr = ConfirmationBottomSheet.G;
                if (!confirmationBottomSheet.I1()) {
                    vv vvVar = confirmationBottomSheet.C;
                    zv8 zv8Var = ConfirmationBottomSheet.G[7];
                    vvVar.b(confirmationBottomSheet, Boolean.TRUE);
                    zo3 zo3Var = confirmationBottomSheet.D;
                    if (zo3Var != null && (bundleH1 = confirmationBottomSheet.H1()) != null) {
                        bundleH1.putBoolean("option_row_checked", zo3Var.c.isChecked());
                    }
                    Object targetController = confirmationBottomSheet.getTargetController();
                    mc4Var = targetController instanceof mc4 ? (mc4) targetController : null;
                    if (mc4Var != null) {
                        mc4Var.e(i2, confirmationBottomSheet.H1());
                    }
                }
                confirmationBottomSheet.v1(true);
                break;
            case 1:
                ConfirmationBottomSheet confirmationBottomSheet2 = (ConfirmationBottomSheet) obj;
                zv8[] zv8VarArr2 = ConfirmationBottomSheet.G;
                if (!confirmationBottomSheet2.I1()) {
                    vv vvVar2 = confirmationBottomSheet2.C;
                    zv8 zv8Var2 = ConfirmationBottomSheet.G[7];
                    vvVar2.b(confirmationBottomSheet2, Boolean.TRUE);
                    zo3 zo3Var2 = confirmationBottomSheet2.D;
                    if (zo3Var2 != null && (bundleH2 = confirmationBottomSheet2.H1()) != null) {
                        bundleH2.putBoolean("option_row_checked", zo3Var2.c.isChecked());
                    }
                    Object targetController2 = confirmationBottomSheet2.getTargetController();
                    mc4Var = targetController2 instanceof mc4 ? (mc4) targetController2 : null;
                    if (mc4Var != null) {
                        mc4Var.e(i2, confirmationBottomSheet2.H1());
                    }
                }
                confirmationBottomSheet2.v1(true);
                break;
            default:
                b5e b5eVar = (b5e) obj;
                b5eVar.s = i2;
                for (int i3 = 0; i3 < 5; i3++) {
                    ImageView imageView = (ImageView) b5eVar.getChildAt(i3);
                    if (i3 <= i2) {
                        imageView.setImageResource(R.drawable.ic_selected_star);
                    } else {
                        EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(b5eVar.getContext(), R.drawable.ic_unselected_star);
                        lvb.B0(enhancedVectorDrawable, "stroke", pq3.j.h(b5eVar).B().b);
                        imageView.setImageDrawable(enhancedVectorDrawable);
                    }
                }
                b5eVar.setContentDescription(b5eVar.getResources().getQuantityString(R.plurals.oneme_in_app_review_rating_bar_accessibility, 5, Integer.valueOf(b5eVar.getSelected()), 5));
                a5e a5eVar = b5eVar.t;
                if (a5eVar != null) {
                    int selected = b5eVar.getSelected();
                    oo ooVar = (oo) a5eVar;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) ooVar.b;
                    FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) ooVar.c;
                    FrameLayout frameLayout = (FrameLayout) ooVar.d;
                    zv8[] zv8VarArr3 = FakeInAppReviewBottomSheet.E;
                    appCompatTextView.setPressed(false);
                    appCompatTextView.setBackground((RippleDrawable) fakeInAppReviewBottomSheet.B.getValue());
                    appCompatTextView.setTextColor(-1);
                    qe7.H(appCompatTextView, 300L, new sk6(fakeInAppReviewBottomSheet, selected, frameLayout, 0));
                }
                break;
        }
    }
}

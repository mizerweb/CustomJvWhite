package one.me.sdk.bottomsheet.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ayb;
import defpackage.cyb;
import defpackage.dk6;
import defpackage.gm0;
import defpackage.j95;
import defpackage.ld8;
import defpackage.lq4;
import defpackage.md8;
import defpackage.n1g;
import defpackage.nd8;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.yl5;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/info/InfoBottomSheetWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class InfoBottomSheetWidget extends BottomSheetWidget {
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;

    public InfoBottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.u = R.string.oneme_bottom_sheet_info_cancel_button;
        this.v = R.id.oneme_bottom_sheet_info_title;
        this.w = R.id.oneme_bottom_sheet_info_rationale;
        this.x = R.id.oneme_bottom_sheet_info_primary_button;
        this.y = R.id.oneme_bottom_sheet_info_cancel_button;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        ld8 ld8VarG1 = G1();
        if (ld8VarG1 != null) {
            md8 md8Var = new md8(linearLayout.getContext());
            md8Var.setHeaderIcon(ld8VarG1);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(md8Var.getLayoutParams());
            layoutParams.gravity = 1;
            layoutParams.topMargin = gm0.K(27.0f * yl5.d().getDisplayMetrics().density);
            linearLayout.addView(md8Var, layoutParams);
        }
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(getV());
        textView.setText(M1());
        textView.setGravity(1);
        textView.setTextAlignment(4);
        q9i.a(q9i.c, textView);
        int i = 3;
        lq4 lq4Var = null;
        n1g.N(new dk6(i, lq4Var, i), textView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gm0.K(19.0f * yl5.d().getDisplayMetrics().density);
        if (J1() == null) {
            layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        }
        linearLayout.addView(textView, layoutParams2);
        Integer numJ1 = J1();
        if (numJ1 != null) {
            int iIntValue = numJ1.intValue();
            TextView textView2 = new TextView(linearLayout.getContext());
            textView2.setId(getW());
            textView2.setText(iIntValue);
            textView2.setGravity(1);
            textView2.setTextAlignment(4);
            q9i.a(q9i.e, textView2);
            n1g.N(new dk6(i, lq4Var, 2), textView2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
            layoutParams3.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
            linearLayout.addView(textView2, layoutParams3);
        }
        int iH1 = H1();
        int x = getX();
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        int iK2 = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        cyb cybVar = new cyb(linearLayout.getContext());
        cybVar.setId(x);
        cybVar.setAppearance(zxb.PRIMARY);
        ayb aybVar = ayb.g;
        cybVar.setSize(aybVar);
        cybVar.setText(cybVar.getContext().getString(iH1));
        qe7.H(cybVar, 300L, new nd8(this, 1));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = iK;
        layoutParams4.bottomMargin = iK2;
        linearLayout.addView(cybVar, layoutParams4);
        if (L1()) {
            int u = getU();
            cyb cybVar2 = new cyb(linearLayout.getContext());
            cybVar2.setId(this.y);
            cybVar2.setAppearance(zxb.SECONDARY);
            cybVar2.setSize(aybVar);
            cybVar2.setText(cybVar2.getContext().getString(u));
            qe7.H(cybVar2, 300L, new nd8(this, 0));
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = 0;
            layoutParams5.bottomMargin = 0;
            linearLayout.addView(cybVar2, layoutParams5);
        }
        return linearLayout;
    }

    /* JADX INFO: renamed from: F1, reason: from getter */
    public int getU() {
        return this.u;
    }

    public ld8 G1() {
        return null;
    }

    public abstract int H1();

    /* JADX INFO: renamed from: I1, reason: from getter */
    public int getX() {
        return this.x;
    }

    public Integer J1() {
        return null;
    }

    /* JADX INFO: renamed from: K1, reason: from getter */
    public int getW() {
        return this.w;
    }

    public boolean L1() {
        return false;
    }

    public abstract int M1();

    /* JADX INFO: renamed from: N1, reason: from getter */
    public int getV() {
        return this.v;
    }

    public void O1() {
        v1(true);
    }

    public abstract void P1();

    public InfoBottomSheetWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InfoBottomSheetWidget(Bundle bundle, int i, j95 j95Var) {
        this((i & 1) != 0 ? new Bundle() : bundle);
    }
}

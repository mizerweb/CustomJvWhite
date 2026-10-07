package one.me.inappreview.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a8g;
import defpackage.b5e;
import defpackage.bb;
import defpackage.bsb;
import defpackage.ch3;
import defpackage.col;
import defpackage.cs;
import defpackage.dwd;
import defpackage.dx4;
import defpackage.eg4;
import defpackage.fn8;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hc4;
import defpackage.ifh;
import defpackage.j8e;
import defpackage.k36;
import defpackage.ln5;
import defpackage.mp5;
import defpackage.n1g;
import defpackage.o23;
import defpackage.oo;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.qt4;
import defpackage.rk6;
import defpackage.tk6;
import defpackage.wf4;
import defpackage.xw3;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/inappreview/ui/FakeInAppReviewBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "in-app-review"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FakeInAppReviewBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] E = {new dwd(FakeInAppReviewBottomSheet.class, "rateView", "getRateView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), zo5.f(zfe.a, FakeInAppReviewBottomSheet.class, "thankView", "getThankView()Landroid/widget/FrameLayout;", 0)};
    public final ShapeDrawable A;
    public final ifh B;
    public final k36 C;
    public boolean D;
    public final h u;
    public final j8e v;
    public final j8e w;
    public final ShapeDrawable x;
    public final ShapeDrawable y;
    public final ShapeDrawable z;

    public FakeInAppReviewBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new h(m35getAccountScopeuqN4xOY());
        this.v = viewBinding(R.id.fake_in_app_review_bottom_sheet_rate_view);
        this.w = viewBinding(R.id.fake_in_app_review_bottom_sheet_thank_view);
        float[] fArr = {yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f, yl5.d().getDisplayMetrics().density * 50.0f};
        this.x = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        this.y = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable2.getPaint().setColor(-16611745);
        this.z = shapeDrawable2;
        this.A = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.B = new ifh(new mp5(4, this));
        this.C = new k36(9, this);
        this.D = true;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        int i;
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        wf4 wf4Var = new wf4(getContext());
        wf4Var.setId(R.id.fake_in_app_review_bottom_sheet_rate_view);
        cs csVar = new cs(wf4Var.getContext());
        csVar.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_icon);
        csVar.setImageDrawable(csVar.getContext().getPackageManager().getApplicationIcon(csVar.getContext().getApplicationInfo()));
        wf4Var.addView(csVar, gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(yl5.d().getDisplayMetrics().density * 44.0f));
        AppCompatTextView appCompatTextView = new AppCompatTextView(wf4Var.getContext());
        appCompatTextView.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_title);
        q9i.a(q9i.c, appCompatTextView);
        appCompatTextView.setText(R.string.tt_app_name);
        a8g a8gVar = pq3.j;
        appCompatTextView.setTextColor(a8gVar.h(appCompatTextView).getText().b);
        wf4Var.addView(appCompatTextView, -2, -2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(wf4Var.getContext());
        appCompatTextView2.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_subtitle);
        q9i.a(q9i.h, appCompatTextView2);
        appCompatTextView2.setText(R.string.oneme_in_app_review_subtitle);
        appCompatTextView2.setTextColor(a8gVar.h(appCompatTextView2).getText().e);
        wf4Var.addView(appCompatTextView2, -2, -2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(wf4Var.getContext());
        appCompatTextView3.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_not_now_btn);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setBackground(col.b(((fn8) a8gVar.h(appCompatTextView3).u().c.a).c, this.y, this.x));
        appCompatTextView3.setText(R.string.oneme_in_app_review_not_now);
        appCompatTextView3.setTextColor(-16611745);
        qe7.H(appCompatTextView3, 300L, new rk6(this, 0));
        wf4Var.addView(appCompatTextView3, 0, gm0.K(yl5.d().getDisplayMetrics().density * 44.0f));
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(wf4Var.getContext());
        appCompatTextView4.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_send_btn);
        appCompatTextView4.setGravity(17);
        appCompatTextView4.setBackground(this.A);
        appCompatTextView4.setTextColor(a8gVar.h(appCompatTextView4).getText().e);
        appCompatTextView4.setText(R.string.oneme_in_app_review_send);
        wf4Var.addView(appCompatTextView4, 0, gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        Context context = wf4Var.getContext();
        b5e b5eVar = new b5e(context);
        b5eVar.s = -1;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            i = 5;
            if (i2 >= 5) {
                break;
            }
            ImageView imageView = new ImageView(context);
            imageView.setId(View.generateViewId());
            int i3 = i2 + 1;
            imageView.setContentDescription(imageView.getResources().getQuantityString(R.plurals.oneme_in_app_review_rating_star_accessibility, i3, Integer.valueOf(i3)));
            imageView.setImageDrawable(new EnhancedVectorDrawable(context, R.drawable.ic_unselected_star));
            imageView.setOnClickListener(new hc4(b5eVar, i2, 2));
            n1g.N(new o23(3, null, 6), imageView);
            b5eVar.addView(imageView, gm0.K(yl5.d().getDisplayMetrics().density * 28.0f), gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
            arrayList.add(imageView);
            i2 = i3;
            appCompatTextView = appCompatTextView;
        }
        AppCompatTextView appCompatTextView5 = appCompatTextView;
        eg4 eg4VarH = ch3.h(b5eVar);
        int i4 = 0;
        for (Object obj : arrayList) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                xw3.V0();
                throw null;
            }
            ImageView imageView2 = (ImageView) obj;
            int i6 = i;
            if (i4 == 0) {
                int id = imageView2.getId();
                eg4VarH.d(id, 6, 0, 6);
                eg4VarH.d(id, 7, ((ImageView) arrayList.get(1)).getId(), 6);
                eg4VarH.g(id).d.V = 1;
            } else if (i4 == arrayList.size() - 1) {
                int id2 = imageView2.getId();
                eg4VarH.d(id2, 6, ((ImageView) arrayList.get(i4 - 1)).getId(), 7);
                eg4VarH.d(id2, 7, 0, 7);
            } else {
                int id3 = imageView2.getId();
                eg4VarH.d(id3, 6, ((ImageView) arrayList.get(i4 - 1)).getId(), 7);
                eg4VarH.d(id3, 7, ((ImageView) arrayList.get(i5)).getId(), 6);
            }
            i4 = i5;
            i = i6;
        }
        int i7 = i;
        eg4VarH.a(b5eVar);
        b5eVar.setContentDescription(b5eVar.getResources().getQuantityString(R.plurals.oneme_in_app_review_rating_bar_accessibility, i7, Integer.valueOf(b5eVar.getSelected()), Integer.valueOf(i7)));
        b5eVar.setId(R.id.fake_in_app_review_bottom_sheet_rate_view_rating_bar);
        b5eVar.setOnSelectListener(new oo(appCompatTextView4, this, frameLayout2, 7));
        wf4Var.addView(b5eVar, -1, -2);
        n1g.N(new tk6(this, appCompatTextView5, appCompatTextView2, appCompatTextView4, b5eVar, null, 0), wf4Var);
        eg4 eg4VarH2 = ch3.h(wf4Var);
        int id4 = csVar.getId();
        eg4VarH2.d(id4, 3, 0, 3);
        qt4.w(24.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id4));
        eg4VarH2.d(id4, 6, 0, 6);
        new bsb(6, eg4VarH2, id4).a(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        int id5 = appCompatTextView5.getId();
        eg4VarH2.d(id5, 3, csVar.getId(), 3);
        eg4VarH2.d(id5, 6, csVar.getId(), 7);
        new bsb(6, eg4VarH2, id5).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id6 = appCompatTextView2.getId();
        eg4VarH2.d(id6, 3, appCompatTextView5.getId(), 4);
        new bsb(3, eg4VarH2, id6).a(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH2.d(id6, 6, csVar.getId(), 7);
        new bsb(6, eg4VarH2, id6).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        int id7 = b5eVar.getId();
        eg4VarH2.d(id7, 3, appCompatTextView2.getId(), 4);
        qt4.w(40.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id7));
        eg4VarH2.d(id7, 6, 0, 6);
        qt4.w(20.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH2, id7));
        eg4VarH2.d(id7, 7, 0, 7);
        new bsb(7, eg4VarH2, id7).a(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
        int id8 = appCompatTextView3.getId();
        eg4VarH2.d(id8, 3, b5eVar.getId(), 4);
        qt4.w(40.0f, yl5.d().getDisplayMetrics().density, new bsb(3, eg4VarH2, id8));
        eg4VarH2.d(id8, 6, 0, 6);
        new bsb(6, eg4VarH2, id8).a(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        eg4VarH2.d(id8, 7, appCompatTextView4.getId(), 6);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH2, id8));
        eg4VarH2.d(id8, 4, 0, 4);
        new bsb(4, eg4VarH2, id8).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        int id9 = appCompatTextView4.getId();
        eg4VarH2.d(id9, 3, b5eVar.getId(), 4);
        new bsb(3, eg4VarH2, id9).a(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH2.d(id9, 6, appCompatTextView3.getId(), 7);
        qt4.w(8.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH2, id9));
        eg4VarH2.d(id9, 7, 0, 7);
        qt4.w(12.0f, yl5.d().getDisplayMetrics().density, new bsb(7, eg4VarH2, id9));
        eg4VarH2.d(id9, 4, 0, 4);
        new bsb(4, eg4VarH2, id9).a(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        eg4VarH2.a(wf4Var);
        frameLayout2.addView(wf4Var);
        ln5 ln5Var = new ln5(this, new dx4(frameLayout2, 11, this));
        if (getRouter() != null) {
            getRouter().a(ln5Var);
            return frameLayout2;
        }
        addLifecycleListener(new bb(this, ln5Var, 3));
        return frameLayout2;
    }

    public FakeInAppReviewBottomSheet(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}

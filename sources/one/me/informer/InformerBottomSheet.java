package one.me.informer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.af8;
import defpackage.ayb;
import defpackage.bc1;
import defpackage.bf8;
import defpackage.c23;
import defpackage.cyb;
import defpackage.dk6;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.ff8;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gr4;
import defpackage.h;
import defpackage.he8;
import defpackage.hr4;
import defpackage.lq4;
import defpackage.mp5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.q9i;
import defpackage.qe7;
import defpackage.t3f;
import defpackage.vv;
import defpackage.x7;
import defpackage.xbd;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zv8;
import defpackage.zxb;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.transparent.TransparentWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/informer/InformerBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "informerId", "(Lt3f;Ljava/lang/String;)V", "one/me/transparent/TransparentWidget", "informer"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InformerBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ zv8[] y;
    public final vv u;
    public final h v;
    public TransparentWidget w;
    public final ny8 x;

    static {
        dwd dwdVar = new dwd(InformerBottomSheet.class, "informerId", "getInformerId()Ljava/lang/String;", 0);
        zfe.a.getClass();
        y = new zv8[]{dwdVar};
    }

    public InformerBottomSheet(Bundle bundle) {
        super(bundle);
        this.u = new vv("arg:informer_id", String.class);
        this.v = new h(m35getAccountScopeuqN4xOY());
        this.x = createViewModelLazy(ff8.class, new fj3(29, new mp5(25, this)));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayoutJ = bc1.j(getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(linearLayoutJ.getContext());
        imageView.setId(R.id.informer_splash_icon);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 80.0f), gm0.K(80.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.topMargin = gm0.K(22.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.setMarginStart(iK);
        layoutParams.setMarginEnd(iK);
        imageView.setLayoutParams(layoutParams);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        linearLayoutJ.addView(imageView);
        TextView textView = new TextView(linearLayoutJ.getContext());
        q9i.a(q9i.b, textView);
        textView.setGravity(17);
        textView.setTextAlignment(4);
        n1g.N(new dk6(3, null, 5), textView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.setMarginStart(iK);
        layoutParams2.setMarginEnd(iK);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        linearLayoutJ.addView(textView);
        TextView textView2 = new TextView(linearLayoutJ.getContext());
        q9i.a(q9i.e, textView2);
        textView2.setGravity(17);
        textView2.setTextAlignment(4);
        n1g.N(new dk6(3, null, 4), textView2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iK);
        layoutParams3.setMarginEnd(iK);
        layoutParams3.gravity = 17;
        textView2.setLayoutParams(layoutParams3);
        linearLayoutJ.addView(textView2);
        cyb cybVar = new cyb(linearLayoutJ.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMarginStart(iK);
        layoutParams4.setMarginEnd(iK);
        cybVar.setLayoutParams(layoutParams4);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setSize(ayb.g);
        qe7.H(cybVar, 300L, new x7(4, this));
        linearLayoutJ.addView(cybVar);
        e9i.j0(new fz6(n1g.v(((ff8) this.x.getValue()).e, getViewLifecycleOwner().f(), n09.d), new he8(null, imageView, linearLayoutJ, textView2, textView, cybVar, this), 3), getViewLifecycleScope());
        return linearLayoutJ;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onChangeStarted(gr4 gr4Var, hr4 hr4Var) {
        super.onChangeStarted(gr4Var, hr4Var);
        if (hr4Var == hr4.e || hr4Var == hr4.c) {
            ff8 ff8Var = (ff8) this.x.getValue();
            bf8 bf8Var = ff8Var.d;
            yab.i0(bf8Var.a, null, 0, new af8(bf8Var, ff8Var.c, (lq4) null, 0), 3);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new c23(this, 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformerBottomSheet(t3f t3fVar, String str) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg:informer_id", str), new ylc("no_horizontal_padding", Boolean.TRUE)));
        Widget.Companion.getClass();
    }
}

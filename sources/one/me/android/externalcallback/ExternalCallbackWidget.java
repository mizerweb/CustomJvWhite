package one.me.android.externalcallback;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import defpackage.aj6;
import defpackage.bj6;
import defpackage.d3;
import defpackage.e9i;
import defpackage.fj3;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.ke3;
import defpackage.lq4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.rx8;
import defpackage.sgg;
import defpackage.soh;
import defpackage.vk4;
import defpackage.xc8;
import defpackage.xhh;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import java.util.ArrayList;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/android/externalcallback/ExternalCallbackWidget;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "uriAsParam", "Lha9;", "localAccountId", "(Ljava/lang/String;Lha9;)V", "oneme"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExternalCallbackWidget extends BottomSheetWidget {
    public static final /* synthetic */ int y = 0;
    public final h u;
    public final ny8 v;
    public final ny8 w;
    public final boolean x;

    public ExternalCallbackWidget(Bundle bundle) {
        super(bundle);
        this.u = new h(m35getAccountScopeuqN4xOY());
        this.v = createViewModelLazy(aj6.class, new fj3(21, new bj6(this, 0)));
        this.w = rx8.P(3, new bj6(this, 1));
        this.x = true;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View D1(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setLayoutParams(layoutParams);
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 70.0f), frameLayout2.getPaddingRight(), gm0.K(70.0f * yl5.d().getDisplayMetrics().density));
        TextView textView = new TextView(frameLayout2.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        xc8 xc8Var = (xc8) this.w.getValue();
        ArrayList arrayList = soh.a;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, xc8Var, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        textView.setText(R.string.oneme_wait_please);
        n1g.N(new d3(this, null, 14), textView);
        frameLayout2.addView(textView);
        return frameLayout2;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: isDialog, reason: from getter */
    public final boolean getX() {
        return this.x;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        aj6 aj6Var = (aj6) this.v.getValue();
        String string = getArgs().getString("external_callback_param_arg");
        if (string == null) {
            string = "";
        }
        sgg sggVar = aj6Var.g;
        if (sggVar == null || !sggVar.isActive()) {
            aj6Var.g = yab.i0(aj6Var.b, ((n0c) ((xhh) aj6Var.d.getValue())).b(), 0, new vk4(aj6Var, string, null, 15), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        e9i.j0(new fz6(n1g.v(((aj6) this.v.getValue()).f, getViewLifecycleOwner().f(), n09.d), new ke3(29, (lq4) null, this), 3), getViewLifecycleScope());
    }

    public ExternalCallbackWidget(String str, ha9 ha9Var) {
        this(n1g.i(new ylc("external_callback_param_arg", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}

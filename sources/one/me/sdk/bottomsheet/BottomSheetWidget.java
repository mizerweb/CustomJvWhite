package one.me.sdk.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.gm0;
import defpackage.mt5;
import defpackage.nr4;
import defpackage.q11;
import defpackage.vv;
import defpackage.yl5;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "bottom-sheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BottomSheetWidget extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] t = {new z8b(BottomSheetWidget.class, "wasKeyboardOpened", "getWasKeyboardOpened()Z"), zo5.e(zfe.a, BottomSheetWidget.class, "setNoHorizontalPadding", "getSetNoHorizontalPadding()Z")};
    public final String m;
    public final boolean n;
    public mt5 o;
    public View p;
    public final vv q;
    public final vv r;
    public final nr4 s;

    public BottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.m = getClass().getName();
        this.n = true;
        Boolean bool = Boolean.FALSE;
        this.q = new vv(Boolean.class, bool, "was_keyboard_opened");
        this.r = new vv(Boolean.class, bool, "no_horizontal_padding");
        this.s = new nr4(getInstanceId(), new q11(this, 0), new q11(this, 1));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        zv8 zv8Var = t[1];
        int iK2 = ((Boolean) this.r.a(this)).booleanValue() ? 0 : gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(iK2, iK, iK2, gm0.K(15.0f * yl5.d().getDisplayMetrics().density));
        frameLayout.addView(D1(layoutInflater, frameLayout), new ViewGroup.LayoutParams(-1, -2));
        if (x1()) {
            mt5 mt5Var = new mt5(frameLayout.getContext());
            mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
            mt5Var.setCustomTheme(t1());
            this.o = mt5Var;
            frameLayout.addView(mt5Var);
        }
    }

    public abstract View D1(LayoutInflater layoutInflater, FrameLayout frameLayout);

    /* JADX INFO: renamed from: E1, reason: from getter */
    public boolean getN() {
        return this.n;
    }

    @Override // defpackage.br4
    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        getRouter().a(this.s);
    }

    @Override // defpackage.br4
    public final void onContextUnavailable() {
        super.onContextUnavailable();
        getRouter().M(this.s);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public void onDestroyView(View view) {
        this.o = null;
        super.onDestroyView(view);
    }
}

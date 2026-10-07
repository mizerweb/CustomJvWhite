package one.me.sdk.bottomsheet;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.ccd;
import defpackage.cq0;
import defpackage.d3;
import defpackage.ecd;
import defpackage.gm0;
import defpackage.ib;
import defpackage.j11;
import defpackage.j8e;
import defpackage.kbc;
import defpackage.lq4;
import defpackage.lsk;
import defpackage.lvb;
import defpackage.n1g;
import defpackage.nvh;
import defpackage.oi8;
import defpackage.pi;
import defpackage.ud9;
import defpackage.vv;
import defpackage.xbd;
import defpackage.yl5;
import defpackage.z8b;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zpe;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.stories.publish.PublishStoryBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "zpe", "ib", "cq0", "bottom-sheet"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseBottomSheetWidget extends Widget {
    public final String a;
    public ecd b;
    public final vv c;
    public final j8e d;
    public final vv e;
    public final oi8 f;
    public boolean g;
    public boolean h;
    public static final /* synthetic */ zv8[] j = {new z8b(BaseBottomSheetWidget.class, "needDim", "getNeedDim()Z"), zo5.f(zfe.a, BaseBottomSheetWidget.class, "cardView", "getCardView()Landroid/view/View;", 0), new z8b(BaseBottomSheetWidget.class, "isDialogClosable", "isDialogClosable()Z")};
    public static final zpe i = new zpe(17);
    public static final String k = "need_dim";
    public static final String l = "is_closable";

    public BaseBottomSheetWidget(Bundle bundle) {
        super(bundle);
        this.a = "BaseBottomSheetWidget#".concat(getClass().getName());
        Boolean bool = Boolean.TRUE;
        this.c = new vv(Boolean.class, bool, k);
        this.d = viewBinding(R.id.oneme_bottom_sheet_popup_card);
        this.e = new vv(Boolean.class, bool, l);
        int i2 = 5;
        this.f = new oi8(0, i2, 0, new j11(3, 3, false), 5);
    }

    public final void A1() {
        if (this.h) {
            return;
        }
        try {
            this.h = true;
            getRouter().C(this);
        } catch (IllegalStateException e) {
            this.h = false;
            gm0.V(getClass().getName(), "popController failure", new cq0(e));
        }
    }

    public final void B1(boolean z) {
        zv8 zv8Var = j[0];
        this.c.b(this, Boolean.valueOf(z));
    }

    public abstract void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle);

    @Override // defpackage.br4
    public boolean handleBack() {
        v1(true);
        return true;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: isDialog */
    public boolean getIsDialog() {
        return !(this instanceof PublishStoryBottomSheet);
    }

    public FrameLayout o1(LayoutInflater layoutInflater, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_bottom_sheet_popup_card);
        frameLayout.setClipToPadding(false);
        frameLayout.setClickable(true);
        frameLayout.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 20.0f));
        C1(frameLayout, layoutInflater, bundle);
        n1g.N(new ud9(this, (lq4) null, 1), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.br4
    public void onAttach(View view) {
        super.onAttach(view);
        ecd ecdVar = this.b;
        if (ecdVar == null || ecdVar.getScrollState() != ccd.a) {
            return;
        }
        bdc.a(ecdVar, new pi(4, ecdVar, ecdVar));
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        gm0.U(this.a, "onCreateView()");
        ecd ecdVar = new ecd(layoutInflater.getContext());
        ecdVar.setId(R.id.oneme_bottom_sheet_popup);
        FrameLayout frameLayoutO1 = o1(layoutInflater, bundle);
        ViewGroup.LayoutParams layoutParams = frameLayoutO1.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        ecdVar.addView(frameLayoutO1, layoutParams);
        ecdVar.setCallback(p1());
        lvb.H(frameLayoutO1, getF(), null);
        n1g.N(new d3(this, null, 2), ecdVar);
        this.b = ecdVar;
        return ecdVar;
    }

    @Override // defpackage.br4
    public void onDestroyView(View view) {
        gm0.U(this.a, "onDestroyView()");
        ecd ecdVar = this.b;
        xbd callback = ecdVar != null ? ecdVar.getCallback() : null;
        ecd ecdVar2 = this.b;
        if (ecdVar2 != null) {
            ecdVar2.setCallback(null);
        }
        ecd ecdVar3 = this.b;
        if (ecdVar3 != null) {
            ValueAnimator valueAnimator = ecdVar3.e;
            if (valueAnimator != null) {
                lsk.a(valueAnimator);
            }
            ecdVar3.e = null;
        }
        this.b = null;
        this.h = false;
        if (this.g && callback != null) {
            callback.h();
        }
        this.g = false;
        super.onDestroyView(view);
    }

    public xbd p1() {
        return new ib(this, 1);
    }

    public final void q1() {
        if (this.g) {
            return;
        }
        this.g = true;
        z1();
    }

    /* JADX INFO: renamed from: r1, reason: from getter */
    public oi8 getF() {
        return this.f;
    }

    public final View s1() {
        return (View) this.d.m(this, j[1]);
    }

    public kbc t1() {
        return null;
    }

    public void u1() {
    }

    public final void v1(boolean z) {
        gm0.U(this.a, "hide(animated = " + z + ")");
        ecd ecdVar = this.b;
        if (ecdVar == null) {
            w1();
        } else {
            if (ecdVar.getScrollState() == ccd.a) {
                return;
            }
            q1();
            ecdVar.j(z);
        }
    }

    public void w1() {
        gm0.U(this.a, "hideInstant()");
        q1();
        A1();
    }

    public final boolean x1() {
        zv8 zv8Var = j[2];
        return ((Boolean) this.e.a(this)).booleanValue();
    }

    public boolean y1() {
        return false;
    }

    public void z1() {
    }
}

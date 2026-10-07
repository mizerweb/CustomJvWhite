package one.me.profile.screens.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aac;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.f43;
import defpackage.fwg;
import defpackage.fz6;
import defpackage.gcc;
import defpackage.h43;
import defpackage.ha9;
import defpackage.hu;
import defpackage.hve;
import defpackage.i19;
import defpackage.i43;
import defpackage.j8e;
import defpackage.jz;
import defpackage.kj1;
import defpackage.ks6;
import defpackage.ku6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mg5;
import defpackage.n;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.ore;
import defpackage.qq2;
import defpackage.rcc;
import defpackage.szc;
import defpackage.t33;
import defpackage.tp2;
import defpackage.tre;
import defpackage.ubf;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.wy7;
import defpackage.xk1;
import defpackage.y3f;
import defpackage.y8j;
import defpackage.ylc;
import defpackage.za2;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zo7;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaTabWidget;", "Lone/me/sdk/arch/Widget;", "Lubf;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lmg5;", "itemType", "Lha9;", "localAccountId", "(JLmg5;Lha9;)V", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChatMediaTabWidget extends Widget implements ubf {
    public static final /* synthetic */ zv8[] n = {new dwd(ChatMediaTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zo5.f(zfe.a, ChatMediaTabWidget.class, "mediaTabs", "getMediaTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new dwd(ChatMediaTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0), new dwd(ChatMediaTabWidget.class, "mediaViewPager", "getMediaViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ny8 d;
    public int e;
    public final ny8 f;
    public final j8e g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public fwg k;
    public final zo7 l;
    public final t33 m;

    public ChatMediaTabWidget(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new kj1(0, this, ChatMediaTabWidget.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 9));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = wtcVar.getAccessor().d(231);
        this.f = createViewModelLazy(f43.class, new qq2(7, new za2(this, 10, bundle)));
        this.g = viewBinding(R.id.profile_media_toolbar);
        this.h = viewBinding(R.id.profile_media_tabs);
        this.i = viewBinding(R.id.profile_media_tabs_pinbars_container);
        this.j = viewBinding(R.id.profile_media_tabs_pager);
        this.l = new zo7(9);
        this.m = new t33(this, bundle.getLong("chat_id"), ku6.q(mg5.d, Byte.valueOf(bundle.getByte("item_type_id"))), getD().b());
    }

    public static final y3f o1(ChatMediaTabWidget chatMediaTabWidget) {
        int iOrdinal = ((i43) i43.d.get(chatMediaTabWidget.p1().getCurrentItem())).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return y3f.CHAT_ATTACHMENTS_FILES;
            }
            if (iOrdinal == 2) {
                return y3f.CHAT_ATTACHMENTS_LINKS;
            }
            if (iOrdinal != 3) {
                ore.o();
                return null;
            }
        }
        return y3f.CHAT_ATTACHMENTS_MEDIA;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setId(R.id.profile_media_tabs_linearlayout);
        linearLayout.setOrientation(1);
        n1g.N(new n(3, null, 2), linearLayout);
        rcc rccVar = new rcc(linearLayout.getContext());
        rccVar.setId(R.id.profile_media_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(new xk1(28)));
        linearLayout.addView(rccVar);
        aac aacVar = new aac(linearLayout.getContext());
        aacVar.setId(R.id.profile_media_tabs);
        aacVar.setTabMode(0);
        aacVar.setTabGravity(2);
        linearLayout.addView(aacVar);
        tp2 tp2VarA = oc9.a(linearLayout.getContext());
        tp2VarA.setId(R.id.profile_media_tabs_pinbars_container);
        linearLayout.addView(tp2VarA);
        y8j y8jVar = new y8j(linearLayout.getContext());
        y8jVar.setId(R.id.profile_media_tabs_pager);
        y8jVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        y8jVar.setOffscreenPageLimit(3);
        y8jVar.e(new wy7(4, this));
        lvb.m0(y8jVar);
        linearLayout.addView(y8jVar);
        return linearLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        fwg fwgVar = this.k;
        if (fwgVar != null) {
            fwgVar.d();
        }
        this.k = null;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.e = bundle.getInt("selected_tab_position_key", 0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("selected_tab_position_key", this.e);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        y8j y8jVarP1 = p1();
        t33 t33Var = this.m;
        y8jVarP1.setAdapter(t33Var);
        zv8[] zv8VarArr = n;
        aac aacVar = (aac) this.h.m(this, zv8VarArr[1]);
        y8j y8jVarP2 = p1();
        zo7 zo7Var = this.l;
        zo7Var.getClass();
        fwg fwgVar = new fwg(aacVar, y8jVarP2, new hu(aacVar, 8, zo7Var));
        fwgVar.c();
        this.k = fwgVar;
        ny8 ny8Var = this.f;
        jz jzVar = new jz(((f43) ny8Var.getValue()).g, 13);
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(jzVar, i19VarF, n09Var), new h43(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(((f43) ny8Var.getValue()).h, getViewLifecycleOwner().f(), n09Var), new h43(null, this, 1), 3), getViewLifecycleScope());
        y8j y8jVarP3 = p1();
        View childAt = y8jVarP3.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        y8jVarP3.h(this.e, false);
        if (t33Var.o.size() > 0) {
            y8jVarP3.measure(View.MeasureSpec.makeMeasureSpec(y8jVarP3.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(y8jVarP3.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        hve childRouter = getChildRouter((ViewGroup) this.i.m(this, zv8VarArr[2]));
        childRouter.e = 1;
        childRouter.S(false);
        if (childRouter.o()) {
            return;
        }
        PinBarsWidget pinBarsWidget = new PinBarsWidget(szc.d, getD().b());
        pinBarsWidget.setRetainViewMode(getRetainViewMode());
        childRouter.T(oc9.e(pinBarsWidget, null, null));
    }

    public final y8j p1() {
        return (y8j) this.j.m(this, n[3]);
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return ((f43) this.f.getValue()).B(lq4Var);
    }

    public ChatMediaTabWidget(long j, mg5 mg5Var, ha9 ha9Var) {
        this(n1g.i(new ylc("chat_id", Long.valueOf(j)), new ylc("item_type_id", Byte.valueOf(mg5Var.a)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}

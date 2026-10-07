package one.me.stickerspreview.set;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.amg;
import defpackage.aog;
import defpackage.bdc;
import defpackage.br4;
import defpackage.c;
import defpackage.c0a;
import defpackage.dj9;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.gmg;
import defpackage.hmg;
import defpackage.i22;
import defpackage.j6c;
import defpackage.j8e;
import defpackage.j8g;
import defpackage.lq4;
import defpackage.m6c;
import defpackage.mt5;
import defpackage.n09;
import defpackage.n1g;
import defpackage.ng7;
import defpackage.ny8;
import defpackage.occ;
import defpackage.oi8;
import defpackage.qe7;
import defpackage.r6c;
import defpackage.rcc;
import defpackage.t3f;
import defpackage.tre;
import defpackage.uik;
import defpackage.vv;
import defpackage.wtc;
import defpackage.xbd;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yw8;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.zsj;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.stickerspreview.StickerPreviewScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/set/StickerSetBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lt3f;", "scopeId", "", "fromWebApp", "(Lt3f;Z)V", "one/me/stickerspreview/StickerPreviewScreen", "stickers-preview"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StickerSetBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ zv8[] v = {new dwd(StickerSetBottomSheet.class, "fromWebApp", "getFromWebApp()Z", 0), zo5.f(zfe.a, StickerSetBottomSheet.class, "stickerId", "getStickerId()J", 0), new dwd(StickerSetBottomSheet.class, "headerView", "getHeaderView()Lone/me/sdk/stickers/set/StickersSetHeaderView;", 0), new dwd(StickerSetBottomSheet.class, "stickerSetRecycler", "getStickerSetRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0), new dwd(StickerSetBottomSheet.class, "loadingView", "getLoadingView()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0)};
    public final ny8 m;
    public final vv n;
    public final vv o;
    public dj9 p;
    public final j8e q;
    public final j8e r;
    public final zsj s;
    public final int t;
    public final j8e u;

    public StickerSetBottomSheet(Bundle bundle) {
        super(bundle);
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        Object objF0 = tre.f0(bundle, Widget.ARG_SCOPE_ID, t3f.class);
        if (objF0 == null) {
            c.o(c0a.o("No value passed for key arg_key_scope_id of type ", t3f.class.getSimpleName(), " in bundle"));
            throw null;
        }
        this.m = getSharedViewModel((t3f) ((Parcelable) objF0), amg.class, null);
        this.n = new vv(Boolean.class, Boolean.FALSE, "arg_from_web_app");
        this.o = new vv(Long.class, 0L, "arg_key_sticker_id");
        this.q = viewBinding(R.id.oneme_stickers_preview_stickers_set_header);
        this.r = viewBinding(R.id.oneme_stickers_preview_stickers_set_content);
        this.s = new zsj(((a2c) wtcVar.getAccessor().c(27)).a(), new uik(25, this), (occ) null);
        this.t = gm0.K(183.0f * yl5.d().getDisplayMetrics().density);
        this.u = viewBinding(R.id.oneme_stickers_preview_stickers_set_loading_view);
        B1(false);
    }

    public static final int D1(StickerSetBottomSheet stickerSetBottomSheet) {
        br4 parentController = stickerSetBottomSheet.getParentController();
        Integer numValueOf = null;
        StickerPreviewScreen stickerPreviewScreen = parentController instanceof StickerPreviewScreen ? (StickerPreviewScreen) parentController : null;
        if (stickerPreviewScreen == null) {
            return 0;
        }
        if (stickerPreviewScreen.getView() != null) {
            j8e j8eVar = stickerPreviewScreen.l;
            zv8[] zv8VarArr = StickerPreviewScreen.v;
            numValueOf = Integer.valueOf(((ViewGroup) stickerPreviewScreen.m.m(stickerPreviewScreen, zv8VarArr[6])).getMeasuredHeight() + ((rcc) j8eVar.m(stickerPreviewScreen, zv8VarArr[5])).getBottom());
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void C1(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 10.0f);
        frameLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), iK, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        aog aogVar = new aog(linearLayout.getContext());
        aogVar.setId(R.id.oneme_stickers_preview_stickers_set_header);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 4.0f);
        aogVar.setLayoutParams(layoutParams);
        qe7.H(aogVar.getHeaderButton(), 300L, new gmg(this, 1));
        int i = 2;
        qe7.H(aogVar.getMoreButton(), 300L, new gmg(this, i));
        linearLayout.addView(aogVar);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext());
        recyclerView.setId(R.id.oneme_stickers_preview_stickers_set_content);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iK2 = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) * 2)) / (gm0.K(81.0f * yl5.d().getDisplayMetrics().density) + gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
        if (iK2 < 1) {
            iK2 = 1;
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iK2));
        recyclerView.h(new i22(iK2, gm0.K(4.0f * yl5.d().getDisplayMetrics().density)), -1);
        recyclerView.i(new yw8(i, this));
        recyclerView.setAdapter(this.s);
        bdc.a(recyclerView, new ng7(recyclerView, recyclerView, this, 24));
        linearLayout.addView(recyclerView);
        r6c r6cVar = new r6c(linearLayout.getContext());
        r6cVar.setId(R.id.oneme_stickers_preview_stickers_set_loading_view);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        r6cVar.setLayoutParams(layoutParams2);
        r6cVar.setAppearance(j6c.a);
        r6cVar.setSize(m6c.a);
        linearLayout.addView(r6cVar);
        frameLayout.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        View mt5Var = new mt5(frameLayout.getContext());
        mt5Var.setTranslationY(zo5.b(6.0f, yl5.d().getDisplayMetrics().density, -iK));
        frameLayout.addView(mt5Var);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final boolean handleBack() {
        return false;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.br4
    public final void onAttach(View view) {
        amg amgVar = (amg) this.m.getValue();
        zv8 zv8Var = v[1];
        amgVar.C(Long.valueOf(((Number) this.o.a(this)).longValue()));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        qe7.H(view, 300L, new gmg(this, 0));
        e9i.j0(new fz6(n1g.v(((amg) this.m.getValue()).A, getViewLifecycleOwner().f(), n09.d), new j8g((lq4) null, this, 8), 3), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final xbd p1() {
        return new hmg(this);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* JADX INFO: renamed from: r1 */
    public final oi8 getF() {
        oi8 oi8Var = oi8.e;
        return oi8.e;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void w1() {
    }

    public StickerSetBottomSheet(t3f t3fVar, boolean z) {
        this(n1g.i(new ylc(Widget.ARG_SCOPE_ID, t3fVar), new ylc("arg_from_web_app", Boolean.valueOf(z))));
    }
}

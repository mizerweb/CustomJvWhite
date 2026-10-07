package one.me.location.map.pick;

import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import defpackage.a8g;
import defpackage.b0m;
import defpackage.c4c;
import defpackage.d0c;
import defpackage.d4c;
import defpackage.d4f;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.fz7;
import defpackage.g5d;
import defpackage.gcc;
import defpackage.gjf;
import defpackage.gm0;
import defpackage.h;
import defpackage.ha9;
import defpackage.hta;
import defpackage.i19;
import defpackage.ifh;
import defpackage.j11;
import defpackage.j8e;
import defpackage.jlk;
import defpackage.jm9;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.kyb;
import defpackage.lh9;
import defpackage.ll6;
import defpackage.lvb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np0;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.oo7;
import defpackage.ore;
import defpackage.owc;
import defpackage.po7;
import defpackage.pq3;
import defpackage.qe7;
import defpackage.qwc;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.svj;
import defpackage.t3f;
import defpackage.t6g;
import defpackage.tk6;
import defpackage.tre;
import defpackage.ubc;
import defpackage.uf4;
import defpackage.uwc;
import defpackage.vtb;
import defpackage.vv;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.wwc;
import defpackage.xbc;
import defpackage.xm9;
import defpackage.y3f;
import defpackage.yab;
import defpackage.yfl;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zl9;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.location.map.pick.PickLocationScreen;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00060\u0004j\u0002`\u00052\u00020\u00062\u00020\u0007B\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB)\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lone/me/location/map/pick/PickLocationScreen;", "Lone/me/sdk/arch/Widget;", "Loo7;", "Lone/me/geo/native/NativeOnCameraIdleListener;", "Lvtb;", "Lone/me/geo/native/NativeOnMapReadyCallback;", "Lc4c;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "requestCode", "Lha9;", "localAccountId", "Lt3f;", "chatScopeId", "(JILha9;Lt3f;)V", "location-map"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PickLocationScreen extends Widget implements oo7, vtb, c4c, mc4 {
    public static final /* synthetic */ zv8[] p = {new dwd(PickLocationScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), zo5.f(zfe.a, PickLocationScreen.class, "requestCode", "getRequestCode()I", 0), new dwd(PickLocationScreen.class, "chatScopeId", "getChatScopeId()Lone/me/sdk/arch/store/ScopeId;", 0), new dwd(PickLocationScreen.class, "mapView", "getMapView()Lone/me/geo/view/OneMeMapView;", 0), new dwd(PickLocationScreen.class, "centerMarker", "getCenterMarker()Landroid/widget/ImageView;", 0), new dwd(PickLocationScreen.class, "buttonSend", "getButtonSend()Lone/me/sdk/uikit/common/buttonold/OneMeTitleSubtitleButton;", 0), new dwd(PickLocationScreen.class, "buttonCurrentLocation", "getButtonCurrentLocation()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool;", 0)};
    public static final oi8 q = new oi8(0, 3, 0, null, 13);
    public static final oi8 r = new oi8(0, 0, 0, new j11(5, 1, false), 7);
    public final ks6 a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final h e;
    public final ifh f;
    public final ny8 g;
    public final j8e h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public po7 l;
    public final ny8 m;
    public final ny8 n;
    public final ll6 o;

    public PickLocationScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.F(this, y3f.CHAT_SHARE_LOCATION);
        this.b = new vv("LocationMapScreen.chatId", Long.class);
        this.c = new vv("LocationMapScreen.requestCode", Integer.class);
        this.d = new vv(t3f.class, t3f.e, "LocationMapScreen.arg_key_chat_scope_id");
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.e = hVar;
        this.f = new ifh(new owc(this, 0));
        this.g = createViewModelLazy(wwc.class, new hta(8, new owc(this, 1)));
        this.h = viewBinding(R.id.oneme_location_map_view);
        this.i = viewBinding(R.id.oneme_location_map_center_marker);
        this.j = viewBinding(R.id.oneme_location_map_button_send);
        this.k = viewBinding(R.id.oneme_location_map_button_current_location);
        this.m = hVar.getAccessor().d(34);
        this.n = hVar.getAccessor().d(97);
        this.o = new ll6();
    }

    @Override // defpackage.vtb
    public final void O(po7 po7Var) {
        this.l = po7Var;
        s1(pq3.j.e(getContext()).m(), po7Var);
        po7Var.g(this);
        po7Var.h(this);
        q1().B(false, false);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        wwc wwcVarQ1 = q1();
        if (i == R.id.oneme_location_confirm_send_message_positive) {
            wwcVarQ1.C();
        } else {
            wwcVarQ1.getClass();
        }
    }

    @Override // defpackage.oo7
    public final void f0() {
        CameraPosition cameraPositionC;
        po7 po7Var = this.l;
        if (po7Var == null || (cameraPositionC = po7Var.c()) == null) {
            return;
        }
        wwc wwcVarQ1 = q1();
        LatLng latLng = cameraPositionC.a;
        yab.i0(wwcVarQ1.b, null, 0, new uwc(wwcVarQ1, latLng.a, latLng.b, null, 0), 3);
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getU() {
        return this.a;
    }

    public final ubc o1() {
        return (ubc) this.j.m(this, p[5]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.oneme_location_map_toolbar_close);
        lvb.H(rccVar, q, null);
        a8g a8gVar = pq3.j;
        rccVar.setBackgroundColor(a8gVar.h(rccVar).k().b);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new lh9(23, this)));
        rccVar.setTitle(R.string.share_location_title);
        rccVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), rccVar.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), rccVar.getPaddingBottom());
        d4c d4cVar = new d4c(getContext());
        d4cVar.setId(R.id.oneme_location_map_view);
        ImageView imageView = new ImageView(getContext());
        imageView.setId(R.id.oneme_location_map_center_marker);
        imageView.setImageResource(R.drawable.icon_geolocation_fill);
        imageView.setImageTintList(ColorStateList.valueOf(a8gVar.h(imageView).getIcon().h));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(R.id.oneme_location_map_bottom_gradient_view);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        r1(gradientDrawable);
        frameLayout.setBackground(gradientDrawable);
        ubc ubcVar = new ubc(getContext());
        ubcVar.setId(R.id.oneme_location_map_button_send);
        kyb kybVarA = yfl.a(getContext());
        wf4 wf4Var = new wf4(layoutInflater.getContext());
        uf4 uf4Var = new uf4(0, 0);
        uf4Var.i = 0;
        uf4Var.t = 0;
        uf4Var.v = 0;
        uf4Var.l = 0;
        uf4Var.setMargins(((ViewGroup.MarginLayoutParams) uf4Var).leftMargin, ((ViewGroup.MarginLayoutParams) uf4Var).topMargin, ((ViewGroup.MarginLayoutParams) uf4Var).rightMargin, -gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(d4cVar, uf4Var);
        uf4 uf4Var2 = new uf4(0, -2);
        uf4Var2.i = 0;
        uf4Var2.t = 0;
        uf4Var2.v = 0;
        wf4Var.addView(rccVar, uf4Var2);
        uf4 uf4Var3 = new uf4(-2, -2);
        uf4Var3.i = d4cVar.getId();
        uf4Var3.l = d4cVar.getId();
        uf4Var3.t = d4cVar.getId();
        uf4Var3.v = d4cVar.getId();
        uf4Var3.setMargins(((ViewGroup.MarginLayoutParams) uf4Var3).leftMargin, ((ViewGroup.MarginLayoutParams) uf4Var3).topMargin, ((ViewGroup.MarginLayoutParams) uf4Var3).rightMargin, gm0.K(17.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(imageView, uf4Var3);
        uf4 uf4Var4 = new uf4(0, gm0.K(104.0f * yl5.d().getDisplayMetrics().density));
        uf4Var4.t = 0;
        uf4Var4.v = 0;
        uf4Var4.l = 0;
        wf4Var.addView(frameLayout, uf4Var4);
        uf4 uf4Var5 = new uf4(0, -2);
        uf4Var5.t = 0;
        uf4Var5.v = 0;
        uf4Var5.l = 0;
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        uf4Var5.setMargins(iK, ((ViewGroup.MarginLayoutParams) uf4Var5).topMargin, iK, gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        wf4Var.addView(ubcVar, uf4Var5);
        lvb.H(ubcVar, r, null);
        uf4 uf4Var6 = new uf4(-2, -2);
        uf4Var6.v = 0;
        uf4Var6.k = ubcVar.getId();
        int iK2 = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        uf4Var6.setMargins(((ViewGroup.MarginLayoutParams) uf4Var6).leftMargin, ((ViewGroup.MarginLayoutParams) uf4Var6).topMargin, iK2, iK2);
        wf4Var.addView(kybVarA, uf4Var6);
        t6g t6gVarA = xm9.a(wf4Var.getContext(), this.e.getAccessor().d(316), ((g5d) ((gjf) this.n.getValue())).c());
        uf4 uf4Var7 = new uf4(xm9.a, xm9.b);
        uf4Var7.t = 0;
        uf4Var7.k = ubcVar.getId();
        wf4Var.addView(t6gVarA, uf4Var7);
        n1g.N(new tk6(rccVar, d4cVar, t6gVarA, this, frameLayout, null, 1), wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        p1().e();
        p1().c();
        po7 po7Var = this.l;
        if (po7Var != null) {
            po7Var.h(null);
        }
        po7 po7Var2 = this.l;
        if (po7Var2 != null) {
            po7Var2.g(null);
        }
        this.l = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 169 && wsc.v((wsc) this.m.getValue(), new svj(this, 1), strArr, iArr, wsc.l, R.string.permissions_allow_access, R.string.permissions_location_denied, np0.m)) {
            q1().B(false, false);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        p1().d(bundle);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        final int i = 0;
        p1().b(n1g.i(new ylc[0]));
        d0c d0cVar = p1().a;
        d0cVar.getClass();
        d0cVar.l(null, new jlk(d0cVar));
        d4c d4cVarP1 = p1();
        fz7 fz7Var = new fz7(1, this, PickLocationScreen.class, "onMapReady", "onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V", 0, 16);
        zl9 zl9VarC = ((g5d) ((gjf) this.n.getValue())).c();
        d4cVarP1.a(fz7Var, this, zl9VarC != null ? zl9VarC.a : null);
        p1().setOnMapTouchListener(this);
        qe7.H((kyb) this.k.m(this, p[6]), 300L, new View.OnClickListener(this) { // from class: pwc
            public final /* synthetic */ PickLocationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                PickLocationScreen pickLocationScreen = this.b;
                switch (i2) {
                    case 0:
                        zv8[] zv8VarArr = PickLocationScreen.p;
                        pickLocationScreen.q1().B(true, true);
                        break;
                    default:
                        zv8[] zv8VarArr2 = PickLocationScreen.p;
                        wwc wwcVarQ1 = pickLocationScreen.q1();
                        yab.i0(wwcVarQ1.b, null, 0, new vwc(wwcVarQ1, null, 1), 3);
                        break;
                }
            }
        });
        final int i2 = 1;
        qe7.H(o1(), 300L, new View.OnClickListener(this) { // from class: pwc
            public final /* synthetic */ PickLocationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i3 = i2;
                PickLocationScreen pickLocationScreen = this.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr = PickLocationScreen.p;
                        pickLocationScreen.q1().B(true, true);
                        break;
                    default:
                        zv8[] zv8VarArr2 = PickLocationScreen.p;
                        wwc wwcVarQ1 = pickLocationScreen.q1();
                        yab.i0(wwcVarQ1.b, null, 0, new vwc(wwcVarQ1, null, 1), 3);
                        break;
                }
            }
        });
        r8e r8eVar = q1().m;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new qwc(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().o, getViewLifecycleOwner().f(), n09Var), new qwc(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(q1().n, getViewLifecycleOwner().f(), n09Var), new qwc(null, this, 2), 3), getViewLifecycleScope());
    }

    public final d4c p1() {
        return (d4c) this.h.m(this, p[3]);
    }

    public final wwc q1() {
        return (wwc) this.g.getValue();
    }

    public final void r1(GradientDrawable gradientDrawable) {
        b0m.e(gradientDrawable, pq3.j.e(getContext()).n() ? new int[]{0, -1207104243, -15921907} : new int[]{0, -1191182337, -1}, new float[]{0.0f, 0.4f, 1.0f});
    }

    public final void s1(kbc kbcVar, po7 po7Var) {
        zl9 zl9VarC = ((g5d) ((gjf) this.n.getValue())).c();
        if ((zl9VarC != null ? zl9VarC.a : null) != null) {
            po7Var.e(jm9.b(getContext(), R.raw.google_universal_map_style));
            return;
        }
        int iOrdinal = kbcVar.A().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                po7Var.e(jm9.b(getContext(), R.raw.google_map_night_style));
                return;
            } else if (iOrdinal != 2) {
                ore.o();
                return;
            }
        }
        po7Var.e(null);
    }

    public PickLocationScreen(long j, int i, ha9 ha9Var, t3f t3fVar) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("LocationMapScreen.chatId", Long.valueOf(j)), new ylc("LocationMapScreen.requestCode", Integer.valueOf(i)), new ylc("LocationMapScreen.arg_key_chat_scope_id", t3fVar)));
    }
}

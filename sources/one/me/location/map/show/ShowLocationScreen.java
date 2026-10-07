package one.me.location.map.show;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.ae9;
import defpackage.ak7;
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
import defpackage.gwc;
import defpackage.h;
import defpackage.ha9;
import defpackage.i19;
import defpackage.ifh;
import defpackage.in9;
import defpackage.j8e;
import defpackage.jlk;
import defpackage.jm9;
import defpackage.kbc;
import defpackage.ks6;
import defpackage.kyb;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n1g;
import defpackage.np0;
import defpackage.ny8;
import defpackage.oi8;
import defpackage.ore;
import defpackage.ouk;
import defpackage.p2g;
import defpackage.po7;
import defpackage.pq3;
import defpackage.ptf;
import defpackage.q2g;
import defpackage.qe7;
import defpackage.r2g;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.svj;
import defpackage.t2g;
import defpackage.t6g;
import defpackage.tre;
import defpackage.uf4;
import defpackage.ul9;
import defpackage.vtb;
import defpackage.vv;
import defpackage.wf4;
import defpackage.wsc;
import defpackage.xbc;
import defpackage.xm9;
import defpackage.y2g;
import defpackage.y3f;
import defpackage.yc9;
import defpackage.yfl;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.zfe;
import defpackage.zl9;
import defpackage.zo5;
import defpackage.zv8;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBY\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lone/me/location/map/show/ShowLocationScreen;", "Lone/me/sdk/arch/Widget;", "Lvtb;", "Lone/me/geo/native/NativeOnMapReadyCallback;", "Lmc4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "senderId", "messageId", "", "lat", "lon", "", "zoom", "", "sourceTypeId", "sourceId", "Lha9;", "localAccountId", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;DDLjava/lang/Float;IJLha9;)V", "location-map"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShowLocationScreen extends Widget implements vtb, mc4 {
    public static final /* synthetic */ zv8[] v = {new dwd(ShowLocationScreen.class, "lat", "getLat()D", 0), zo5.f(zfe.a, ShowLocationScreen.class, "lon", "getLon()D", 0), new dwd(ShowLocationScreen.class, "zoom", "getZoom()F", 0), new dwd(ShowLocationScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;", 0), new dwd(ShowLocationScreen.class, "senderId", "getSenderId()Ljava/lang/Long;", 0), new dwd(ShowLocationScreen.class, "messageId", "getMessageId()Ljava/lang/Long;", 0), new dwd(ShowLocationScreen.class, "sourceTypeId", "getSourceTypeId()I", 0), new dwd(ShowLocationScreen.class, "sourceId", "getSourceId()J", 0), new dwd(ShowLocationScreen.class, "mapView", "getMapView()Lone/me/geo/view/OneMeMapView;", 0), new dwd(ShowLocationScreen.class, "buttonCurrentLocation", "getButtonCurrentLocation()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool;", 0), new dwd(ShowLocationScreen.class, "locationInfoLayout", "getLocationInfoLayout()Lone/me/location/map/show/view/LocationInfoLayout;", 0)};
    public static final oi8 w = new oi8(0, 3, 0, null, 13);
    public final ks6 a;
    public final vv b;
    public final vv c;
    public final vv d;
    public final vv e;
    public final vv f;
    public final vv g;
    public final vv h;
    public final vv i;
    public final ifh j;
    public final h k;
    public final ny8 l;
    public final ny8 m;
    public final j8e n;
    public in9 o;
    public final j8e p;
    public final j8e q;
    public po7 r;
    public final LinkedHashMap s;
    public final ny8 t;
    public final ny8 u;

    public ShowLocationScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.F(this, y3f.CHAT_LOCATION_VIEWER);
        Double dValueOf = Double.valueOf(0.0d);
        this.b = new vv(Double.class, dValueOf, "ShowLocationScreen.lat");
        this.c = new vv(Double.class, dValueOf, "ShowLocationScreen.lon");
        this.d = new vv(Float.class, Float.valueOf(14.0f), "ShowLocationScreen.zoom");
        this.e = new vv(Long.class, null, "ShowLocationScreen.chatId");
        this.f = new vv(Long.class, null, "ShowLocationScreen.senderId");
        this.g = new vv(Long.class, null, "ShowLocationScreen.msgId");
        this.h = new vv(Integer.class, 0, "ShowLocationScreen.sourceTypeId");
        this.i = new vv(Long.class, 0L, "ShowLocationScreen.sourceId");
        this.j = new ifh(new p2g(this, 0));
        h hVar = new h(m35getAccountScopeuqN4xOY());
        this.k = hVar;
        this.l = hVar.getAccessor().d(247);
        this.m = createViewModelLazy(y2g.class, new t2g(0, new p2g(this, 1)));
        this.n = viewBinding(R.id.oneme_location_map_view);
        this.p = viewBinding(R.id.oneme_location_map_button_current_location);
        this.q = viewBinding(R.id.oneme_location_map_location_info);
        this.s = new LinkedHashMap();
        this.t = hVar.getAccessor().d(34);
        this.u = hVar.getAccessor().d(97);
    }

    @Override // defpackage.vtb
    public final void O(po7 po7Var) {
        this.r = po7Var;
        q1(pq3.j.e(getContext()).m(), po7Var);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Intent intent = (Intent) this.s.get(Integer.valueOf(i));
        if (intent != null) {
            ak7 ak7Var = (ak7) this.l.getValue();
            zv8[] zv8VarArr = v;
            zv8 zv8Var = zv8VarArr[7];
            long jLongValue = ((Number) this.i.a(this)).longValue();
            zv8 zv8Var2 = zv8VarArr[6];
            int iIntValue = ((Number) this.h.a(this)).intValue();
            ak7Var.getClass();
            ul9 ul9Var = new ul9();
            ul9Var.put("source_id", Long.valueOf(jLongValue));
            ul9Var.put("source_type", Integer.valueOf(iIntValue));
            ((ae9) ak7Var.a.getValue()).h("geolocation_send_click", ouk.a(new ylc("source_meta", ul9Var.b())));
            getContext().startActivity(intent);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    public final d4c o1() {
        return (d4c) this.n.m(this, v[8]);
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rcc rccVar = new rcc(getContext());
        rccVar.setId(R.id.oneme_location_map_toolbar_close);
        lvb.H(rccVar, w, null);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new xbc(new ptf(5, this)));
        rccVar.setBackgroundColor(pq3.j.h(rccVar).k().b);
        rccVar.setTitle(R.string.share_location_title);
        rccVar.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), rccVar.getPaddingTop(), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), rccVar.getPaddingBottom());
        d4c d4cVar = new d4c(getContext());
        d4cVar.setId(R.id.oneme_location_map_view);
        yc9 yc9Var = new yc9(getContext());
        yc9Var.setId(R.id.oneme_location_map_location_info);
        yc9Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        kyb kybVarA = yfl.a(getContext());
        t6g t6gVarA = xm9.a(getContext(), this.k.getAccessor().d(316), ((g5d) ((gjf) this.u.getValue())).c());
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
        uf4 uf4Var3 = new uf4(0, -2);
        uf4Var3.t = 0;
        uf4Var3.v = 0;
        uf4Var3.l = 0;
        wf4Var.addView(yc9Var, uf4Var3);
        uf4 uf4Var4 = new uf4(-2, -2);
        uf4Var4.v = 0;
        uf4Var4.k = yc9Var.getId();
        int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        uf4Var4.setMargins(((ViewGroup.MarginLayoutParams) uf4Var4).leftMargin, ((ViewGroup.MarginLayoutParams) uf4Var4).topMargin, iK, iK);
        wf4Var.addView(kybVarA, uf4Var4);
        uf4 uf4Var5 = new uf4(xm9.a, xm9.b);
        uf4Var5.t = 0;
        uf4Var5.k = yc9Var.getId();
        wf4Var.addView(t6gVarA, uf4Var5);
        n1g.N(new q2g(rccVar, d4cVar, t6gVarA, this, null), wf4Var);
        return wf4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        o1().e();
        o1().c();
        po7 po7Var = this.r;
        if (po7Var != null) {
            po7Var.h(null);
        }
        po7 po7Var2 = this.r;
        if (po7Var2 != null) {
            po7Var2.g(null);
        }
        this.r = null;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 169 && wsc.v((wsc) this.t.getValue(), new svj(this, 1), strArr, iArr, wsc.l, R.string.permissions_allow_access, R.string.permissions_location_denied, np0.m)) {
            p1().C();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (getView() != null) {
            o1().d(bundle);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 0;
        o1().b(n1g.i(new ylc[0]));
        d0c d0cVar = o1().a;
        d0cVar.getClass();
        lq4 lq4Var = null;
        d0cVar.l(null, new jlk(d0cVar));
        d4c d4cVarO1 = o1();
        fz7 fz7Var = new fz7(1, this, ShowLocationScreen.class, "onMapReady", "onMapReady(Lcom/google/android/gms/maps/GoogleMap;)V", 0, 23);
        zl9 zl9VarC = ((g5d) ((gjf) this.u.getValue())).c();
        d4cVarO1.a(fz7Var, null, zl9VarC != null ? zl9VarC.a : null);
        qe7.H((kyb) this.p.m(this, v[9]), 300L, new gwc(28, this));
        r8e r8eVar = p1().p;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        int i2 = 3;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new r2g(lq4Var, this, i), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().r, getViewLifecycleOwner().f(), n09Var), new r2g(lq4Var, this, 1), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(p1().q, getViewLifecycleOwner().f(), n09Var), new r2g(lq4Var, this, 2), i2), getViewLifecycleScope());
    }

    public final y2g p1() {
        return (y2g) this.m.getValue();
    }

    public final void q1(kbc kbcVar, po7 po7Var) {
        zl9 zl9VarC = ((g5d) ((gjf) this.u.getValue())).c();
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

    public ShowLocationScreen(Long l, Long l2, Long l3, double d, double d2, Float f, int i, long j, ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a)), new ylc("ShowLocationScreen.chatId", l), new ylc("ShowLocationScreen.senderId", l2), new ylc("ShowLocationScreen.msgId", l3), new ylc("ShowLocationScreen.lat", Double.valueOf(d)), new ylc("ShowLocationScreen.lon", Double.valueOf(d2)), new ylc("ShowLocationScreen.zoom", f), new ylc("ShowLocationScreen.sourceTypeId", Integer.valueOf(i)), new ylc("ShowLocationScreen.sourceId", Long.valueOf(j))));
    }
}

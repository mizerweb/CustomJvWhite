package one.me.settings.devices;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a2c;
import defpackage.a8j;
import defpackage.ayb;
import defpackage.bc1;
import defpackage.br4;
import defpackage.chf;
import defpackage.cyb;
import defpackage.d4f;
import defpackage.e5d;
import defpackage.e9i;
import defpackage.fz6;
import defpackage.g8c;
import defpackage.ggc;
import defpackage.gm0;
import defpackage.gwc;
import defpackage.h47;
import defpackage.ha9;
import defpackage.hgh;
import defpackage.hsc;
import defpackage.hve;
import defpackage.i19;
import defpackage.irf;
import defpackage.j1f;
import defpackage.jc4;
import defpackage.jrf;
import defpackage.k1f;
import defpackage.kc4;
import defpackage.krf;
import defpackage.ks6;
import defpackage.l1f;
import defpackage.lrf;
import defpackage.lve;
import defpackage.m1f;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0e;
import defpackage.n1f;
import defpackage.n1g;
import defpackage.np4;
import defpackage.ny8;
import defpackage.o1f;
import defpackage.oi8;
import defpackage.ore;
import defpackage.p;
import defpackage.pq3;
import defpackage.prf;
import defpackage.pvb;
import defpackage.q91;
import defpackage.qb3;
import defpackage.qe7;
import defpackage.qrf;
import defpackage.r5h;
import defpackage.r66;
import defpackage.r8e;
import defpackage.rcc;
import defpackage.sbf;
import defpackage.tnh;
import defpackage.tre;
import defpackage.wbc;
import defpackage.wtc;
import defpackage.yd0;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.z22;
import defpackage.ztd;
import defpackage.zv8;
import defpackage.zxb;
import java.util.Collections;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/settings/devices/SettingsDevicesScreen;", "Lone/me/sdk/arch/Widget;", "Ln0e;", "Lmc4;", "Lhsc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lha9;", "localAccountId", "(Lha9;)V", "settings-devices"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingsDevicesScreen extends Widget implements n0e, mc4, hsc {
    public final oi8 a;
    public final ks6 b;
    public final wtc c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public g8c h;
    public final ny8 i;
    public final h47 j;

    public SettingsDevicesScreen(Bundle bundle) {
        super(bundle);
        this.a = oi8.f;
        this.b = tre.G(this, new irf(0));
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = wtcVar.getAccessor().d(34);
        this.e = wtcVar.getAccessor().d(246);
        this.f = wtcVar.getAccessor().d(23);
        this.g = wtcVar.getAccessor().d(316);
        this.i = createViewModelLazy(qrf.class, new ztd(22, new jrf(this, 0)));
        this.j = new h47(((a2c) wtcVar.getAccessor().c(27)).a(), new krf(this), 11);
    }

    @Override // defpackage.mc4
    public final void H(Bundle bundle) {
        if (bundle == null || bundle.getInt("dialog.id") != 0) {
            return;
        }
        o1().B();
    }

    @Override // defpackage.hsc
    public final void Y0(boolean z) {
        if (z) {
            return;
        }
        o1().B();
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        Object objSingletonList;
        qrf qrfVarO1 = o1();
        if (i == R.id.settings_devices_allow_camera_permission_btn) {
            a8j.x(qrfVarO1.p, ggc.b);
            return;
        }
        if (i == R.id.settings_devices_deny_camera_permission_btn) {
            qrfVarO1.B();
            return;
        }
        if (i != R.id.settings_devices_dialog_finished_session_finish_btn) {
            qrfVarO1.getClass();
            return;
        }
        if (qrfVarO1.m == null) {
            int iIntValue = ((Number) ((e5d) qrfVarO1.j.getValue()).z().i()).intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                objSingletonList = null;
            } else {
                String strH = ((hgh) qrfVarO1.f.getValue()).h(false);
                objSingletonList = (strH == null || r5h.X0(strH)) ? r66.a : Collections.singletonList(strH);
            }
            pvb pvbVar = (pvb) qrfVarO1.d.getValue();
            qrfVarO1.m = Long.valueOf(pvb.s(pvbVar, new z22(pvbVar.u().a.g(), objSingletonList, 2)));
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.b;
    }

    public final qrf o1() {
        return (qrf) this.i.getValue();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        n1g.N(new qb3(3, null, 13), frameLayout);
        LinearLayout linearLayoutJ = bc1.j(layoutInflater.getContext(), new ViewGroup.LayoutParams(-1, -1), 1);
        rcc rccVar = new rcc(linearLayoutJ.getContext());
        rccVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        rccVar.setTitle(R.string.settings_devices_toolbar_title);
        rccVar.setLeftActions(new wbc(new chf(4)));
        linearLayoutJ.addView(rccVar);
        RecyclerView recyclerView = new RecyclerView(linearLayoutJ.getContext());
        recyclerView.setId(R.id.settings_devices_recycler_view);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.j);
        recyclerView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingTop(), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), recyclerView.getPaddingBottom());
        recyclerView.h(new sbf(pq3.j.h(recyclerView), new krf(this), null, null, null, 60), -1);
        recyclerView.h(new q91(8), -1);
        linearLayoutJ.addView(recyclerView);
        frameLayout.addView(linearLayoutJ);
        cyb cybVar = new cyb(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        layoutParams2.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f));
        layoutParams2.setMarginEnd(gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        cybVar.setLayoutParams(layoutParams2);
        cybVar.setSize(ayb.g);
        cybVar.setAppearance(zxb.PRIMARY);
        cybVar.setText(np4.q(cybVar.getContext(), R.string.settings_devices_qr_scan_btn));
        cybVar.setIcon(cybVar.getContext().getDrawable(R.drawable.icon_qr_code).mutate());
        qe7.H(cybVar, 300L, new gwc(23, this));
        frameLayout.addView(cybVar);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        SettingsDevicesScreen settingsDevicesScreen = this;
        if (i == 158) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    yd0 yd0Var = (yd0) settingsDevicesScreen.e.getValue();
                    yd0Var.getClass();
                    yd0.a(yd0Var, 3, 0, Boolean.TRUE, 2);
                    settingsDevicesScreen.o1().D();
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialog.id", 0);
            zv8[] zv8VarArr = BottomSheetWidget.t;
            jc4 jc4VarC = p.c(R.string.permissions_allow_access, bundle, null, 4);
            jc4VarC.i(Integer.valueOf(R.drawable.icon_camera));
            jc4VarC.g(new tnh(R.string.settings_devices_camera_request_description));
            jc4VarC.a(new kc4(R.id.settings_devices_allow_camera_permission_btn, new tnh(R.string.permissions_dialog_yes), 3, true, 3, 2), new kc4(R.id.settings_devices_deny_camera_permission_btn, new tnh(R.string.permissions_dialog_no), 2, true, 3, 2));
            ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(settingsDevicesScreen);
            confirmationBottomSheetF.setTargetController(settingsDevicesScreen);
            br4 parentController = settingsDevicesScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
            hve hveVarU1 = rootController != null ? rootController.u1() : null;
            if (hveVarU1 != null) {
                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        r8e r8eVar = o1().s;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(r8eVar, i19VarF, n09Var), new lrf(null, this, 0), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().q, getViewLifecycleOwner().f(), n09Var), new lrf(null, this, 1), 3), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(o1().p, getViewLifecycleOwner().f(), n09Var), new lrf(null, this, 2), 3), getViewLifecycleScope());
    }

    @Override // defpackage.n0e
    public final void s0(o1f o1fVar) {
        qrf qrfVarO1 = o1();
        if (o1fVar instanceof m1f) {
            yd0 yd0VarC = qrfVarO1.C();
            yd0VarC.getClass();
            yd0.a(yd0VarC, 5, 0, null, 6);
            qrfVarO1.k.B(qrfVarO1, qrf.u[0], a8j.t(qrfVarO1, null, new prf(qrfVarO1, ((m1f) o1fVar).a, null, 1), 1));
            return;
        }
        qrfVarO1.getClass();
        if (o1fVar.equals(j1f.a)) {
            yd0 yd0VarC2 = qrfVarO1.C();
            yd0VarC2.getClass();
            yd0.a(yd0VarC2, 4, 3, null, 4);
        } else if (o1fVar.equals(l1f.a)) {
            yd0 yd0VarC3 = qrfVarO1.C();
            yd0VarC3.getClass();
            yd0.a(yd0VarC3, 4, 4, null, 4);
        } else if (o1fVar.equals(n1f.a)) {
            yd0 yd0VarC4 = qrfVarO1.C();
            yd0VarC4.getClass();
            yd0.a(yd0VarC4, 4, 1, null, 4);
        } else {
            if (o1fVar.equals(k1f.a)) {
                return;
            }
            ore.o();
        }
    }

    public SettingsDevicesScreen(ha9 ha9Var) {
        this(n1g.i(new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}

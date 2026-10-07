package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.main.accountswitcher.AccountSwitcherBottomSheet;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ks9 implements qsf, rf7, t65, at1, j18, ip5, kg7, xn9, jg7, t0a, m72, g1d, wsf, j8e, igg {
    public final /* synthetic */ int a;
    public final Object b;

    public ks9(int i) {
        this.a = i;
        switch (i) {
            case 11:
                this.b = new l9b();
                break;
            case 18:
                this.b = c98.l();
                break;
            case 25:
                this.b = new zu4(2);
                break;
            case 28:
                this.b = new yr8(10);
                break;
            default:
                this.b = (CloseCameraDeviceOnCameraGraphCloseQuirk) uk5.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
        }
    }

    @Override // defpackage.m72
    public void A(y8e y8eVar, pne pneVar) {
        ((mof) this.b).m(pneVar);
    }

    @Override // defpackage.t0a
    public void C(u0a u0aVar) {
        axa axaVar = ((cxa) this.b).d.f.d;
        iyh iyhVarT = u0aVar.t();
        ush ushVar = ((cxa) this.b).d.d;
        ushVar.getClass();
        gxa gxaVar = axaVar.a;
        synchronized (gxaVar.c) {
            mof mofVar = gxaVar.e;
            mofVar.getClass();
            mofVar.m(new bxa(iyhVarT, ushVar));
        }
        ((cxa) this.b).d.f.a();
    }

    public void D(vb2 vb2Var) {
        if (vb2Var.b) {
            return;
        }
        j28 j28Var = (j28) this.b;
        synchronized (((ArrayList) j28Var.e)) {
            ((ArrayList) j28Var.e).remove(vb2Var);
        }
    }

    public void E(int i, boolean z) {
        ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.b;
        zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
        l63 l63VarU1 = chatMediaViewerScreen.U1();
        l63VarU1.getClass();
        if (z) {
            return;
        }
        l63VarU1.K1.B(l63VarU1, l63.O1[5], a8j.t(l63VarU1, null, new v53(i, l63VarU1, null), 1));
    }

    public sx3 F(int i, String str) {
        List list = (List) this.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tnh tnhVarA = ((fri) it.next()).a(i, str);
            if (tnhVarA != null) {
                arrayList.add(tnhVarA);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            return new sx3(arrayList);
        }
        return null;
    }

    @Override // defpackage.kg7
    public /* bridge */ /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 17:
                break;
            default:
                break;
        }
    }

    @Override // defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return (rt2) ((xn3) ((ny8) this.b).getValue()).k(((Long) obj).longValue()).a.getValue();
    }

    @Override // defpackage.at1, defpackage.n12
    public void b() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        ((sa2) callScreen.j.getValue()).f(1, 2, ns4.a(callScreen.R1().J()));
        it3.a(callScreen.getContext(), v3e.c(callScreen.R1().K().l));
        if (it3.b()) {
            String string = callScreen.getContext().getString(R.string.call_link_share_dialog_share_link_copy);
            h8c h8cVar = new h8c(callScreen);
            h8cVar.n(string);
            h8cVar.e(new y42(4, null));
            h8cVar.c(new o8c(0, 0, 0, 11));
            h8cVar.p();
        }
    }

    @Override // defpackage.qsf
    public void c(long j) {
        AccountSwitcherBottomSheet accountSwitcherBottomSheet = (AccountSwitcherBottomSheet) this.b;
        int i = AccountSwitcherBottomSheet.y;
        String str = accountSwitcherBottomSheet.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.j(j, "onSettingsItemClick: id: "), null);
            }
        }
        AccountSwitcherBottomSheet accountSwitcherBottomSheet2 = (AccountSwitcherBottomSheet) this.b;
        if (j == -1) {
            o7 o7VarF1 = accountSwitcherBottomSheet2.F1();
            ha9 ha9VarF = ((y6b) o7VarF1.d.getValue()).f();
            ((k6b) o7VarF1.e.getValue()).a(1, 1, null);
            String str2 = o7VarF1.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null) {
                je9 je9Var2 = je9.e;
                if (a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, qv1.i("Add new account, localAccountId = ", ha9VarF), null);
                }
            }
            hl9.b.b().b(":login", n1g.i(new ylc("force_push", "true")), ha9VarF);
        } else {
            accountSwitcherBottomSheet2.F1().B(new ha9((int) j));
        }
        ((AccountSwitcherBottomSheet) this.b).v1(true);
    }

    @Override // defpackage.at1, defpackage.n12
    public void d() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().F();
    }

    @Override // defpackage.at1, defpackage.n12
    public void e() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        ((sa2) callScreen.j.getValue()).f(3, 2, ns4.a(callScreen.R1().J()));
        String str = sj8.a;
        sj8.j(callScreen.getContext(), v3e.c(callScreen.R1().K().l), null);
    }

    @Override // defpackage.n12
    public void f() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        if (callScreen.R1().D(callScreen.N1().g)) {
            CallScreen.G1(callScreen);
        }
    }

    @Override // defpackage.at1, defpackage.n12
    public void g() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        ((sa2) callScreen.j.getValue()).f(2, 2, ns4.a(callScreen.R1().J()));
        h02 h02VarR1 = callScreen.R1();
        a8j.x(h02VarR1.G, new ly1(v3e.c(h02VarR1.K().l)));
    }

    @Override // defpackage.p52
    public void h(fu1 fu1Var) {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().P(fu1Var);
    }

    @Override // defpackage.p52
    public void i(fu1 fu1Var, Point point) {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().R(fu1Var, point);
    }

    @Override // defpackage.wsf
    public void j(long j, boolean z) {
        Object value;
        mrd mrdVar;
        boolean z2;
        boolean z3;
        srd srdVarO1 = ((lrd) this.b).f.o1();
        mjg mjgVar = srdVarO1.o;
        if (j == R.id.profile_edit_member_permissions_change_photo) {
            mjgVar.j(null, mrd.a((mrd) mjgVar.getValue(), z, false, false, false, false, 30));
            srdVarO1.D(wm9.O0(new ylc("ONLY_OWNER_CAN_CHANGE_ICON_TITLE", Boolean.valueOf(!z))));
            return;
        }
        boolean z4 = z;
        if (j == R.id.profile_edit_member_permissions_add_user) {
            do {
                value = mjgVar.getValue();
                mrdVar = (mrd) value;
                z2 = !z4 ? false : mrdVar.e;
                z3 = z4;
                z4 = z3;
            } while (!mjgVar.h(value, mrd.a(mrdVar, false, z3, false, false, z2, 13)));
            HashMap mapO0 = wm9.O0(new ylc("ONLY_ADMIN_CAN_ADD_MEMBER", Boolean.valueOf(!z4)));
            if (!z4) {
                mapO0.put("MEMBERS_CAN_SEE_PRIVATE_LINK", Boolean.FALSE);
            }
            srdVarO1.D(mapO0);
            a8j.t(srdVarO1, null, new ur8(srdVarO1, null, 22), 3);
            return;
        }
        if (j == R.id.profile_edit_member_permissions_pin_message) {
            mjgVar.j(null, mrd.a((mrd) mjgVar.getValue(), false, false, z4, false, false, 27));
            srdVarO1.D(wm9.O0(new ylc("ALL_CAN_PIN_MESSAGE", Boolean.valueOf(z4))));
        } else if (j == R.id.profile_edit_member_permissions_call_to_chat) {
            mjgVar.j(null, mrd.a((mrd) mjgVar.getValue(), false, false, false, z4, false, 23));
            srdVarO1.D(wm9.O0(new ylc("ONLY_ADMIN_CAN_CALL", Boolean.valueOf(!z4))));
        } else if (j == R.id.profile_edit_member_permissions_see_private_link) {
            mjgVar.j(null, mrd.a((mrd) mjgVar.getValue(), false, false, false, false, z4, 15));
            srdVarO1.D(wm9.O0(new ylc("MEMBERS_CAN_SEE_PRIVATE_LINK", Boolean.valueOf(z4))));
        }
    }

    @Override // defpackage.ip5
    public void k() {
        ((op5) ((pp5) this.b).d).q();
    }

    @Override // defpackage.qsf
    public void l(long j, boolean z) {
        AccountSwitcherBottomSheet accountSwitcherBottomSheet = (AccountSwitcherBottomSheet) this.b;
        int i = AccountSwitcherBottomSheet.y;
        String str = accountSwitcherBottomSheet.m;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, bc1.l(j, "onSwitchClick: id: ", ", isChecked: ", z), null);
            }
        }
        ((AccountSwitcherBottomSheet) this.b).F1().B(new ha9((int) j));
        ((AccountSwitcherBottomSheet) this.b).v1(true);
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        return (zu4) this.b;
    }

    @Override // defpackage.p52
    public void n(fu1 fu1Var) {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().g.g(fu1Var);
    }

    @Override // defpackage.j18
    public Uri o(String str) {
        str.getClass();
        if (str.equals("api")) {
            return ((fi6) this.b).h().a();
        }
        throw new NoHttpApiEndpointException(str);
    }

    @Override // defpackage.g1d
    public void onDestroy() {
        PipScreen pipScreen = (PipScreen) this.b;
        if (!pipScreen.getRouter().o()) {
            pipScreen.requireActivity().finish();
            return;
        }
        ar arVarRequireActivity = pipScreen.requireActivity();
        Intent intent = new Intent(pipScreen.requireActivity(), pipScreen.requireActivity().getClass());
        intent.setFlags(131072);
        arVarRequireActivity.startActivity(intent);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) throws Exception {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                ((a58) obj).close();
                break;
            default:
                lvb.H0("MediaNtfMng", "custom command " + ((String) obj) + " produced an error: " + th.getMessage(), th);
                break;
        }
    }

    @Override // defpackage.ip5
    public void p(int i) {
        pp5.c((pp5) this.b, true, i * 10);
    }

    @Override // defpackage.uhf
    public void q(vhf vhfVar) {
        ((cxa) this.b).d.f.c.a(3).b();
    }

    @Override // defpackage.m72
    public void r(y8e y8eVar, IOException iOException) {
        ((mof) this.b).n(iOException);
    }

    @Override // defpackage.wsf
    public void s(long j) {
        srd srdVarO1 = ((lrd) this.b).f.o1();
        if (srdVarO1.p.isActive()) {
            return;
        }
        srdVarO1.p = a8j.t(srdVarO1, null, new i20(j, srdVarO1, (lq4) null, 22), 3);
    }

    @Override // defpackage.t65
    public Object t() {
        return new CallDebugMenuScreen((ha9) this.b);
    }

    @Override // defpackage.p52
    public void u(fu1 fu1Var) {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        if (callScreen.R1().D(callScreen.N1().g)) {
            CallScreen.G1(callScreen);
        }
    }

    @Override // defpackage.igg
    public hgg v() {
        return (yr8) this.b;
    }

    @Override // defpackage.p52
    public void w() {
        ej1 ej1Var;
        ij1 ij1Var = ((lj1) this.b).v;
        if (ij1Var == null || (ej1Var = ((fj1) ((ex8) ij1Var).b).y) == null) {
            return;
        }
        CallScreen callScreen = ((hx1) ej1Var).a;
        l6m l6mVar = CallScreen.D1;
        callScreen.R1().g.i();
    }

    public String x(d01 d01Var, pj4 pj4Var) {
        return (pj4Var == null || ((lx2) this.b) == lx2.a) ? qv1.k("/", d01Var.b) : zo5.p(xoh.b(pj4Var.l), " /", d01Var.b);
    }

    public int y(byte[] bArr, int i, int i2, float f) {
        float[] fArr = (float[]) this.b;
        int length = fArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            fArr[i3] = ((((bArr[(i2 >> 1) + i] >> ((i2 & 1) << 2)) & 15) / 7.5f) - 1.0f) * f;
            i2++;
        }
        return i2;
    }

    public float[] z() {
        return (float[]) this.b;
    }

    public /* synthetic */ ks9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ks9(int i, int i2) {
        this.a = 29;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            for (int i5 = i3 > 0 ? 0 : 1; i5 * i2 < (i2 - i3) * i; i5++) {
                i4++;
            }
            i3++;
        }
        this.b = new float[i4];
    }

    public ks9(Context context, ComponentName componentName, kr6 kr6Var, Bundle bundle) {
        this.a = 0;
        this.b = new is9(context, componentName, kr6Var, bundle);
    }
}

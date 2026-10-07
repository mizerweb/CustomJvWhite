package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.location.Geocoder;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.Locale;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.chats.picker.AbstractPickerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2(gu4 gu4Var, vh vhVar, Uri uri) {
        this.a = 3;
        this.b = vhVar;
        this.c = uri;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int i;
        uq1 tq1Var;
        ze1 ze1Var = null;
        switch (this.a) {
            case 0:
                AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) this.b;
                Bundle bundle = (Bundle) this.c;
                zv8[] zv8VarArr = AbstractPickerScreen.i;
                m8b m8bVarZ1 = abstractPickerScreen.z1(bundle);
                pyc pycVarP1 = abstractPickerScreen.p1();
                dzc dzcVarS1 = abstractPickerScreen.s1();
                ca2 ca2Var = abstractPickerScreen.c;
                return new txc(m8bVarZ1, pycVarP1, dzcVarS1, (xhh) ((ifh) ca2Var.e()).getValue(), ca2Var.getAccessor().d(97));
            case 1:
                ((p7d) this.b).invoke((d9) this.c);
                return sbi.a;
            case 2:
                return new Geocoder((Context) this.b, (Locale) ((ifh) this.c).getValue());
            case 3:
                vh vhVar = (vh) this.b;
                try {
                    mf5 mf5VarE = y3m.e((Context) vhVar.b.getValue(), (Uri) this.c, ((vsg) ((e5d) vhVar.d.getValue()).V4.a(e5d.S6[309]).i()).e);
                    Bitmap bitmap = (Bitmap) mf5VarE.c;
                    if (bitmap != null) {
                        Point point = (Point) mf5VarE.d;
                        int i2 = point.x;
                        if (i2 <= 0 || (i = point.y) <= 0) {
                            rel.b(bitmap);
                            poeVar = null;
                        } else {
                            poeVar = new e3h(i2, i, bitmap);
                        }
                    } else {
                        poeVar = null;
                    }
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    String str = vhVar.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "getFrame failed", thA);
                        }
                    }
                }
                return (e3h) (poeVar instanceof poe ? null : poeVar);
            case 4:
                Context context = (Context) this.b;
                qn qnVar = (qn) this.c;
                vki vkiVar = new vki(context, (q78) null);
                vkiVar.setCallback(qnVar.l);
                return vkiVar;
            case 5:
                return ApiModuleImpl.hangupDelegate_delegate$lambda$0((et7) this.b, (ApiModuleImpl) this.c);
            case 6:
                kq0 kq0Var = (kq0) this.b;
                jq0 jq0Var = (jq0) this.c;
                fg4 fg4Var = kq0Var.a;
                synchronized (fg4Var.c) {
                    if (fg4Var.d.remove(jq0Var) && fg4Var.d.isEmpty()) {
                        fg4Var.d();
                    }
                    break;
                }
                return sbi.a;
            case 7:
                cf7 cf7Var = (cf7) this.b;
                sr srVar = (sr) this.c;
                ViewGroup viewGroup = (ViewGroup) srVar.a;
                View view = (View) cf7Var.invoke((viewGroup != null ? viewGroup : null).getContext());
                srVar.W(view);
                return view;
            case 8:
                qc1 qc1Var = (qc1) this.b;
                r rVar = (r) this.c;
                qc1Var.H = null;
                rVar.invoke();
                return sbi.a;
            case 9:
                Context context2 = (Context) this.b;
                qc1 qc1Var2 = (qc1) this.c;
                yxa yxaVar = new yxa(context2);
                yxaVar.setBounds(0, 0, qc1Var2.getControlsSize().a(), qc1Var2.getControlsSize().a());
                return yxaVar;
            case 10:
                ((ai1) this.b).c.e((rh1) this.c);
                return sbi.a;
            case 11:
                lj1.u((lj1) this.b, (tv8) this.c);
                return sbi.a;
            case 12:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.b;
                Bundle bundle2 = (Bundle) this.c;
                lm1 lm1Var = (lm1) callIncomingScreen.a.getAccessor().c(862);
                boolean z = bundle2.getBoolean("call_incoming_video");
                long j = bundle2.getLong("call_incoming_chat_id");
                String string = bundle2.getString("call_incoming_name", "");
                String string2 = bundle2.getString("call_incoming_avatar");
                String string3 = bundle2.getString("call_incoming_session_id");
                return new km1(z, j, string, string2, string3 == null ? "" : string3, lm1Var.a, lm1Var.b, lm1Var.c, lm1Var.d, lm1Var.e, lm1Var.f, lm1Var.g, lm1Var.h, lm1Var.i, lm1Var.j);
            case 13:
                ym1 ym1Var = (ym1) this.b;
                nm1 nm1Var = (nm1) this.c;
                b95 b95Var = (b95) ym1Var.h.getValue();
                x02 x02Var = nm1Var.a;
                x02 x02Var2 = nm1Var.a;
                b95Var.q(x02Var.s());
                if (!m92.a(ym1Var.k().w1())) {
                    kk9.m(kk9.b, null, false, x02Var2.l(), x02Var2.s(), 3);
                }
                return sbi.a;
            case 14:
                return new uo1((wo1) this.b, (ny8) this.c);
            case 15:
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = (CallJoinLinkPreviewWidget) this.b;
                Bundle bundle3 = (Bundle) this.c;
                sx1 sx1Var = callJoinLinkPreviewWidget.b;
                pp1 pp1Var = (pp1) sx1Var.getAccessor().c(865);
                String string4 = bundle3.getString("call_join_link");
                if (string4 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                msc mscVar = callJoinLinkPreviewWidget.d;
                boolean z2 = bundle3.getBoolean("is_video_call", false);
                svj svjVar = callJoinLinkPreviewWidget.c;
                phf phfVar = new phf(sx1Var.getAccessor().d(168), 9, sx1Var.getAccessor().d(85));
                pp1Var.getClass();
                return new op1(string4, phfVar, svjVar, mscVar, z2, pp1Var.a, pp1Var.b, pp1Var.c, pp1Var.d, pp1Var.e);
            case 16:
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) this.b;
                Bundle bundle4 = (Bundle) this.c;
                wq1 wq1Var = (wq1) callLinkInfoScreen.a.getAccessor().c(770);
                CallLinkInfoScreen.t.getClass();
                String string5 = bundle4.getString("link_param", "");
                String str2 = string5 == null ? "" : string5;
                Long lValueOf = bundle4.containsKey("id_param") ? Long.valueOf(bundle4.getLong("id_param")) : null;
                if (lValueOf == null) {
                    tq1Var = new sq1(str2);
                } else {
                    long jLongValue = lValueOf.longValue();
                    String string6 = bundle4.getString("title_param", "");
                    tq1Var = new tq1(jLongValue, str2, string6 == null ? "" : string6, bundle4.getBoolean("is_link_call"));
                }
                return new vq1(tq1Var, (xu1) callLinkInfoScreen.g.getValue(), wq1Var.a, wq1Var.b, wq1Var.c, wq1Var.d, wq1Var.e);
            case 17:
                vq1 vq1Var = (vq1) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                boolean z3 = ((lq1) vq1Var.k.a.getValue()).h;
                ic6 ic6Var = vq1Var.m;
                if (z3) {
                    a8j.x(ic6Var, new zn1(charSequence.toString()));
                } else {
                    pk1 pk1Var = pk1.b;
                    String string7 = charSequence.toString();
                    pk1Var.getClass();
                    bc1.q(":call-join-preview?link=".concat(string7), ic6Var);
                }
                return sbi.a;
            case 18:
                CallMoreBottomSheet callMoreBottomSheet = (CallMoreBottomSheet) this.b;
                Bundle bundle5 = (Bundle) this.c;
                bs1 bs1Var = (bs1) callMoreBottomSheet.n.getAccessor().c(841);
                return new as1(vr1.valueOf(bundle5.getString("open_type", "UNDEFINE")), (h02) callMoreBottomSheet.m.getValue(), bs1Var.a, bs1Var.b, bs1Var.c, bs1Var.d, bs1Var.e);
            case 19:
                dt1 dt1Var = (dt1) this.b;
                fu1 fu1Var = (fu1) this.c;
                ft0 ft0Var = dt1Var.u;
                if (ft0Var != null) {
                    View anchorButton = ((izb) dt1Var.a).getAnchorButton();
                    dt1Var.l();
                    CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) ft0Var.a;
                    zv8[] zv8VarArr2 = CallOpponentsListWidget.v;
                    kt1 kt1VarP1 = callOpponentsListWidget.p1();
                    ze1 ze1VarC = kt1VarP1.d.c(fu1Var, null);
                    if (ze1VarC != null) {
                        ((sa2) kt1VarP1.k.getValue()).a(fu1Var.a, ns4.a(((dz4) kt1VarP1.C().z().getValue()).c), ze1VarC.c);
                        ze1Var = ze1VarC;
                    }
                    if (ze1Var != null) {
                        Point point2 = new Point(0, 0);
                        int[] iArr = new int[2];
                        anchorButton.getLocationOnScreen(iArr);
                        int i3 = iArr[0];
                        point2.x = i3;
                        int i4 = iArr[1];
                        point2.y = i4;
                        opl.b(callOpponentsListWidget, 1).c().p(ze1Var.a).b().n(i3, i4).l(ze1Var.b).build().u(callOpponentsListWidget);
                    }
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                CallPresettingsScreen callPresettingsScreen = (CallPresettingsScreen) this.b;
                Bundle bundle6 = (Bundle) this.c;
                ov1 ov1Var = (ov1) callPresettingsScreen.a.getAccessor().c(774);
                return new nv1(Long.valueOf(bundle6.getLong("chat_id_arg")).longValue(), ov1Var.a, ov1Var.b, ov1Var.c);
            case 21:
                CallScreen callScreen = (CallScreen) this.b;
                mx1 mx1Var = (mx1) this.c;
                l6m l6mVar = CallScreen.D1;
                callScreen.requireActivity().o(mx1Var);
                return sbi.a;
            case 22:
                return bz1.u((bz1) this.c, (Context) this.b);
            case 23:
                w22.w((w22) this.b, (see) this.c);
                return sbi.a;
            case 24:
                w22.u((w22) this.b, (ll9) this.c);
                return sbi.a;
            case 25:
                w22 w22Var = (w22) this.b;
                return new ct1(x7j.a, (ha9) this.c, w22Var.s, new u22(w22Var), new r22(w22Var, 1), new r22(w22Var, 2), null, 64);
            case 26:
                return w22.x((Context) this.b, (w22) this.c);
            case 27:
                Context context3 = (Context) this.b;
                y62 y62Var = (y62) this.c;
                b1g b1gVar = new b1g(context3);
                a1g a1gVar = b1gVar.c;
                a1gVar.c();
                b1gVar.onThemeChanged(pq3.j.l(y62Var).b);
                y0g y0gVar = y0g.b;
                z0g z0gVar = a1gVar.j;
                zv8[] zv8VarArr3 = a1g.n;
                z0gVar.B(a1gVar, zv8VarArr3[3], y0gVar);
                a1gVar.k.B(a1gVar, zv8VarArr3[4], 5000L);
                b1gVar.e = -gm0.K(70.0f * yl5.d().getDisplayMetrics().density);
                a1gVar.h.B(a1gVar, zv8VarArr3[0], x0g.b);
                b1gVar.setAlpha(76);
                return b1gVar;
            case 28:
                return new v82((w82) this.b, (njd) this.c, 0);
            default:
                ((w82) this.b).j.g((vd4) ((ifh) this.c).getValue());
                return sbi.a;
        }
    }

    public /* synthetic */ z2(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}

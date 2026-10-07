package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import one.me.android.root.RootController;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.folders.list.FoldersListScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s81 implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s81(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x053a  */
    /* JADX WARN: Code duplicated, block: B:243:0x05f1  */
    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        vg4 vg4VarW;
        vg4 vg4VarW2;
        Object value;
        rbb i65Var;
        ks9 ks9Var;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((o91) obj3).n((oh1) obj, obj2);
                return sbi.a;
            case 1:
                ((due) obj3).D(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return sbi.a;
            case 2:
                CallHistoryScreen callHistoryScreen = (CallHistoryScreen) obj3;
                int iIntValue = ((Integer) obj).intValue();
                zv8[] zv8VarArr = CallHistoryScreen.D;
                if (iIntValue == 0) {
                    int i2 = ((o5b) callHistoryScreen.r1().h.b.a.getValue()).b.size() == 1 ? R.string.call_history_delete_selected_confirm_title_single : R.string.call_history_delete_selected_confirm_title;
                    zv8[] zv8VarArr2 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(i2, null, null, 6);
                    jc4VarC.b(2, new tnh(R.string.call_history_item_call_toolbar_action_remove));
                    jc4VarC.c(3, new tnh(R.string.call_history_delete_selected_cancel_button));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(callHistoryScreen);
                    confirmationBottomSheetF.setTargetController(callHistoryScreen);
                    br4 parentController = callHistoryScreen;
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
                return sbi.a;
            case 3:
                Set set = (Set) obj2;
                set.add((String) obj3);
                return set;
            case 4:
                ((Long) obj).getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                q12 q12Var = ((r12) obj3).s;
                if (q12Var != null) {
                    CallScreen callScreen = ((nx1) q12Var).a;
                    l6m l6mVar = CallScreen.D1;
                    callScreen.R1().e.e.a(zBooleanValue);
                }
                return sbi.a;
            case 5:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                c62.a((c62) obj3);
                return sbi.a;
            case 6:
                xd3 xd3Var = (xd3) obj3;
                rt2 rt2Var = (rt2) obj;
                rt2 rt2Var2 = (rt2) obj2;
                vg4 vg4VarW3 = rt2Var.w();
                Long lValueOf = vg4VarW3 != null ? Long.valueOf(vg4VarW3.v()) : null;
                vg4 vg4VarW4 = rt2Var2.w();
                if (cqk.d(lValueOf, vg4VarW4 != null ? Long.valueOf(vg4VarW4.v()) : null)) {
                    if (!xd3Var.c.i()) {
                        yf3 yf3Var = (yf3) xd3Var.Q1.a.getValue();
                        CharSequence charSequence = yf3Var != null ? yf3Var.b : null;
                        rt2Var2.K0();
                        if (cqk.d(charSequence, rt2Var2.j)) {
                            if (rt2Var.b0() != rt2Var2.b0()) {
                            }
                        }
                    } else if (rt2Var.b0() != rt2Var2.b0() && cqk.d(rt2Var.E(), rt2Var2.D(true)) && rt2Var.q() == rt2Var2.q()) {
                        if ((rt2Var.u0() || ((vg4VarW2 = rt2Var.w()) != null && vg4VarW2.G())) == (rt2Var2.u0() || ((vg4VarW = rt2Var2.w()) != null && vg4VarW.G()))) {
                            rt2Var.L0();
                            CharSequence charSequence2 = rt2Var.m;
                            rt2Var2.L0();
                            if (cqk.d(charSequence2, rt2Var2.m)) {
                                rt2Var.K0();
                                CharSequence charSequence3 = rt2Var.j;
                                rt2Var2.K0();
                                if (cqk.d(charSequence3, rt2Var2.j) && rt2Var.A() == rt2Var2.A() && rt2Var.b.b() == rt2Var2.b.b()) {
                                    mx2 mx2VarG = rt2Var.G();
                                    String str = mx2VarG != null ? mx2VarG.c : null;
                                    mx2 mx2VarG2 = rt2Var2.G();
                                    if (cqk.d(str, mx2VarG2 != null ? mx2VarG2.c : null)) {
                                        us0 us0Var = us0.b;
                                        rs0 rs0Var = rs0.a;
                                        z = cqk.d(rt2Var.s(us0Var, rs0Var), rt2Var2.s(us0Var, rs0Var));
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 7:
                ((wj4) ((zsj) obj3).g).m(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return sbi.a;
            case 8:
                k8b k8bVar = (k8b) obj3;
                return Integer.valueOf(tre.P(k8bVar.d(((vg4) obj).v(), 0L), k8bVar.d(((vg4) obj2).v(), 0L)));
            case 9:
                Long l = (Long) obj;
                l.getClass();
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                ((m20) obj3).invoke(l, bool);
                return sbi.a;
            case 10:
                ((w9h) obj3).invoke((View) obj, (u9h) obj2);
                return sbi.a;
            case 11:
                yia yiaVar = (yia) obj3;
                try {
                    yiaVar.E(((Long) obj).longValue());
                    ch3.D(yiaVar, obj2);
                    return sbi.a;
                } catch (IOException e) {
                    throw new es6("bad packing of LongObjectMap", (Throwable) e);
                }
            case 12:
                long jLongValue = ((Long) obj).longValue();
                ((Boolean) obj2).getClass();
                NotificationsSettingsScreen notificationsSettingsScreen = (NotificationsSettingsScreen) ((vn7) obj3).b;
                zv8[] zv8VarArr3 = NotificationsSettingsScreen.m;
                notificationsSettingsScreen.p1().H(jLongValue);
                return sbi.a;
            case 13:
                ((Long) obj).getClass();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                long j = z5c.b;
                PollCreateScreen pollCreateScreen = ((q7d) obj3).a;
                zv8[] zv8VarArr4 = PollCreateScreen.n;
                y7d y7dVarP1 = pollCreateScreen.p1();
                y7dVarP1.getClass();
                if (j == j) {
                    mjg mjgVar = y7dVarP1.d;
                    do {
                        value = mjgVar.getValue();
                    } while (!mjgVar.h(value, x8d.a((x8d) value, null, zBooleanValue2, 1)));
                }
                return sbi.a;
            case 14:
                yfd yfdVar = (yfd) obj3;
                Long l2 = (Long) obj;
                f9b f9bVar = (f9b) obj2;
                je9 je9Var = je9.e;
                if (f9bVar == null) {
                    String str2 = yfdVar.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "applyCallFix: no presence for #" + l2, null);
                    }
                    yab.i0(yfdVar.n, null, 0, new l0d(yfdVar, l2, null, 5), 3);
                    return null;
                }
                qfd qfdVar = (qfd) f9bVar.getValue();
                if (qfdVar == null || qfdVar.b != agd.OFFLINE) {
                    String str3 = yfdVar.g;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str3, "applyCallsFix: ignore patch for #" + l2 + "=" + qfdVar, null);
                    }
                } else {
                    yfdVar.G.put(l2, Long.valueOf(((s7f) ((et3) yfdVar.z.getValue())).f()));
                    f9bVar.setValue(qfd.a(qfdVar, 1));
                    String str4 = yfdVar.g;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                        a4cVar3.c(je9Var, str4, iic.m(l2, "applyCallsFix: moved #", " to ONLINE"), null);
                    }
                }
                return f9bVar;
            case 15:
                return RetryKt.retryApiWithBackoff$lambda$0((y3e) obj3, (Throwable) obj, ((Integer) obj2).intValue());
            case 16:
                RecyclerView recyclerView = (RecyclerView) obj3;
                List list = (List) obj2;
                zv8[] zv8VarArr5 = SelectedMediaBottomBarWidget.C;
                if (list.size() > ((List) obj).size()) {
                    recyclerView.w0(list.size() - 1);
                }
                return sbi.a;
            case 17:
                ylc ylcVar = (ylc) obj2;
                if (cqk.d(ylcVar, ((wjf) obj3).h)) {
                    return null;
                }
                return ylcVar;
            case 18:
                long jLongValue2 = ((Long) obj).longValue();
                boolean zBooleanValue3 = ((Boolean) obj2).booleanValue();
                SettingsBatteryScreen settingsBatteryScreen = (SettingsBatteryScreen) ((due) obj3).a;
                zv8[] zv8VarArr6 = SettingsBatteryScreen.g;
                xqf xqfVarO1 = settingsBatteryScreen.o1();
                int i3 = (int) jLongValue2;
                if (i3 == R.id.oneme_settings_battery_item_gif_available) {
                    xqfVarO1.getClass();
                    xqfVarO1.k.B(xqfVarO1, xqf.o[2], a8j.t(xqfVarO1, null, new wqf(xqfVarO1, zBooleanValue3, null, 1), 1));
                } else if (i3 == R.id.oneme_settings_battery_item_animoji_enabled) {
                    xqfVarO1.getClass();
                    xqfVarO1.l.B(xqfVarO1, xqf.o[3], a8j.t(xqfVarO1, null, new wqf(xqfVarO1, zBooleanValue3, null, 0), 1));
                } else if (i3 == R.id.oneme_settings_battery_item_playlist_enabled) {
                    xqfVarO1.m.B(xqfVarO1, xqf.o[4], yab.i0(xqfVarO1.b, null, 2, new qi4(xqfVarO1, (lq4) null, xqfVarO1, zBooleanValue3), 1));
                } else if (i3 == R.id.oneme_settings_battery_item_video) {
                    xqfVarO1.E(xqfVarO1.C().d.getInt("app.video.auto.play", 1) != -1 ? -1 : 0);
                } else {
                    xqfVarO1.getClass();
                }
                return sbi.a;
            case 19:
                ((qsf) obj3).l(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                long jLongValue3 = ((Long) obj).longValue();
                boolean zBooleanValue4 = ((Boolean) obj2).booleanValue();
                qsf qsfVar = ((btf) obj3).u;
                if (qsfVar != null) {
                    qsfVar.l(jLongValue3, zBooleanValue4);
                }
                return sbi.a;
            case 21:
                ((rtf) obj3).l(((Long) obj).longValue(), ((Boolean) obj2).booleanValue());
                return sbi.a;
            case 22:
                long jLongValue4 = ((Long) obj).longValue();
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                SettingsPrivacyScreen settingsPrivacyScreen = (SettingsPrivacyScreen) ((c7k) obj3).b;
                zv8[] zv8VarArr7 = SettingsPrivacyScreen.i;
                gvf gvfVarO1 = settingsPrivacyScreen.o1();
                pzf pzfVar = gvfVarO1.z;
                long j2 = x7c.g;
                if (jLongValue4 == j2) {
                    if (zBooleanValue5) {
                        if (!gvfVarO1.E().n()) {
                            if (gvfVarO1.E().n()) {
                                i65Var = (gvfVarO1.E().n() && gvfVarO1.F().a() && !gvfVarO1.E().d.getBoolean("app.privacy.safe_mode_no_pin", false)) ? rpf.b : qpf.b;
                            } else {
                                uuf.b.getClass();
                                i65Var = new i65(":settings/privacy/onboarding");
                            }
                            gvfVarO1.I(i65Var);
                        }
                    } else if (gvfVarO1.E().d.getBoolean("app.privacy.safe_mode_no_pin", false)) {
                        gm0.n(gvfVarO1.x, "disableSafeMode");
                        if (gvfVarO1.E().n()) {
                            gvfVarO1.v.B(gvfVarO1, gvf.C[5], yab.h0(gvfVarO1.b, ((n0c) gvfVarO1.c).a(), 2, new cvf(gvfVarO1, null, 0)));
                        } else {
                            gm0.Y(gvf.class.getName(), "Early return in disableSafeMode cuz of !appPrefs.isSafeModeEnabled");
                        }
                    } else {
                        gvfVarO1.y = j2;
                        gvfVarO1.I(rpf.b);
                    }
                }
                return sbi.a;
            case 23:
                spg spgVar = (spg) obj3;
                List list2 = (List) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Context context = spgVar.f;
                if (iIntValue2 == R.id.oneme_stickers_settings_stickers_multiselect_delete) {
                    a8j.x(spgVar.v, new urf(new tnh(list2.size() > 1 ? R.string.oneme_stickers_settings_stickers_confirm_delete_stickers_title : R.string.oneme_stickers_settings_stickers_confirm_delete_sticker_title), new xnh(context.getString(R.string.oneme_stickers_settings_stickers_confirm_delete_subtitle, spgVar.F(list2.size()), spgVar.c == kng.RECENT ? context.getString(R.string.oneme_stickers_settings_stickers_recent_snackbar_from) : context.getString(R.string.oneme_stickers_settings_stickers_favorite_snackbar_from))), xw3.P0(new kc4(R.id.oneme_stickers_settings_confirm_delete_stickers_action, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_action), 1, 56), new kc4(R.id.oneme_stickers_settings_confirm_cancel, new tnh(R.string.oneme_stickers_settings_menu_delete_set_confirm_cancel), 2, 56))));
                }
                return sbi.a;
            case 24:
                int iW0 = r5h.W0((CharSequence) obj, (char[]) obj3, ((Integer) obj2).intValue(), false);
                if (iW0 < 0) {
                    return null;
                }
                return new ylc(Integer.valueOf(iW0), 1);
            case 25:
                pdh pdhVar = (pdh) obj3;
                Long l3 = (Long) obj;
                vo8 vo8Var = (vo8) obj2;
                if (vo8Var == null || !vo8Var.isActive()) {
                    njf njfVar = pdhVar.a;
                    if (njfVar == null) {
                        njfVar = null;
                    }
                    wmi wmiVarI = njfVar.i();
                    njf njfVar2 = pdhVar.a;
                    if (njfVar2 == null) {
                        njfVar2 = null;
                    }
                    return yab.i0(wmiVarI, ((n0c) njfVar2.f()).a(), 0, new odh(pdhVar, l3, null), 2);
                }
                String str5 = pdhVar.b;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 == null) {
                    return vo8Var;
                }
                je9 je9Var2 = je9.d;
                if (!a4cVar4.b(je9Var2)) {
                    return vo8Var;
                }
                a4cVar4.c(je9Var2, str5, zo5.h(vo8Var.hashCode(), "process: using existing job: "), null);
                return vo8Var;
            case 26:
                cni cniVar = (cni) obj3;
                if (((MotionEvent) obj2).getAction() == 0 && (ks9Var = cniVar.u) != null) {
                    ((FoldersListScreen) ks9Var.b).e.s(cniVar);
                }
                return Boolean.FALSE;
            case 27:
                xc7 xc7Var = (xc7) obj3;
                t4j t4jVar = (t4j) obj;
                t4j t4jVar2 = (t4j) obj2;
                int iAbs = Math.abs(((kwi) t4jVar.b).c().ordinal() - xc7Var.ordinal());
                int iAbs2 = Math.abs(((kwi) t4jVar2.b).c().ordinal() - xc7Var.ordinal());
                return Integer.valueOf(iAbs == iAbs2 ? ((kwi) t4jVar2.b).c().b - ((kwi) t4jVar.b).c().b : iAbs - iAbs2);
            case 28:
                Long l4 = (Long) obj;
                l4.getClass();
                ((pti) obj3).d.invoke(l4);
                return sbi.a;
            default:
                return WebTransportSocket._init_$lambda$0((WebTransportSocket) obj3, (sbi) obj, (NALSocket.Listener) obj2);
        }
    }

    public /* synthetic */ s81(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
    }
}

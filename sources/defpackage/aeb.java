package defpackage;

import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.reactions.ProfileReactionsSettingsScreen;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aeb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ aeb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aw1 aw1Var;
        int i = this.a;
        kt7 kt7Var = kt7.CLOCK_TICK;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fz7) obj2).invoke((udb) obj);
                break;
            case 1:
                long j = ((vnb) obj).c;
                NotificationsSettingsScreen notificationsSettingsScreen = (NotificationsSettingsScreen) ((vn7) obj2).b;
                zv8[] zv8VarArr = NotificationsSettingsScreen.m;
                notificationsSettingsScreen.p1().H(j);
                break;
            case 2:
                ((al9) obj2).invoke(Integer.valueOf(((mxb) obj).b));
                break;
            case 3:
                lyb lybVar = (lyb) obj;
                myb mybVar = ((oyb) obj2).a;
                if (mybVar != null) {
                    mybVar.g(lybVar.a);
                }
                break;
            case 4:
                ((cf7) obj2).invoke(Integer.valueOf(((mcc) obj).a));
                break;
            case 5:
                zv8[] zv8VarArr2 = PhotoEditScreen.s1;
                p0m.a((lx3) obj2, kt7Var);
                ((PhotoEditScreen) obj).y1().B(k11.c);
                break;
            case 6:
                zv8[] zv8VarArr3 = PhotoEditScreen.s1;
                p0m.a((ImageView) obj2, kt7Var);
                ((PhotoEditScreen) obj).y1().B(k11.b);
                break;
            case 7:
                qxc qxcVar = (qxc) obj;
                ((rea) obj2).invoke(qxcVar.h, Boolean.valueOf(qxcVar.l));
                break;
            case 8:
                ((iaa) obj2).invoke(Integer.valueOf(((b7d) obj).a));
                break;
            case 9:
                w5d.a((w5d) obj2, (cf7) obj);
                break;
            case 10:
                ((n9d) obj2).u.invoke(Integer.valueOf(((m9d) obj).b));
                break;
            case 11:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen = (ProfileReactionsSettingsScreen) obj;
                zv8[] zv8VarArr4 = ProfileReactionsSettingsScreen.p;
                ((atf) obj2).setVisibility(8);
                jtd jtdVarP1 = profileReactionsSettingsScreen.p1();
                mjg mjgVar = jtdVarP1.n;
                Object value = mjgVar.getValue();
                la3 la3Var = value instanceof la3 ? (la3) value : null;
                if (la3Var == null) {
                    gm0.Y(jtd.class.getName(), "Early return in dropSettingsToDefault cuz of _state.value as? ChatReactionsSettingsState.Content is null");
                } else {
                    List<jl> list = la3Var.d;
                    ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
                    for (jl jlVar : list) {
                        arrayList.add(((b56) jtdVarP1.g.getValue()).b(jlVar.a, jlVar.c, jlVar.e, jlVar.b, gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
                    }
                    mjgVar.j(null, la3.a(la3Var, jtdVarP1.C().a, jtdVarP1.C().b, arrayList, false, true, 200));
                }
                a8j.x(((ez9) profileReactionsSettingsScreen.g.getValue()).f, zy9.a);
                break;
            case 12:
                ProfileReactionsSettingsScreen profileReactionsSettingsScreen2 = (ProfileReactionsSettingsScreen) obj;
                zv8[] zv8VarArr5 = ProfileReactionsSettingsScreen.p;
                ((cyb) obj2).setLoading(true);
                profileReactionsSettingsScreen2.q1();
                profileReactionsSettingsScreen2.p1().F();
                break;
            case 13:
                ((dud) obj2).f.v1().L(((ard) obj).c);
                break;
            case 14:
                ProfileScreen profileScreen = ((dud) obj2).f;
                int i2 = ((fqd) obj).b;
                dvd dvdVarV1 = profileScreen.v1();
                yab.i0(dvdVarV1.b, ((n0c) dvdVarV1.F()).a(), 0, new w93(dvdVarV1, i2, (lq4) null, 9), 2);
                break;
            case 15:
                ProfileScreen profileScreen2 = ((dud) obj).f;
                long j2 = ((qqd) obj2).a.a;
                profileScreen2.getClass();
                trd.b.k(j2);
                break;
            case 16:
                ProfileScreen profileScreen3 = ((dud) obj2).f;
                long j3 = ((tqd) obj).a;
                profileScreen3.getClass();
                String str = "ID #" + j3 + " скопирован в буфер обмена";
                it3.a.A(new i0(profileScreen3.requireActivity(), str, String.valueOf(j3), 14));
                if (it3.b()) {
                    h8c h8cVar = (h8c) profileScreen3.c.getAccessor().d(316).getValue();
                    h8cVar.n(str);
                    h9c h9cVar = h8cVar.b;
                    h8cVar.b = h9c.a(h9cVar, null, null, null, null, o8c.a(h9cVar.e, 2, 0, 0, 14), null, null, 111);
                    h8cVar.p();
                }
                break;
            case 17:
                p4e p4eVar = (p4e) obj;
                o4e o4eVar = ((q4e) obj2).a;
                if (o4eVar != null) {
                    dw1 dw1VarG1 = ((CallRateBottomSheet) o4eVar).G1();
                    int i3 = p4eVar.a;
                    mjg mjgVar2 = dw1VarG1.h;
                    Integer num = ((bw1) mjgVar2.getValue()).a;
                    if (num == null || num.intValue() != i3) {
                        a8j.x(dw1VarG1.p, xv1.a);
                        mjgVar2.j(null, bw1.a((bw1) mjgVar2.getValue(), Integer.valueOf(i3), null, 6));
                        if (i3 == R.id.call_rate_positive_button) {
                            dw1VarG1.C(false);
                        } else {
                            mjg mjgVar3 = dw1VarG1.k;
                            List listB = dw1VarG1.B();
                            mjgVar3.getClass();
                            mjgVar3.j(null, listB);
                            if (i3 == R.id.call_rate_negative_button) {
                                mjg mjgVar4 = dw1VarG1.i;
                                tnh tnhVar = new tnh(R.string.call_rate_negative_title_text);
                                mjgVar4.getClass();
                                mjgVar4.j(null, tnhVar);
                                mjg mjgVar5 = dw1VarG1.m;
                                List<v4e> listP0 = dw1VarG1.e ? xw3.P0(v4e.VIDEO_FREEZES, v4e.VIDEO_QUALITY, v4e.VIDEO_SYNC, v4e.VIDEO_CALL_INTERRUPTION, v4e.USERS_FREEZES) : xw3.P0(v4e.AUDIO_FREEZES, v4e.AUDIO_CALL_INTERRUPTION, v4e.VOICE_COMMUNICATION_PROBLEM, v4e.AUDIO_QUALITY, v4e.AUDIO_ECHO);
                                ArrayList arrayList2 = new ArrayList(yw3.W0(listP0, 10));
                                for (v4e v4eVar : listP0) {
                                    int iOrdinal = v4eVar.ordinal();
                                    switch (v4eVar.ordinal()) {
                                        case 0:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_audio_freezes_title));
                                            break;
                                        case 1:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_audio_call_interuption_title));
                                            break;
                                        case 2:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_voice_communication_problem_title));
                                            break;
                                        case 3:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_audio_quality_title));
                                            break;
                                        case 4:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_audio_echo_title));
                                            break;
                                        case 5:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_video_freezes_title));
                                            break;
                                        case 6:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_video_quality_title));
                                            break;
                                        case 7:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_video_sync_title));
                                            break;
                                        case 8:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_video_call_interuption_title));
                                            break;
                                        case 9:
                                            aw1Var = new aw1(iOrdinal, new tnh(R.string.call_rate_reason_users_freezes_title));
                                            break;
                                        default:
                                            ore.o();
                                            break;
                                    }
                                    arrayList2.add(aw1Var);
                                }
                                mjgVar5.getClass();
                                mjgVar5.j(null, arrayList2);
                            }
                        }
                        break;
                    }
                }
                break;
            case 18:
                w5e w5eVar = (w5e) obj2;
                p0m.a(w5eVar, lt7.CONFIRM);
                ((cf7) obj).invoke(w5eVar.getReaction());
                if (w5eVar.getCount() != 1 || !w5eVar.b()) {
                    w5eVar.a(w5eVar.b());
                }
                break;
            case 19:
                ((cf7) obj2).invoke((g6e) obj);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((fz7) obj2).invoke((s9e) obj);
                break;
            case 21:
                ydf ydfVar = (ydf) obj2;
                nld nldVar = (nld) obj;
                if (!ydfVar.u.isSelected()) {
                    Object objH0 = tre.h0(ydfVar.a, R.id.profile_selectable_item_tag);
                    Integer num2 = objH0 instanceof Integer ? (Integer) objH0 : null;
                    if (num2 != null) {
                        nldVar.invoke(num2);
                    }
                    break;
                }
                break;
            case 22:
                ServerPortBottomSheet serverPortBottomSheet = (ServerPortBottomSheet) obj2;
                cyb cybVar = (cyb) obj;
                CharSequence text = ((jac) serverPortBottomSheet.w.m(serverPortBottomSheet, ServerPortBottomSheet.y[0])).getText();
                if (text != null && text.length() != 0) {
                    hcd hcdVar = (hcd) serverPortBottomSheet.v.getValue();
                    String string = text.toString();
                    xre xreVar = new xre(cybVar, 6, serverPortBottomSheet);
                    dq4 dq4Var = hcdVar.b;
                    xt4 xt4VarB = ((n0c) ((xhh) hcdVar.d.getValue())).b();
                    zhb zhbVar = zhb.b;
                    xt4VarB.getClass();
                    yab.i0(dq4Var, lvb.x0(xt4VarB, zhbVar), 0, new voc(hcdVar, string, xreVar, null, 8), 2);
                    break;
                }
                break;
            case 23:
                long j4 = ((bbf) obj).d;
                SettingsAutoSaveScreen settingsAutoSaveScreen = (SettingsAutoSaveScreen) ((i1m) obj2).a;
                zv8[] zv8VarArr6 = SettingsAutoSaveScreen.g;
                settingsAutoSaveScreen.o1().D(j4);
                break;
            case 24:
                long j5 = ((naf) obj).d;
                SettingsBatteryScreen settingsBatteryScreen = (SettingsBatteryScreen) ((due) obj2).a;
                zv8[] zv8VarArr7 = SettingsBatteryScreen.g;
                settingsBatteryScreen.o1().D((int) j5);
                break;
            case 25:
                long j6 = ((az0) obj).a;
                SettingsBlacklistScreen settingsBlacklistScreen = (SettingsBlacklistScreen) ((ft0) obj2).a;
                zv8[] zv8VarArr8 = SettingsBlacklistScreen.h;
                brf brfVarO1 = settingsBlacklistScreen.o1();
                brfVarO1.o.B(brfVarO1, brf.q[0], yab.h0(brfVarO1.b, ((n0c) ((xhh) brfVarO1.j.getValue())).a(), 2, new tl1(brfVarO1, j6, null, 10)));
                break;
            case 26:
                qrf qrfVarO1 = ((krf) obj2).a.o1();
                long j7 = ((nrf) obj).b;
                qrfVarO1.getClass();
                if (j7 == v7c.a) {
                    a8j.x(qrfVarO1.q, new rfc(new tnh(R.string.settings_devices_finished_all), new ArrayList(new wv(new kc4[]{new kc4(R.id.settings_devices_dialog_finished_session_finish_btn, new tnh(R.string.settings_devices_dialog_finished_session_finish_btn), 1, 56), new kc4(R.id.settings_devices_dialog_finished_session_cancel_btn, new tnh(R.string.settings_devices_dialog_finished_session_cancel), 3, 56)}, true))));
                    break;
                }
                break;
            case 27:
                ((qsf) obj2).c(((psf) obj).getItemId());
                break;
            case 28:
                ((rtf) obj2).c(((bbf) obj).d);
                break;
            default:
                long j8 = ((raf) obj).d;
                SettingsPrivacyScreen settingsPrivacyScreen = (SettingsPrivacyScreen) ((c7k) obj2).b;
                zv8[] zv8VarArr9 = SettingsPrivacyScreen.i;
                gvf gvfVarO1 = settingsPrivacyScreen.o1();
                pzf pzfVar = gvfVarO1.z;
                if (j8 == x7c.i) {
                    gvfVarO1.I(tpf.f);
                    break;
                } else if (j8 == x7c.f) {
                    if (gvfVarO1.E().n()) {
                        gvfVarO1.I(tpf.m);
                    } else {
                        gvfVarO1.I(tpf.g);
                    }
                    break;
                } else if (j8 == x7c.d) {
                    if (gvfVarO1.E().n()) {
                        gvfVarO1.I(tpf.m);
                    } else {
                        gvfVarO1.I(tpf.i);
                    }
                    break;
                } else if (j8 == x7c.n) {
                    uuf.b.getClass();
                    gvfVarO1.I(new i65(":settings/webapps"));
                    break;
                } else if (j8 == x7c.e) {
                    uuf.b.getClass();
                    gvfVarO1.I(new i65(":settings/blacklist"));
                    break;
                } else if (j8 == x7c.h) {
                    if (gvfVarO1.E().n()) {
                        gvfVarO1.I(tpf.m);
                    } else {
                        gvfVarO1.I(tpf.h);
                    }
                    break;
                } else if (j8 != x7c.g) {
                    if (j8 == x7c.a) {
                        if (gvfVarO1.E().n()) {
                            gvfVarO1.I(tpf.m);
                        } else {
                            gvfVarO1.I(tpf.j);
                        }
                    } else if (j8 == x7c.k) {
                        vjd vjdVar = (vjd) ((utd) gvfVarO1.n.getValue()).c(((s7f) gvfVarO1.F()).t()).getValue();
                        if (vjdVar == null || !vjdVar.c.contains(tsd.SECOND_FACTOR_PASSWORD_ENABLED)) {
                            uuf.b.getClass();
                            gvfVarO1.I(new i65(":settings/privacy/onboarding-twofa?state=start"));
                        } else {
                            uuf.b.getClass();
                            gvfVarO1.I(new i65(":twofa/password/check"));
                        }
                    } else if (j8 == x7c.l) {
                        uuf.b.getClass();
                        gvfVarO1.I(new i65(":settings/privacy/profile-deletion"));
                    } else if (j8 == x7c.b) {
                        if (gvfVarO1.H()) {
                            uuf uufVar = uuf.b;
                            long jLongValue = ((Number) ((f5d) ((wo6) gvfVarO1.g.getValue())).a.z2.a(e5d.S6[181]).i()).longValue();
                            uufVar.getClass();
                            gvfVarO1.I(uuf.j(jLongValue, null));
                        }
                    } else if (j8 == x7c.j) {
                        gvfVarO1.I(tpf.n);
                    }
                    break;
                } else if (gvfVarO1.E().n() && !gvfVarO1.F().a() && !gvfVarO1.E().d.getBoolean("app.privacy.safe_mode_no_pin", false)) {
                    gvfVarO1.I(qpf.b);
                    break;
                }
                break;
        }
    }
}

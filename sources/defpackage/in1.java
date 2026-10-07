package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.devmenu.tools.ChatInfoDevWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class in1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in1(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:251:0x0577  */
    /* JADX WARN: Code duplicated, block: B:285:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:288:0x0609  */
    /* JADX WARN: Code duplicated, block: B:289:0x060d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:295:0x0625  */
    /* JADX WARN: Code duplicated, block: B:298:0x0632 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:299:0x0634  */
    /* JADX WARN: Code duplicated, block: B:300:0x0637  */
    /* JADX WARN: Code duplicated, block: B:303:0x0643  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    private final Object l(Object obj) {
        String strB;
        boolean z;
        ynh xnhVar;
        CharSequence charSequence;
        CharSequence charSequenceA;
        boolean z2;
        List listJ;
        List listJ2;
        c79 c79Var;
        ArrayList arrayList;
        lqd lqdVar;
        boolean z3;
        int i;
        int i2;
        int i3;
        u8b u8bVar;
        String str;
        long[] jArr;
        List listJ3;
        CharSequence charSequenceA2;
        kx2 kx2Var;
        vg4 vg4VarW;
        boolean zJ;
        zw2 zw2Var;
        ylc ylcVar = (ylc) this.f;
        ch3.d0(obj);
        rt2 rt2Var = (rt2) ylcVar.a;
        yhc yhcVar = (yhc) ylcVar.b;
        ga3 ga3Var = (ga3) this.g;
        zv8[] zv8VarArr = ga3.A;
        List listJ4 = r66.a;
        boolean zD = jcd.d((jcd) ga3Var.u.getValue(), null, rt2Var, 1);
        String str2 = rt2Var.b.J;
        if (str2 == null || r5h.X0(str2)) {
            strB = null;
        } else {
            w69 w69Var = (w69) ga3Var.p.getValue();
            w69Var.getClass();
            if (w69Var.c(Uri.parse(str2), new kn3(w69Var, 1)).b) {
                strB = null;
            } else {
                strB = xoh.b(str2);
            }
        }
        long jA = rt2Var.A();
        if (!rt2Var.a()) {
            nx2 nx2Var = rt2Var.b;
            if (rt2Var.f0() || rt2Var.h0() || !rt2Var.X() || nx2Var.K.i(4)) {
                zJ = false;
            } else if (rt2Var.B0()) {
                zJ = true;
            } else {
                zJ = rt2Var.J();
                if (!rt2Var.d0() && (zw2Var = nx2Var.I) != null && !zw2Var.b) {
                    zJ = true;
                }
            }
            if (!zJ) {
                z = false;
            } else if (rt2Var.b.g()) {
                z = true;
            } else {
                z = false;
            }
        } else if (rt2Var.b.g()) {
            z = true;
        } else {
            z = false;
        }
        rt2Var.K0();
        CharSequence charSequenceF = rt2Var.j;
        if (charSequenceF == null) {
            charSequenceF = rt2Var.F();
        }
        CharSequence charSequence2 = charSequenceF;
        if (zD) {
            xnhVar = new tnh(jcd.b((jcd) ga3Var.u.getValue(), rt2Var, 2));
        } else {
            xnhVar = (rt2Var.e0() || rt2Var.d0()) ? new xnh(rt2Var.D(true)) : new xnh("not supported");
        }
        ynh ynhVar = xnhVar;
        if (rt2Var.f0()) {
            charSequence = null;
        } else {
            rt2Var.L0();
            charSequence = rt2Var.m;
        }
        boolean zF0 = rt2Var.f0();
        if (rt2Var.d0()) {
            charSequenceA = null;
        } else {
            p4c p4cVar = (p4c) ga3Var.d.getValue();
            if (strB == null) {
                strB = "";
            }
            charSequenceA = p4cVar.a(strB, true);
        }
        int iA = vs0.a.a();
        ProfileScreen.B.getClass();
        bkd bkdVar = new bkd(jA, z, rt2Var.C(iA, gm0.K(ProfileScreen.D * yl5.d().getDisplayMetrics().density)), rt2Var.r(gm0.K(56.0f * yl5.d().getDisplayMetrics().density)), charSequence2, charSequence, zF0, ynhVar, charSequenceA, false, zD, rt2Var.u0() || ((vg4VarW = rt2Var.w()) != null && vg4VarW.G()), 0, 0, false, 29184);
        nx2 nx2Var2 = rt2Var.b;
        fqd fqdVar = (nx2Var2 == null || nx2Var2.b != lx2.b || (kx2Var = nx2Var2.c) != kx2.a || kx2Var == kx2.h || (nx2Var2.q0 & 1) == 0) ? null : new fqd(R.string.report_and_leave, R.id.profile_action_report_and_leave, 12);
        if (rt2Var.e0()) {
            boolean z4 = rt2Var.C0() || rt2Var.p0();
            boolean z5 = ((Number) ((e5d) ga3Var.m.getValue()).G0.a(e5d.S6[83]).i()).longValue() >= ((long) rt2Var.b.b());
            if (z4) {
                i61 i61Var = (i61) ga3Var.b.getValue();
                i61Var.getClass();
                c79 c79VarW = yab.w();
                if (rt2Var.m0() && !rt2Var.f0() && z5) {
                    c79VarW.add(new lyb(R.id.profile_audio_button, Integer.valueOf(R.string.oneme_profile_audio), (Integer) null, Integer.valueOf(R.drawable.icon_call), (Integer) null, 52));
                }
                lyb lybVarA = rt2Var.s0((et3) i61Var.a.getValue()) ? i61.a() : i61.b();
                boolean z6 = !rt2Var.p0();
                if (!rt2Var.f0()) {
                    c79VarW.add(lyb.a(lybVarA, z6));
                }
                nx2 nx2Var3 = rt2Var.b;
                if ((rt2Var.h0() || nx2Var3.c != kx2.c) && !rt2Var.q0() && !rt2Var.g0() && nx2Var3.c != kx2.g) {
                    c79VarW.add(i61.c());
                }
                listJ3 = yab.j(c79VarW);
            } else {
                listJ3 = listJ4;
            }
            if (z4) {
                fmd fmdVar = (fmd) ga3Var.v.getValue();
                fmdVar.getClass();
                boolean zB0 = rt2Var.B0();
                boolean zF1 = rt2Var.f0();
                boolean zK = rt2Var.K();
                boolean zI = rt2Var.b.K.i(1024);
                c79 c79VarW2 = yab.w();
                boolean zD2 = jcd.d(fmdVar.a, null, rt2Var, 1);
                if (!zF1 && !zD2) {
                    c79VarW2.add((lyb) fmdVar.c.getValue());
                }
                if (!zK && !zD2) {
                    c79VarW2.add((lyb) fmdVar.d.getValue());
                }
                if (!zF1) {
                    c79VarW2.add((lyb) fmdVar.j.getValue());
                }
                if (zB0 && !zF1 && !zI) {
                    c79VarW2.add((lyb) fmdVar.h.getValue());
                }
                listJ4 = yab.j(c79VarW2);
            }
            pbf pbfVar = (pbf) ga3Var.c.getValue();
            pbfVar.getClass();
            nx2 nx2Var4 = rt2Var.b;
            c79 c79VarW3 = yab.w();
            pbfVar.i(rt2Var, null, c79VarW3);
            if (!jcd.d(pbfVar.g(), null, rt2Var, 1) && (charSequenceA2 = pbfVar.e().a(rt2Var.v(), true)) != null && !r5h.X0(charSequenceA2)) {
                c79VarW3.add(new lqd(8, charSequenceA2));
            }
            if (rt2Var.z0() && !rt2Var.f0()) {
                c79VarW3.add(new iqd(nx2Var4.T.c, 64));
            }
            pbfVar.b(rt2Var, null, c79VarW3);
            if (rt2Var.C0() || rt2Var.p0()) {
                pbfVar.a(rt2Var, null, c79VarW3);
            }
            pbf.c(c79VarW3, rt2Var);
            if (nx2Var4.b() != 0) {
                c79VarW3.add((gqd) pbfVar.i.getValue());
            }
            listJ = yab.j(c79VarW3);
            List list = listJ3;
            listJ2 = listJ4;
            listJ4 = list;
            z2 = true;
        } else if (rt2Var.d0()) {
            i61 i61Var2 = (i61) ga3Var.b.getValue();
            i61Var2.getClass();
            c79 c79VarW4 = yab.w();
            boolean zD3 = jcd.d((jcd) i61Var2.b.getValue(), null, rt2Var, 1);
            c79VarW4.add(lyb.a(rt2Var.s0((et3) i61Var2.a.getValue()) ? i61.a() : i61.b(), !rt2Var.p0()));
            if (!zD3) {
                c79VarW4.add(i61.c());
            }
            c79 c79VarJ = yab.j(c79VarW4);
            fmd fmdVar2 = (fmd) ga3Var.v.getValue();
            e5d e5dVar = (e5d) ga3Var.m.getValue();
            fmdVar2.getClass();
            boolean zB1 = rt2Var.B0();
            boolean zZ0 = rt2Var.z0();
            boolean zA0 = rt2Var.A0();
            boolean zW = rt2Var.W();
            boolean zK2 = rt2Var.K();
            c79 c79VarW5 = yab.w();
            if (zA0) {
                c79VarW5.add((lyb) fmdVar2.c.getValue());
            }
            if (zB1 && !zK2) {
                c79VarW5.add((lyb) fmdVar2.e.getValue());
            }
            if (((Boolean) e5dVar.t2.a(e5d.S6[175]).i()).booleanValue() && !zB1 && zW) {
                c79VarW5.add((lyb) fmdVar2.f.getValue());
            }
            if (zA0) {
                if (zB1 || zZ0) {
                    c79VarW5.add((lyb) fmdVar2.k.getValue());
                } else {
                    c79VarW5.add((lyb) fmdVar2.l.getValue());
                }
            }
            if (zB1) {
                c79VarW5.add((lyb) fmdVar2.i.getValue());
            }
            listJ2 = yab.j(c79VarW5);
            pbf pbfVar2 = (pbf) ga3Var.c.getValue();
            pbfVar2.getClass();
            c79 c79VarW6 = yab.w();
            pbfVar2.i(rt2Var, null, c79VarW6);
            nx2 nx2Var5 = rt2Var.b;
            dx2 dx2Var = nx2Var5.D;
            if (dx2Var == null || (jArr = dx2Var.a) == null) {
                c79Var = c79VarJ;
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                int length = jArr.length;
                int i4 = 0;
                while (i4 < length) {
                    long j = jArr[i4];
                    c79 c79Var2 = c79VarJ;
                    if (!a.M0(j, (long[]) pbfVar2.f().n().i())) {
                        arrayList.add(Long.valueOf(j));
                    }
                    i4++;
                    c79VarJ = c79Var2;
                }
                c79Var = c79VarJ;
            }
            if (((Boolean) pbfVar2.f().i().i()).booleanValue() && arrayList != null && !arrayList.isEmpty()) {
                xnh xnhVar2 = (yhcVar == null || (str = yhcVar.b) == null) ? ynh.b : new xnh(str);
                if (yhcVar == null || (u8bVar = yhcVar.h) == null) {
                    u8bVar = cqb.b;
                }
                c79VarW6.add(new xqd(0, true, xnhVar2, u8bVar, (Long) ww3.t1(arrayList), 3, Long.valueOf(rt2Var.A()), 129));
            }
            if (rt2Var.x0() && nx2Var5.c()) {
                c79VarW6.add(new wqd(nx2Var5.J));
            }
            boolean z7 = rt2Var.d0() && nx2Var5.I.k;
            if (jcd.d(pbfVar2.g(), null, rt2Var, 1)) {
                lqdVar = null;
            } else {
                CharSequence charSequenceA3 = pbfVar2.e().a(rt2Var.v(), true);
                if (charSequenceA3 == null || charSequenceA3.length() == 0) {
                    charSequenceA3 = null;
                }
                if (charSequenceA3 != null) {
                    lqd lqdVar2 = new lqd(z7 ? 536870920 : 8, charSequenceA3);
                    c79VarW6.add(lqdVar2);
                    lqdVar = lqdVar2;
                } else {
                    lqdVar = null;
                }
            }
            if (z7) {
                c79VarW6.add(new crd(lqdVar != null ? -1878917120 : 131072));
            }
            pbfVar2.a(rt2Var, null, c79VarW6);
            pbf.c(c79VarW6, rt2Var);
            if (rt2Var.z0()) {
                int i5 = nx2Var5.r0;
                boolean z8 = i5 > 0 && ((f5d) ((wo6) pbfVar2.e.getValue())).e();
                boolean z9 = ((f5d) ((wo6) pbfVar2.e.getValue())).q() && srk.a(rt2Var.n(((s7f) pbfVar2.d()).t()), 2) && nx2Var5.v0 > 0;
                if (rt2Var.w0()) {
                    z2 = true;
                    if (nx2Var5.c() && (rt2Var.I() || rt2Var.S())) {
                        z3 = true;
                    }
                    if (z3) {
                        c79VarW6.add(new vqd());
                    }
                    int i6 = nx2Var5.T.c;
                    if (z3) {
                        i = 1073741888;
                    } else {
                        i = 536870976;
                    }
                    c79VarW6.add(new iqd(i6, i));
                    int iB = nx2Var5.b();
                    if (!z8 || z9) {
                        i2 = 1073741952;
                    } else {
                        i2 = -2147483520;
                    }
                    c79VarW6.add(new yqd(iB, i2));
                    if (z8) {
                        if (z9) {
                            i3 = 1075838976;
                        } else {
                            i3 = -2145386496;
                        }
                        c79VarW6.add(new zqd(i5, i3));
                    }
                    if (z9) {
                        c79VarW6.add(new nqd(nx2Var5.v0));
                    }
                } else {
                    z2 = true;
                }
                z3 = false;
                if (z3) {
                    c79VarW6.add(new vqd());
                }
                int i7 = nx2Var5.T.c;
                if (z3) {
                    i = 1073741888;
                } else {
                    i = 536870976;
                }
                c79VarW6.add(new iqd(i7, i));
                int iB2 = nx2Var5.b();
                if (z8) {
                    i2 = 1073741952;
                } else {
                    i2 = 1073741952;
                }
                c79VarW6.add(new yqd(iB2, i2));
                if (z8) {
                    if (z9) {
                        i3 = 1075838976;
                    } else {
                        i3 = -2145386496;
                    }
                    c79VarW6.add(new zqd(i5, i3));
                }
                if (z9) {
                    c79VarW6.add(new nqd(nx2Var5.v0));
                }
            } else {
                z2 = true;
            }
            gjf gjfVar = (gjf) pbfVar2.d.getValue();
            gjfVar.getClass();
            if (((Number) ((g5d) gjfVar).a.E2.a(e5d.S6[186]).i()).longValue() != 0 && srk.a(rt2Var.n(((s7f) pbfVar2.d()).t()), np0.q)) {
                c79VarW6.add(new kqd());
            }
            listJ = yab.j(c79VarW6);
            listJ4 = c79Var;
        } else {
            z2 = true;
            String str3 = "unsupported chat type " + rt2Var.b.b;
            qv1.u(str3, ga3Var.o, str3);
            listJ = listJ4;
            listJ2 = listJ;
        }
        c79 c79VarW7 = yab.w();
        if (!listJ4.isEmpty() || !listJ2.isEmpty()) {
            if (rt2Var.p0() || listJ2.isEmpty()) {
                z2 = false;
            }
            c79VarW7.add(new eqd(listJ4, listJ2, z2));
        }
        if (fqdVar != null) {
            c79VarW7.add(fqdVar);
        }
        if (rt2Var.p0() || rt2Var.h()) {
            c79VarW7.add(new fqd(rt2Var.h() ? R.string.channel_subscribe : R.string.oneme_profile_add_to_chat, R.id.profile_action_primary, 12));
        }
        c79VarW7.addAll(listJ);
        ga3Var.f(new tjd(bkdVar, yab.j(c79VarW7)));
        return sbi.a;
    }

    private final Object n(Object obj) {
        vg4 vg4VarW;
        ch3.d0(obj);
        xd3 xd3Var = (xd3) this.f;
        rt2 rt2Var = (rt2) xd3Var.G1.a.getValue();
        sbi sbiVar = sbi.a;
        if (rt2Var == null) {
            return sbiVar;
        }
        boolean zS0 = rt2Var.s0(xd3Var.G());
        boolean zD = jcd.d((jcd) xd3Var.u.getValue(), null, rt2Var, 1);
        c79 c79VarW = yab.w();
        t73 t73Var = xd3Var.c;
        wxb wxbVar = xd3Var.n;
        if (!t73Var.a()) {
            nx2 nx2Var = rt2Var.b;
            if ((rt2Var.h0() || nx2Var.c != kx2.c) && !rt2Var.q0() && !rt2Var.g0() && nx2Var.c != kx2.g && rt2Var.c != null && !zD) {
                c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_search, new tnh(R.string.oneme_chat_toolbar_more_action_search), new Integer(R.drawable.icon_search), (Integer) null, 20));
            }
        }
        if (rt2Var.h0() && (vg4VarW = rt2Var.w()) != null && vg4VarW.h() && !zD) {
            c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_share_contact, new tnh(R.string.share_contact_menu), new Integer(R.drawable.icon_forward), (Integer) null, 20));
        }
        if (!rt2Var.p0()) {
            c79VarW.add(new rp4(!zS0 ? R.id.oneme_toolbar_more_action_notifications_enabled : R.id.oneme_toolbar_more_action_notifications_disabled, new tnh(R.string.oneme_chat_toolbar_more_action_notifications), new Integer(!zS0 ? R.drawable.icon_notifications : R.drawable.icon_notifications_crossed), (Integer) null, 20));
            if ((!rt2Var.d0() || rt2Var.A0()) && !zD && !rt2Var.i0()) {
                c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_add_to_folder, new tnh(R.string.oneme_chat_modal_action_add_to_folder), new Integer(R.drawable.icon_folder_add_to), (Integer) null, 20));
            }
            boolean z = rt2Var.A() != 0;
            boolean z2 = rt2Var.h0() && !rt2Var.b0();
            if (xd3Var.n1 && z2 && z) {
                c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_send_money, new tnh(R.string.oneme_chat_modal_action_send_money), new Integer(R.drawable.icon_wallet), (Integer) null, 20));
            }
            wxbVar.getClass();
            if (a55.a(xd3Var.Z) == a55.DEV_OPTIONS_MENU && !rt2Var.d0()) {
                c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_send_logs, new tnh(R.string.oneme_chat_modal_action_send_logs), new Integer(R.drawable.icon_placeholder), (Integer) null, 20));
            }
        }
        if (rt2Var.d0() && rt2Var.x0() && !zD) {
            c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_share_channel, new tnh(R.string.oneme_chat_modal_action_share_channel), new Integer(R.drawable.icon_forward), (Integer) null, 20));
        }
        b5d b5dVar = ((e5d) xd3Var.t.getValue()).t2;
        zv8[] zv8VarArr = e5d.S6;
        if (((Boolean) b5dVar.a(zv8VarArr[175]).i()).booleanValue() && rt2Var.d0() && rt2Var.W() && !rt2Var.B0()) {
            c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_complain_channel, new tnh(R.string.oneme_chat_modal_action_report), new Integer(R.attr.text_negative), new Integer(R.drawable.icon_report), new Integer(R.attr.icon_negative)));
        }
        wxbVar.getClass();
        if (((Boolean) ((f5d) ((wo6) xd3Var.s.getValue())).a.h4.a(zv8VarArr[269]).i()).booleanValue()) {
            c79VarW.add(new rp4(R.id.oneme_toolbar_more_action_dump_messages, new tnh(R.string.oneme_chat_modal_action_dump_messages), new Integer(R.drawable.icon_placeholder), (Integer) null, 20));
        }
        c79 c79VarJ = yab.j(c79VarW);
        ic6 ic6Var = xd3Var.L1;
        ylc ylcVar = new ylc("chat_server_id", new Long(rt2Var.A()));
        vg4 vg4VarW2 = rt2Var.w();
        a8j.x(ic6Var, new lc3(c79VarJ, n1g.i(ylcVar, new ylc("contact_id", vg4VarW2 != null ? new Long(vg4VarW2.v()) : null)), (View) this.g));
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                in1 in1Var = new in1((kn1) obj2, lq4Var, 0);
                in1Var.f = obj;
                return in1Var;
            case 1:
                in1 in1Var2 = new in1((vq1) obj2, lq4Var, 1);
                in1Var2.f = obj;
                return in1Var2;
            case 2:
                return new in1((kt1) this.f, (String) obj2, lq4Var, 2);
            case 3:
                return new in1((q32) this.f, (h02) obj2, lq4Var, 3);
            case 4:
                in1 in1Var3 = new in1(lq4Var, (vv1) obj2, 4);
                in1Var3.f = obj;
                return in1Var3;
            case 5:
                return new in1((Set) this.f, (j52) obj2, lq4Var, 5);
            case 6:
                in1 in1Var4 = new in1((r62) obj2, lq4Var, 6);
                in1Var4.f = obj;
                return in1Var4;
            case 7:
                in1 in1Var5 = new in1(lq4Var, (CallWaitingRoomEventsWidget) obj2, 7);
                in1Var5.f = obj;
                return in1Var5;
            case 8:
                return new in1((zm2) this.f, (iaj) obj2, lq4Var, 8);
            case 9:
                return new in1((kc2) this.f, (String) obj2, lq4Var, 9);
            case 10:
                in1 in1Var6 = new in1((sfa) obj2, lq4Var, 10);
                in1Var6.f = obj;
                return in1Var6;
            case 11:
                in1 in1Var7 = new in1((ChatAdminsScreen) obj2, lq4Var, 11);
                in1Var7.f = obj;
                return in1Var7;
            case 12:
                in1 in1Var8 = new in1((lv2) obj2, lq4Var, 12);
                in1Var8.f = obj;
                return in1Var8;
            case 13:
                in1 in1Var9 = new in1((hy2) obj2, lq4Var, 13);
                in1Var9.f = obj;
                return in1Var9;
            case 14:
                in1 in1Var10 = new in1((ChatInfoDevWidget) obj2, lq4Var, 14);
                in1Var10.f = obj;
                return in1Var10;
            case 15:
                in1 in1Var11 = new in1((n13) obj2, lq4Var, 15);
                in1Var11.f = obj;
                return in1Var11;
            case 16:
                in1 in1Var12 = new in1((f43) obj2, lq4Var, 16);
                in1Var12.f = obj;
                return in1Var12;
            case 17:
                in1 in1Var13 = new in1((j43) obj2, lq4Var, 17);
                in1Var13.f = obj;
                return in1Var13;
            case 18:
                return new in1((x43) this.f, (c39) obj2, lq4Var, 18);
            case 19:
                return new in1((e70) this.f, (x43) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new in1((ChatMediaViewerScreen) this.f, (m53) obj2, lq4Var, 20);
            case 21:
                return new in1((l63) this.f, (c39) obj2, lq4Var, 21);
            case 22:
                in1 in1Var14 = new in1((l63) obj2, lq4Var, 22);
                in1Var14.f = obj;
                return in1Var14;
            case 23:
                in1 in1Var15 = new in1((ChatMembersCompactWidget) obj2, lq4Var, 23);
                in1Var15.f = obj;
                return in1Var15;
            case 24:
                return new in1((Set) this.f, (l73) obj2, lq4Var, 24);
            case 25:
                in1 in1Var16 = new in1(lq4Var, (ChatNotificationsSettingsScreen) obj2, 25);
                in1Var16.f = obj;
                return in1Var16;
            case 26:
                return new in1((ga3) this.f, (rt2) obj2, lq4Var, 26);
            case 27:
                in1 in1Var17 = new in1((ga3) obj2, lq4Var, 27);
                in1Var17.f = obj;
                return in1Var17;
            case 28:
                return new in1((xd3) this.f, (View) obj2, lq4Var, 28);
            default:
                in1 in1Var18 = new in1((ny8) obj2, lq4Var, 29);
                in1Var18.f = obj;
                return in1Var18;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((in1) create((Long) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((in1) create((gk1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((in1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                return ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((in1) create((cd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((in1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                return ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                ((in1) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((in1) create((m9a) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                ((in1) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((in1) create((kz5) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((in1) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((in1) create((la0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((in1) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((in1) create((l1j) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((in1) create((wz9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((in1) create((m9a) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((in1) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                ((in1) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((in1) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((in1) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v30, types: [s66] */
    /* JADX WARN: Type inference failed for: r2v32, types: [h6g] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        String strK;
        Object value2;
        ynh ynhVar;
        Object n62Var;
        TextUtils.TruncateAt truncateAt;
        String string;
        Object[] spans;
        int length;
        int i;
        Object value3;
        Object value4;
        int i2 = this.e;
        int i3 = R.string.call_screen_waiting_room_user_waitting_approuve;
        boolean z = true;
        CharSequence charSequence = null;
        SpannedString spannedString = null;
        charSequenceB = null;
        CharSequence charSequenceB = null;
        switch (i2) {
            case 0:
                Long l = (Long) this.f;
                ch3.d0(obj);
                kn1 kn1Var = (kn1) this.g;
                mjg mjgVar = kn1Var.l;
                do {
                    value = mjgVar.getValue();
                    if (l != null) {
                        ((p32) kn1Var.f.getValue()).getClass();
                        strK = qv1.k("· ", p32.e(l));
                    } else {
                        strK = null;
                    }
                    if (strK == null) {
                        strK = "";
                    }
                } while (!mjgVar.h(value, strK));
                return sbi.a;
            case 1:
                sbi sbiVar = sbi.a;
                gk1 gk1Var = (gk1) this.f;
                ch3.d0(obj);
                if (gk1Var instanceof ek1) {
                    Long l2 = ((vq1) this.g).i;
                    ek1 ek1Var = (ek1) gk1Var;
                    long j = ek1Var.a.b;
                    if (l2 != null && l2.longValue() == j) {
                        ((vq1) this.g).i = null;
                        vq1 vq1Var = (vq1) this.g;
                        if1 if1Var = ek1Var.a;
                        String str = if1Var.g;
                        String str2 = if1Var.c;
                        co1 co1Var = vq1Var.e;
                        mjg mjgVar2 = vq1Var.j;
                        while (true) {
                            Object value5 = mjgVar2.getValue();
                            if (!mjgVar2.h(value5, lq1.a((lq1) value5, co1Var.a(charSequence, Long.MIN_VALUE), v3e.c(str), str2, new jq1(co1Var.b(str)), str2 != null ? new xnh(str2) : new tnh(R.string.call_history_info_title), lq1.k, eq1.a, true, null, vq1Var.B(null, true), 1))) {
                                charSequence = null;
                            }
                        }
                    }
                } else {
                    if (!(gk1Var instanceof fk1)) {
                        ore.o();
                        return null;
                    }
                    Long l3 = ((vq1) this.g).i;
                    long j2 = ((fk1) gk1Var).a;
                    if (l3 != null && l3.longValue() == j2) {
                        ((vq1) this.g).i = null;
                        mjg mjgVar3 = ((vq1) this.g).j;
                        do {
                            value2 = mjgVar3.getValue();
                        } while (!mjgVar3.h(value2, lq1.a((lq1) value2, null, null, null, new hq1(), new tnh(R.string.call_history_info_create_failed), r66.a, fq1.a, false, null, null, 1807)));
                    }
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                kt1 kt1Var = (kt1) this.f;
                ny8 ny8Var = kt1Var.i;
                String str3 = (String) this.g;
                kt1Var.n = str3;
                enc encVar = (enc) kt1Var.C().getParticipants().a().getValue();
                if (r5h.X0(str3)) {
                    c79 c79VarW = yab.w();
                    c79VarW.add(encVar.a);
                    c79VarW.addAll(encVar.c.values());
                    kt1.B(kt1Var, yab.j(c79VarW), encVar.g);
                } else {
                    c79 c79VarW2 = yab.w();
                    if (((daf) ny8Var.getValue()).g(encVar.a.b.getName().toString(), str3)) {
                        c79VarW2.add(encVar.a);
                    }
                    Collection collectionValues = encVar.c.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : collectionValues) {
                        if (((daf) ny8Var.getValue()).g(((tmc) obj2).b.getName().toString(), str3)) {
                            arrayList.add(obj2);
                        }
                    }
                    c79VarW2.addAll(arrayList);
                    kt1.B(kt1Var, yab.j(c79VarW2), encVar.g);
                }
                return sbi.a;
            case 3:
                ch3.d0(obj);
                q32 q32Var = (q32) this.f;
                s32 s32Var = (s32) ((h02) this.g).X.getValue();
                s32Var.b = q32Var;
                Iterator it = s32Var.a.iterator();
                while (it.hasNext()) {
                    ((r32) it.next()).D(q32Var);
                }
                return q32Var;
            case 4:
                Object obj3 = this.f;
                ch3.d0(obj);
                y12 y12Var = (y12) obj3;
                vv1 vv1Var = (vv1) this.g;
                vv1Var.setVisibility(!(y12Var.c instanceof u12) ? 0 : 8);
                x12 x12Var = y12Var.c;
                if (!x12Var.equals(u12.a)) {
                    if (x12Var.equals(w12.a)) {
                        t12 t12Var = y12Var.b;
                        if (t12Var != null && (ynhVar = t12Var.b) != null) {
                            charSequenceB = ynhVar.b(vv1Var.getContext());
                        }
                        vv1Var.setBody(charSequenceB);
                        vv1Var.setLoading(false);
                    } else {
                        if (!x12Var.equals(v12.a)) {
                            ore.o();
                            return null;
                        }
                        vv1Var.setLoading(true);
                    }
                }
                return sbi.a;
            case 5:
                j52 j52Var = (j52) this.g;
                Object mwVar = s66.a;
                ch3.d0(obj);
                Set set = (Set) this.f;
                if (!set.isEmpty()) {
                    bi4 bi4Var = ((no4) j52Var.b.getValue()).a;
                    bi4Var.a();
                    mw mwVar2 = new mw(0);
                    bi4Var.a.forEach(new kw2(set, mwVar2, 1));
                    if (!mwVar2.isEmpty()) {
                        mwVar = new mw(mwVar2.c);
                        for (Map.Entry entry : (gw) mwVar2.entrySet()) {
                            long jLongValue = ((Number) entry.getKey()).longValue();
                            vg4 vg4Var = (vg4) entry.getValue();
                            String strK2 = vg4Var.k();
                            if (strK2 == null) {
                                strK2 = "";
                            }
                            String strI0 = z5h.I0(strK2.toString(), ' ', (char) 160, true);
                            Long l4 = new Long(jLongValue);
                            CharSequence charSequenceB2 = j52Var.b(strI0, vg4Var.G());
                            mwVar.put(l4, new gni(vg4Var.v(), charSequenceB2 == null ? "" : charSequenceB2, vg4Var.u(), vg4Var.z(us0.d), vg4Var.I(), vg4Var.G()));
                        }
                    }
                }
                return mwVar;
            case 6:
                cd cdVar = (cd) this.f;
                ch3.d0(obj);
                r62 r62Var = (r62) this.g;
                ny8 ny8Var2 = r62Var.d;
                mjg mjgVar4 = r62Var.e;
                while (true) {
                    Object value6 = mjgVar4.getValue();
                    Object o62Var = (q62) value6;
                    Map map = cdVar.a;
                    if (!map.isEmpty() || cdVar.b.isEmpty()) {
                        if (map.isEmpty()) {
                            o62Var = new o62(cdVar.c);
                        } else {
                            if (map.size() == 1) {
                                fu1 fu1Var = (fu1) ((Map.Entry) ww3.q1(map.entrySet())).getKey();
                                q42 q42Var = (q42) ((Map.Entry) ww3.q1(map.entrySet())).getValue();
                                n62Var = new p62(fu1Var, new xnh(r62.C(r62Var, q42Var.getName())), ((p32) ny8Var2.getValue()).a(new tnh(i3)), gm0.a(q42Var.g(), new Long(q42Var.p())), q42Var.a(), cdVar.c);
                            } else if (map.size() == 2) {
                                List listJ1 = ww3.J1(map.values());
                                n62Var = new n62(new vnh(R.string.call_screen_waiting_room_two_users_waitting_title, a.n1(new Object[]{r62.C(r62Var, ((q42) ww3.r1(listJ1)).getName()), r62.C(r62Var, ((q42) ww3.B1(listJ1)).getName())})), ((p32) ny8Var2.getValue()).a(new tnh(R.string.call_screen_waiting_room_users_waitting_approuve)), 1, r62.B(r62Var, listJ1), cdVar.c);
                            } else {
                                List listJ2 = ww3.J1(map.values());
                                n62Var = new n62(new vnh(R.string.call_screen_waiting_room_more_users_waitting_title, a.n1(new Object[]{r62.C(r62Var, ((q42) ww3.r1(listJ2)).getName()), String.valueOf(listJ2.size() - 1)})), ((p32) ny8Var2.getValue()).a(new tnh(R.string.call_screen_waiting_room_users_waitting_approuve)), 2, r62.B(r62Var, listJ2), cdVar.c);
                            }
                            o62Var = n62Var;
                        }
                    }
                    if (mjgVar4.h(value6, o62Var)) {
                        return sbi.a;
                    }
                    i3 = R.string.call_screen_waiting_room_user_waitting_approuve;
                }
                break;
            case 7:
                Object obj4 = this.f;
                ch3.d0(obj);
                q62 q62Var = (q62) obj4;
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) this.g;
                zv8[] zv8VarArr = CallWaitingRoomEventsWidget.m;
                boolean z2 = q62Var instanceof p62;
                if (z2) {
                    FrameLayout frameLayoutQ1 = callWaitingRoomEventsWidget.q1();
                    Rect rect = n7j.a;
                    if (frameLayoutQ1.findViewById(R.id.call_waiting_room_events_multi_view) != null) {
                        isk.d(callWaitingRoomEventsWidget.r1(), false, 0L, null, 6);
                    }
                    if (callWaitingRoomEventsWidget.q1().findViewById(R.id.call_waiting_room_events_view) != null) {
                        isk.d(callWaitingRoomEventsWidget.p1(), true, 0L, null, 6);
                    } else {
                        FrameLayout frameLayoutQ2 = callWaitingRoomEventsWidget.q1();
                        izb izbVar = new izb(callWaitingRoomEventsWidget.getContext(), false);
                        izbVar.setId(R.id.call_waiting_room_events_view);
                        izbVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        izbVar.setCustomTheme(pq3.j.l(izbVar).b);
                        izbVar.setCallButtonMode(dzb.b);
                        izbVar.setSubtitle(izbVar.getContext().getString(R.string.call_screen_waiting_room_user_waitting_approuve));
                        izbVar.setVisibility(0);
                        frameLayoutQ2.addView(izbVar);
                    }
                } else if (q62Var instanceof n62) {
                    FrameLayout frameLayoutQ3 = callWaitingRoomEventsWidget.q1();
                    Rect rect2 = n7j.a;
                    if (frameLayoutQ3.findViewById(R.id.call_waiting_room_events_view) != null) {
                        isk.d(callWaitingRoomEventsWidget.p1(), false, 0L, null, 6);
                    }
                    if (callWaitingRoomEventsWidget.q1().findViewById(R.id.call_waiting_room_events_multi_view) != null) {
                        isk.d(callWaitingRoomEventsWidget.r1(), true, 0L, null, 6);
                    } else {
                        FrameLayout frameLayoutQ4 = callWaitingRoomEventsWidget.q1();
                        b5b b5bVar = new b5b(callWaitingRoomEventsWidget.getContext());
                        b5bVar.setId(R.id.call_waiting_room_events_multi_view);
                        b5bVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                        b5bVar.setVisibility(0);
                        frameLayoutQ4.addView(b5bVar);
                        callWaitingRoomEventsWidget.r1().setVisibility(0);
                    }
                }
                if (!(q62Var instanceof m62)) {
                    if (q62Var instanceof o62) {
                        callWaitingRoomEventsWidget.s1(((o62) q62Var).a);
                    } else if (z2) {
                        izb izbVarP1 = callWaitingRoomEventsWidget.p1();
                        p62 p62Var = (p62) q62Var;
                        tj0 tj0Var = p62Var.d;
                        izbVarP1.j(tj0Var.a, tj0Var.b, p62Var.e);
                        CharSequence charSequenceB3 = p62Var.b.b(izbVarP1.getContext());
                        if (charSequenceB3 != null) {
                            List listL1 = r5h.l1(r5h.y1(charSequenceB3), new char[]{' ', 160});
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : listL1) {
                                if (!r5h.X0((String) obj5)) {
                                    arrayList2.add(obj5);
                                }
                            }
                            int size = arrayList2.size();
                            if (size == 0) {
                                string = "";
                            } else if (size != 1) {
                                string = ((String) arrayList2.get(0)) + " " + r5h.R0(0, (CharSequence) arrayList2.get(1)) + ".";
                            } else {
                                string = charSequenceB3.toString();
                            }
                        } else {
                            string = null;
                        }
                        izbVarP1.setTitle(string != null ? string : "");
                        if (charSequenceB3 != null) {
                            SpannableString spannableStringValueOf = SpannableString.valueOf(charSequenceB3);
                            try {
                                spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), ImageSpan.class);
                                while (true) {
                                    if (i >= length) {
                                        z = false;
                                    } else if (!(((ImageSpan) spans[i]).getDrawable() instanceof osi)) {
                                        i++;
                                    }
                                }
                            } catch (Throwable unused) {
                                spans = null;
                            }
                            if (spans == null) {
                                spans = new ImageSpan[0];
                            }
                            length = spans.length;
                            i = 0;
                            callWaitingRoomEventsWidget.p1().setVerified(z);
                        }
                        izbVarP1.setSubtitle(p62Var.c.b(izbVarP1.getContext()));
                        izbVarP1.setSubtitleTextColor(czb.a);
                        izbVarP1.i();
                        izbVarP1.p((LayerDrawable) ((tbj) callWaitingRoomEventsWidget.h.getValue()).b.getValue(), (LayerDrawable) ((tbj) callWaitingRoomEventsWidget.h.getValue()).c.getValue(), new w62(callWaitingRoomEventsWidget, 0, q62Var));
                        ezb ezbVar = ezb.b;
                        izbVarP1.setTrailingElementsPadding(ezbVar);
                        izbVarP1.setCellHeight(ezbVar);
                        izbVarP1.setOnClickListener(null);
                        int iK = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        izbVarP1.setPadding(iK, iK, iK, iK);
                    } else {
                        if (!(q62Var instanceof n62)) {
                            ore.o();
                            return null;
                        }
                        b5b b5bVarR1 = callWaitingRoomEventsWidget.r1();
                        n62 n62Var2 = (n62) q62Var;
                        b5bVarR1.setAvatars(n62Var2.d);
                        vnh vnhVar = n62Var2.a;
                        int i4 = n62Var2.c;
                        TextView textView = b5bVarR1.t;
                        textView.setText(vnhVar.b(textView.getContext()));
                        int iD = qt4.D(i4);
                        if (iD == 0) {
                            truncateAt = TextUtils.TruncateAt.END;
                        } else {
                            if (iD != 1) {
                                ore.o();
                                return null;
                            }
                            truncateAt = TextUtils.TruncateAt.MIDDLE;
                        }
                        textView.setEllipsize(truncateAt);
                        b5bVarR1.setMessage(n62Var2.b);
                        b5bVarR1.setMessageTextColor(a5b.a);
                        qe7.H(b5bVarR1, 300L, new x62(callWaitingRoomEventsWidget, 0, q62Var));
                        int iK2 = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                        b5bVarR1.setPadding(iK2, iK2, iK2, iK2);
                    }
                }
                return sbi.a;
            case 8:
                ch3.d0(obj);
                zm2 zm2Var = (zm2) this.f;
                if (zm2Var != null) {
                    zm2Var.o();
                }
                iaj iajVar = (iaj) this.g;
                if (iajVar != null) {
                    iajVar.a(null);
                }
                return sbi.a;
            case 9:
                ch3.d0(obj);
                return ((kc2) this.f).d((String) this.g);
            case 10:
                tw2 tw2Var = (tw2) this.f;
                ch3.d0(obj);
                tw2Var.e((sfa) this.g);
                return sbi.a;
            case 11:
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) this.g;
                m9a m9aVar = (m9a) this.f;
                ch3.d0(obj);
                if (m9aVar instanceof i9a) {
                    trd trdVar = trd.b;
                    zv8[] zv8VarArr2 = ChatAdminsScreen.l;
                    long jP1 = chatAdminsScreen.p1();
                    long j3 = ((i9a) m9aVar).a;
                    trdVar.getClass();
                    trdVar.e(trd.l(jP1, j3));
                } else if (m9aVar instanceof g9a) {
                    g9a g9aVar = (g9a) m9aVar;
                    int i5 = g9aVar.a;
                    long j4 = g9aVar.b;
                    zv8[] zv8VarArr3 = ChatAdminsScreen.l;
                    if (i5 == R.id.profile_members_list_action_delete_from_admin) {
                        gu2 gu2VarO1 = chatAdminsScreen.o1();
                        e9i.j0(e9i.T(new bye(new f1j(((no4) gu2VarO1.e.getValue()).j(j4), (lq4) null, gu2VarO1, j4)), ((n0c) ((xhh) gu2VarO1.f.getValue())).b()), gu2VarO1.b);
                    }
                } else if (m9aVar instanceof j9a) {
                    if (((j9a) m9aVar).a == R.id.profile_members_list_add_admin_to_chat_action) {
                        trd trdVar2 = trd.b;
                        zv8[] zv8VarArr4 = ChatAdminsScreen.l;
                        o65.c(trdVar2.b(), zo5.j(chatAdminsScreen.p1(), ":profile/add-admins?chat_id="), null, null, 6);
                    }
                } else if (m9aVar instanceof l9a) {
                    trd trdVar3 = trd.b;
                    zv8[] zv8VarArr5 = ChatAdminsScreen.l;
                    long jP2 = chatAdminsScreen.p1();
                    long jLongValue2 = ((Number) chatAdminsScreen.h.getValue()).longValue();
                    trdVar3.getClass();
                    trdVar3.e(trd.l(jP2, jLongValue2));
                } else if (m9aVar instanceof k9a) {
                    trd trdVar4 = trd.b;
                    zv8[] zv8VarArr6 = ChatAdminsScreen.l;
                    long jP3 = chatAdminsScreen.p1();
                    long j5 = ((k9a) m9aVar).a;
                    trdVar4.getClass();
                    trdVar4.e(trd.l(jP3, j5));
                } else if (!(m9aVar instanceof h9a)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 12:
                ylc ylcVar = (ylc) this.f;
                ch3.d0(obj);
                lq2 lq2Var = (lq2) ylcVar.a;
                jl jlVar = (jl) ylcVar.b;
                lv2 lv2Var = (lv2) this.g;
                mjg mjgVar5 = lv2Var.i;
                lq2 lq2Var2 = (lq2) mjgVar5.getValue();
                if ((lq2Var2 != null ? lq2Var2.b : null) == kq2.b) {
                    mjgVar5.setValue(lq2Var);
                }
                String str4 = jlVar != null ? jlVar.c : null;
                zv8[] zv8VarArr7 = lv2.I;
                lv2Var.d(lv2Var.D(str4));
                return sbi.a;
            case 13:
                kz5 kz5Var = (kz5) this.f;
                ch3.d0(obj);
                hy2 hy2Var = (hy2) this.g;
                String str5 = kz5Var.h;
                zv8[] zv8VarArr8 = hy2.Q;
                mjg mjgVar6 = hy2Var.l;
                kz5 kz5Var2 = (kz5) mjgVar6.getValue();
                if (kz5Var2 != null && !cqk.d(kz5Var2.h, str5)) {
                    mjgVar6.j(null, kz5.c(kz5Var2, null, null, null, str5, 127));
                }
                hy2 hy2Var2 = (hy2) this.g;
                String str6 = kz5Var.a;
                long j6 = kz5Var.b;
                String str7 = kz5Var.d;
                CharSequence charSequence2 = kz5Var.c;
                kz5 kz5Var3 = (kz5) hy2Var2.k.getValue();
                ind indVar = new ind(j6, str7, charSequence2, str6, kz5Var3 != null && kz5Var3.b((c06) hy2Var2.l.getValue()), hy2Var2.r);
                List listB = hy2Var2.f().b(hy2Var2);
                mjg mjgVar7 = hy2Var2.b;
                do {
                    value3 = mjgVar7.getValue();
                } while (!mjgVar7.h(value3, indVar));
                mjg mjgVar8 = hy2Var2.c;
                do {
                    value4 = mjgVar8.getValue();
                } while (!mjgVar8.h(value4, listB));
                return sbi.a;
            case 14:
                rt2 rt2Var = (rt2) this.f;
                ch3.d0(obj);
                TextView textView2 = ((ChatInfoDevWidget) this.g).c;
                if (textView2 != null) {
                    if (rt2Var != null) {
                        nx2 nx2Var = rt2Var.b;
                        StringBuilder sbC = nbh.C("local_id=");
                        sbC.append(rt2Var.a);
                        sbC.append("\nserverId=");
                        long j7 = nx2Var.a;
                        fx2 fx2Var = nx2Var.n;
                        sbC.append(j7);
                        sbC.append("\ntype=");
                        sbC.append(nx2Var.b);
                        sbC.append("\nstatus=");
                        sbC.append(nx2Var.c);
                        sbC.append("\nowner=");
                        sbC.append(nx2Var.d);
                        sbC.append("\nparticipants=");
                        sbC.append(f55.E(nx2Var.e));
                        sbC.append("\ntitle=");
                        sbC.append(gm0.c() ? nx2Var.g : "*****");
                        sbC.append("\nlastMessageId=");
                        sbC.append(nx2Var.j);
                        sbC.append("\nlastEventTime=");
                        sbC.append(nx2Var.k);
                        sbC.append("\nnewMessages=");
                        sbC.append(nx2Var.m);
                        sbC.append("\nmarkedAsUnread=");
                        sbC.append(nx2Var.i0);
                        sbC.append("\nchatSettings=");
                        sbC.append(nx2Var.a());
                        sbC.append("\nchatReactionsSettings=");
                        sbC.append(nx2Var.p);
                        sbC.append("\nlastReactionMessageId=");
                        sbC.append(nx2Var.j0);
                        sbC.append("\nlastReaction=");
                        sbC.append(nx2Var.k0);
                        sbC.append("\ncommentsBlacklistCount=");
                        sbC.append(nx2Var.v0);
                        sbC.append("\nchunks=");
                        mg5 mg5Var = mg5.REGULAR;
                        sbC.append(fx2Var.d(mg5Var));
                        sbC.append("\n\t");
                        ww3.y1(fx2Var.e(mg5Var), sbC, "\n\t", new xk1(20), 48);
                        String string2 = sbC.toString();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Object[] objArr = {new d1b(), new RelativeSizeSpan(0.8f)};
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) string2);
                        for (int i6 = 0; i6 < 2; i6++) {
                            spannableStringBuilder.setSpan(objArr[i6], length2, spannableStringBuilder.length(), 17);
                        }
                        spannedString = new SpannedString(spannableStringBuilder);
                    }
                    textView2.setText(spannedString);
                }
                return sbi.a;
            case 15:
                la0 la0Var = (la0) this.f;
                ch3.d0(obj);
                n13.u((n13) this.g, la0Var);
                return sbi.a;
            case 16:
                rt2 rt2Var2 = (rt2) this.f;
                ch3.d0(obj);
                mjg mjgVar9 = ((f43) this.g).f;
                String strS = rt2Var2.s(us0.c, rs0.a);
                rt2Var2.L0();
                c43 c43Var = new c43(new fcc(strS, rt2Var2.m, rt2Var2.q(), null, 0, 56), rt2Var2.F());
                mjgVar9.getClass();
                mjgVar9.j(null, c43Var);
                return sbi.a;
            case 17:
                l1j l1jVar = (l1j) this.f;
                ch3.d0(obj);
                j43 j43Var = (j43) this.g;
                int i7 = j43.z;
                j43Var.u(l1jVar);
                return sbi.a;
            case 18:
                ch3.d0(obj);
                x43 x43Var = (x43) this.f;
                xu1 xu1Var = x43Var.f;
                c39 c39Var = (c39) this.g;
                xu1Var.k(c39Var.a, true, false, false, new za2(x43Var, 13, c39Var));
                return sbi.a;
            case 19:
                ch3.d0(obj);
                int i8 = ((e70) this.f).d() ? R.string.profile_media_save_gif_snackbar_success : R.string.profile_media_save_image_snackbar_success;
                x43 x43Var2 = (x43) this.g;
                zv8[] zv8VarArr9 = x43.q1;
                h8c h8cVarJ = x43Var2.J();
                h8cVarJ.m(new tnh(i8));
                h8cVarJ.h(new w8c(R.drawable.icon_check));
                h8cVarJ.p();
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ch3.d0(obj);
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) this.f;
                m53 m53Var = (m53) this.g;
                if (chatMediaViewerScreen.getView() != null) {
                    chatMediaViewerScreen.G1().h(m53Var.b, false);
                }
                return sbi.a;
            case 21:
                ch3.d0(obj);
                l63 l63Var = (l63) this.f;
                xu1 xu1Var2 = l63Var.i;
                c39 c39Var2 = (c39) this.g;
                xu1Var2.k(c39Var2.a, true, false, false, new za2(l63Var, 14, c39Var2));
                return sbi.a;
            case 22:
                wz9 wz9Var = (wz9) this.f;
                ch3.d0(obj);
                ((l63) this.g).H.updateAndGet(new ea1(5, wz9Var));
                return sbi.a;
            case 23:
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) this.g;
                m9a m9aVar2 = (m9a) this.f;
                ch3.d0(obj);
                if (m9aVar2 instanceof i9a) {
                    trd.b.o(((i9a) m9aVar2).a);
                } else if (m9aVar2 instanceof g9a) {
                    g9a g9aVar2 = (g9a) m9aVar2;
                    int i9 = g9aVar2.a;
                    long j8 = g9aVar2.b;
                    zv8[] zv8VarArr10 = ChatMembersCompactWidget.h;
                    if (i9 == R.id.profile_members_list_action_select) {
                        n9a n9aVarQ1 = chatMembersCompactWidget.q1();
                        Set setSingleton = Collections.singleton(Long.valueOf(j8));
                        mjg mjgVar10 = n9aVarQ1.h;
                        mjgVar10.getClass();
                        mjgVar10.j(null, setSingleton);
                    } else if (i9 == R.id.profile_members_list_action_delete_from_chat) {
                        l73 l73VarP1 = chatMembersCompactWidget.p1();
                        a8j.t(l73VarP1, ((n0c) ((xhh) l73VarP1.i.getValue())).b(), new tl1(l73VarP1, j8, null, 2), 2);
                    }
                } else if (m9aVar2 instanceof j9a) {
                    int i10 = ((j9a) m9aVar2).a;
                    if (i10 == R.id.profile_members_list_add_to_chat_action) {
                        trd trdVar5 = trd.b;
                        zv8[] zv8VarArr11 = ChatMembersCompactWidget.h;
                        trdVar5.j(chatMembersCompactWidget.o1(), true);
                    } else if (i10 == R.id.profile_members_list_add_to_channel_action) {
                        trd trdVar6 = trd.b;
                        zv8[] zv8VarArr12 = ChatMembersCompactWidget.h;
                        trdVar6.j(chatMembersCompactWidget.o1(), false);
                    } else if (i10 == R.id.profile_members_list_invite_by_link_action) {
                        trd trdVar7 = trd.b;
                        zv8[] zv8VarArr13 = ChatMembersCompactWidget.h;
                        trdVar7.m(chatMembersCompactWidget.o1());
                    } else if (i10 == R.id.profile_open_all_chat_members_action) {
                        trd trdVar8 = trd.b;
                        zv8[] zv8VarArr14 = ChatMembersCompactWidget.h;
                        trdVar8.n(chatMembersCompactWidget.o1(), "MEMBER");
                    }
                } else if (m9aVar2 instanceof k9a) {
                    trd.b.o(((k9a) m9aVar2).a);
                } else if (m9aVar2 instanceof l9a) {
                    h8c h8cVar = new h8c(chatMembersCompactWidget);
                    h8cVar.n(np4.q(chatMembersCompactWidget.getContext(), R.string.self_profile_click));
                    h8cVar.p();
                } else if (!(m9aVar2 instanceof h9a)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 24:
                ch3.d0(obj);
                Set set2 = (Set) this.f;
                l73 l73Var = (l73) this.g;
                ic6 ic6Var = l73Var.p;
                String strZ1 = ww3.z1(set2, ", ", null, null, new j22(12, l73Var), 30);
                int iD2 = qt4.D(l73Var.o);
                if (iD2 == 0) {
                    a8j.x(ic6Var, pll.a(set2, new tnh(R.string.profile_members_list_delete_many_from_channel_title), new xnh(strZ1)));
                } else {
                    if (iD2 != 1) {
                        ore.o();
                        return null;
                    }
                    a8j.x(ic6Var, pll.b(set2, new tnh(R.string.profile_members_list_delete_many_from_chat_title), new xnh(strZ1)));
                }
                return sbi.a;
            case 25:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((ChatNotificationsSettingsScreen) this.g).d.H((List) obj6);
                return sbi.a;
            case 26:
                ch3.d0(obj);
                ga3 ga3Var = (ga3) this.f;
                rt2 rt2Var3 = (rt2) this.g;
                zv8[] zv8VarArr15 = ga3.A;
                if (rt2Var3.d0() && rt2Var3.b.g()) {
                    ((pvb) ga3Var.t.getValue()).f(rt2Var3.A());
                }
                return sbi.a;
            case 27:
                return l(obj);
            case 28:
                return n(obj);
            default:
                rt2 rt2Var4 = (rt2) this.f;
                ch3.d0(obj);
                vg4 vg4VarW = rt2Var4.w();
                return vg4VarW != null ? new r8e((f9b) ((yfd) ((ny8) this.g).getValue()).F.computeIfAbsent(Long.valueOf(vg4VarW.v()), new am(15, new pyb(27)))) : new tz(7, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in1(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ in1(lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}

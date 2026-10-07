package defpackage;

import android.app.DownloadManager;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import java.util.List;
import java.util.regex.Pattern;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wo0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(boolean z, hyi hyiVar, Float f, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 9;
        this.f = z;
        this.g = hyiVar;
        this.h = f;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                wo0 wo0Var = new wo0((zo0) this.g, (ny8) obj2, lq4Var, 0);
                wo0Var.f = ((Boolean) obj).booleanValue();
                return wo0Var;
            case 1:
                wo0 wo0Var2 = new wo0((pe1) obj2, this.f, lq4Var, 1);
                wo0Var2.g = obj;
                return wo0Var2;
            case 2:
                wo0 wo0Var3 = new wo0((kt1) obj2, this.f, lq4Var, 2);
                wo0Var3.g = obj;
                return wo0Var3;
            case 3:
                wo0 wo0Var4 = new wo0((lv2) obj2, this.f, lq4Var, 3);
                wo0Var4.g = obj;
                return wo0Var4;
            case 4:
                wo0 wo0Var5 = new wo0((rt2) obj2, this.f, lq4Var, 4);
                wo0Var5.g = obj;
                return wo0Var5;
            case 5:
                return new wo0((File) this.g, this.f, (dr6) obj2, lq4Var);
            case 6:
                wo0 wo0Var6 = new wo0((MediaBarPermissionWidget) this.g, (FrameLayout) obj2, lq4Var, 6);
                wo0Var6.f = ((Boolean) obj).booleanValue();
                return wo0Var6;
            case 7:
                wo0 wo0Var7 = new wo0((qaa) obj2, this.f, lq4Var, 7);
                wo0Var7.g = obj;
                return wo0Var7;
            case 8:
                wo0 wo0Var8 = new wo0(this.f, (gpi) obj2, lq4Var);
                wo0Var8.g = obj;
                return wo0Var8;
            default:
                return new wo0(this.f, (hyi) this.g, (Float) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((wo0) create(bool, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wo0) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wo0) create((gc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((wo0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((wo0) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((wo0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ((wo0) create(bool2, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((wo0) create((p8a) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((wo0) create((lyj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((wo0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequenceC;
        Object value;
        st1 st1Var;
        c79 c79VarJ;
        List listJ;
        List list;
        boolean z;
        View rootView;
        switch (this.e) {
            case 0:
                boolean z2 = this.f;
                ch3.d0(obj);
                zo0 zo0Var = (zo0) this.g;
                zv8[] zv8VarArr = zo0.k;
                zo0Var.j.B(zo0Var, zo0.k[0], yab.h0(zo0Var.b, ((n0c) zo0Var.d).b(), 2, new qi4(zo0Var, (ny8) this.h, z2, (lq4) null, 2)));
                return sbi.a;
            case 1:
                rt2 rt2Var = (rt2) this.g;
                ch3.d0(obj);
                pe1 pe1Var = (pe1) this.h;
                mjg mjgVar = pe1Var.n;
                boolean z3 = this.f;
                while (true) {
                    Object value2 = mjgVar.getValue();
                    be1 be1Var = (be1) value2;
                    CharSequence charSequence = be1Var.c;
                    if (charSequence == null || r5h.X0(charSequence)) {
                        vg4 vg4VarW = rt2Var.w();
                        if (vg4VarW == null) {
                            rt2Var.K0();
                            charSequenceC = rt2Var.j;
                        } else {
                            rt2Var.K0();
                            charSequenceC = pe1Var.c(rt2Var.j, vg4VarW.G());
                        }
                    } else {
                        charSequenceC = be1Var.c;
                    }
                    CharSequence charSequence2 = charSequenceC;
                    rt2Var.w();
                    CharSequence charSequenceA = "";
                    if (z3) {
                        CharSequence charSequence3 = be1Var.c;
                        if (charSequence3 == null || r5h.X0(charSequence3)) {
                            rt2Var.L0();
                            charSequenceA = rt2Var.m;
                        } else {
                            Pattern pattern = m3c.a;
                            CharSequence charSequence4 = be1Var.c;
                            charSequenceA = m3c.a(charSequence4 != null ? charSequence4 : "", (p4c) pe1Var.d.getValue());
                        }
                    }
                    CharSequence charSequence5 = charSequenceA;
                    long j = rt2Var.a;
                    CharSequence charSequence6 = be1Var.d;
                    CharSequence charSequence7 = charSequence6 == null ? charSequence2 : charSequence6;
                    String strS = rt2Var.s(us0.d, rs0.a);
                    long jQ = rt2Var.q();
                    boolean z4 = !z3;
                    rt2 rt2Var2 = rt2Var;
                    long jA = rt2Var2.A();
                    vg4 vg4VarW2 = rt2Var2.w();
                    if (mjgVar.h(value2, be1.a(be1Var, new Long(j), new Long(jA), charSequence2, charSequence7, strS, new Long(jQ), charSequence5, z4, null, vg4VarW2 != null ? vg4VarW2.i() : null, null, false, null, 7424))) {
                        return sbi.a;
                    }
                    rt2Var = rt2Var2;
                }
                break;
            case 2:
                gc gcVar = (gc) this.g;
                ch3.d0(obj);
                kt1 kt1Var = (kt1) this.h;
                mjg mjgVar2 = kt1Var.o;
                boolean z5 = this.f;
                do {
                    value = mjgVar2.getValue();
                    st1Var = (st1) value;
                    boolean z6 = gcVar.a;
                    Integer numValueOf = Integer.valueOf(R.drawable.icon_user_add);
                    c79 c79VarW = yab.w();
                    if (!z5) {
                        c79VarW.add(new lyb(R.id.call_screen_opponents_list_link, Integer.valueOf(R.string.call_screen_opponents_list_link), (Integer) null, Integer.valueOf(R.drawable.icon_link), (Integer) null, 52));
                    }
                    if (!z5) {
                        c79VarW.add(new lyb(R.id.call_screen_opponents_list_invite_users, Integer.valueOf(R.string.oneme_invite), (Integer) null, numValueOf, (Integer) null, 52));
                    } else if (z5 && z6) {
                        c79VarW.add(new lyb(R.id.call_screen_opponents_list_add_users, Integer.valueOf(R.string.call_screen_opponents_list_add_users), (Integer) null, numValueOf, (Integer) null, 52));
                    }
                    c79VarJ = yab.j(c79VarW);
                    if (gcVar.a) {
                        gc gcVar2 = (gc) ((ya1) ((da1) kt1Var.j.getValue())).v.getValue();
                        boolean z7 = gcVar2.b;
                        boolean z8 = gcVar2.c;
                        c79 c79VarW2 = yab.w();
                        if (z7) {
                            c79VarW2.add(new lyb(R.id.call_admin_settings_disable_all_cameras_once, Integer.valueOf(R.string.call_admin_settings_disable_all_cameras_once), (Integer) null, Integer.valueOf(R.drawable.icon_video_call_crossed), (Integer) null, 52));
                        }
                        if (z8) {
                            c79VarW2.add(new lyb(R.id.call_admin_settings_disable_all_mic_once, Integer.valueOf(R.string.call_admin_settings_disable_all_mic_once), (Integer) null, Integer.valueOf(R.drawable.icon_microphone_crossed), (Integer) null, 52));
                        }
                        c79VarW2.add(new lyb(R.id.call_admin_settings_disable_all_hands_once, Integer.valueOf(R.string.call_admin_settings_disable_all_hands_once), (Integer) null, Integer.valueOf(R.drawable.icon_hand_crossed), (Integer) null, 52));
                        listJ = yab.j(c79VarW2);
                    } else {
                        listJ = r66.a;
                    }
                    list = listJ;
                    z = gcVar.a;
                } while (!mjgVar2.h(value, st1.a(st1Var, null, c79VarJ, list, z, null, z, 17)));
                return sbi.a;
            case 3:
                sbi sbiVar = sbi.a;
                gu4 gu4Var = (gu4) this.g;
                ch3.d0(obj);
                lv2 lv2Var = (lv2) this.h;
                rt2 rt2VarV = lv2Var.v();
                if (rt2VarV != null) {
                    if (rt2VarV.A() == 0) {
                        gm0.Y(gu4Var.getClass().getName(), "Try update revokePrivateLink with charServerId == 0");
                        ((iv4) lv2Var.q.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update revokePrivateLink with charServerId == 0. ChatChangeLink"));
                    } else {
                        (this.f ? lv2Var.D : lv2Var.E).set(((pvb) lv2Var.p.getValue()).g(rt2VarV.a, rt2VarV.A(), 0, null, true, null));
                    }
                }
                return sbiVar;
            case 4:
                tw2 tw2Var = (tw2) this.g;
                ch3.d0(obj);
                tw2Var.q0 = (!this.f ? 1 : 0) | (((rt2) this.h).b.q0 & (-2));
                return sbi.a;
            case 5:
                File file = (File) this.g;
                dr6 dr6Var = (dr6) this.h;
                String str = dr6Var.f;
                ch3.d0(obj);
                try {
                    String strI = l21.i(file.getName());
                    if (strI == null || strI.length() == 0) {
                        strI = "*/*";
                    }
                    String str2 = strI;
                    if (Build.VERSION.SDK_INT < 29 || this.f) {
                        boolean z9 = this.f;
                        Object systemService = dr6Var.a.getSystemService("download");
                        DownloadManager downloadManager = systemService instanceof DownloadManager ? (DownloadManager) systemService : null;
                        if (downloadManager == null) {
                            gm0.Y(str, "Early return in notifyLessAndroidQ cuz of systemService is null");
                        } else {
                            downloadManager.addCompletedDownload(file.getName(), file.getName(), false, str2, file.getAbsolutePath(), file.length(), z9);
                        }
                    } else {
                        dr6.a(dr6Var, file, str2);
                    }
                } catch (Throwable th) {
                    gm0.l(str, "fail!", th);
                    ((t1c) ((ed6) dr6Var.b.getValue())).a(th);
                }
                return sbi.a;
            case 6:
                FrameLayout frameLayout = (FrameLayout) this.h;
                boolean z10 = this.f;
                ch3.d0(obj);
                MediaBarPermissionWidget mediaBarPermissionWidget = (MediaBarPermissionWidget) this.g;
                if (z10) {
                    rootView = ((hj2) ((oc2) mediaBarPermissionWidget.d.getValue())).getRootView();
                    qe7.H(rootView, 300L, new gr9(mediaBarPermissionWidget, 2));
                } else {
                    ow0 ow0Var = mediaBarPermissionWidget.c;
                    zv8 zv8Var = MediaBarPermissionWidget.g[0];
                    rootView = (LinearLayout) ow0Var.getValue();
                }
                frameLayout.removeAllViews();
                frameLayout.addView(rootView);
                return sbi.a;
            case 7:
                sbi sbiVar2 = sbi.a;
                p8a p8aVar = (p8a) this.g;
                ch3.d0(obj);
                qaa qaaVar = (qaa) this.h;
                zv8[] zv8VarArr2 = qaa.E;
                rt2 rt2VarD = qaaVar.D();
                if (rt2VarD != null) {
                    if (cqk.d(p8aVar, n8a.a)) {
                        qaaVar.t.B(qaaVar, qaa.E[1], a8j.t(qaaVar, qaaVar.v, new maa(qaaVar, rt2VarD, null, 2), 2));
                    } else {
                        if (!cqk.d(p8aVar, o8a.a)) {
                            ore.o();
                            return null;
                        }
                        if (this.f) {
                            qaaVar.u.B(qaaVar, qaa.E[2], a8j.t(qaaVar, qaaVar.v, new maa(qaaVar, rt2VarD, null, 3), 2));
                        }
                    }
                }
                return sbiVar2;
            case 8:
                ic6 ic6Var = ((gpi) this.h).r1;
                lyj lyjVar = (lyj) this.g;
                ch3.d0(obj);
                if (this.f && lyjVar.e.a("showSaving", false)) {
                    a8j.x(ic6Var, new nqi());
                }
                if (lyjVar.b.a()) {
                    a8j.x(ic6Var, new mqi(lyjVar.b == kyj.c));
                }
                return sbi.a;
            default:
                Float f = (Float) this.h;
                hyi hyiVar = (hyi) this.g;
                ch3.d0(obj);
                if (this.f) {
                    e3j e3jVar = hyi.a(hyiVar).h;
                    if (e3jVar != null) {
                        e3jVar.pause();
                    }
                } else if (f != null) {
                    hyi.a(hyiVar).r(f.floatValue());
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo0(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wo0(Object obj, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.f = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(boolean z, gpi gpiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 8;
        this.f = z;
        this.h = gpiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(File file, boolean z, dr6 dr6Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 5;
        this.g = file;
        this.f = z;
        this.h = dr6Var;
    }
}

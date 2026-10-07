package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class op1 extends a8j {
    public static final /* synthetic */ zv8[] s;
    public static final ylc t;
    public final String c;
    public final phf d;
    public final svj e;
    public final msc f;
    public final boolean g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg n;
    public final mjg o;
    public final p3c p;
    public volatile sgg q;
    public final ic6 r;

    static {
        z8b z8bVar = new z8b(op1.class, "requestParticipantsJob", "getRequestParticipantsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        s = new zv8[]{z8bVar};
        t = new ylc(gm0.a("", Long.MIN_VALUE), rki.c(R.drawable.saved_group_call_avatar).toString());
    }

    public op1(String str, phf phfVar, svj svjVar, msc mscVar, boolean z, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        sgg sggVar;
        yp9 yp9Var = yp9.a;
        this.c = str;
        this.d = phfVar;
        this.e = svjVar;
        this.f = mscVar;
        this.g = z;
        this.h = ny8Var;
        this.i = ny8Var3;
        this.j = ny8Var4;
        this.k = ny8Var5;
        this.l = ny8Var2;
        this.m = rx8.P(3, new yk1(4, this));
        mjg mjgVarA = p90.a(new lp1(null, yp9Var, z ? yp9.b : yp9Var, true, new xnh(""), null, null));
        this.n = mjgVarA;
        this.o = mjgVarA;
        this.p = qyj.S();
        lq4 lq4Var = null;
        this.r = new ic6(null);
        yab.i0(this.b, ((n0c) ((xhh) ny8Var2.getValue())).b(), 0, new kp1(this, lq4Var, 0), 2);
        int i = 1;
        if (this.q == null || (sggVar = this.q) == null || !sggVar.isActive()) {
            this.q = yab.i0(this.b, ((n0c) ((xhh) ny8Var2.getValue())).b(), 0, new kp1(this, lq4Var, i), 2);
        }
    }

    public static final ynh B(op1 op1Var, List list, int i) {
        List listQ;
        fi4 fi4Var;
        if (i == 0) {
            return new tnh(R.string.call_users_info_count_no_users);
        }
        String strA = null;
        if (i == 1) {
            vg4 vg4Var = (vg4) ww3.t1(list);
            if (vg4Var != null && (listQ = vg4Var.q()) != null && (fi4Var = (fi4) ww3.t1(listQ)) != null) {
                strA = fi4Var.a();
            }
            if (strA == null) {
                strA = "";
            }
            return new xnh(strA);
        }
        if (i != 2) {
            return new pnh(R.plurals.call_users_info_count, i);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fi4 fi4Var2 = (fi4) ww3.t1(((vg4) it.next()).q());
            String str = fi4Var2 != null ? fi4Var2.a : null;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new xnh(ww3.z1(arrayList, null, null, null, null, 63));
    }

    public final void C(boolean z) {
        mjg mjgVar;
        Object value;
        lp1 lp1Var;
        yp9 yp9Var;
        svj svjVar = this.e;
        msc mscVar = this.f;
        if (mscVar.c(svjVar)) {
            gm0.n(op1.class.getName(), "Early return in microphoneEnable cuz of permissionMapper.shouldAskMicrophonePermission(widgetPermissionRequestHost)");
            return;
        }
        sa2 sa2Var = (sa2) this.i.getValue();
        long j = z ? 1L : 0L;
        sa2Var.getClass();
        sa2.c(sa2Var, "AUDIO_ENABLED", null, null, Long.valueOf(j), null, null, true, Boolean.FALSE, 116);
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
            lp1Var = (lp1) value;
            if (mscVar.b().c(wsc.i)) {
                yp9Var = z ? yp9.b : yp9.a;
            } else {
                yp9Var = yp9.e;
            }
        } while (!mjgVar.h(value, lp1.a(lp1Var, null, yp9Var, null, false, null, null, null, 125)));
    }

    public final void D(boolean z) {
        mjg mjgVar;
        Object value;
        msc mscVar = this.f;
        if (!mscVar.b().c(wsc.n)) {
            mscVar.b().p(this.e);
            gm0.n(op1.class.getName(), "Early return in videoEnable cuz of permissionMapper.shouldAskVideoPermission(widgetPermissionRequestHost)");
            return;
        }
        sa2 sa2Var = (sa2) this.i.getValue();
        long j = z ? 1L : 0L;
        sa2Var.getClass();
        sa2.c(sa2Var, "VIDEO_ENABLED", null, null, Long.valueOf(j), null, null, true, null, 372);
        do {
            mjgVar = this.n;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, lp1.a((lp1) value, null, null, mscVar.a(z), false, null, null, null, 123)));
    }
}

package defpackage;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.ConcurrentHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xpf extends a8j {
    public static final /* synthetic */ zv8[] r;
    public final ymb c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final p3c i = qyj.S();
    public final mjg j;
    public final r8e k;
    public final ic6 l;
    public final ConcurrentHashMap m;
    public final ifh n;
    public Integer o;
    public final ny8 p;
    public final String q;

    static {
        z8b z8bVar = new z8b(xpf.class, "updateRingtoneJob", "getUpdateRingtoneJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        r = new zv8[]{z8bVar};
    }

    public xpf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ymb ymbVar, ny8 ny8Var5, lqe lqeVar) {
        this.c = ymbVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.g = ny8Var5;
        this.h = ny8Var4;
        mjg mjgVarA = p90.a(r66.a);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        lq4 lq4Var = null;
        this.l = new ic6(null);
        this.m = new ConcurrentHashMap();
        this.n = new ifh(new ize(12, this));
        this.p = rx8.P(3, new tyd(25));
        this.q = xpf.class.getName();
        e9i.j0(e9i.T(new fz6(new fz6(lqeVar.k, new gce(this, lq4Var, 24), 3), new hpf(lqeVar, lq4Var, 1)), ((n0c) ((xhh) ny8Var.getValue())).b()), this.b);
    }

    public static final Object B(xpf xpfVar, mdh mdhVar) {
        Object objK0 = yab.K0(((n0c) ((xhh) xpfVar.d.getValue())).a(), new hpf(xpfVar, null, 2), mdhVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public final Context C() {
        return (Context) this.f.getValue();
    }

    public final m7g D() {
        return (m7g) this.h.getValue();
    }

    public final void E() {
        ifh ifhVar = this.n;
        boolean zIsStreamMute = ((AudioManager) ifhVar.getValue()).isStreamMute(3);
        boolean z = ((AudioManager) ifhVar.getValue()).getStreamVolume(3) == 0;
        if (zIsStreamMute || z) {
            a8j.x(this.l, new rvf(R.drawable.icon_sound_fill, new tnh(R.string.oneme_settings_ringtone_low_volume_level)));
        }
    }

    public final void F() {
        a8j.x(this.l, new rvf(R.drawable.icon_warning_fill, new tnh(R.string.oneme_settings_ringtone_custom_section_wrong_format)));
    }

    public final void G(dqe dqeVar) {
        sgg sggVarT = a8j.t(this, null, new gce(this, dqeVar, null, 25), 1);
        this.i.B(this, r[0], sggVarT);
    }
}

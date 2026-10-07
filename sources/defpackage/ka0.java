package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final class ka0 implements r80 {
    public final w7b a;
    public final bxd b;
    public final ifh d;
    public final s80 e;
    public boolean f;
    public boolean h;
    public final ia0 i;
    public final String c = zo5.p(ka0.class.getName(), "#", av7.g(System.identityHashCode(this)));
    public String g = "";

    public ka0(Context context, w7b w7bVar, bxd bxdVar, ny8 ny8Var) {
        this.a = w7bVar;
        this.b = bxdVar;
        int i = 1;
        this.d = new ifh(new rgb(context, i));
        this.e = new s80(context, this);
        k90 k90Var = new k90(i, this);
        this.i = new ia0(this);
        ifh ifhVar = new ifh(new d2(6, this));
        w7bVar.a(k90Var);
        ((b95) ny8Var.getValue()).c((ja0) ifhVar.getValue());
    }

    public static final boolean c(ka0 ka0Var) {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) ka0Var.d.getValue()).getDevices(2)) {
            int type = audioDeviceInfo.getType();
            if (type == 3 || type == 4 || type == 8) {
                return true;
            }
        }
        return false;
    }

    public static final void e(ka0 ka0Var) {
        xte xteVar = ka0Var.a.a;
        if (!xteVar.r) {
            ka0Var.e.u();
            bxd bxdVar = ka0Var.b;
            if (ka0Var.f) {
                ka0Var.f = false;
                bxdVar.b();
                bxdVar.h.remove(ka0Var.i);
                return;
            }
            return;
        }
        u7b u7bVarJ = xteVar.j();
        Object obj = u7bVarJ != null ? u7bVarJ.b().get("MediaMetadata.Extra.ATTACH_ID") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            str = "";
        }
        boolean zEquals = str.equals(ka0Var.g);
        String str2 = ka0Var.c;
        if (zEquals) {
            gm0.n(str2, "updatePlayer(), requesting focus");
            ka0Var.e.v(1, 4, 1);
            ka0Var.g();
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, nbh.w("updatePlayer() Skipping focus request. localAttachId=", str, ", currentLocalAttachId=", ka0Var.g, " "), null);
        }
    }

    @Override // defpackage.r80
    public final float a() {
        return this.a.a.t;
    }

    @Override // defpackage.r80
    public final void b(float f) {
    }

    @Override // defpackage.r80
    public final boolean d() {
        return this.a.a.r;
    }

    public final void f(long j, long j2, mg5 mg5Var, String str, long j3, String str2, String str3, String str4, ns5 ns5Var) {
        String str5 = this.c;
        a4c a4cVar = gm0.f;
        lq4 lq4Var = null;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbT = qt4.t(j2, "playAudioMessage(messageId=", ", attachLocalId=", str);
                sbT.append(")");
                a4cVar.c(je9Var, str5, sbT.toString(), null);
            }
        }
        u7b u7bVarJ = this.a.a.j();
        Object obj = u7bVarJ != null ? u7bVarJ.b().get("MediaMetadata.Extra.MESSAGE_ID") : null;
        Long l = obj instanceof Long ? (Long) obj : null;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (jLongValue == j2) {
            w7b w7bVar = this.a;
            if (w7bVar.a.s) {
                w7bVar.d();
                return;
            }
        }
        if (jLongValue == j2) {
            w7b w7bVar2 = this.a;
            if (w7bVar2.a.r) {
                w7bVar2.b();
                return;
            }
        }
        if (jLongValue == j2) {
            xte xteVar = this.a.a;
            if (xteVar.q) {
                yab.i0(xteVar.d, null, 0, new wte(xteVar, lq4Var, 1), 3);
                return;
            }
        }
        this.g = str;
        this.a.c(new r7b(j, j2, mg5Var, str, j3, str2, str3, str4, ns5Var));
    }

    public final void g() {
        if (this.h && !this.f && this.a.a.r) {
            this.f = true;
            bxd bxdVar = this.b;
            bxdVar.a();
            bxdVar.h.add(this.i);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.e.t(i);
    }

    @Override // defpackage.r80
    public final void pause() {
        w7b w7bVar = this.a;
        if (w7bVar.a.m()) {
            return;
        }
        w7bVar.b();
    }

    @Override // defpackage.r80
    public final void play() {
        w7b w7bVar = this.a;
        boolean zM = w7bVar.a.m();
        String str = this.c;
        if (zM) {
            gm0.n(str, "Early return in play cuz of musicService.isPlayingEnded");
            return;
        }
        gm0.n(str, "play(), requesting focus");
        this.e.v(1, 4, 1);
        xte xteVar = w7bVar.a;
        yab.i0(xteVar.d, null, 0, new wte(xteVar, null, 1), 3);
    }
}

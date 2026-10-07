package defpackage;

import one.video.player.BaseVideoPlayer;

/* JADX INFO: loaded from: classes3.dex */
public final class lk8 {
    public final Long a;
    public final xc7 b;
    public final boolean c;
    public final long d;
    public final String e;
    public final String f;
    public final kk8 g;
    public final kk8 h;
    public final kk8 i;

    public lk8(aec aecVar, Long l, ckl cklVar) {
        long jK;
        String str;
        kwi kwiVar;
        this.a = l;
        t4j t4jVarF = aecVar.f();
        String str2 = null;
        this.b = (t4jVarF == null || (kwiVar = (kwi) t4jVarF.b) == null) ? null : kwiVar.c();
        this.c = aecVar.b() != null;
        boolean z = aecVar instanceof BaseVideoPlayer;
        if (z) {
            wx wxVar = BaseVideoPlayer.C;
            jK = ((BaseVideoPlayer) aecVar).k();
        } else {
            jK = 100;
        }
        this.d = jK;
        BaseVideoPlayer baseVideoPlayer = z ? (BaseVideoPlayer) aecVar : null;
        if (baseVideoPlayer != null) {
            baseVideoPlayer.verifyThread("one.video.player.BaseVideoPlayer.getVideoDecoderNameString");
            str = baseVideoPlayer.i;
        } else {
            str = null;
        }
        this.e = str;
        BaseVideoPlayer baseVideoPlayer2 = z ? (BaseVideoPlayer) aecVar : null;
        if (baseVideoPlayer2 != null) {
            baseVideoPlayer2.verifyThread("one.video.player.BaseVideoPlayer.getAudioDecoderNameString");
            str2 = baseVideoPlayer2.j;
        }
        this.f = str2;
        this.g = new kk8(aecVar, 0);
        this.h = new kk8(aecVar, 1);
        this.i = new kk8(aecVar, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InternalStatInfo(" + this.b);
        Long l = this.a;
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue != 0) {
                sb.append(", live_seek= " + jLongValue);
            }
        }
        sb.append(", vfpo= " + this.d);
        String str = this.e;
        if (str != null) {
            sb.append(", vcodec= ".concat(str));
        }
        String str2 = this.f;
        if (str2 != null) {
            sb.append(", acodec= ".concat(str2));
        }
        edc edcVarC = this.g.b.c();
        if (edcVarC != null) {
            zg6 zg6Var = edcVarC.a;
            sb.append(", bw= " + zg6Var.f());
            sb.append(", rtt= " + zg6Var.b());
        }
        this.h.invoke();
        this.i.b.d();
        sb.append(")");
        return sb.toString();
    }
}

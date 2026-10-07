package defpackage;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import one.video.player.error.OneVideoPlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class dti implements c3j {
    public final xhh a;
    public final ite b;
    public final ny8 c;
    public final ny8 d;
    public boolean f;
    public rui h;
    public d3j l;
    public final String e = dti.class.getName();
    public long g = -1;
    public long i = -1;
    public final EnumSet j = EnumSet.noneOf(cti.class);
    public final LinkedHashMap k = new LinkedHashMap();
    public af7 m = new i94(12);

    public dti(ny8 ny8Var, ny8 ny8Var2, xhh xhhVar, ite iteVar) {
        this.a = xhhVar;
        this.b = iteVar;
        this.c = ny8Var;
        this.d = ny8Var2;
    }

    @Override // defpackage.c3j
    public final void c() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onVideoPlay"), null);
            }
        }
        if (this.h != null) {
            if (this.j.add(cti.a)) {
                ul9 ul9Var = new ul9();
                ul9Var.putAll(this.k);
                ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
                ul9Var.put("param", "0");
                t("action_play", ul9Var.b());
                return;
            }
            return;
        }
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            rui ruiVar2 = this.h;
            a4cVar2.c(je9Var2, str2, iic.m(ruiVar2 != null ? Long.valueOf(ruiVar2.k()) : null, "VideoContent(", "): VideoContent is null! Skip handling"), null);
        }
    }

    @Override // defpackage.c3j
    public final void e() {
        int i;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onPlaybackStarted"), null);
            }
        }
        if (this.h == null) {
            String str2 = this.e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                rui ruiVar2 = this.h;
                a4cVar2.c(je9Var2, str2, iic.m(ruiVar2 != null ? Long.valueOf(ruiVar2.k()) : null, "VideoContent(", "): VideoContent is null! Skip handling"), null);
                return;
            }
            return;
        }
        if (this.j.add(cti.d)) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.i);
            ul9 ul9Var = new ul9();
            ul9Var.putAll(this.k);
            y0e y0eVar = (y0e) this.m.invoke();
            if (y0eVar != null) {
                switch (y0eVar.ordinal()) {
                    case 0:
                        i = 8;
                        break;
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 1;
                        break;
                    default:
                        ore.o();
                        return;
                }
                ul9Var.put("quality", Integer.valueOf(i));
            }
            ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
            ul9Var.put("param", strValueOf);
            t("playback_started", ul9Var.b());
        }
    }

    @Override // defpackage.c3j
    public final void f() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                Long lValueOf = ruiVar != null ? Long.valueOf(ruiVar.k()) : null;
                a4cVar.c(je9Var, str, "VideoContent(" + lValueOf + "): " + ((Object) ("onPlaybackBuffering, isEmptyBuffer=" + this.f + ", bufferingStartTime=" + this.g)), null);
            }
        }
        if (this.f) {
            this.g = SystemClock.elapsedRealtime();
        } else {
            this.g = -1L;
            this.f = true;
        }
    }

    @Override // defpackage.c3j
    public final void g() {
        yab.i0(this.b, ((n0c) this.a).c().S0(), 0, new hpf(this, null, 17), 2);
    }

    @Override // defpackage.c3j
    public final void h() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onVideoSeek"), null);
            }
        }
        s();
        this.f = false;
    }

    @Override // defpackage.c3j
    public final void i() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onPlaybackEnded"), null);
            }
        }
        r();
        this.g = -1L;
        this.f = false;
    }

    @Override // defpackage.c3j
    public final void j(rui ruiVar) {
        je9 je9Var = je9.d;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            rui ruiVar2 = this.h;
            a4cVar.c(je9Var, str, "VideoContent(" + (ruiVar2 != null ? Long.valueOf(ruiVar2.k()) : null) + "): " + ((Object) ("onPreparingNewVideo: " + ruiVar)), null);
        }
        this.h = ruiVar;
        this.j.clear();
        r();
        this.f = false;
        this.i = SystemClock.elapsedRealtime();
        Integer num = 1;
        this.k.clear();
        rui ruiVar3 = this.h;
        if (ruiVar3 == null) {
            String str2 = this.e;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                rui ruiVar4 = this.h;
                a4cVar2.c(je9Var2, str2, iic.m(ruiVar4 != null ? Long.valueOf(ruiVar4.k()) : null, "VideoContent(", "): video is empty!"), null);
                return;
            }
            return;
        }
        this.k.put("at", Integer.valueOf(v0h.a(ruiVar3.getType())));
        if (ruiVar3.b()) {
            this.k.put("cached_data", num);
        }
        this.k.put("vsid", vpl.c());
        long jK = ruiVar3.k();
        Long lValueOf = Long.valueOf(jK);
        if (jK <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            this.k.put("vid", Long.valueOf(lValueOf.longValue()));
        }
        String host = ruiVar3.d().getHost();
        if (host != null) {
            if (host.length() <= 0) {
                host = null;
            }
            if (host != null) {
                this.k.put("cdn_host", host);
            }
        }
        String contentType = ruiVar3.getContentType();
        if (cqk.d(contentType, ewi.b(1))) {
            num = 0;
        } else if (!cqk.d(contentType, ewi.b(2))) {
            num = cqk.d(contentType, ewi.b(3)) ? 2 : null;
        }
        if (num != null) {
            this.k.put("ct", Integer.valueOf(num.intValue()));
        }
        d3j d3jVar = this.l;
        if (d3jVar != null) {
            this.k.put("place", Integer.valueOf(d3jVar.a()));
        }
        String str3 = this.e;
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            rui ruiVar5 = this.h;
            Long lValueOf2 = ruiVar5 != null ? Long.valueOf(ruiVar5.k()) : null;
            a4cVar3.c(je9Var, str3, "VideoContent(" + lValueOf2 + "): " + ((Object) ("Build new params=" + this.k)), null);
        }
    }

    @Override // defpackage.c3j
    public final void k() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onRelease"), null);
            }
        }
        r();
        this.g = -1L;
        this.f = false;
    }

    @Override // defpackage.c3j
    public final void l() {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                a4cVar.c(je9Var, str, iic.m(ruiVar != null ? Long.valueOf(ruiVar.k()) : null, "VideoContent(", "): onFirstBytes"), null);
            }
        }
        if (this.h != null) {
            if (this.j.add(cti.b)) {
                String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.i);
                ul9 ul9Var = new ul9();
                ul9Var.putAll(this.k);
                ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
                ul9Var.put("param", strValueOf);
                t("first_bytes", ul9Var.b());
                return;
            }
            return;
        }
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.f;
        if (a4cVar2.b(je9Var2)) {
            rui ruiVar2 = this.h;
            a4cVar2.c(je9Var2, str2, iic.m(ruiVar2 != null ? Long.valueOf(ruiVar2.k()) : null, "VideoContent(", "): VideoContent is null! Skip handling"), null);
        }
    }

    @Override // defpackage.c3j
    public final void o(Throwable th) {
        String simpleName;
        int i;
        je9 je9Var = je9.d;
        boolean z = th instanceof PlaybackException;
        String str = this.e;
        if (z) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                Long lValueOf = ruiVar != null ? Long.valueOf(ruiVar.k()) : null;
                PlaybackException playbackException = (PlaybackException) th;
                a4cVar.c(je9Var, str, "VideoContent(" + lValueOf + "): " + ((Object) nbh.r(playbackException.a, "onPlaybackError: errorCodeName=", playbackException.b(), ", errorCode=")), null);
            }
        } else {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                rui ruiVar2 = this.h;
                Long lValueOf2 = ruiVar2 != null ? Long.valueOf(ruiVar2.k()) : null;
                a4cVar2.c(je9Var, str, "VideoContent(" + lValueOf2 + "): " + ((Object) "onPlaybackError: ".concat(th != null ? th.getClass().getSimpleName() : "'Unknown'")), null);
            }
        }
        if (z) {
            simpleName = ((PlaybackException) th).b();
        } else if (th instanceof OneVideoPlaybackException) {
            simpleName = ((OneVideoPlaybackException) th).getA().toString();
        } else {
            simpleName = th != null ? th.getClass().getSimpleName() : "Unknown";
        }
        ul9 ul9Var = new ul9();
        ul9Var.putAll(this.k);
        y0e y0eVar = (y0e) this.m.invoke();
        if (y0eVar != null) {
            switch (y0eVar.ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 7;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 2;
                    break;
                case 7:
                    i = 1;
                    break;
                default:
                    ore.o();
                    return;
            }
            ul9Var.put("quality", Integer.valueOf(i));
        }
        ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
        ul9Var.put("param", simpleName);
        t("content_error", ul9Var.b());
    }

    @Override // defpackage.c3j
    public final void q(boolean z) {
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                Long lValueOf = ruiVar != null ? Long.valueOf(ruiVar.k()) : null;
                a4cVar.c(je9Var, str, "VideoContent(" + lValueOf + "): " + ((Object) zo5.s("onPlaybackPrepared, playWhenReady=", z)), null);
            }
        }
        s();
    }

    public final void r() {
        int i;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                Long lValueOf = ruiVar != null ? Long.valueOf(ruiVar.k()) : null;
                a4cVar.c(je9Var, str, "VideoContent(" + lValueOf + "): " + ((Object) zo5.j(this.g, "Check if prev video closed with empty buffer -> bufferingStartTime=")), null);
            }
        }
        if (this.g > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.g);
            ul9 ul9Var = new ul9();
            ul9Var.putAll(this.k);
            y0e y0eVar = (y0e) this.m.invoke();
            if (y0eVar != null) {
                switch (y0eVar.ordinal()) {
                    case 0:
                        i = 8;
                        break;
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 1;
                        break;
                    default:
                        ore.o();
                        return;
                }
                ul9Var.put("quality", Integer.valueOf(i));
            }
            ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
            ul9Var.put("param", strValueOf);
            t("close_at_empty_buffer", ul9Var.b());
            this.g = -1L;
        }
    }

    public final void s() {
        int i;
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                rui ruiVar = this.h;
                Long lValueOf = ruiVar != null ? Long.valueOf(ruiVar.k()) : null;
                a4cVar.c(je9Var, str, "VideoContent(" + lValueOf + "): " + ((Object) zo5.j(this.g, "Check if cur video has empty buffer -> bufferingStartTime=")), null);
            }
        }
        if (this.g > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.g);
            ul9 ul9Var = new ul9();
            ul9Var.putAll(this.k);
            y0e y0eVar = (y0e) this.m.invoke();
            if (y0eVar != null) {
                switch (y0eVar.ordinal()) {
                    case 0:
                        i = 8;
                        break;
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 1;
                        break;
                    default:
                        ore.o();
                        return;
                }
                ul9Var.put("quality", Integer.valueOf(i));
            }
            ul9Var.put("connection_type", Integer.valueOf(((wd4) this.d.getValue()).a().a));
            ul9Var.put("param", strValueOf);
            t("empty_buffer", ul9Var.b());
            this.g = -1L;
        }
    }

    public final void t(String str, ul9 ul9Var) {
        ae9.k((ae9) this.c.getValue(), "VIDEO_STATS", str, ul9Var, 8);
    }
}

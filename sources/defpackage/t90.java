package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.math.BigInteger;
import java.util.EnumSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class t90 {
    public final xhh a;
    public final ite b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public ry9 g;
    public final String f = t90.class.getName();
    public final LinkedHashMap h = new LinkedHashMap();
    public boolean i = true;
    public long j = -1;
    public final EnumSet k = EnumSet.noneOf(s90.class);

    public t90(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, xhh xhhVar, ite iteVar) {
        this.a = xhhVar;
        this.b = iteVar;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
    }

    public final void a(ry9 ry9Var) {
        Object next;
        String string;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var2)) {
            ry9 ry9Var2 = this.g;
            a4cVar.c(je9Var2, str, "MediaItem(" + (ry9Var2 != null ? ry9Var2.a : null) + "): " + ((Object) ("onMediaItemTransition: " + ry9Var)), null);
        }
        if (ry9Var == null) {
            gm0.Y(t90.class.getName(), "Early return in onMediaItemTransition cuz of mediaItem is null");
            return;
        }
        Integer num = ry9Var.d.H;
        int iIntValue = num != null ? num.intValue() : -1;
        y1 y1Var = new y1(0, ty9.f);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((ty9) next).ordinal() != iIntValue);
        ty9 ty9Var = (ty9) next;
        if (ty9Var == null) {
            ty9Var = ty9.a;
        }
        if (ty9Var != ty9.b) {
            String str2 = this.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                ry9 ry9Var3 = this.g;
                a4cVar2.c(je9Var, str2, c0a.o("MediaItem(", ry9Var3 != null ? ry9Var3.a : null, "): Unsupported media item, skip!"), null);
                return;
            }
            return;
        }
        String str3 = ry9Var.a;
        ry9 ry9Var4 = this.g;
        if (cqk.d(str3, ry9Var4 != null ? ry9Var4.a : null)) {
            String str4 = this.f;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                ry9 ry9Var5 = this.g;
                a4cVar3.c(je9Var, str4, c0a.o("MediaItem(", ry9Var5 != null ? ry9Var5.a : null, "): Same media started to play, skip!"), null);
                return;
            }
            return;
        }
        this.g = ry9Var;
        this.k.clear();
        this.i = true;
        this.j = SystemClock.elapsedRealtime();
        this.h.clear();
        LinkedHashMap linkedHashMap = this.h;
        h4e h4eVar = i4e.a;
        linkedHashMap.put("asid", new BigInteger(Long.toUnsignedString(i4e.b.f()), 10).toString(36));
        this.h.put("at", 0);
        Bundle bundle = ry9Var.d.I;
        if (bundle != null) {
            long j = bundle.getLong("MediaMetadata.Extra.AUDIO_ID");
            Long lValueOf = Long.valueOf(j);
            if (j == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                this.h.put("aid", Long.valueOf(lValueOf.longValue()));
            }
        }
        Bundle bundle2 = ry9Var.d.I;
        if (bundle2 != null && (string = bundle2.getString("MediaMetadata.Extra.CDN_HOST")) != null) {
            if (r5h.X0(string)) {
                string = null;
            }
            if (string != null) {
                this.h.put("cdn_host", string);
            }
        }
        Bundle bundle3 = ry9Var.d.I;
        if (bundle3 != null) {
            this.h.put("ct", Integer.valueOf(bundle3.getInt("MediaMetadata.Extra.CONTENT_TYPE")));
        }
        String str5 = this.f;
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
            ry9 ry9Var6 = this.g;
            String str6 = ry9Var6 != null ? ry9Var6.a : null;
            a4cVar4.c(je9Var2, str5, "MediaItem(" + str6 + "): " + ((Object) ("Build new params, " + this.h)), null);
        }
        ul9 ul9Var = new ul9();
        ul9Var.putAll(this.h);
        wd4 wd4Var = (wd4) this.d.getValue();
        ul9Var.put("connection_type", Integer.valueOf(wd4Var.h() ? wd4Var.a().a : 1));
        ul9Var.put("param", "0");
        g("action_play", ul9Var.b());
    }

    public final void b() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            ry9 ry9Var = this.g;
            a4cVar.c(je9Var, str, c0a.o("MediaItem(", ry9Var != null ? ry9Var.a : null, "): onPlaybackBuffering"), null);
        }
    }

    public final void c() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                ry9 ry9Var = this.g;
                a4cVar.c(je9Var, str, c0a.o("MediaItem(", ry9Var != null ? ry9Var.a : null, "): onPlaybackEnded"), null);
            }
        }
        this.g = null;
    }

    public final void d(PlaybackException playbackException) {
        t90 t90Var;
        String simpleName;
        jy9 jy9Var;
        Uri uri;
        je9 je9Var = je9.d;
        if (playbackException != null) {
            int i = playbackException.a;
            if (i == 2000 || i == 4003) {
                ry9 ry9Var = this.g;
                String str = ry9Var != null ? ry9Var.a : null;
                String strI = zo5.i(i, "Audio playback error, errorCode=", ", scheme:", (ry9Var == null || (jy9Var = ry9Var.b) == null || (uri = jy9Var.a) == null) ? null : uri.getScheme());
                t90Var = this;
                yab.i0(this.b, ((n0c) this.a).b(), 0, new fze(t90Var, str, strI, null, 3), 2);
            } else {
                t90Var = this;
            }
            String str2 = t90Var.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                ry9 ry9Var2 = t90Var.g;
                String str3 = ry9Var2 != null ? ry9Var2.a : null;
                a4cVar.c(je9Var, str2, "MediaItem(" + str3 + "): " + ((Object) nbh.r(playbackException.a, "onPlaybackError: errorCodeName=", playbackException.b(), ", errorCode=")), null);
            }
        } else {
            t90Var = this;
            String str4 = t90Var.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                ry9 ry9Var3 = t90Var.g;
                String str5 = ry9Var3 != null ? ry9Var3.a : null;
                a4cVar2.c(je9Var, str4, "MediaItem(" + str5 + "): " + ((Object) "onPlaybackError: ".concat(playbackException != null ? playbackException.getClass().getSimpleName() : "'Unknown'")), null);
            }
        }
        if (playbackException != null) {
            simpleName = playbackException.b();
        } else {
            simpleName = playbackException != null ? playbackException.getClass().getSimpleName() : "Unknown";
        }
        ul9 ul9Var = new ul9();
        ul9Var.putAll(t90Var.h);
        wd4 wd4Var = (wd4) t90Var.d.getValue();
        ul9Var.put("connection_type", Integer.valueOf(wd4Var.h() ? wd4Var.a().a : 1));
        ul9Var.put("param", simpleName);
        t90Var.g("content_error", ul9Var.b());
        t90Var.g = null;
    }

    public final void e() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                ry9 ry9Var = this.g;
                a4cVar.c(je9Var, str, c0a.o("MediaItem(", ry9Var != null ? ry9Var.a : null, "): onPlayerReady"), null);
            }
        }
        if (this.g == null) {
            String str2 = this.f;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                ry9 ry9Var2 = this.g;
                a4cVar2.c(je9Var2, str2, c0a.o("MediaItem(", ry9Var2 != null ? ry9Var2.a : null, "): MediaItem is null! Skip handling"), null);
                return;
            }
            return;
        }
        EnumSet enumSet = this.k;
        s90 s90Var = s90.b;
        if (enumSet.contains(s90Var)) {
            return;
        }
        this.k.add(s90Var);
        String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.j);
        ul9 ul9Var = new ul9();
        ul9Var.putAll(this.h);
        wd4 wd4Var = (wd4) this.d.getValue();
        ul9Var.put("connection_type", Integer.valueOf(wd4Var.h() ? wd4Var.a().a : 1));
        ul9Var.put("param", strValueOf);
        if (this.i) {
            ul9Var.put("cached_data", 1);
        }
        g("action_ready", ul9Var.b());
    }

    public final void f() {
        String str = this.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                ry9 ry9Var = this.g;
                a4cVar.c(je9Var, str, c0a.o("MediaItem(", ry9Var != null ? ry9Var.a : null, "): onPlayerStop"), null);
            }
        }
        this.g = null;
    }

    public final void g(String str, ul9 ul9Var) {
        ae9.k((ae9) this.c.getValue(), "AUDIO_STATS", str, ul9Var, 8);
    }
}

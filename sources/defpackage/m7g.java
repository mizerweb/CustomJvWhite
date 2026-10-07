package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class m7g implements r80, hh9 {
    public static final /* synthetic */ zv8[] k;
    public final Context a;
    public final xhh b;
    public final AudioManager c;
    public MediaPlayer d;
    public final s80 e;
    public final dq4 f;
    public final ny8 h;
    public final p3c g = qyj.S();
    public final int i = 2;
    public float j = 1.0f;

    static {
        z8b z8bVar = new z8b(m7g.class, "startPlaybackJob", "getStartPlaybackJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        k = new zv8[]{z8bVar};
    }

    public m7g(Context context, xhh xhhVar, ny8 ny8Var) {
        this.a = context;
        this.b = xhhVar;
        this.c = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        this.e = new s80(context, this);
        this.f = cqk.a(((n0c) xhhVar).c());
        this.h = ny8Var;
    }

    public static final void e(m7g m7gVar, MediaPlayer mediaPlayer) {
        Object poeVar;
        boolean zIsPlaying;
        m7gVar.getClass();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                try {
                    zIsPlaying = mediaPlayer.isPlaying();
                } catch (IllegalStateException unused) {
                    zIsPlaying = false;
                }
                a4cVar.c(je9Var, "SimpleRingtonePlayer", zo5.s("releasePlayerOnly, player is playing: ", zIsPlaying), null);
            }
        }
        try {
            mediaPlayer.release();
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("SimpleRingtonePlayer", "failed to release media player", thA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[Catch: CancellationException -> 0x004f, all -> 0x00b9, TRY_ENTER, TryCatch #0 {CancellationException -> 0x004f, blocks: (B:12:0x0041, B:29:0x0093, B:37:0x00bc, B:32:0x0098, B:34:0x009e, B:52:0x00f9, B:46:0x00d9), top: B:85:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX WARN: Code duplicated, block: B:80:0x0190  */
    /* JADX WARN: Code duplicated, block: B:94:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final Object f(m7g m7gVar, String str, z4a z4aVar, int i, boolean z, nq4 nq4Var) {
        d7g d7gVar;
        MediaPlayer mediaPlayer;
        String str2;
        boolean z2;
        Object obj;
        int i2;
        MediaPlayer mediaPlayer2;
        float streamVolume;
        a4c a4cVar;
        a4c a4cVar2;
        a4c a4cVar3;
        z4a z4aVar2 = z4aVar;
        m7gVar.getClass();
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof d7g) {
            d7gVar = (d7g) nq4Var;
            int i3 = d7gVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d7gVar.k = i3 - Integer.MIN_VALUE;
            } else {
                d7gVar = new d7g(m7gVar, nq4Var);
            }
        } else {
            d7gVar = new d7g(m7gVar, nq4Var);
        }
        Object obj2 = d7gVar.i;
        hu4 hu4Var = hu4.a;
        int i4 = d7gVar.k;
        if (i4 == 0) {
            ch3.d0(obj2);
            try {
                MediaPlayer mediaPlayer3 = new MediaPlayer();
                try {
                    xt4 xt4VarB = ((n0c) m7gVar.b).b();
                    h7g h7gVar = new h7g(z4aVar2, mediaPlayer3, m7gVar, 0);
                    d7gVar.d = str;
                    d7gVar.e = z4aVar2;
                    d7gVar.f = mediaPlayer3;
                    d7gVar.g = i;
                    z2 = z;
                    d7gVar.h = z2;
                    d7gVar.k = 1;
                    Object objV = qyj.V(xt4VarB, h7gVar, d7gVar);
                    if (objV == hu4Var) {
                        return hu4Var;
                    }
                    mediaPlayer = mediaPlayer3;
                    str2 = str;
                    obj = objV;
                    i2 = i;
                    if (((Boolean) obj).booleanValue()) {
                        AudioManager audioManager = m7gVar.c;
                        streamVolume = audioManager.getStreamVolume(i2) / audioManager.getStreamMaxVolume(i2);
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | mediaSource: " + z4aVar2, null);
                        }
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | streamType: " + i2 + ", currentStreamTypeVolume: " + streamVolume, null);
                        }
                        mediaPlayer.setLooping(z2);
                        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(i2).build());
                        mediaPlayer2 = mediaPlayer;
                        mediaPlayer2.setOnPreparedListener(new e7g(m7gVar, mediaPlayer2, str2, m7gVar.d, i2));
                        mediaPlayer2.setOnCompletionListener(new f7g(str2, m7gVar, mediaPlayer2));
                        mediaPlayer2.setOnErrorListener(new g7g(str2, m7gVar, mediaPlayer2));
                        m7gVar.d = mediaPlayer2;
                        mediaPlayer2.prepareAsync();
                    } else {
                        a4cVar3 = gm0.f;
                        if (a4cVar3 != null) {
                            a4cVar3.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | mediaSource: " + z4aVar2 + " loading failed", null);
                        }
                        e(m7gVar, mediaPlayer);
                    }
                } catch (CancellationException e) {
                    e = e;
                    mediaPlayer = mediaPlayer3;
                    if (m7gVar.d == mediaPlayer) {
                        m7gVar.h(mediaPlayer);
                        m7gVar.d = null;
                    } else {
                        e(m7gVar, mediaPlayer);
                    }
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    mediaPlayer = mediaPlayer3;
                    str2 = str;
                    c7g c7gVar = new c7g(c0a.o("Playback(", str2, ") | Got error during init player"), th);
                    gm0.V("SimpleRingtonePlayer", c7gVar.getMessage(), c7gVar);
                    if (m7gVar.d == mediaPlayer) {
                        m7gVar.h(mediaPlayer);
                        m7gVar.d = null;
                    } else {
                        e(m7gVar, mediaPlayer);
                    }
                    return sbiVar;
                }
            } catch (Exception e2) {
                c7g c7gVar2 = new c7g(c0a.o("Playback(", str, ") | failed to create media player"), e2);
                gm0.V("SimpleRingtonePlayer", c7gVar2.getMessage(), c7gVar2);
            }
        } else {
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = d7gVar.h;
            int i5 = d7gVar.g;
            mediaPlayer = d7gVar.f;
            z4a z4aVar3 = d7gVar.e;
            String str3 = d7gVar.d;
            try {
                try {
                    ch3.d0(obj2);
                    i2 = i5;
                    obj = obj2;
                    str2 = str3;
                    z2 = z3;
                    z4aVar2 = z4aVar3;
                    try {
                        try {
                            if (((Boolean) obj).booleanValue()) {
                                a4cVar3 = gm0.f;
                                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                                    a4cVar3.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | mediaSource: " + z4aVar2 + " loading failed", null);
                                }
                                e(m7gVar, mediaPlayer);
                            } else {
                                try {
                                    AudioManager audioManager2 = m7gVar.c;
                                    streamVolume = audioManager2.getStreamVolume(i2) / audioManager2.getStreamMaxVolume(i2);
                                    a4cVar = gm0.f;
                                    if (a4cVar != null && a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | mediaSource: " + z4aVar2, null);
                                    }
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                        a4cVar2.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | streamType: " + i2 + ", currentStreamTypeVolume: " + streamVolume, null);
                                    }
                                    mediaPlayer.setLooping(z2);
                                    mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(i2).build());
                                    mediaPlayer2 = mediaPlayer;
                                    try {
                                        mediaPlayer2.setOnPreparedListener(new e7g(m7gVar, mediaPlayer2, str2, m7gVar.d, i2));
                                        mediaPlayer2.setOnCompletionListener(new f7g(str2, m7gVar, mediaPlayer2));
                                        mediaPlayer2.setOnErrorListener(new g7g(str2, m7gVar, mediaPlayer2));
                                        m7gVar.d = mediaPlayer2;
                                        mediaPlayer2.prepareAsync();
                                    } catch (CancellationException e3) {
                                        e = e3;
                                        mediaPlayer = mediaPlayer2;
                                        if (m7gVar.d == mediaPlayer) {
                                            m7gVar.h(mediaPlayer);
                                            m7gVar.d = null;
                                        } else {
                                            e(m7gVar, mediaPlayer);
                                        }
                                        throw e;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        mediaPlayer = mediaPlayer2;
                                        c7g c7gVar3 = new c7g(c0a.o("Playback(", str2, ") | Got error during init player"), th);
                                        gm0.V("SimpleRingtonePlayer", c7gVar3.getMessage(), c7gVar3);
                                        if (m7gVar.d == mediaPlayer) {
                                            m7gVar.h(mediaPlayer);
                                            m7gVar.d = null;
                                        } else {
                                            e(m7gVar, mediaPlayer);
                                        }
                                    }
                                } catch (CancellationException e4) {
                                    e = e4;
                                    mediaPlayer2 = mediaPlayer;
                                } catch (Throwable th3) {
                                    th = th3;
                                    mediaPlayer2 = mediaPlayer;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (CancellationException e5) {
                        e = e5;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    str2 = str3;
                    c7g c7gVar4 = new c7g(c0a.o("Playback(", str2, ") | Got error during init player"), th);
                    gm0.V("SimpleRingtonePlayer", c7gVar4.getMessage(), c7gVar4);
                    if (m7gVar.d == mediaPlayer) {
                        m7gVar.h(mediaPlayer);
                        m7gVar.d = null;
                    } else {
                        e(m7gVar, mediaPlayer);
                    }
                    return sbiVar;
                }
            } catch (CancellationException e6) {
                e = e6;
                if (m7gVar.d == mediaPlayer) {
                    m7gVar.h(mediaPlayer);
                    m7gVar.d = null;
                } else {
                    e(m7gVar, mediaPlayer);
                }
                throw e;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final Object g(m7g m7gVar, String str, z4a z4aVar, int i, boolean z, nq4 nq4Var) {
        i7g i7gVar;
        int i2;
        boolean z2;
        MediaPlayer mediaPlayer;
        a4c a4cVar;
        boolean zIsPlaying;
        Boolean boolValueOf;
        Throwable th;
        String str2 = str;
        z4a z4aVar2 = z4aVar;
        m7gVar.getClass();
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof i7g) {
            i7gVar = (i7g) nq4Var;
            int i3 = i7gVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i7gVar.k = i3 - Integer.MIN_VALUE;
            } else {
                i7gVar = new i7g(m7gVar, nq4Var);
            }
        } else {
            i7gVar = new i7g(m7gVar, nq4Var);
        }
        Object obj = i7gVar.i;
        hu4 hu4Var = hu4.a;
        int i4 = i7gVar.k;
        try {
            if (i4 == 0) {
                ch3.d0(obj);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    MediaPlayer mediaPlayer2 = m7gVar.d;
                    if (mediaPlayer2 != null) {
                        try {
                            zIsPlaying = mediaPlayer2.isPlaying();
                        } catch (IllegalStateException unused) {
                            zIsPlaying = false;
                        }
                        boolValueOf = Boolean.valueOf(zIsPlaying);
                    } else {
                        boolValueOf = null;
                    }
                    a4cVar2.c(je9Var, "SimpleRingtonePlayer", "resetSafely, player is playing: " + boolValueOf, null);
                }
                MediaPlayer mediaPlayer3 = m7gVar.d;
                try {
                    if (mediaPlayer3 == null) {
                        a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "SimpleRingtonePlayer", c0a.o("Playback(", str2, ") | resetSafely failed. Releasing safely"), null);
                        }
                        m7gVar.h(m7gVar.d);
                        try {
                            m7gVar.d = new MediaPlayer();
                        } catch (Exception e) {
                            c7g c7gVar = new c7g(c0a.o("Playback(", str2, ") | failed to create media player"), e);
                            gm0.V("SimpleRingtonePlayer", c7gVar.getMessage(), c7gVar);
                            return sbiVar;
                        }
                    } else {
                        try {
                            mediaPlayer3.reset();
                            m7gVar.e.u();
                        } catch (Exception e2) {
                            gm0.V("SimpleRingtonePlayer", "failed to reset media player", e2);
                            m7gVar.e.u();
                            a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4cVar.c(je9Var, "SimpleRingtonePlayer", c0a.o("Playback(", str2, ") | resetSafely failed. Releasing safely"), null);
                            }
                            m7gVar.h(m7gVar.d);
                            m7gVar.d = new MediaPlayer();
                        }
                    }
                    MediaPlayer mediaPlayer4 = m7gVar.d;
                    if (mediaPlayer4 == null) {
                        ore.p("Required value was null.");
                        return null;
                    }
                    try {
                        xt4 xt4VarB = ((n0c) m7gVar.b).b();
                        h7g h7gVar = new h7g(z4aVar2, mediaPlayer4, m7gVar, 1);
                        i7gVar.d = str2;
                        i7gVar.e = z4aVar2;
                        i7gVar.f = mediaPlayer4;
                        i2 = i;
                        i7gVar.g = i2;
                        z2 = z;
                        i7gVar.h = z2;
                        i7gVar.k = 1;
                        Object objV = qyj.V(xt4VarB, h7gVar, i7gVar);
                        if (objV == hu4Var) {
                            return hu4Var;
                        }
                        mediaPlayer = mediaPlayer4;
                        obj = objV;
                    } catch (Throwable th2) {
                        th = th2;
                        c7g c7gVar2 = new c7g(c0a.o("Playback(", str2, ") | Got error during init player"), th);
                        gm0.V("SimpleRingtonePlayer", c7gVar2.getMessage(), c7gVar2);
                        m7gVar.h(m7gVar.d);
                        m7gVar.d = null;
                        return sbiVar;
                    }
                } catch (Throwable th3) {
                    m7gVar.e.u();
                    throw th3;
                }
            } else {
                if (i4 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = i7gVar.h;
                int i5 = i7gVar.g;
                mediaPlayer = i7gVar.f;
                z4a z4aVar3 = i7gVar.e;
                String str3 = i7gVar.d;
                try {
                    ch3.d0(obj);
                    z2 = z3;
                    i2 = i5;
                    str2 = str3;
                    z4aVar2 = z4aVar3;
                } catch (Throwable th4) {
                    th = th4;
                    str2 = str3;
                    c7g c7gVar3 = new c7g(c0a.o("Playback(", str2, ") | Got error during init player"), th);
                    gm0.V("SimpleRingtonePlayer", c7gVar3.getMessage(), c7gVar3);
                    m7gVar.h(m7gVar.d);
                    m7gVar.d = null;
                    return sbiVar;
                }
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            AudioManager audioManager = m7gVar.c;
            float streamVolume = audioManager.getStreamVolume(i2) / audioManager.getStreamMaxVolume(i2);
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | isMediaSourceLoaded: " + zBooleanValue + ", mediaSource: " + z4aVar2, null);
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                a4cVar4.c(je9Var, "SimpleRingtonePlayer", "Playback(" + str2 + ") | streamType: " + i2 + ", currentStreamTypeVolume: " + streamVolume, null);
            }
            mediaPlayer.setLooping(z2);
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(i2).build());
            mediaPlayer.setOnPreparedListener(new j7g(str2, m7gVar, i2, mediaPlayer));
            mediaPlayer.setOnCompletionListener(new k7g(m7gVar, str2));
            mediaPlayer.setOnErrorListener(new l7g(str2));
            mediaPlayer.prepareAsync();
            return sbiVar;
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    @Override // defpackage.r80
    public final float a() {
        return this.j;
    }

    @Override // defpackage.r80
    public final void b(float f) {
        this.j = f;
        yab.i0(this.f, null, 0, new m13(this, f, null), 3);
    }

    @Override // defpackage.hh9
    public final void c() {
        gm0.n("SimpleRingtonePlayer", "onLogout called, player closed");
        h(this.d);
        this.d = null;
        vd7.f(this.f.a, null);
    }

    @Override // defpackage.r80
    public final boolean d() {
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer == null || !Looper.getMainLooper().isCurrentThread()) {
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void h(MediaPlayer mediaPlayer) {
        Object poeVar;
        boolean zIsPlaying;
        Boolean boolValueOf;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (mediaPlayer != null) {
                    try {
                        zIsPlaying = mediaPlayer.isPlaying();
                    } catch (IllegalStateException unused) {
                        zIsPlaying = false;
                    }
                    boolValueOf = Boolean.valueOf(zIsPlaying);
                } else {
                    boolValueOf = null;
                }
                a4cVar.c(je9Var, "SimpleRingtonePlayer", "releaseSafely, player is playing: " + boolValueOf, null);
            }
        }
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.release();
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V("SimpleRingtonePlayer", "failed to release media player", thA);
        }
        this.e.u();
    }

    public final void i(z4a z4aVar, int i, boolean z) {
        this.g.B(this, k[0], yab.i0(this.f, null, 2, new lm8(this, hashCode() + "#" + i4e.b.c(), z4aVar, i, z, null), 1));
    }

    public final void j() {
        boolean zIsPlaying;
        Boolean boolValueOf;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                MediaPlayer mediaPlayer = this.d;
                if (mediaPlayer != null) {
                    try {
                        zIsPlaying = mediaPlayer.isPlaying();
                    } catch (IllegalStateException unused) {
                        zIsPlaying = false;
                    }
                    boolValueOf = Boolean.valueOf(zIsPlaying);
                } else {
                    boolValueOf = null;
                }
                a4cVar.c(je9Var, "SimpleRingtonePlayer", "stopPlayback, player is playing: " + boolValueOf, null);
            }
        }
        p3c p3cVar = this.g;
        zv8[] zv8VarArr = k;
        vo8 vo8Var = (vo8) p3cVar.m(this, zv8VarArr[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
        this.g.B(this, zv8VarArr[0], null);
        h(this.d);
        this.d = null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        String strK;
        AudioAttributes audioAttributes;
        boolean z;
        int usage = -1;
        if (i == -3) {
            strK = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        } else if (i == -2) {
            strK = "AUDIOFOCUS_LOSS_TRANSIENT";
        } else if (i != -1) {
            strK = i != 1 ? c0a.k(i, "Unknown(", ")") : "AUDIOFOCUS_GAIN";
        } else {
            strK = "AUDIOFOCUS_LOSS";
        }
        if (i == -3 || i == -2 || i == -1) {
            AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.e.f;
            if (audioFocusRequest != null && (audioAttributes = audioFocusRequest.getAudioAttributes()) != null) {
                usage = audioAttributes.getUsage();
            }
            z = usage == 6;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "SimpleRingtonePlayer", qt4.n("onAudioFocusChange ", strK, " avoidFocusLoss: ", z), null);
            }
        }
        if (z) {
            return;
        }
        this.e.t(i);
    }

    @Override // defpackage.r80
    public final void pause() {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                MediaPlayer mediaPlayer = this.d;
                a4cVar.c(je9Var, "SimpleRingtonePlayer", "pause, player is playing: " + (mediaPlayer != null ? Boolean.valueOf(mediaPlayer.isPlaying()) : null), null);
            }
        }
        j();
    }

    @Override // defpackage.r80
    public final void play() {
    }
}

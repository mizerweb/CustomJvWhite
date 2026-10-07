package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes4.dex */
final class xbm extends fcm {
    private int a;
    private int b;
    private float c;
    private float d;
    private boolean e;
    private float f;
    private float g;
    private long h;
    private long i;
    private boolean j;
    private float k;
    private float l;
    private short m;

    @Override // defpackage.fcm
    public final fcm a(boolean z) {
        this.j = true;
        this.m = (short) (this.m | 512);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm b(float f) {
        this.g = 0.8f;
        this.m = (short) (this.m | 64);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm c(float f) {
        this.f = 0.5f;
        this.m = (short) (this.m | 32);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm d(float f) {
        this.d = 0.8f;
        this.m = (short) (this.m | 8);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm e(int i) {
        this.b = 5;
        this.m = (short) (this.m | 2);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm f(float f) {
        this.c = 0.25f;
        this.m = (short) (this.m | 4);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm g(long j) {
        this.i = CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS;
        this.m = (short) (this.m | 256);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm h(boolean z) {
        this.e = z;
        this.m = (short) (this.m | 16);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm i(float f) {
        this.k = 0.1f;
        this.m = (short) (this.m | 1024);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm j(long j) {
        this.h = 1500L;
        this.m = (short) (this.m | 128);
        return this;
    }

    @Override // defpackage.fcm
    public final fcm k(float f) {
        this.l = 0.05f;
        this.m = (short) (this.m | 2048);
        return this;
    }

    @Override // defpackage.fcm
    public final gcm l() {
        if (this.m == 4095) {
            return new zbm(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.m & 1) == 0) {
            sb.append(" recentFramesToCheck");
        }
        if ((this.m & 2) == 0) {
            sb.append(" recentFramesContainingPredictedArea");
        }
        if ((this.m & 4) == 0) {
            sb.append(" recentFramesIou");
        }
        if ((this.m & 8) == 0) {
            sb.append(" maxCoverage");
        }
        if ((this.m & 16) == 0) {
            sb.append(" useConfidenceScore");
        }
        if ((this.m & 32) == 0) {
            sb.append(" lowerConfidenceScore");
        }
        if ((this.m & 64) == 0) {
            sb.append(" higherConfidenceScore");
        }
        if ((this.m & 128) == 0) {
            sb.append(" zoomIntervalInMillis");
        }
        if ((this.m & 256) == 0) {
            sb.append(" resetIntervalInMillis");
        }
        if ((this.m & 512) == 0) {
            sb.append(" enableZoomThreshold");
        }
        if ((this.m & 1024) == 0) {
            sb.append(" zoomInThreshold");
        }
        if ((this.m & 2048) == 0) {
            sb.append(" zoomOutThreshold");
        }
        ore.k("Missing required properties:".concat(sb.toString()));
        return null;
    }

    public final fcm m(int i) {
        this.a = 10;
        this.m = (short) (this.m | 1);
        return this;
    }
}

package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class u3e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ u3e(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int frame;
        uy0 uy0Var;
        switch (this.a) {
            case 0:
                RLottieDrawable rLottieDrawable = this.b;
                rLottieDrawable.w = null;
                rLottieDrawable.c();
                Runnable runnable = rLottieDrawable.y1;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 1:
                RLottieDrawable rLottieDrawable2 = this.b;
                rLottieDrawable2.E = true;
                rLottieDrawable2.invalidateInternal();
                rLottieDrawable2.c();
                Runnable runnable2 = rLottieDrawable2.y1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                break;
            case 2:
                if (!this.b.q1) {
                    RLottieDrawable rLottieDrawable3 = this.b;
                    if (!rLottieDrawable3.C && rLottieDrawable3.canLoadFrames()) {
                        RLottieDrawable rLottieDrawable4 = this.b;
                        if (rLottieDrawable4.v == null) {
                            rLottieDrawable4.D1 = true;
                            if (RLottieDrawable.lottieCacheGenerateQueue == null) {
                                RLottieDrawable.createCacheGenQueue();
                            }
                            uy0.B++;
                            nn5 nn5Var = RLottieDrawable.lottieCacheGenerateQueue;
                            RLottieDrawable rLottieDrawable5 = this.b;
                            h7b h7bVar = new h7b(11, this);
                            rLottieDrawable5.v = h7bVar;
                            nn5Var.b(h7bVar);
                        }
                        break;
                    }
                }
                break;
            case 3:
                RLottieDrawable rLottieDrawable6 = this.b;
                if (rLottieDrawable6.v != null) {
                    uy0.c();
                    rLottieDrawable6.v = null;
                }
                rLottieDrawable6.D1 = false;
                rLottieDrawable6.c();
                Runnable runnable3 = rLottieDrawable6.whenCacheDone;
                if (runnable3 != null) {
                    runnable3.run();
                    rLottieDrawable6.whenCacheDone = null;
                }
                break;
            default:
                if (this.b.q1) {
                    RLottie.getLogger().l("RLottieDrawable. Load frame isRecycled");
                } else if (this.b.canLoadFrames()) {
                    if (this.b.z == null) {
                        try {
                            RLottieDrawable rLottieDrawable7 = this.b;
                            rLottieDrawable7.z = Bitmap.createBitmap(rLottieDrawable7.a, rLottieDrawable7.b, Bitmap.Config.ARGB_8888);
                        } catch (Throwable th) {
                            RLottie.getLogger().h(th);
                        }
                    }
                    if (this.b.z != null) {
                        try {
                            if (!this.b.j.isEmpty()) {
                                for (Map.Entry entry : this.b.j.entrySet()) {
                                    RLottieDrawable.setLayerColor(this.b.r1, (String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                                }
                                this.b.j.clear();
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        RLottieDrawable rLottieDrawable8 = this.b;
                        if (rLottieDrawable8.h != null && rLottieDrawable8.r1 != 0) {
                            RLottieDrawable.replaceColors(this.b.r1, this.b.h);
                            this.b.h = null;
                        }
                        try {
                            int i = this.b.I ? 2 : 1;
                            System.currentTimeMillis();
                            RLottieDrawable rLottieDrawable9 = this.b;
                            if (!rLottieDrawable9.w1 || (uy0Var = rLottieDrawable9.G1) == null) {
                                long j = rLottieDrawable9.r1;
                                RLottieDrawable rLottieDrawable10 = this.b;
                                int i2 = rLottieDrawable10.H;
                                Bitmap bitmap = rLottieDrawable10.z;
                                RLottieDrawable rLottieDrawable11 = this.b;
                                frame = RLottieDrawable.getFrame(j, i2, bitmap, rLottieDrawable11.a, rLottieDrawable11.b, rLottieDrawable11.z.getRowBytes(), true);
                            } else {
                                try {
                                    frame = uy0Var.f(rLottieDrawable9.z, rLottieDrawable9.H / i);
                                    try {
                                        if (!this.b.G1.g()) {
                                            RLottieDrawable rLottieDrawable12 = this.b;
                                            if (rLottieDrawable12.J1 && rLottieDrawable12.r1 != 0) {
                                                RLottieDrawable.destroy(this.b.r1);
                                                this.b.r1 = 0L;
                                            }
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        RLottie.getLogger().h(e);
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    frame = 0;
                                }
                            }
                            uy0 uy0Var2 = this.b.G1;
                            if (uy0Var2 != null && uy0Var2.g()) {
                                RLottieDrawable rLottieDrawable13 = this.b;
                                if (!rLottieDrawable13.I1) {
                                    rLottieDrawable13.I1 = true;
                                    RLottieDrawable.V1.post(rLottieDrawable13.E1);
                                }
                                RLottieDrawable rLottieDrawable14 = this.b;
                                if (rLottieDrawable14.J1) {
                                    if (rLottieDrawable14.r1 == 0) {
                                        RLottieDrawable rLottieDrawable15 = this.b;
                                        String string = ((File) rLottieDrawable15.A1.d).toString();
                                        RLottieDrawable rLottieDrawable16 = this.b;
                                        ed7 ed7Var = rLottieDrawable16.A1;
                                        ed7Var.getClass();
                                        rLottieDrawable15.r1 = RLottieDrawable.create(string, null, rLottieDrawable16.a, rLottieDrawable16.b, new int[3], false, (int[]) ed7Var.c, false, ed7Var.b);
                                    }
                                    long j2 = this.b.r1;
                                    RLottieDrawable rLottieDrawable17 = this.b;
                                    int i3 = rLottieDrawable17.H;
                                    Bitmap bitmap2 = rLottieDrawable17.z;
                                    RLottieDrawable rLottieDrawable18 = this.b;
                                    frame = RLottieDrawable.getFrame(j2, i3, bitmap2, rLottieDrawable18.a, rLottieDrawable18.b, rLottieDrawable18.z.getRowBytes(), true);
                                } else {
                                    frame = -1;
                                }
                            }
                            if (frame == -1) {
                                RLottie.getLogger().l("RLottieDrawable. Load frame result == -1");
                                RLottieDrawable.V1.post(this.b.B1);
                                CountDownLatch countDownLatch = this.b.B;
                                if (countDownLatch != null) {
                                    countDownLatch.countDown();
                                }
                                break;
                            } else {
                                RLottieDrawable rLottieDrawable19 = this.b;
                                rLottieDrawable19.y = rLottieDrawable19.z;
                                RLottieDrawable rLottieDrawable20 = this.b;
                                int i4 = rLottieDrawable20.e;
                                if (i4 >= 0 && rLottieDrawable20.f) {
                                    int i5 = rLottieDrawable20.H;
                                    if (i5 > i4) {
                                        int i6 = i5 - i;
                                        if (i6 >= i4) {
                                            rLottieDrawable20.H = i6;
                                            rLottieDrawable20.u = false;
                                        } else {
                                            rLottieDrawable20.u = true;
                                            RLottieDrawable.a(this.b);
                                        }
                                    } else {
                                        int i7 = i5 + i;
                                        if (i7 < i4) {
                                            rLottieDrawable20.H = i7;
                                            rLottieDrawable20.u = false;
                                        } else {
                                            rLottieDrawable20.u = true;
                                            RLottieDrawable.a(this.b);
                                        }
                                    }
                                } else if (i4 < 0 || !rLottieDrawable20.f) {
                                    int i8 = rLottieDrawable20.H + i;
                                    if (i4 < 0) {
                                        i4 = rLottieDrawable20.c[0];
                                    }
                                    int i9 = rLottieDrawable20.q;
                                    if (i8 < i4) {
                                        if (i9 == 3) {
                                            rLottieDrawable20.u = true;
                                            this.b.s++;
                                        } else {
                                            rLottieDrawable20.H = i8;
                                            rLottieDrawable20.u = false;
                                        }
                                    } else if (i9 == 1) {
                                        rLottieDrawable20.H = 0;
                                        rLottieDrawable20.u = false;
                                        RLottieDrawable rLottieDrawable21 = this.b;
                                        if (rLottieDrawable21.l) {
                                            rLottieDrawable21.k = null;
                                            rLottieDrawable21.l = false;
                                        }
                                        int i10 = rLottieDrawable21.r;
                                        if (i10 > 0) {
                                            rLottieDrawable21.r = i10 - 1;
                                        }
                                    } else if (i9 == 2) {
                                        rLottieDrawable20.H = 0;
                                        rLottieDrawable20.u = true;
                                        RLottieDrawable rLottieDrawable22 = this.b;
                                        rLottieDrawable22.s++;
                                        if (rLottieDrawable22.l) {
                                            rLottieDrawable22.k = null;
                                            rLottieDrawable22.l = false;
                                        }
                                    } else {
                                        rLottieDrawable20.u = true;
                                        RLottieDrawable.a(this.b);
                                    }
                                } else {
                                    int i11 = rLottieDrawable20.H;
                                    if (i11 > i4) {
                                        int i12 = i11 - i;
                                        if (i12 >= i4) {
                                            rLottieDrawable20.H = i12;
                                            rLottieDrawable20.u = false;
                                        } else {
                                            rLottieDrawable20.u = true;
                                            RLottieDrawable.a(this.b);
                                        }
                                    } else {
                                        int i13 = i11 + i;
                                        if (i13 < i4) {
                                            rLottieDrawable20.H = i13;
                                            rLottieDrawable20.u = false;
                                        } else {
                                            rLottieDrawable20.u = true;
                                            RLottieDrawable.a(this.b);
                                        }
                                    }
                                }
                            }
                        } catch (Exception e3) {
                            RLottie.getLogger().h(e3);
                        }
                    } else {
                        RLottie.getLogger().l("RLottieDrawable. Load frame background bitmap is null");
                    }
                    RLottieDrawable.V1.post(this.b.C1);
                    CountDownLatch countDownLatch2 = this.b.B;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                } else {
                    RLottie.getLogger().l("RLottieDrawable. Load frame !canLoadFrames()");
                    CountDownLatch countDownLatch3 = this.b.B;
                    if (countDownLatch3 != null) {
                        countDownLatch3.countDown();
                    }
                    RLottieDrawable.V1.post(this.b.B1);
                }
                break;
        }
    }
}

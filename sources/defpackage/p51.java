package defpackage;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import kotlin.TypeCastException;
import one.video.calls.sdk_private.j;
import org.apache.http.ParseException;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsUploadConfig;
import ru.ok.android.externcalls.sdk.analytics.UploadConfigProvider;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p51 implements qbf, NativeDoubleArrayConsumer.Consumer, tg4, r89, zm7, hu8, mf7, w71, UploadConfigProvider, ApplicationNameProvider, bg7, hgd, t65 {
    public static final p51 b = new p51(0);
    public static final p51 c = new p51(1);
    public static final p51 d = new p51(2);
    public static final p51 e = new p51(3);
    public final /* synthetic */ int a;

    public /* synthetic */ p51(int i) {
        this.a = i;
    }

    public static /* synthetic */ void d() {
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new ParseException(str + obj);
    }

    public static /* synthetic */ void g(String str) throws j {
        throw new j(str);
    }

    @Override // defpackage.zm7, defpackage.owi
    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        lvb.l0("BaseGlShaderProgram", "Exception caught by default BaseGlShaderProgram errorListener.", videoFrameProcessingException);
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                ((c60) obj).i = u60.e;
                break;
            case 24:
                ((tw2) obj).M = 0L;
                break;
            default:
                ((tw2) obj).k0 = null;
                break;
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        switch (this.a) {
            case 17:
                jj6 jj6Var = (jj6) obj;
                jj6Var.getClass();
                return jj6Var.getClass().getSimpleName();
            case 21:
                return new jid((iid) obj);
            case 22:
                return Integer.valueOf(((vih) obj).a);
            default:
                by3 by3Var = (by3) obj;
                Bundle bundle = by3Var.g;
                x88 x88Var = by3Var.h;
                Bundle bundle2 = new Bundle();
                emf emfVar = by3Var.a;
                if (emfVar != null) {
                    bundle2.putBundle(by3.k, emfVar.b());
                }
                int i = by3Var.b;
                if (i != -1) {
                    bundle2.putInt(by3.l, i);
                }
                int i2 = by3Var.c;
                if (i2 != 0) {
                    bundle2.putInt(by3.r, i2);
                }
                int i3 = by3Var.d;
                if (i3 != 0) {
                    bundle2.putInt(by3.m, i3);
                }
                CharSequence charSequence = by3Var.f;
                if (charSequence != "") {
                    bundle2.putCharSequence(by3.n, charSequence);
                }
                if (!bundle.isEmpty()) {
                    bundle2.putBundle(by3.o, bundle);
                }
                Uri uri = by3Var.e;
                if (uri != null) {
                    bundle2.putParcelable(by3.q, uri);
                }
                boolean z = by3Var.i;
                if (!z) {
                    bundle2.putBoolean(by3.p, z);
                }
                if (x88Var.c() != 1 || x88Var.b(0) != 6) {
                    bundle2.putIntArray(by3.s, x88Var.g());
                }
                if (by3Var.j != null) {
                    by3Var.o(bundle2, by3.t);
                }
                return bundle2;
        }
    }

    @Override // defpackage.hgd
    public void b(ich ichVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(ichVar.b.getWidth(), ichVar.b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        ichVar.b(surface, zjl.a(), new ro7(surface, 1, surfaceTexture));
    }

    @Override // defpackage.w71
    public String c(a35 a35Var) {
        String str = a35Var.h;
        return str != null ? str : a35Var.a.toString();
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
    }

    @Override // defpackage.qbf
    public int e(int i) {
        return 4;
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.ApplicationNameProvider
    public String getName() {
        hj8 hj8Var = mi1.e;
        return "";
    }

    @Override // ru.ok.android.externcalls.sdk.analytics.UploadConfigProvider
    public ConversationAnalyticsUploadConfig getUploadConfig() {
        return new ConversationAnalyticsUploadConfig(10, 200, 100, null, false, false, true, false, 168, null);
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        long jG0;
        v56 v56Var;
        eg6 eg6Var;
        ve5 ve5Var;
        switch (this.a) {
            case 9:
                y75 y75Var = (y75) obj;
                b85 b85Var = y75Var.b;
                if (y75Var == b85Var.j && b85Var.n != null) {
                    xkg xkgVar = b85Var.p;
                    int i = xkgVar.b;
                    if (i != -1) {
                        long j = ((ta0) xkgVar.e).f / i;
                        ic0 ic0Var = b85Var.t;
                        ic0Var.getClass();
                        jG0 = vqi.g0(ic0Var.a.getSampleRate(), j);
                    } else {
                        jG0 = -9223372036854775807L;
                    }
                    final long jElapsedRealtime = SystemClock.elapsedRealtime() - b85Var.W;
                    v56 v56Var2 = b85Var.n;
                    final int i2 = ((ta0) b85Var.p.e).f;
                    final long jP0 = vqi.p0(jG0);
                    final v2a v2aVar = ((lt9) v56Var2.b).h2;
                    Handler handler = (Handler) v2aVar.b;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: jb0
                            @Override // java.lang.Runnable
                            public final void run() {
                                ob0 ob0Var = (ob0) v2aVar.c;
                                String str = vqi.a;
                                ob0Var.G(i2, jP0, jElapsedRealtime);
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case 10:
                y75 y75Var2 = (y75) obj;
                y75Var2.getClass();
                b85.c0.getAndDecrement();
                v56 v56Var3 = y75Var2.b.n;
                if (v56Var3 != null) {
                    ta0 ta0Var = y75Var2.a;
                    tb0 tb0Var = new tb0(ta0Var.a, ta0Var.b, ta0Var.c, ta0Var.f, ta0Var.d, ta0Var.e);
                    v2a v2aVar2 = ((lt9) v56Var3.b).h2;
                    Handler handler2 = (Handler) v2aVar2.b;
                    if (handler2 != null) {
                        handler2.post(new lb0(v2aVar2, tb0Var, 0));
                        return;
                    }
                    return;
                }
                return;
            case 11:
                y75 y75Var3 = (y75) obj;
                b85 b85Var2 = y75Var3.b;
                if (y75Var3 == b85Var2.j && (v56Var = b85Var2.n) != null && b85Var2.O && (eg6Var = ((lt9) v56Var.b).J) != null) {
                    eg6Var.b();
                    return;
                }
                return;
            case 12:
                y75 y75Var4 = (y75) obj;
                b85 b85Var3 = y75Var4.b;
                if (y75Var4 == b85Var3.j && b85Var3.M) {
                    b85Var3.N = true;
                    return;
                }
                return;
            default:
                v56 v56Var4 = ((x75) obj).a.n;
                if (v56Var4 != null) {
                    lt9 lt9Var = (lt9) v56Var4.b;
                    synchronized (lt9Var.a) {
                        ve5Var = lt9Var.r;
                        break;
                    }
                    if (ve5Var != null) {
                        synchronized (ve5Var.c) {
                            ve5Var.f.getClass();
                            break;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        switch (this.a) {
            case 16:
                return BatchInternalIdResponse.parse(vu8Var);
            default:
                return ClientSupportedCodecs.Request._get_okParser_$lambda$0(vu8Var);
        }
    }

    @Override // defpackage.t65
    public Object t() {
        return new kn4();
    }
}

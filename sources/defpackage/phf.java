package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.security.auth.x500.X500Principal;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class phf implements cy, mp9, kt9, kg7, CapturerObserver, wc0, otb {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public phf(Context context, int i) {
        this.a = i;
        switch (i) {
            case 13:
                this.b = context;
                this.c = new ifh(new qv(12, this));
                break;
            default:
                yab.s(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
        }
    }

    public static s7g f(phf phfVar, Context context, int i, kbc kbcVar, int i2) {
        if ((i2 & 8) != 0) {
            kbcVar = null;
        }
        qlg qlgVar = (qlg) phfVar.b;
        if (i == R.id.oneme_stickers_view_type_stickers_set_recent_add_button) {
            return new s47(context, (af7) phfVar.c, kbcVar);
        }
        if (i == R.id.oneme_stickers_view_type_sticker_webm) {
            return new gj9(context, qlgVar, 2);
        }
        return i == R.id.oneme_stickers_view_type_sticker_lottie ? new gj9(context, qlgVar, 0) : new gj9(context, qlgVar, 1);
    }

    @Override // defpackage.mp9
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                ((mp9) this.c).a(obj);
                break;
            default:
                ((qhh) this.c).b.G();
                break;
        }
    }

    @Override // defpackage.mp9
    public void b() {
        ((mp9) this.c).b();
    }

    @Override // defpackage.mp9
    public void c(ko5 ko5Var) {
        oo5.d((hp9) this.b, ko5Var);
    }

    @Override // defpackage.cy
    public ey createAssetLoader(s26 s26Var, Looper looper, dy dyVar, ay ayVar) {
        return s26.d(s26Var.a) ? new qhf((shf) this.c, s26Var.d) : ((cy) this.b).createAssetLoader(s26Var, looper, dyVar, ayVar);
    }

    public x70 d(lek lekVar) {
        try {
            Duration duration = (Duration) Optional.ofNullable(((dek) this.b).a).orElse(gek.m1);
            String str = lekVar.a;
            String str2 = lekVar.b;
            int i = lekVar.c;
            dek dekVar = (dek) this.b;
            x70 x70Var = new x70(str, str2, i, duration, dekVar, dekVar.c, dekVar.f);
            if (!Optional.ofNullable(null).isPresent()) {
                return x70Var;
            }
            long jLongValue = ((Long) Optional.ofNullable(null).get()).longValue();
            z7k z7kVar = (z7k) x70Var.b;
            if (jLongValue < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                z7kVar.getClass();
                ore.p("Receiver buffer size must be at least 1024");
                return null;
            }
            if (jLongValue > z7kVar.J.d) {
                ore.p("Bidirectional stream buffer size cannot be larger than connection buffer size");
                return null;
            }
            if (z7kVar.p == 1) {
                z7kVar.J.f = jLongValue;
                return x70Var;
            }
            if (z7kVar.p != 3) {
                ore.k("Cannot change setting while connection is being established or closed");
                return null;
            }
            zak zakVar = z7kVar.E;
            u5k u5kVar = zakVar.f;
            zakVar.f = new iak(u5kVar.a(), u5kVar.b(), u5kVar.c(), u5kVar.d(), u5kVar.e(), u5kVar.f(), u5kVar.g(), jLongValue);
            return x70Var;
        } catch (IOException e) {
            qr7.o(e);
            return null;
        }
    }

    @Override // defpackage.kt9
    public void e(int i, ty4 ty4Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, ty4Var.i, j, i2);
    }

    @Override // defpackage.kt9
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    public void g(TrustAnchor trustAnchor) {
        HashMap map = (HashMap) this.c;
        X509Certificate trustedCert = trustAnchor.getTrustedCert();
        X500Principal subjectX500Principal = trustedCert != null ? trustedCert.getSubjectX500Principal() : trustAnchor.getCA();
        ArrayList arrayList = (ArrayList) map.get(subjectX500Principal);
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            map.put(subjectX500Principal, arrayList);
        } else if (trustedCert != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (trustedCert.equals(((TrustAnchor) arrayList.get(i)).getTrustedCert())) {
                    return;
                }
            }
        }
        arrayList.add(trustAnchor);
    }

    @Override // defpackage.kt9
    public ByteBuffer getInputBuffer(int i) {
        return ((MediaCodec) this.b).getInputBuffer(i);
    }

    @Override // defpackage.kt9
    public ByteBuffer getOutputBuffer(int i) {
        return ((MediaCodec) this.b).getOutputBuffer(i);
    }

    @Override // defpackage.kt9
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.kt9
    public void h(long j, int i, int i2, int i3) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.kt9
    public void i() {
        ((MediaCodec) this.b).detachOutputSurface();
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ((Map) ((fbc) this.c).c).remove((qjh) this.b);
    }

    @Override // defpackage.kt9
    public void k(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.kt9
    public void l(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.kt9
    public void m(int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[Catch: all -> 0x0042, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:3:0x000f, B:5:0x001b, B:10:0x0025, B:12:0x0031, B:13:0x0037, B:15:0x003d, B:20:0x004a, B:18:0x0044, B:22:0x0053), top: B:30:0x000f }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [c76] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet] */
    public Set n(X509Certificate x509Certificate) {
        ?? hashSet;
        X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.b).readLock();
        lock.lock();
        try {
            ArrayList arrayList = (ArrayList) ((HashMap) this.c).get(issuerX500Principal);
            if (arrayList == null) {
                hashSet = c76.a;
            } else {
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    hashSet = new HashSet();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        TrustAnchor trustAnchor = (TrustAnchor) arrayList.get(i);
                        try {
                            X509Certificate trustedCert = trustAnchor.getTrustedCert();
                            PublicKey publicKey = trustedCert != null ? trustedCert.getPublicKey() : trustAnchor.getCAPublicKey();
                            if (publicKey != null) {
                                x509Certificate.verify(publicKey);
                                hashSet.add(trustAnchor);
                            }
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    hashSet = c76.a;
                }
            }
            lock.unlock();
            return hashSet;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        p3j p3jVar = (p3j) this.c;
        p3jVar.a.log("VideoRecord", "Capture started (success=" + z + "), notify listener");
        yki ykiVar = p3jVar.h;
        if (ykiVar != null) {
            ((sb9) ykiVar.a).g.execute(new xi3(ykiVar, z, !z));
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        p3j p3jVar = (p3j) this.c;
        p3jVar.a.log("VideoRecord", "Capture stopped, notify listener");
        yki ykiVar = p3jVar.h;
        if (ykiVar != null) {
            ((sb9) ykiVar.a).g.execute(new xi3(ykiVar, false, false));
        }
    }

    @Override // defpackage.mp9
    public void onError(Throwable th) {
        ((mp9) this.c).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        qhh qhhVar = (qhh) this.c;
        fik fikVar = (fik) this.b;
        if (((qme) fikVar.c).g) {
            return;
        }
        Object obj = ((hl2) ((ArrayList) fikVar.b).get(0)).e.a.get("CAPTURE_CONFIG_ID_KEY");
        int iIntValue = obj == null ? -1 : ((Integer) obj).intValue();
        boolean z = th instanceof ImageCaptureException;
        g85 g85Var = qhhVar.c;
        if (z) {
            fj0 fj0Var = new fj0(iIntValue, (ImageCaptureException) th);
            g85Var.getClass();
            wxl.a();
            ((zg0) g85Var.e).k.accept(fj0Var);
        } else {
            fj0 fj0Var2 = new fj0(iIntValue, new ImageCaptureException(2, "Failed to submit capture request", th));
            g85Var.getClass();
            wxl.a();
            ((zg0) g85Var.e).k.accept(fj0Var2);
        }
        qhhVar.b.G();
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        ((CapturerObserver) this.b).onFrameCaptured(videoFrame);
    }

    @Override // defpackage.kt9
    public void p(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.kt9
    public int q() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.kt9
    public int r(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.kt9
    public void release() {
        euc eucVar = (euc) this.c;
        MediaCodec mediaCodec = (MediaCodec) this.b;
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && eucVar != null) {
                eucVar.I(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // defpackage.kt9
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.kt9
    public void t(ArrayList arrayList) {
        ((MediaCodec) this.b).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.kt9
    public void u(yt9 yt9Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new t30(this, yt9Var, 1), handler);
    }

    @Override // defpackage.kt9
    public void v(ArrayList arrayList) {
        ((MediaCodec) this.b).unsubscribeFromVendorParameters(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable w(nq4 nq4Var) {
        hni hniVar;
        if (nq4Var instanceof hni) {
            hniVar = (hni) nq4Var;
            int i = hniVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hniVar.f = i - Integer.MIN_VALUE;
            } else {
                hniVar = new hni(this, nq4Var);
            }
        } else {
            hniVar = new hni(this, nq4Var);
        }
        Object objB = hniVar.d;
        int i2 = hniVar.f;
        if (i2 == 0) {
            ch3.d0(objB);
            utd utdVar = (utd) ((ny8) this.c).getValue();
            long jT = ((s7f) ((et3) ((ny8) this.b).getValue())).t();
            hniVar.f = 1;
            objB = utdVar.b(jT, hniVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objB);
        }
        return ((vjd) objB).d;
    }

    public String x(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public /* synthetic */ phf(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public phf(xtj xtjVar) {
        this.a = 16;
        this.c = new o73();
        this.b = xtjVar;
        dul.A();
    }

    public /* synthetic */ phf(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public phf(Set set) {
        this.a = 8;
        this.b = new ReentrantReadWriteLock();
        this.c = new HashMap();
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                g((TrustAnchor) it.next());
            }
        }
    }

    public phf() {
        this.a = 7;
        new ReentrantLock();
        this.b = new ConcurrentHashMap();
        this.c = new ReferenceQueue();
    }

    public phf(dek dekVar) {
        this.a = 14;
        this.b = dekVar;
        this.c = new ConcurrentHashMap();
    }

    public phf(MediaCodec mediaCodec, euc eucVar) {
        this.a = 5;
        this.b = mediaCodec;
        this.c = eucVar;
        if (Build.VERSION.SDK_INT < 35 || eucVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) eucVar.d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            lvb.b0(((HashSet) eucVar.b).add(mediaCodec));
        }
    }
}

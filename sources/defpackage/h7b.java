package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.media3.transformer.ExportException;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import one.me.mediaeditor.PhotoEditScreen;
import one.me.rlottie.RLottieDrawable;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h7b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h7b(mdc mdcVar, long j) {
        this.a = 2;
        this.b = mdcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View viewE;
        switch (this.a) {
            case 0:
                try {
                    ((n7b) this.b).c.I(tab.t());
                    return;
                } catch (Exception e) {
                    lvb.l0("MultiInputVG", "Error releasing GlObjectsProvider", e);
                    return;
                }
            case 1:
                n7b n7bVar = (n7b) ((i1m) this.b).a;
                n7bVar.e.b(n7bVar.t);
                return;
            case 2:
                ldc ldcVar = (ldc) ((mdc) this.b).d.a;
                ldcVar.k.x(ldcVar, ldcVar.A(ldcVar.z()));
                return;
            case 3:
                ymc ymcVar = (ymc) this.b;
                synchronized (ymcVar) {
                    for (int i = 0; i < ymcVar.f.size(); i++) {
                        try {
                            ((VideoTrack) ymcVar.f.get(i)).removeSink((VideoSink) ymcVar.g.get(i));
                            ((VideoTrack) ymcVar.f.get(i)).removeSink((VideoSink) ymcVar.h.get(i));
                        } catch (Throwable th) {
                            ymcVar.a.log("ParticipantsAgnosticVideoTracks", "close error: " + th.getMessage());
                            return;
                        }
                    }
                }
                return;
            case 4:
                throw ((RuntimeException) this.b);
            case 5:
                guc gucVar = (guc) this.b;
                try {
                    gucVar.f();
                    return;
                } catch (Exception e2) {
                    gm0.V("guc", "syncInternal: exception", e2);
                    ((t1c) gucVar.l).a(e2);
                    return;
                }
            case 6:
                PhotoEditScreen photoEditScreen = (PhotoEditScreen) this.b;
                zv8[] zv8VarArr = PhotoEditScreen.s1;
                if (photoEditScreen.isAttached()) {
                    photoEditScreen.w1().animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator((PathInterpolator) photoEditScreen.w.getValue()).start();
                    return;
                }
                return;
            case 7:
                d0d d0dVar = (d0d) this.b;
                d0dVar.d = 1.0f;
                iua iuaVar = d0dVar.p;
                if (iuaVar != null) {
                    iuaVar.invoke();
                    return;
                }
                return;
            case 8:
                ((g3d) this.b).u--;
                return;
            case 9:
                ecd ecdVar = (ecd) this.b;
                xbd xbdVar = ecdVar.a;
                if (xbdVar == null || (viewE = xbdVar.e()) == null) {
                    return;
                }
                bdc.a(viewE, new ng7(viewE, 19, ecdVar));
                return;
            case 10:
                ((igd) this.b).s();
                return;
            case 11:
                RLottieDrawable rLottieDrawable = ((u3e) this.b).b;
                try {
                    uy0 uy0Var = rLottieDrawable.G1;
                    if (uy0Var != null) {
                        uy0Var.b();
                    }
                    break;
                } catch (Throwable unused) {
                }
                RLottieDrawable.V1.post(rLottieDrawable.F1);
                return;
            case 12:
                RecordManagerImpl.onRecordStarted$lambda$1((RecordManagerImpl) this.b);
                return;
            case 13:
                bee beeVar = (bee) ((fik) this.b).c;
                if (beeVar.d) {
                    return;
                }
                tvj.a("Recorder", "Retry setupVideo #" + beeVar.e);
                ich ichVar = beeVar.a;
                msh mshVar = beeVar.b;
                dee deeVar = beeVar.g;
                deeVar.D().b(new d86(beeVar, ichVar, mshVar, 24), deeVar.e);
                return;
            case 14:
                ldc ldcVar2 = (ldc) ((fbc) this.b).c;
                ldcVar2.k.w(ldcVar2);
                return;
            case 15:
                vre vreVar = (vre) this.b;
                boolean z = vreVar.c > 0;
                if (vreVar.p.compareAndSet(false, true) && z) {
                    dq4 dq4Var = vreVar.l.a;
                    if (dq4Var == null) {
                        dq4Var = null;
                    }
                    yab.i0(dq4Var, vreVar.s, 0, new bte(vreVar, null, 0), 2);
                    return;
                }
                return;
            case 16:
                ((hue) this.b).a.release();
                return;
            case 17:
                rve rveVar = (rve) this.b;
                f25 f25Var = (f25) rveVar.b.get();
                if (f25Var != null) {
                    o3k o3kVar = rveVar.c;
                    if (o3kVar == null) {
                        ore.p("Illegal 'listener' value: null");
                        return;
                    } else {
                        f25Var.c.remove(o3kVar);
                        f25Var.c(rveVar.d);
                        return;
                    }
                }
                return;
            case 18:
                z18 z18Var = (z18) this.b;
                f25 f25Var2 = (f25) ((AtomicReference) z18Var.h).get();
                if (f25Var2 != null) {
                    f25Var2.c((p3k) z18Var.i);
                    return;
                }
                return;
            case 19:
                ((b4f) this.b).c();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((y58) this.b).p();
                return;
            case 21:
                SelectAlbumWidget selectAlbumWidget = (SelectAlbumWidget) this.b;
                zv8[] zv8VarArr2 = SelectAlbumWidget.f;
                selectAlbumWidget.p1().k();
                return;
            case 22:
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) this.b;
                if (selectCountryBottomSheet.getView() != null) {
                    ((RecyclerView) selectCountryBottomSheet.o.m(selectCountryBottomSheet, SelectCountryBottomSheet.t[0])).w0(0);
                    return;
                }
                return;
            case 23:
                ((shf) this.b).i(Bitmap.createBitmap(new int[]{-16777216}, 1, 1, Bitmap.Config.ARGB_8888));
                return;
            case 24:
                ((qhf) this.b).a();
                return;
            case 25:
                rhf rhfVar = (rhf) this.b;
                try {
                    if (rhfVar.d.v) {
                        return;
                    }
                    rhfVar.d.h();
                    rhfVar.c += rhfVar.d.x;
                    rhfVar.d.n.release();
                    shf shfVar = rhfVar.d;
                    shfVar.l = false;
                    int i2 = shfVar.m + 1;
                    shfVar.m = i2;
                    ghe gheVar = shfVar.a;
                    if (i2 == gheVar.d) {
                        shfVar.m = 0;
                        shfVar.r++;
                    }
                    s26 s26Var = (s26) gheVar.get(shfVar.m);
                    shf shfVar2 = rhfVar.d;
                    phf phfVar = shfVar2.c;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    shf shfVar3 = rhfVar.d;
                    shfVar2.n = phfVar.createAssetLoader(s26Var, looperMyLooper, shfVar3, shfVar3.d);
                    rhfVar.d.n.start();
                    return;
                } catch (RuntimeException e3) {
                    rhfVar.d.b(ExportException.a(1000, e3));
                    return;
                }
            case 26:
                ((xhf) this.b).c();
                return;
            case 27:
                wif wifVar = (wif) this.b;
                if (wifVar.J()) {
                    pbi pbiVar = wifVar.C;
                    if (pbiVar.o != null) {
                        pbiVar.o.L(pbiVar.j);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                szf szfVar = (szf) this.b;
                szfVar.k.log("SlmsSource", "releaseInternal");
                if (szfVar.o != null) {
                    sb9 sb9Var = szfVar.o;
                    sb9Var.n.log("OKRTCLmsAdapter", "release");
                    xde xdeVar = sb9Var.D;
                    if (xdeVar != null) {
                        xdeVar.b = null;
                        ((Handler) xdeVar.c).removeCallbacks((rda) xdeVar.d);
                        ((sb9) xdeVar.e).n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                    }
                    sb9Var.c.clear();
                    sb9Var.q = null;
                    sb9Var.a();
                    if (sb9Var.r != null) {
                        kd2 kd2Var = sb9Var.r;
                        kd2Var.e.log("CameraCapturerAdapter", "release");
                        kd2Var.f.clear();
                        kd2Var.b();
                        ((eoc) kd2Var.c.b).dispose();
                        sb9Var.r = null;
                    }
                    if (sb9Var.t != null) {
                        sb9Var.t.b();
                        sb9Var.t = null;
                    }
                    if (sb9Var.u != null) {
                        g5f g5fVar = sb9Var.u;
                        if (!g5fVar.c) {
                            if (g5fVar.f != null) {
                                g5fVar.f.d(null);
                            }
                            g5fVar.b.a(new f5f(g5fVar, 0));
                            qq4 qq4Var = g5fVar.b;
                            qq4Var.getClass();
                            try {
                                qq4Var.c.await();
                                break;
                            } catch (InterruptedException unused2) {
                            }
                        }
                        sb9Var.u = null;
                    }
                    sb9Var.n.log("OKRTCLmsAdapter", "releaseScreenCastVideoTrack");
                    sb9Var.z.l();
                    sb9Var.g();
                    sb9Var.i.l();
                    sb9Var.h.dispose();
                    sb9Var.n.log("OKRTCLmsAdapter", sb9Var + ": " + uza.b(sb9Var.h) + " was disposed");
                    szfVar.k.log("SlmsSource", uza.b(szfVar.o).concat(" was released"));
                    szfVar.o = null;
                    return;
                }
                return;
            default:
                g85 g85Var = (g85) this.b;
                synchronized (((ArrayDeque) g85Var.d)) {
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) g85Var.a).edit();
                    String str = (String) g85Var.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) g85Var.d).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) g85Var.c);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
        }
    }

    public /* synthetic */ h7b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

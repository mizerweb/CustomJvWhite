package defpackage;

import android.graphics.SurfaceTexture;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.MetadataRepository;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import one.video.calls.sdk.upload.FileUploadService;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsBufferUnderflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes4.dex */
public final class wze implements s8g, kg7, t0k, vhi, rg4 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public wze() {
        this.a = 4;
        this.b = (ImageCaptureFailedForSpecificCombinationQuirk) rk5.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
        this.c = (PreviewGreenTintQuirk) rk5.a.b(PreviewGreenTintQuirk.class);
    }

    public static wze k(yfj yfjVar) {
        return new wze(yfjVar);
    }

    public static wze l() {
        return new wze(new yfj());
    }

    @Override // defpackage.s8g
    public void a(Object obj) {
        switch (this.a) {
            case 2:
                s8g s8gVar = (s8g) this.b;
                try {
                    ((e8g) this.c).c.accept(obj);
                    s8gVar.a(obj);
                } catch (Throwable th) {
                    iwl.a(th);
                    s8gVar.onError(th);
                    return;
                }
                break;
            case 5:
                qyj.l(null, ((r72) this.b).b(null));
                break;
            default:
                qyj.l("Unexpected result from SurfaceRequest. Surface was provided twice.", ((cj0) obj).a != 3);
                tvj.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.b).release();
                bph bphVar = ((aph) this.c).a;
                if (bphVar.j != null) {
                    bphVar.j = null;
                }
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        yii yiiVar = (yii) obj;
        File file = (File) this.b;
        yiiVar.getClass();
        if (yiiVar instanceof wii) {
            au6.a(FileUploadService.a, "Upload failed. Reason: " + ((wii) yiiVar).a + ", File " + file.getAbsolutePath());
        } else {
            if (!yiiVar.equals(xii.a)) {
                ore.o();
                return;
            }
            au6.a(FileUploadService.a, "Upload successful. File " + file.getAbsolutePath());
        }
        if (((it6) this.c).c) {
            wxl.b(file, new ysj(1, FileUploadService.a, au6.class, "log", "log(Ljava/lang/String;)V", 0, 3));
        }
    }

    public boolean b(y3e y3eVar, String str, String str2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        boolean zContainsKey = linkedHashMap.containsKey(str);
        String str3 = (String) linkedHashMap.put(str, str2);
        if (!zContainsKey || !Objects.equals(str3, str2)) {
            return true;
        }
        y3eVar.log("CodecPrefUtil", "parameter " + str + " value did not change");
        return false;
    }

    @Override // defpackage.s8g
    public void c(ko5 ko5Var) {
        ((s8g) this.b).c(ko5Var);
    }

    public s9g d(oy9 oy9Var) {
        return new s9g(oy9Var, (s25) this.b, (l6m) this.c);
    }

    @Override // defpackage.vhi
    public void e(long j) {
        ((tw5) this.b).e(j);
    }

    public void f(String str) {
        mii miiVarH = ((zgi) this.b).h();
        String str2 = ((vfi) ((wfe) this.c).a).a.d;
        miiVarH.getClass();
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        if (str != null) {
            b9bVar.k("host_ip", str);
        }
        qrc.k(miiVarH, "url_connected", 2, str2, false, null, b9bVar, 24);
    }

    @Override // defpackage.vhi
    public void g(iji ijiVar) {
        wfe wfeVar = (wfe) this.c;
        ((tw5) this.b).g(ijiVar);
        if (ijiVar instanceof fji) {
            ((af7) wfeVar.a).invoke();
        }
        if (ijiVar instanceof dji) {
            ((af7) wfeVar.a).invoke();
        }
    }

    public void h(Boolean bool) {
        this.c = bool;
    }

    public void i() {
        this.b = zul.CUSTOM;
    }

    public sql j() {
        return new sql(this);
    }

    @Override // defpackage.s8g
    public void onError(Throwable th) {
        ((s8g) this.b).onError(th);
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 5:
                if (th instanceof gch) {
                    qyj.l(null, ((u72) this.c).cancel(false));
                    return;
                } else {
                    qyj.l(null, ((r72) this.b).b(null));
                    return;
                }
            default:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
        }
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "Bounds{lower=" + ((mi8) this.b) + " upper=" + ((mi8) this.c) + "}";
            case 13:
            default:
                return super.toString();
            case 14:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
                if (linkedHashMap.isEmpty()) {
                    return sb.toString();
                }
                sb.append(' ');
                boolean z = true;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(';');
                    }
                    sb.append((String) entry.getKey());
                    String str = (String) entry.getValue();
                    if (str != null) {
                        sb.append('=');
                        sb.append(str);
                    }
                }
                return sb.toString();
        }
    }

    @Override // defpackage.t0k
    public int write(ByteBuffer byteBuffer) throws IOException {
        i1m i1mVar = ((agi) this.b).e;
        xde xdeVar = (xde) this.c;
        SSLEngine sSLEngine = (SSLEngine) xdeVar.b;
        ByteBuffer byteBufferX = xdeVar.x();
        if (byteBufferX.hasRemaining()) {
            ((SocketChannel) i1mVar.a).write(byteBufferX);
            return 0;
        }
        byteBufferX.clear();
        SSLEngineResult sSLEngineResultWrap = sSLEngine.wrap(byteBuffer, byteBufferX);
        SSLEngineResult.Status status = sSLEngineResultWrap.getStatus();
        int i = status == null ? -1 : pgh.$EnumSwitchMapping$0[status.ordinal()];
        if (i == 1) {
            byteBufferX.flip();
            ((SocketChannel) i1mVar.a).write(byteBufferX);
            return sSLEngineResultWrap.bytesConsumed();
        }
        if (i == 2) {
            throw new TlsConnectionClosedException("SSLEngine.wrap error. Connection closed. " + sSLEngineResultWrap, null, 2, null);
        }
        if (i == 3) {
            throw new TlsBufferOverflowException("SSLEngine.wrap error. " + sSLEngineResultWrap, null, 2, null);
        }
        if (i != 4) {
            ore.o();
            return 0;
        }
        throw new TlsBufferUnderflowException("SSLEngine.wrap error. " + sSLEngineResultWrap, null, 2, null);
    }

    public /* synthetic */ wze(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ wze(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public wze(yfj yfjVar) {
        this.a = 17;
        this.c = new o73();
        this.b = yfjVar;
        l6m.u();
    }

    public wze(MetadataRepository metadataRepository, c4h c4hVar, ac5 ac5Var) {
        this.a = 15;
        this.b = metadataRepository;
        this.c = Logger.DefaultImpls.createLogger(ac5Var, this);
    }

    public wze(String str, LinkedHashMap linkedHashMap) {
        this.a = 14;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.c = linkedHashMap2;
        this.b = str;
        if (linkedHashMap != null) {
            linkedHashMap2.putAll(linkedHashMap);
        }
    }

    public wze(CidLogger cidLogger, l6m l6mVar, cnc cncVar) {
        this.a = 11;
        this.b = cidLogger;
        this.c = cncVar;
    }

    public /* synthetic */ wze(int i) {
        this.a = i;
    }

    public wze(s25 s25Var) {
        this.a = 3;
        s25Var.getClass();
        this.b = s25Var;
        this.c = new l6m(22);
    }

    public wze(WindowInsetsAnimation.Bounds bounds) {
        this.a = 12;
        this.b = mi8.c(bounds.getLowerBound());
        this.c = mi8.c(bounds.getUpperBound());
    }
}

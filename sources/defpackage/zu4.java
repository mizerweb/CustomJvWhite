package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class zu4 implements fi6, CameraVideoCapturer.CameraConfigurationProvider {
    public final Object a;
    public volatile Object b;

    public zu4(int i) {
        switch (i) {
            case 3:
                this.b = new gi2();
                this.a = new Object();
                break;
            default:
                this.a = new ReentrantLock();
                break;
        }
    }

    public void a(List list, af7 af7Var) {
        vo8 vo8Var;
        ReentrantLock reentrantLock = (ReentrantLock) this.a;
        reentrantLock.lock();
        try {
            fke fkeVar = (fke) this.b;
            if (fkeVar == null || !fkeVar.a.isActive() || !list.equals(fkeVar.b)) {
                if (fkeVar != null && (vo8Var = fkeVar.a) != null) {
                    vo8Var.b(null);
                }
                vo8 vo8Var2 = (vo8) af7Var.invoke();
                fke fkeVar2 = new fke(vo8Var2, list);
                vo8Var2.start();
                this.b = fkeVar2;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void b(t6f t6fVar) {
        this.b = t6fVar;
        Uri uriA = ((t6f) this.b).a();
        ((ta4) this.a).setSessionInfo(new sa4(((t6f) this.b).a.c, uriA == null ? null : uriA.toString(), ((t6f) this.b).a.b));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    public yu4 c() {
        String string;
        jjd jjdVar;
        ljf ljfVar = (ljf) this.a;
        if (((Number) ((ifh) ljfVar.d).getValue()).longValue() <= 0 || ((Number) ((ifh) ljfVar.b).getValue()).longValue() <= 0) {
            return null;
        }
        yu4 yu4Var = (yu4) this.b;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/proc/self/stat", "r");
            try {
                StringBuilder sb = new StringBuilder();
                for (String line = randomAccessFile.readLine(); line != null; line = randomAccessFile.readLine()) {
                    sb.append(line);
                }
                string = sb.toString();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(randomAccessFile, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            string = null;
        }
        if (string == null) {
            jjdVar = null;
        } else {
            List listM1 = r5h.m1(string, new String[]{" "}, 6);
            if (listM1.size() <= 24) {
                jjdVar = null;
            } else {
                try {
                    jjdVar = new jjd(Long.parseLong((String) listM1.get(13)), Long.parseLong((String) listM1.get(14)), Long.parseLong((String) listM1.get(15)), Long.parseLong((String) listM1.get(16)), Long.parseLong((String) listM1.get(21)), Long.parseLong((String) listM1.get(23)));
                } catch (NumberFormatException unused2) {
                    jjdVar = null;
                }
            }
        }
        this.b = jjdVar != null ? new yu4(SystemClock.elapsedRealtime() / 1000, jjdVar) : null;
        return yu4Var;
    }

    @Override // defpackage.fi6
    public t6f h() {
        String str;
        if (((t6f) this.b) == null) {
            sa4 sessionInfo = ((ta4) this.a).getSessionInfo();
            t6f t6fVarD = t6f.c.b(((ta4) this.a).getAppKey()).d(Uri.parse(((ta4) this.a).getBaseEndpoint()));
            if (sessionInfo != null && (str = sessionInfo.a) != null) {
                t6fVarD = t6fVarD.c(str);
            }
            this.b = t6fVarD;
        }
        return (t6f) this.b;
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraConfigurationProvider
    public boolean isCrashOnCameraCloseRequired() {
        ((gi2) this.b).getClass();
        return false;
    }

    public /* synthetic */ zu4(Object obj) {
        this.a = obj;
    }
}

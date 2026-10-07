package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import one.me.folders.list.FoldersListScreen;
import org.webrtc.EncodedImage;
import org.webrtc.JniCommon;
import org.webrtc.Size;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uc2(zc2 zc2Var, yc2 yc2Var, jme jmeVar, int i) {
        this.a = 0;
        this.c = zc2Var;
        this.d = jmeVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wmf wmfVar;
        int i = this.a;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((zc2) obj2).d(yc2.d((jme) obj), i2);
                break;
            case 1:
                e74 e74Var = (e74) obj2;
                Object obj3 = ((uik) obj).b;
                String str = (String) e74Var.a.get(Integer.valueOf(i2));
                if (str != null) {
                    w9 w9Var = (w9) e74Var.e.get(str);
                    if ((w9Var != null ? w9Var.a : null) != null) {
                        u9 u9Var = w9Var.a;
                        if (e74Var.d.remove(str)) {
                            u9Var.c(obj3);
                        }
                    } else {
                        e74Var.g.remove(str);
                        e74Var.f.put(str, obj3);
                    }
                    break;
                }
                break;
            case 2:
                ((e74) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
            case 3:
                y55 y55Var = (y55) obj2;
                y55Var.j.decrementAndGet();
                ByteBuffer byteBuffer = ((EncodedImage) obj).buffer;
                if (i2 > y55Var.l.get()) {
                    y55Var.a.decode(byteBuffer);
                }
                bak bakVar = y55Var.o;
                bakVar.y.decrementAndGet();
                byteBuffer.rewind();
                bakVar.z.addAndGet(-byteBuffer.capacity());
                JniCommon.nativeFreeByteBuffer(byteBuffer);
                break;
            case 4:
                ((lpd) ((ec1) obj2).e).d(i2, obj);
                break;
            case 5:
                av5 av5Var = (av5) obj2;
                ((bv5) obj).d(av5Var.a, av5Var.b, i2);
                break;
            case 6:
                k57 k57VarO1 = ((FoldersListScreen) ((f57) obj2).h.b).o1();
                k57VarO1.getClass();
                r17 r17Var = ((zmi) ((ArrayList) obj).get(i2)).a;
                k57VarO1.m = r17Var != null ? r17Var.a : null;
                break;
            case 7:
                ((bc7) obj2).b((Size) obj, i2 + 1);
                break;
            case 8:
                jv9 jv9Var = (jv9) obj2;
                try {
                    wmfVar = (wmf) ((e89) obj).get();
                    lvb.W(wmfVar, "SessionResult must not be null");
                } catch (InterruptedException e) {
                    e = e;
                    lvb.H0("MCImplBase", "Session operation failed", e);
                    wmfVar = new wmf(-1);
                } catch (CancellationException e2) {
                    lvb.H0("MCImplBase", "Session operation cancelled", e2);
                    wmfVar = new wmf(1);
                } catch (ExecutionException e3) {
                    e = e3;
                    lvb.H0("MCImplBase", "Session operation failed", e);
                    wmfVar = new wmf(-1);
                }
                e38 e38Var = jv9Var.D;
                if (e38Var != null) {
                    try {
                        e38Var.D(jv9Var.c, i2, wmfVar.b());
                    } catch (RemoteException unused) {
                        lvb.G0("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            case 9:
                Pair pair = (Pair) obj;
                ((r75) ((k5a) obj2).b.i).d(((Integer) pair.first).intValue(), (x4a) pair.second, i2);
                break;
            case 10:
                ((pgg) obj2).d(i2, obj);
                break;
            default:
                z18 z18Var = (z18) obj2;
                byte[] bArr = (byte[]) obj;
                Iterator it = ((CopyOnWriteArrayList) z18Var.c).iterator();
                while (it.hasNext()) {
                    try {
                        ((wve) it.next()).b(i2, bArr);
                    } catch (Throwable th) {
                        ((y3e) z18Var.b).reportException("RtcNotificationReceiver", "rtc.notification.handle.datareceived", th);
                    }
                }
                break;
        }
    }

    public /* synthetic */ uc2(f57 f57Var, int i, int i2, ArrayList arrayList) {
        this.a = 6;
        this.c = f57Var;
        this.b = i2;
        this.d = arrayList;
    }

    public /* synthetic */ uc2(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ uc2(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}

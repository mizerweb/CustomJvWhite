package defpackage;

import android.util.DisplayMetrics;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.time.Instant;
import org.json.JSONObject;
import org.webrtc.Size;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class myj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ myj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 4;
        Object obj = this.b;
        switch (i) {
            case 0:
                xde xdeVar = (xde) obj;
                ((uxe) xdeVar.e).K(new atj(i2, xdeVar));
                break;
            case 1:
                y8k y8kVar = (y8k) obj;
                if (y8kVar.h) {
                    Instant instant = y8kVar.a.instant();
                    if (y8kVar.g.plusMillis(y8kVar.d).isBefore(instant)) {
                        if (y8kVar.g.plusMillis(((long) y8kVar.f.getAsInt()) * 3).isBefore(instant)) {
                            y8kVar.b.shutdown();
                            z7k z7kVar = y8kVar.e;
                            if (z7kVar.p != 4 && z7kVar.p != 5) {
                                z7kVar.f(new v5k(z7kVar.j.i != 2 ? 1 : 4));
                                z7kVar.E.f();
                                z7kVar.B.g();
                                z7kVar.c.getClass();
                                Instant.now();
                                z7kVar.p();
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                bak bakVar = (bak) obj;
                y55 y55Var = bakVar.g;
                if (y55Var != null) {
                    y55Var.a();
                    bakVar.g = null;
                    bakVar.D = 0;
                }
                csb csbVar = bakVar.f;
                if (csbVar != null) {
                    try {
                        ((ByteArrayOutputStream) csbVar.d).close();
                        break;
                    } catch (IOException unused) {
                    }
                }
                bakVar.f = null;
                break;
            case 3:
                vbk vbkVar = (vbk) obj;
                while (!vbkVar.f) {
                    try {
                        DatagramPacket datagramPacket = new DatagramPacket(new byte[1500], 1500);
                        try {
                            vbkVar.a.receive(datagramPacket);
                            if (vbkVar.c.test(datagramPacket)) {
                                vbkVar.e.add(new ubk(datagramPacket, Instant.now()));
                            }
                        } catch (SocketException e) {
                            throw e;
                        } catch (SocketTimeoutException unused2) {
                        }
                    } catch (IOException e2) {
                        if (vbkVar.f) {
                            return;
                        }
                        vbkVar.b.accept(e2);
                        return;
                    } catch (Throwable th) {
                        vbkVar.b.accept(th);
                        return;
                    }
                }
                break;
            case 4:
                cfk cfkVar = (cfk) obj;
                try {
                    cfkVar.e.onResponse(new JSONObject().put("error", "command-discarded"));
                } catch (Throwable th2) {
                    cfkVar.f.b.logException("OKSignaling", "Error discarding postponed command", th2);
                    return;
                }
                break;
            default:
                xde xdeVar2 = (xde) ((rda) obj).b;
                ub9 ub9Var = (ub9) xdeVar2.b;
                sb9 sb9Var = (sb9) xdeVar2.e;
                CidLogger cidLogger = sb9Var.n;
                if (ub9Var != null) {
                    try {
                        sb9Var.e();
                        Size size = sb9Var.B;
                        DisplayMetrics displayMetrics = sb9Var.A;
                        if (displayMetrics.widthPixels != size.width || displayMetrics.heightPixels != size.height) {
                            cidLogger.log("OKRTCLmsAdapter", "Screen size did change" + size.width + "x" + size.height + "->" + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
                            int i3 = displayMetrics.widthPixels;
                            size.width = i3;
                            int i4 = displayMetrics.heightPixels;
                            size.height = i4;
                            ((ub9) xdeVar2.b).a(i3, i4);
                        }
                    } catch (Throwable th3) {
                        cidLogger.reportException("OKRTCLmsAdapter", "Error on screen share size update", th3);
                    }
                    sb9Var.b((ub9) xdeVar2.b);
                    break;
                }
                break;
        }
    }
}

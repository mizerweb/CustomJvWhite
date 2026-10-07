package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.time.Clock;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import one.video.calls.sdk_private.dQ;
import org.webrtc.PeerConnectionFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y81 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y81(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        String[] strArr;
        switch (this.a) {
            case 0:
                o91 o91Var = (o91) this.b;
                try {
                    ((PeerConnectionFactory) obj).submitDumpRequest((String) this.c, Integer.MAX_VALUE, null);
                    return;
                } catch (Throwable th) {
                    o91Var.N.logException("OKRTCCall", "Error starting local audio dump", th);
                    return;
                }
            case 1:
                o91 o91Var2 = (o91) this.b;
                try {
                    ((PeerConnectionFactory) obj).setTFLiteLibraryPath(((wl) this.c).p());
                    return;
                } catch (IllegalStateException e) {
                    o91Var2.N.reportException("OKRTCCall", "Error loading TFLite", e);
                    return;
                }
            case 2:
                qpc qpcVar = (qpc) this.b;
                List list = (List) this.c;
                PeerConnectionFactory peerConnectionFactory = (PeerConnectionFactory) obj;
                qpcVar.f0.getClass();
                try {
                    if (qpcVar.H != null) {
                        qpcVar.w.log("PeerConnectionClient", qpcVar.toString().concat(": peer connection is already created"));
                    } else {
                        qpcVar.O = list;
                        qpcVar.o(peerConnectionFactory);
                        qpcVar.f0.getClass();
                        qpcVar.r.post(new dpc(qpcVar, 1));
                    }
                    return;
                } catch (Exception e2) {
                    qpcVar.I = true;
                    qpcVar.w.reportException("PeerConnectionClient", "pc.create", e2);
                    return;
                }
            case 3:
                szf szfVar = (szf) this.b;
                p8b p8bVar = (p8b) this.c;
                n11 n11VarA = szfVar.a((PeerConnectionFactory) obj);
                if (n11VarA.b) {
                    return;
                }
                ((sb9) n11VarA.c).d(p8bVar);
                return;
            case 4:
                y4k y4kVar = (y4k) obj;
                ((l5b[]) ((eth) this.b).a)[y4kVar.ordinal()] = new l5b(y4kVar, (hak) this.c);
                return;
            case 5:
                w4k w4kVar = (w4k) obj;
                ((hak) this.b).h[w4kVar.ordinal()] = new fak((Clock) this.c, w4kVar);
                return;
            case 6:
                hak hakVar = (hak) this.b;
                Instant instant = (Instant) this.c;
                rck rckVar = (rck) obj;
                eck eckVar = hakVar.k;
                pbk pbkVar = rckVar.a;
                Consumer consumer = rckVar.b;
                if (!eckVar.p && pbkVar.u()) {
                    ybk ybkVar = eckVar.e[pbkVar.o().ordinal()];
                    synchronized (ybkVar) {
                        try {
                            if (!ybkVar.k) {
                                if (pbkVar.u()) {
                                    y5k y5kVar = ybkVar.d;
                                    synchronized (y5kVar) {
                                        try {
                                            synchronized (y5kVar) {
                                                if (!pbkVar.t()) {
                                                    y5kVar.a += (long) pbkVar.q();
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                if (pbkVar.s()) {
                                    ybkVar.g.getAndAdd(1);
                                    ybkVar.j = instant;
                                }
                                ybkVar.f.put(pbkVar.p(), new zbk(instant, pbkVar, consumer));
                                break;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    eckVar.f(false);
                    eckVar.g();
                }
                y8k y8kVar = hakVar.l;
                pbk pbkVar2 = rckVar.a;
                if (y8kVar.h && pbkVar2.s() && y8kVar.i == 1) {
                    y8kVar.g = instant;
                    y8kVar.i = 2;
                    return;
                }
                return;
            case 7:
                ((qck[]) ((i46) this.b).b)[((y4k) this.c).a().ordinal()] = null;
                return;
            default:
                zdk zdkVar = (zdk) this.b;
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                Map.Entry entry = (Map.Entry) obj;
                Charset charset = zdk.b;
                h6f h6fVar = zdkVar.a;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Objects.requireNonNull(str);
                Objects.requireNonNull(str2);
                int i = -1;
                int i2 = 0;
                while (true) {
                    String[] strArr2 = (String[]) h6fVar.b;
                    strArr = (String[]) h6fVar.c;
                    if (i2 < strArr2.length) {
                        if (str.equals(strArr2[i2])) {
                            if (i < 0) {
                                i = i2;
                            }
                            if (str2.equals(strArr[i2])) {
                                i = i2;
                            }
                        }
                        i2++;
                    }
                }
                if (i < 0) {
                    byte[] bytes = ((String) entry.getKey()).getBytes(charset);
                    zdk.a(3, (byte) 32, bytes.length, byteBuffer);
                    byteBuffer.put(bytes);
                    byte[] bytes2 = ((String) entry.getValue()).getBytes(charset);
                    zdk.a(7, (byte) 0, bytes2.length, byteBuffer);
                    byteBuffer.put(bytes2);
                    return;
                }
                String[] strArr3 = (String[]) h6fVar.b;
                if (strArr3[i] == null) {
                    throw new dQ();
                }
                if (((String) new AbstractMap.SimpleImmutableEntry(strArr3[i], strArr[i]).getValue()).equals(entry.getValue())) {
                    zdk.a(6, (byte) -64, i, byteBuffer);
                    return;
                }
                String str3 = (String) entry.getValue();
                zdk.a(4, (byte) 80, i, byteBuffer);
                byte[] bytes3 = str3.getBytes(charset);
                zdk.a(7, (byte) 0, bytes3.length, byteBuffer);
                byteBuffer.put(bytes3);
                return;
        }
    }
}

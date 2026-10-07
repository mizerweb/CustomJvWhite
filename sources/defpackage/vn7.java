package defpackage;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.Rating;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Surface;
import android.view.Window;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.io.EOFException;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.KeyAgreement;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.mediaeditor.GifViewerWidget;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.g;
import one.video.calls.sdk_private.j;
import one.video.calls.sdk_private.n;
import one.video.calls.sdk_private.p;
import one.video.calls.sdk_private.q;
import one.video.calls.sdk_private.r;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class vn7 implements oca, rg4, t65, cj1, cv1, ha3, aa9, kg7, q5j, jg7, wsf {
    public static volatile vn7 c;
    public static vn7 d;
    public final /* synthetic */ int a;
    public Object b;

    public vn7(int i) {
        this.a = i;
        switch (i) {
            case 8:
                this.b = s66.a;
                break;
            case 14:
                this.b = (SmallDisplaySizeQuirk) uk5.a(SmallDisplaySizeQuirk.class);
                break;
            case 18:
                this.b = new nmc(10);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                this.b = new ConcurrentHashMap();
                break;
            case 21:
                this.b = new Bundle();
                break;
            case 24:
                break;
            case 29:
                this.b = new Object();
                new Handler(Looper.getMainLooper(), new acg(0, this));
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    @Override // defpackage.kg7
    public void a(Object obj) {
        switch (this.a) {
            case 15:
                break;
            case 22:
                ((mof) this.b).m(((bxa) obj).a);
                break;
            default:
                tvj.a("Recorder", "Encodings end successfully.");
                dee deeVar = (dee) this.b;
                deeVar.k(deeVar.V, deeVar.W);
                break;
        }
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        wy0 wy0Var = (wy0) obj;
        ih ihVar = (ih) this.b;
        ((CidLogger) ihVar.b).log("BitrateDumpGatheringConfigCacherImpl", "Got remote bitrate dump config, caching it " + wy0Var);
        ((xy0) ((ex8) ihVar.a).b).X("bitrate_config_key", wy0Var);
    }

    @Override // defpackage.aa9
    public void b() throws IOException {
        w15 w15Var = (w15) this.b;
        w15Var.A.b();
        IOException iOException = w15Var.C;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // defpackage.cj1
    public int c() {
        return ((CallGridLayoutManager) this.b).p.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // defpackage.cj1
    public int d() {
        return ((CallGridLayoutManager) this.b).p.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0202  */
    public p5k e(ByteBuffer byteBuffer, cr0 cr0Var, int i) throws g {
        w4k w4kVar;
        KeyAgreement keyAgreement;
        int i2;
        byte b = byteBuffer.get();
        int i3 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
        jfk jfkVar = jfk.client_hello;
        if (b == jfkVar.a) {
            o5k o5kVar = new o5k(byteBuffer, (atj) this.b);
            if (cr0Var == null) {
                return o5kVar;
            }
            throw new q("no client hello expected");
        }
        jfk jfkVar2 = jfk.server_hello;
        int i4 = 3;
        final int i5 = 1;
        if (b == jfkVar2.a) {
            s5k s5kVar = new s5k();
            s5kVar.d = Collections.EMPTY_LIST;
            int i6 = i3 + 4;
            if (byteBuffer.remaining() < 44) {
                p51.g("Message too short");
                return null;
            }
            byteBuffer.getInt();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            if (b2 != 3 || b3 != 3) {
                throw new n("Invalid version number (should be 0x0303)");
            }
            byte[] bArr = new byte[32];
            s5kVar.b = bArr;
            byteBuffer.get(bArr);
            Arrays.equals(s5kVar.b, s5k.e);
            int i7 = byteBuffer.get() & 255;
            if (i7 > 32) {
                p51.g("session id length exceeds 32");
                return null;
            }
            byteBuffer.get(new byte[i7]);
            Arrays.stream(hfk.values()).filter(new r4k(byteBuffer.getShort(), 2)).findFirst().ifPresent(new r5k(0, s5kVar));
            if (byteBuffer.get() != 0) {
                p51.g("Legacy compression method must have the value 0");
                return null;
            }
            s5kVar.d = p5k.c(byteBuffer, jfkVar2, null);
            s5kVar.a = new byte[i6];
            byteBuffer.get(s5kVar.a);
            if (cr0Var != null) {
                i05 i05Var = (i05) cr0Var;
                if (i05Var.m == 2) {
                    boolean zAnyMatch = s5kVar.d.stream().anyMatch(new e05(1));
                    boolean zAnyMatch2 = s5kVar.d.stream().anyMatch(new e05(3));
                    if (!zAnyMatch || !zAnyMatch2) {
                        throw new p();
                    }
                    if (((Short) s5kVar.d.stream().filter(new e05(4)).map(new f05(1)).findFirst().get()).shortValue() != 772) {
                        throw new n("invalid tls version");
                    }
                    if (s5kVar.d.stream().filter(new u6(2, i05Var)).anyMatch(new e05(5))) {
                        throw new n("illegal extension in server hello");
                    }
                    Optional optionalFindFirst = s5kVar.d.stream().filter(new e05(6)).findFirst();
                    Optional optionalEmpty = Optional.empty();
                    if (optionalFindFirst.isPresent()) {
                        optionalEmpty = Optional.of((skc) optionalFindFirst.filter(new e05(8)).map(new f05(2)).orElseThrow(new kn(2)));
                        if (((skc) optionalEmpty.get()).a != i05Var.i) {
                            throw new n("server supplied key share does not match client supported named group");
                        }
                    }
                    Optional optionalFindFirst2 = s5kVar.d.stream().filter(new e05(2)).findFirst();
                    if (!optionalEmpty.isPresent() && !optionalFindFirst2.isPresent()) {
                        throw new p(" either the pre_shared_key extension or the key_share extension must be present", gfk.missing_extension);
                    }
                    if (optionalFindFirst2.isPresent()) {
                        i05Var.v = true;
                    }
                    if (!i05Var.h.contains(s5kVar.c)) {
                        throw new n("cipher suite does not match");
                    }
                    hfk hfkVar = s5kVar.c;
                    i05Var.j = hfkVar;
                    if (((oj6) i05Var.c) == null) {
                        i05Var.o = new kr6(cr0.a(hfkVar));
                        kr6 kr6Var = i05Var.o;
                        int i8 = sx5.a[i05Var.j.ordinal()];
                        if (i8 == 1) {
                            i2 = 16;
                        } else if (i8 == 2 || i8 == 3) {
                            i2 = 32;
                        } else if (i8 == 4 || i8 == 5) {
                            i2 = 16;
                        } else {
                            hs4.b();
                            i2 = 0;
                        }
                        i05Var.c = new oj6(kr6Var, null, i2, cr0.a(i05Var.j));
                        i05Var.o.p(i05Var.n);
                        oj6 oj6Var = (oj6) i05Var.c;
                        kr6 kr6Var2 = oj6Var.r;
                        kr6Var2.getClass();
                        oj6Var.a(oj6Var.j, "c e traffic", kr6Var2.r(kr6.B(jfkVar)), oj6Var.e);
                        i05Var.f.getClass();
                    }
                    boolean zIsPresent = optionalFindFirst2.isPresent();
                    oj6 oj6Var2 = (oj6) i05Var.c;
                    if (zIsPresent) {
                        int i9 = ((kgh) optionalFindFirst2.get()).a;
                        oj6Var2.f = true;
                    } else if (oj6Var2.i != null && !oj6Var2.f) {
                        oj6Var2.b(new byte[oj6Var2.e]);
                    }
                    if (optionalEmpty.isPresent()) {
                        oj6 oj6Var3 = (oj6) i05Var.c;
                        oj6Var3.h = (PrivateKey) i05Var.b;
                        oj6Var3.g = ((skc) optionalEmpty.get()).a();
                        oj6 oj6Var4 = (oj6) i05Var.c;
                        oj6Var4.getClass();
                        try {
                            PublicKey publicKey = oj6Var4.g;
                            if (publicKey instanceof ECPublicKey) {
                                keyAgreement = KeyAgreement.getInstance("ECDH");
                            } else {
                                if (!jx5.x(publicKey)) {
                                    throw new RuntimeException("Unsupported key type");
                                }
                                keyAgreement = KeyAgreement.getInstance("XDH");
                            }
                            keyAgreement.init(oj6Var4.h);
                            keyAgreement.doPhase(oj6Var4.g, true);
                            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                            oj6Var4.s = bArrGenerateSecret;
                            t5k.a(bArrGenerateSecret);
                        } catch (InvalidKeyException e) {
                            e = e;
                            c.g(e, "Unsupported crypto: ");
                            return null;
                        } catch (NoSuchAlgorithmException e2) {
                            e = e2;
                            c.g(e, "Unsupported crypto: ");
                            return null;
                        }
                    }
                    i05Var.o.p(s5kVar);
                    oj6 oj6Var5 = (oj6) i05Var.c;
                    byte[] bArr2 = oj6Var5.j;
                    byte[] bArr3 = oj6Var5.c;
                    short s = oj6Var5.e;
                    byte[] bArrA = oj6Var5.a(bArr2, "derived", bArr3, s);
                    t5k.a(bArrA);
                    byte[] bArrC = oj6Var5.b.c(bArrA, oj6Var5.s);
                    oj6Var5.o = bArrC;
                    t5k.a(bArrC);
                    kr6 kr6Var3 = oj6Var5.r;
                    kr6Var3.getClass();
                    byte[] bArrR = kr6Var3.r(kr6.B(jfkVar2));
                    byte[] bArrA2 = oj6Var5.a(oj6Var5.o, "c hs traffic", bArrR, s);
                    oj6Var5.n = bArrA2;
                    t5k.a(bArrA2);
                    byte[] bArrA3 = oj6Var5.a(oj6Var5.o, "s hs traffic", bArrR, s);
                    oj6Var5.m = bArrA3;
                    t5k.a(bArrA3);
                    byte[] bArr4 = oj6Var5.n;
                    short s2 = oj6Var5.d;
                    Charset charset = oj6.u;
                    t5k.a(oj6Var5.a(bArr4, "key", "".getBytes(charset), s2));
                    t5k.a(oj6Var5.a(oj6Var5.m, "key", "".getBytes(charset), s2));
                    t5k.a(oj6Var5.a(oj6Var5.n, "iv", "".getBytes(charset), (short) 12));
                    t5k.a(oj6Var5.a(oj6Var5.m, "iv", "".getBytes(charset), (short) 12));
                    i05Var.m = 3;
                    z7k z7kVar = i05Var.f;
                    b5k b5kVar = z7kVar.e;
                    i05 i05Var2 = z7kVar.y;
                    hfk hfkVar2 = i05Var2.j;
                    if (hfkVar2 == null) {
                        ore.k("No (valid) server hello received yet");
                        return null;
                    }
                    synchronized (b5kVar) {
                        b5kVar.a = hfkVar2;
                        w4kVar = w4k.c;
                        b5kVar.b(w4kVar, hfkVar2, b5kVar.b.a);
                        oj6 oj6Var6 = (oj6) i05Var2.c;
                        if (oj6Var6 == null) {
                            throw new IllegalStateException("Traffic secret not yet available");
                        }
                        b5kVar.f[2].b(oj6Var6.n);
                        oj6 oj6Var7 = (oj6) i05Var2.c;
                        if (oj6Var7 == null) {
                            throw new IllegalStateException("Traffic secret not yet available");
                        }
                        b5kVar.g[2].b(oj6Var7.m);
                        if (b5kVar.h) {
                            b5kVar.c("HANDSHAKE_TRAFFIC_SECRET", w4kVar);
                        }
                    }
                    z7kVar.i = w4kVar;
                    synchronized (z7kVar.g) {
                        try {
                            if (qt4.D(z7kVar.f) >= qt4.D(2)) {
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                z7kVar.f = 2;
                                z7kVar.h.forEach(new w7k(z7kVar, 0));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    z7kVar.k.add(new x7k(z7kVar, 0));
                    return s5kVar;
                }
            }
            return s5kVar;
        }
        if (b == jfk.encrypted_extensions.a) {
            l1k l1kVar = new l1k(1);
            List list = Collections.EMPTY_LIST;
            l1kVar.c = list;
            List list2 = (List) list.stream().map(new f05(23)).collect(Collectors.toList());
            int iSum = list2.stream().mapToInt(new ao8(8)).sum();
            byte[] bArr5 = new byte[iSum + 6];
            l1kVar.b = bArr5;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr5);
            byteBufferWrap.putInt((iSum + 2) | 134217728);
            byteBufferWrap.putShort((short) iSum);
            list2.forEach(new bo8(byteBufferWrap, 3));
            int i10 = i3 + 4;
            atj atjVar = (atj) this.b;
            if (byteBuffer.remaining() < 6) {
                p51.g("Message too short");
                return null;
            }
            int iPosition = byteBuffer.position();
            int i11 = byteBuffer.getInt() & 16777215;
            if (byteBuffer.remaining() < i11 || i11 < 2) {
                p51.g("Incorrect message length");
                return null;
            }
            l1kVar.c = p5k.c(byteBuffer, jfkVar2, atjVar);
            l1kVar.b = new byte[i10];
            byteBuffer.get(l1kVar.b);
            if (cr0Var != null) {
                i05 i05Var3 = (i05) cr0Var;
                if (i != 2) {
                    throw new q("incorrect protection level");
                }
                if (i05Var3.m != 3) {
                    throw new q("unexpected encrypted extensions message");
                }
                final List list3 = (List) i05Var3.l.stream().map(new f05(4)).collect(Collectors.toList());
                if (!((List) l1kVar.c).stream().filter(new e05(10)).allMatch(new Predicate() { // from class: g05
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        int i12 = i5;
                        List list4 = list3;
                        switch (i12) {
                            case 0:
                                return list4.contains((mfk) obj);
                            default:
                                return list4.contains(((gab) obj).getClass());
                        }
                    }
                })) {
                    throw new r("extension response to missing request");
                }
                if (((Set) ((List) l1kVar.c).stream().map(new f05(5)).collect(Collectors.toSet())).size() != ((List) l1kVar.c).size()) {
                    throw new r("duplicate extensions not allowed");
                }
                i05Var3.o.p(l1kVar);
                i05Var3.m = i05Var3.v ? 7 : 4;
                z7k z7kVar2 = i05Var3.f;
                List<gab> list4 = (List) l1kVar.c;
                z7kVar2.getClass();
                for (gab gabVar : list4) {
                    if (gabVar instanceof pj9) {
                        z7kVar2.W = i4;
                    } else if (gabVar instanceof fbk) {
                        try {
                            c8k c8kVar = ((fbk) gabVar).d;
                            z7kVar2.g(c8kVar);
                            byte[] bArr6 = c8kVar.n;
                            if (bArr6 != null && c8kVar.a != null) {
                                s4k s4kVar = z7kVar2.G.e;
                                if (!Arrays.equals(s4kVar != null ? s4kVar.b : new byte[0], c8kVar.n)) {
                                    z7kVar2.e(10L, "initial_source_connection_id transport parameter does not match", 1);
                                } else if (Arrays.equals(z7kVar2.G.g, c8kVar.a)) {
                                    if (z7kVar2.d == 2) {
                                        h6f h6fVar = c8kVar.r;
                                        if (h6fVar == null || !((e8k) h6fVar.b).equals(z7kVar2.a.a)) {
                                            Objects.toString(z7kVar2.a);
                                            Objects.toString(h6fVar);
                                            z7kVar2.e(17L, "Chosen version does not match packet version", 1);
                                        } else {
                                            z7kVar2.d = i4;
                                            e8k e8kVar = z7kVar2.H;
                                            f8k f8kVar = z7kVar2.a;
                                            Objects.toString(e8kVar);
                                            Objects.toString(f8kVar);
                                        }
                                    }
                                    z7kVar2.M = c8kVar;
                                    if (z7kVar2.o == null) {
                                        z7kVar2.o = new mak(z7kVar2.M.c, z7kVar2.M.d, z7kVar2.M.e, z7kVar2.M.f, z7kVar2.c);
                                        z7kVar2.E.d = z7kVar2.o;
                                    } else {
                                        z7kVar2.o.b(z7kVar2.M);
                                    }
                                    b6k b6kVar = z7kVar2.G;
                                    int i12 = z7kVar2.M.m;
                                    b6kVar.getClass();
                                    b6kVar.h = Integer.min(i12, 6);
                                    z7kVar2.d(z7kVar2.F.b, z7kVar2.M.b);
                                    b6k b6kVar2 = z7kVar2.G;
                                    byte[] bArr7 = z7kVar2.M.q;
                                    ConcurrentHashMap concurrentHashMap = b6kVar2.e.a;
                                    z5k z5kVar = (z5k) concurrentHashMap.get(0);
                                    concurrentHashMap.put(0, new z5k(z5kVar.b, z5kVar.a, bArr7, z5kVar.c));
                                    boolean z = z7kVar2.V;
                                    c8k c8kVar2 = z7kVar2.M;
                                    if (z) {
                                        if (c8kVar2.o != null) {
                                            if (Arrays.equals(z7kVar2.G.i, z7kVar2.M.o)) {
                                            }
                                        }
                                        throw new bJ(9, "incorrect retry_source_connection_id transport parameter");
                                    }
                                    if (c8kVar2.o != null) {
                                        throw new bJ(9, "unexpected retry_source_connection_id transport parameter");
                                    }
                                    z7kVar2.n(z7kVar2.M);
                                } else {
                                    z7kVar2.e(10L, "original_destination_connection_id transport parameter does not match", 1);
                                }
                            } else if (bArr6 == null) {
                                z7kVar2.e(8L, "missing initial_source_connection_id transport parameter", 1);
                            } else {
                                z7kVar2.e(8L, "missing original_destination_connection_id transport parameter", 1);
                            }
                            i4 = 3;
                        } catch (bJ e3) {
                            throw new g("Invalid transport parameters", e3);
                        }
                    } else {
                        continue;
                    }
                }
            }
            return l1kVar;
        }
        jfk jfkVar3 = jfk.certificate;
        if (b == jfkVar3.a) {
            f1k f1kVar = new f1k();
            ArrayList arrayList = new ArrayList();
            f1kVar.c = arrayList;
            int iPosition2 = byteBuffer.position();
            int iA = f1kVar.a(byteBuffer, jfkVar3, 13);
            try {
                int i13 = byteBuffer.get() & 255;
                if (i13 > 0) {
                    byte[] bArr8 = new byte[i13];
                    f1kVar.a = bArr8;
                    byteBuffer.get(bArr8);
                } else {
                    f1kVar.a = new byte[0];
                }
                f1kVar.e(byteBuffer);
                f1kVar.d = new byte[iA + 4];
                byteBuffer.get(f1kVar.d);
                if (cr0Var == null) {
                    return f1kVar;
                }
                i05 i05Var4 = (i05) cr0Var;
                if (i != 2) {
                    throw new q("incorrect protection level");
                }
                int i14 = i05Var4.m;
                if (i14 != 5 && i14 != 4) {
                    throw new q("unexpected certificate message");
                }
                if (f1kVar.a.length > 0) {
                    throw new n("certificate request context should be zero length");
                }
                X509Certificate x509Certificate = f1kVar.b;
                if (x509Certificate == null) {
                    throw new n("missing certificate");
                }
                i05Var4.q = x509Certificate;
                i05Var4.r = arrayList;
                i05Var4.o.y(f1kVar);
                i05Var4.m = 6;
                return f1kVar;
            } catch (BufferUnderflowException unused) {
                p51.g("message underflow");
                return null;
            }
        }
        jfk jfkVar4 = jfk.certificate_request;
        if (b == jfkVar4.a) {
            l1k l1kVar2 = new l1k(0);
            int iPosition3 = byteBuffer.position();
            int iA2 = l1kVar2.a(byteBuffer, jfkVar4, 7);
            int i15 = byteBuffer.get();
            byte[] bArr9 = new byte[i15];
            if (i15 > 0) {
                byteBuffer.get(bArr9);
            }
            l1kVar2.c = p5k.c(byteBuffer, jfkVar4, null);
            if (byteBuffer.position() - (iPosition3 + 4) != iA2) {
                p51.g("inconsistent length");
                return null;
            }
            l1kVar2.b = new byte[iA2 + 4];
            byteBuffer.get(l1kVar2.b);
            if (cr0Var == null) {
                return l1kVar2;
            }
            i05 i05Var5 = (i05) cr0Var;
            if (i != 2) {
                throw new q("incorrect protection level");
            }
            if (i05Var5.m != 4) {
                throw new q("unexpected certificate request message");
            }
            i05Var5.z = (List) ((ArrayList) l1kVar2.c).stream().filter(new e05(11)).findFirst().map(new f05(6)).orElseThrow(new kn(4));
            i05Var5.o.p(l1kVar2);
            i05Var5.x = (List) ((ArrayList) l1kVar2.c).stream().filter(new e05(0)).findFirst().map(new f05(0)).orElse(Collections.EMPTY_LIST);
            i05Var5.w = true;
            i05Var5.m = 5;
            return l1kVar2;
        }
        jfk jfkVar5 = jfk.certificate_verify;
        if (b == jfkVar5.a) {
            m5k m5kVar = new m5k();
            int i16 = i3 + 4;
            int iPosition4 = byteBuffer.position();
            int iA3 = m5kVar.a(byteBuffer, jfkVar5, 9);
            try {
                m5kVar.a = (mfk) Arrays.stream(mfk.values()).filter(new r4k(byteBuffer.getShort(), 4)).findFirst().orElse(null);
                byte[] bArr10 = new byte[byteBuffer.getShort() & 65535];
                m5kVar.b = bArr10;
                byteBuffer.get(bArr10);
                if (byteBuffer.position() - iPosition4 != iA3 + 4) {
                    throw new j("Incorrect message length");
                }
                m5kVar.c = new byte[i16];
                byteBuffer.get(m5kVar.c);
                if (cr0Var != null) {
                    ((i05) cr0Var).i(m5kVar, i);
                }
                return m5kVar;
            } catch (BufferUnderflowException unused2) {
                p51.g("message underflow");
                return null;
            }
        }
        jfk jfkVar6 = jfk.finished;
        if (b == jfkVar6.a) {
            l1k l1kVar3 = new l1k(2);
            byte[] bArr11 = new byte[l1kVar3.a(byteBuffer, jfkVar6, 36)];
            l1kVar3.b = bArr11;
            byteBuffer.get(bArr11);
            byte[] bArr12 = new byte[i3 + 4];
            l1kVar3.c = bArr12;
            byteBuffer.get(bArr12);
            if (cr0Var != null) {
                ((i05) cr0Var).h(l1kVar3, i);
            }
            return l1kVar3;
        }
        jfk jfkVar7 = jfk.new_session_ticket;
        if (b != jfkVar7.a) {
            throw new g(c0a.k(b, "Invalid/unsupported message type (", ")"));
        }
        q5k q5kVar = new q5k();
        int iA4 = q5kVar.a(byteBuffer, jfkVar7, 17);
        int i17 = byteBuffer.getInt();
        q5kVar.d = i17;
        if (i17 > 604800 || i17 < 0) {
            throw new n("Invalid ticket lifetime");
        }
        q5kVar.a = ((long) byteBuffer.getInt()) & 4294967295L;
        int i18 = iA4 - 8;
        byte[] bArrE = q5k.e(byteBuffer, 1, i18, "ticket nonce");
        q5kVar.c = bArrE;
        q5kVar.b = q5k.e(byteBuffer, 2, i18 - (bArrE.length + 1), "ticket");
        for (gab gabVar2 : p5k.c(byteBuffer, jfkVar7, null)) {
            if (gabVar2 instanceof pj9) {
                if (q5kVar.e != null) {
                    p51.g("repeated extension is not allowed");
                    return null;
                }
                q5kVar.e = (pj9) gabVar2;
            }
        }
        if (cr0Var == null) {
            return q5kVar;
        }
        i05 i05Var6 = (i05) cr0Var;
        if (i != 3) {
            throw new q("incorrect protection level");
        }
        oj6 oj6Var8 = (oj6) i05Var6.c;
        oj6Var8.a(oj6Var8.l, "resumption", q5kVar.c, oj6Var8.e);
        mf mfVar = new mf(13);
        mfVar.c = new Date();
        mfVar.b = q5kVar.d;
        pj9 pj9Var = q5kVar.e;
        if (pj9Var != null) {
            pj9Var.a.getClass();
        }
        i05Var6.u.add(mfVar);
        z7k z7kVar3 = i05Var6.f;
        z7kVar3.getClass();
        List list5 = z7kVar3.O;
        c8k c8kVar3 = z7kVar3.M;
        yr8 yr8Var = new yr8(17);
        long j = c8kVar3.b;
        list5.add(yr8Var);
        return q5kVar;
    }

    @Override // defpackage.oca
    public void f(yba ybaVar, boolean z) {
        ((vr) this.b).s(ybaVar);
    }

    @Override // defpackage.cv1
    public PointF g() {
        PointF pointFG;
        ev1 ev1Var = (ev1) this.b;
        cv1 applicationPipDepended = ev1Var.getApplicationPipDepended();
        return (applicationPipDepended == null || (pointFG = applicationPipDepended.g()) == null) ? o7j.c(ev1Var.getContext()) : pointFG;
    }

    public void h(EventItemsMap eventItemsMap) {
        eventItemsMap.getClass();
        eventItemsMap.set("vcid", ((qs4) this.b).b);
    }

    public void i(StringBuilder sb, Iterator it) {
        ste steVar = (ste) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ste.b(entry.getKey()));
            sb.append("=");
            sb.append(ste.b(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) steVar.b);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ste.b(entry2.getKey()));
                sb.append("=");
                sb.append(ste.b(entry2.getValue()));
            }
        }
    }

    @Override // defpackage.q5j
    public boolean isDebugEnabled() {
        GifViewerWidget gifViewerWidget = (GifViewerWidget) this.b;
        return ((xb9) ((et3) gifViewerWidget.e.getValue())).g0() && ((Boolean) ((e5d) gifViewerWidget.d.getValue()).x().i()).booleanValue();
    }

    @Override // defpackage.wsf
    public void j(long j, boolean z) {
        Object value;
        xmd xmdVar;
        Object value2;
        xmd xmdVar2;
        Object value3;
        xmd xmdVar3;
        Object value4;
        xmd xmdVarA;
        Object value5;
        xmd xmdVar4;
        Object value6;
        xmd xmdVar5;
        Object value7;
        xmd xmdVar6;
        Object value8;
        xmd xmdVarA2;
        Object value9;
        xmd xmdVar7;
        Object value10;
        xmd xmdVar8;
        mjg mjgVar = ((ProfileEditAdminPermissionsWidget) ((lp0) this.b).g).p1().o;
        if (j == b6c.l) {
            do {
                value10 = mjgVar.getValue();
                xmdVar8 = (xmd) value10;
            } while (!mjgVar.h(value10, xmdVar8 != null ? xmd.a(xmdVar8, false, new wmd(z, xmdVar8.c.b), null, null, null, null, null, null, null, null, 8175) : null));
            return;
        }
        if (j == b6c.i) {
            do {
                value9 = mjgVar.getValue();
                xmdVar7 = (xmd) value9;
            } while (!mjgVar.h(value9, xmdVar7 != null ? xmd.a(xmdVar7, false, null, new wmd(z, xmdVar7.d.b), null, null, null, null, null, null, null, 8159) : null));
            return;
        }
        if (j == b6c.k) {
            do {
                value8 = mjgVar.getValue();
                xmd xmdVar9 = (xmd) value8;
                if (xmdVar9 != null) {
                    xmdVarA2 = xmd.a(xmdVar9, false, null, null, new wmd(z, xmdVar9.e.b), new wmd(!z ? false : xmdVar9.f.a, z), new wmd(!z ? false : xmdVar9.g.a, xmdVar9.a && z), null, null, null, null, 7743);
                } else {
                    xmdVarA2 = null;
                }
            } while (!mjgVar.h(value8, xmdVarA2));
            return;
        }
        if (j == b6c.f) {
            do {
                value7 = mjgVar.getValue();
                xmdVar6 = (xmd) value7;
            } while (!mjgVar.h(value7, xmdVar6 != null ? xmd.a(xmdVar6, false, null, null, null, new wmd(z, xmdVar6.f.b), null, null, null, null, null, 8063) : null));
            return;
        }
        if (j == b6c.j) {
            do {
                value6 = mjgVar.getValue();
                xmdVar5 = (xmd) value6;
            } while (!mjgVar.h(value6, xmdVar5 != null ? xmd.a(xmdVar5, false, null, null, null, null, new wmd(z, xmdVar5.g.b), null, null, null, null, 7935) : null));
            return;
        }
        if (j == b6c.d) {
            do {
                value5 = mjgVar.getValue();
                xmdVar4 = (xmd) value5;
            } while (!mjgVar.h(value5, xmdVar4 != null ? xmd.a(xmdVar4, false, null, null, null, null, null, new wmd(z, xmdVar4.h.b), null, null, null, 7679) : null));
            return;
        }
        if (j == b6c.h) {
            do {
                value4 = mjgVar.getValue();
                xmd xmdVar10 = (xmd) value4;
                if (xmdVar10 != null) {
                    xmdVarA = xmd.a(xmdVar10, !z ? false : xmdVar10.b, null, null, null, null, null, null, new wmd(z, xmdVar10.i.b), null, null, 7159);
                } else {
                    xmdVarA = null;
                }
            } while (!mjgVar.h(value4, xmdVarA));
            return;
        }
        if (j == b6c.e) {
            do {
                value3 = mjgVar.getValue();
                xmdVar3 = (xmd) value3;
            } while (!mjgVar.h(value3, xmdVar3 != null ? xmd.a(xmdVar3, false, null, null, null, null, null, null, null, new wmd(z, xmdVar3.j.b), null, 6143) : null));
        } else if (j == b6c.g) {
            do {
                value2 = mjgVar.getValue();
                xmdVar2 = (xmd) value2;
            } while (!mjgVar.h(value2, xmdVar2 != null ? xmd.a(xmdVar2, z, null, null, null, null, null, null, null, null, null, 8183) : null));
        } else if (j == b6c.m) {
            do {
                value = mjgVar.getValue();
                xmdVar = (xmd) value;
            } while (!mjgVar.h(value, xmdVar != null ? xmd.a(xmdVar, false, null, null, null, null, null, null, null, null, new wmd(z, xmdVar.k.b), 4095) : null));
        }
    }

    @Override // defpackage.q5j
    public int k() {
        rui ruiVar = ((GifViewerWidget) this.b).j;
        if (ruiVar != null) {
            return ruiVar.getHeight();
        }
        return 0;
    }

    public d0a l() {
        return new d0a((Bundle) this.b);
    }

    @Override // defpackage.oca
    public boolean m(yba ybaVar) {
        Window.Callback callback = ((vr) this.b).l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, ybaVar);
        return true;
    }

    @Override // defpackage.q5j
    public int n() {
        rui ruiVar = ((GifViewerWidget) this.b).j;
        if (ruiVar != null) {
            return ruiVar.getWidth();
        }
        return 0;
    }

    @Override // defpackage.cv1
    public void o(float f, float f2) {
        ev1 ev1Var = (ev1) this.b;
        cv1 applicationPipDepended = ev1Var.getApplicationPipDepended();
        if (applicationPipDepended != null) {
            applicationPipDepended.o(f, f2);
        }
        PointF pointF = ev1Var.e;
        pointF.x = f;
        pointF.y = f2;
    }

    @Override // defpackage.kg7
    public void onFailure(Throwable th) {
        switch (this.a) {
            case 15:
                boolean z = th instanceof MediaCodec.CodecException;
                m86 m86Var = (m86) ((zo7) this.b).b;
                if (!z) {
                    m86Var.b(0, th.getMessage(), th);
                } else {
                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                    m86Var.b(1, codecException.getMessage(), codecException);
                }
                break;
            case 22:
                ((mof) this.b).n(th);
                break;
            default:
                dee deeVar = (dee) this.b;
                qyj.l("In-progress recording shouldn't be null", deeVar.s != null);
                if (!deeVar.s.l) {
                    tvj.a("Recorder", "Encodings end with error: " + th);
                    deeVar.k(deeVar.E == null ? 8 : 6, th);
                }
                break;
        }
    }

    @Override // defpackage.q5j
    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        String str = ((GifViewerWidget) this.b).c;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Media editor. Gif viewer, surface destroyed " + surfaceTexture, null);
        }
    }

    public lwa p(kj6 kj6Var, b48 b48Var, int i) {
        int i2;
        nmc nmcVar = (nmc) this.b;
        int i3 = 0;
        lwa lwaVarE = null;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = i4 % 10;
                int i6 = i5 + 10;
                if (i5 == 0 && i4 != 0) {
                    byte[] bArr = nmcVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i7 = i4 == 0 ? 10 : 1;
                try {
                    kj6Var.u(i6 - i7, nmcVar.a, i7);
                    nmcVar.N(i5);
                    nmcVar.M(i6);
                    if (nmcVar.a() < 3) {
                        qr7.l("position=", nmcVar.b, ", limit=", nmcVar.c);
                        return null;
                    }
                    int iD = nmcVar.D();
                    i2 = nmcVar.b - 3;
                    nmcVar.b = i2;
                    if (iD == 4801587) {
                        break;
                    }
                    if (xjg.c(nmcVar.i()) == -1) {
                        if (i4 == 0) {
                            nmcVar.c(20);
                        }
                        i4++;
                        if (i4 > i) {
                        }
                    }
                    kj6Var.q();
                    kj6Var.z(i3);
                    return lwaVarE;
                } catch (EOFException unused) {
                }
            }
            nmcVar.O(6);
            int iZ = nmcVar.z();
            int i8 = iZ + 10;
            if (lwaVarE == null) {
                byte[] bArr2 = new byte[i8];
                System.arraycopy(nmcVar.a, i2, bArr2, 0, 10);
                kj6Var.u(10, bArr2, iZ);
                lwaVarE = new d48(b48Var).e(i8, bArr2);
            } else {
                kj6Var.z(iZ);
            }
            i3 += i8;
        }
    }

    public void q(String str, Bitmap bitmap) {
        Integer num = (Integer) d0a.d.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.b).putParcelable(str, bitmap);
        } else {
            ore.p(c0a.o("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    public void r(long j, String str) {
        Integer num = (Integer) d0a.d.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.b).putLong(str, j);
        } else {
            ore.p(c0a.o("The ", str, " key cannot be used to put a long"));
        }
    }

    @Override // defpackage.wsf
    public void s(long j) {
        ((ProfileEditAdminPermissionsWidget) ((lp0) this.b).g).p1().G(j, true);
    }

    @Override // defpackage.t65
    public Object t() {
        return new PipScreen((ha9) this.b);
    }

    public void u(String str, d5e d5eVar) {
        Object obj;
        Integer num = (Integer) d0a.d.get(str);
        if (num != null && num.intValue() != 3) {
            ore.p(c0a.o("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Bundle bundle = (Bundle) this.b;
        if (d5eVar.c == null) {
            boolean zF = d5eVar.f();
            int i = d5eVar.a;
            if (zF) {
                switch (i) {
                    case 1:
                        d5eVar.c = Rating.newHeartRating(d5eVar.e());
                        break;
                    case 2:
                        d5eVar.c = Rating.newThumbRating(d5eVar.g());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        d5eVar.c = Rating.newStarRating(i, d5eVar.d());
                        break;
                    case 6:
                        d5eVar.c = Rating.newPercentageRating(d5eVar.b());
                        break;
                    default:
                        obj = null;
                        break;
                }
            } else {
                d5eVar.c = Rating.newUnratedRating(i);
            }
            obj = d5eVar.c;
        } else {
            obj = d5eVar.c;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    @Override // defpackage.q5j
    public int v() {
        return 2;
    }

    public void w(String str, String str2) {
        Integer num = (Integer) d0a.d.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, str2);
        } else {
            ore.p(c0a.o("The ", str, " key cannot be used to put a String"));
        }
    }

    @Override // defpackage.q5j
    public void x(Surface surface, uvi uviVar) {
        String str = ((GifViewerWidget) this.b).c;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Media editor. Gif viewer, set surface " + surface, null);
            }
        }
        e3j e3jVarV1 = ((GifViewerWidget) this.b).v1();
        if (e3jVarV1 != null) {
            e3jVarV1.H(surface);
            e3jVarV1.C(uviVar);
        }
    }

    public void y(String str, CharSequence charSequence) {
        Integer num = (Integer) d0a.d.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.b).putCharSequence(str, charSequence);
        } else {
            ore.p(c0a.o("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    public yt1 z(int i) {
        x52 x52Var = (x52) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (x52Var != null) {
            return x52Var.b;
        }
        return null;
    }

    public /* synthetic */ vn7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}

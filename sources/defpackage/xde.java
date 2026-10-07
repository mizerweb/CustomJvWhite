package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.camera.core.ProcessingException;
import androidx.camera.video.internal.encoder.EncodeException;
import com.vk.push.common.Logger;
import com.vk.push.common.clientid.ClientId;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Inflater;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import one.video.upload.exceptions.TlsBufferOverflowException;
import one.video.upload.exceptions.TlsBufferUnderflowException;
import one.video.upload.exceptions.TlsConnectionClosedException;
import one.video.upload.exceptions.TlsHandshakeEndOfStreamException;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes4.dex */
public class xde implements w76, d9h, rmi, i9j, d8h {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public xde(List list) {
        int i;
        this.a = 17;
        this.b = new nmc();
        this.c = new nmc();
        uaj uajVar = new uaj();
        this.d = uajVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = vqi.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                uajVar.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = uajVar.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e) {
                        lvb.H0("VobsubParser", "Parsing color failed", e);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    lvb.G0("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        uajVar.e = Integer.parseInt(strArrSplit2[0]);
                        uajVar.f = Integer.parseInt(strArrSplit2[1]);
                        uajVar.b = true;
                    } catch (RuntimeException e2) {
                        lvb.H0("VobsubParser", "Parsing IDX failed", e2);
                    }
                }
            }
        }
    }

    public static String v(String str) {
        try {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[np0.r];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i <= 0) {
                        String str2 = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                        fileInputStream.close();
                        return str2;
                    }
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
            return e.toString();
        }
    }

    public Set A() {
        return c76.a;
    }

    public boolean B() {
        ArrayList arrayList = (ArrayList) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((h2i) arrayList.get(i)).b == -1) {
                return false;
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            h2i h2iVar = (h2i) arrayList.get(i2);
            if (h2iVar.b != h2iVar.a.size()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x007f */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        r5 = defpackage.qt4.v("Error when loading library: ", r5, ", library hash is ");
        r5.append(v(r7));
        r5.append(", LD_LIBRARY_PATH is ");
        r5.append(r6);
        android.util.Log.e("SoFileLoaderImpl", r5.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "nativeLoad() returned error for "
            java.lang.Object r1 = r5.c
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto Lc
            java.lang.System.load(r7)
            return
        Lc:
            r1 = 4
            r6 = r6 & r1
            if (r6 != r1) goto L15
            java.lang.Object r6 = r5.d
        L12:
            java.lang.String r6 = (java.lang.String) r6
            goto L18
        L15:
            java.lang.Object r6 = r5.e
            goto L12
        L18:
            r1 = 0
            java.lang.Object r2 = r5.b     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L81
            java.lang.Runtime r2 = (java.lang.Runtime) r2     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L81
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L81
            java.lang.Object r3 = r5.c     // Catch: java.lang.Throwable -> L7b
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L7b
            java.lang.Runtime r5 = (java.lang.Runtime) r5     // Catch: java.lang.Throwable -> L7b
            java.lang.Class<com.facebook.soloader.SoLoader> r4 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r6}     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L79
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L79
            if (r5 != 0) goto L5f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L5b
            java.lang.String r0 = "SoFileLoaderImpl"
            java.lang.String r1 = "Error when loading library: "
            java.lang.String r2 = ", library hash is "
            java.lang.StringBuilder r5 = defpackage.qt4.v(r1, r5, r2)
            java.lang.String r7 = v(r7)
            r5.append(r7)
            java.lang.String r7 = ", LD_LIBRARY_PATH is "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
        L5b:
            return
        L5c:
            r0 = move-exception
            r1 = r5
            goto L7d
        L5f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch: java.lang.Throwable -> L5c
            r1.append(r5)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5c
            qcg r5 = new qcg     // Catch: java.lang.Throwable -> L79
            r5.<init>(r7, r1)     // Catch: java.lang.Throwable -> L79
            throw r5     // Catch: java.lang.Throwable -> L79
        L79:
            r0 = move-exception
            goto L7d
        L7b:
            r5 = move-exception
            r0 = r5
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r0     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L81 java.lang.Throwable -> L81 java.lang.Throwable -> L81
        L7f:
            r5 = move-exception
            goto La0
        L81:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r5.<init>()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = "nativeLoad() error during invocation for "
            r5.append(r0)     // Catch: java.lang.Throwable -> L7f
            r5.append(r7)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = ": "
            r5.append(r0)     // Catch: java.lang.Throwable -> L7f
            r5.append(r1)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L7f
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L7f
            throw r5     // Catch: java.lang.Throwable -> L7f
        La0:
            if (r1 == 0) goto Lc2
            java.lang.String r0 = "SoFileLoaderImpl"
            java.lang.String r2 = "Error when loading library: "
            java.lang.String r3 = ", library hash is "
            java.lang.StringBuilder r1 = defpackage.qt4.v(r2, r1, r3)
            java.lang.String r7 = v(r7)
            r1.append(r7)
            java.lang.String r7 = ", LD_LIBRARY_PATH is "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            android.util.Log.e(r0, r6)
        Lc2:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xde.C(int, java.lang.String):void");
    }

    public void D(z8g z8gVar) throws Throwable {
        Object objC = ((p41) this.d).c(z8gVar);
        if (objC instanceof bs2) {
            Throwable thA = ds2.a(objC);
            if (thA != null) {
                throw thA;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objC instanceof cs2) {
            ore.k("Check failed.");
        } else if (((AtomicInteger) this.e).getAndIncrement() == 0) {
            yab.i0((gu4) this.b, null, 0, new ryf(this, null, 1), 3);
        }
    }

    public boolean E(q8 q8Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(p(q8Var), new gca((Context) this.c, (zah) menuItem));
    }

    @Override // defpackage.d8h
    public int F() {
        return 2;
    }

    public boolean G(q8 q8Var, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        vah vahVarP = p(q8Var);
        h6g h6gVar = (h6g) this.e;
        Menu scaVar = (Menu) h6gVar.get(menu);
        if (scaVar == null) {
            scaVar = new sca((Context) this.c, (yba) menu);
            h6gVar.put(menu, scaVar);
        }
        return callback.onCreateActionMode(vahVarP, scaVar);
    }

    public void H(long j) {
        ((AtomicReference) this.e).updateAndGet(new wua(j, 1));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0157  */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    public void I(JSONObject jSONObject) throws JSONException {
        j28 j28VarR;
        xmf xmfVarR;
        yt1 yt1Var;
        ysj ysjVar;
        ysj ysjVar2;
        q4g q4gVar;
        dc9 dc9Var = (dc9) this.c;
        dc9Var.getClass();
        try {
            j28VarR = dc9Var.r(jSONObject);
        } catch (JSONException e) {
            ((CidLogger) dc9Var.b).logException("RoomPartsUpdateParser", "Room participants update parse error", e);
            j28VarR = null;
        }
        if (j28VarR == null) {
            return;
        }
        i12 i12Var = (i12) this.e;
        ih ihVar = i12Var.g;
        p81 p81Var = (p81) ihVar.b;
        xq1 xq1Var = i12Var.e;
        fik fikVar = i12Var.c;
        int i = j28VarR.b;
        List list = (List) j28VarR.d;
        ru1 ru1Var = i12Var.b;
        boolean zJ1 = ww3.j1(list, ru1Var.a.a);
        List list2 = (List) j28VarR.f;
        dnf dnfVar = (dnf) j28VarR.c;
        ru1Var.o(dnfVar, list2);
        uvc uvcVar = (uvc) j28VarR.e;
        if (uvcVar != null) {
            ru1Var.h(dnfVar, (List) uvcVar.b);
            for (au1 au1Var : (List) uvcVar.c) {
                vmc vmcVar = xq1Var.n;
                yt1 yt1Var2 = au1Var.b;
                yt1Var2.getClass();
                vmcVar.onStateChanged(yt1Var2, au1Var);
            }
        }
        boolean z = dnfVar instanceof cnf;
        if (z) {
            fikVar.d(new x70((cnf) dnfVar, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(Integer.valueOf(i)), new xr8(), new xr8(), true));
        }
        if (zJ1 && !dnfVar.equals(ru1Var.k)) {
            if (!cqk.d(ru1Var.k, dnfVar)) {
                ru1Var.p(dnfVar);
                xq1Var.f.onCurrentParticipantActiveRoomChanged(new d12(dnfVar, z ? fikVar.r((cnf) dnfVar) : null));
            }
            if (!ru1Var.a.b()) {
                ysj ysjVar3 = new ysj(i12Var, 9);
                ysj ysjVar4 = new ysj(i12Var, 10);
                q4g q4gVar2 = p81Var.b.k;
                if (q4gVar2 == null) {
                    ysjVar4.invoke(new IllegalStateException("Signaling is not ready or released"));
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("command", "get-rooms");
                    q4gVar2.l(jSONObject2, new x81(ihVar, ysjVar4, ysjVar3, 2), new mb(ihVar, ysjVar4, 4));
                }
            } else if (z) {
                ysjVar = new ysj(i12Var, 9);
                ysjVar2 = new ysj(i12Var, 10);
                q4gVar = p81Var.b.k;
                if (q4gVar == null) {
                    ysjVar2.invoke(new IllegalStateException("Signaling is not ready or released"));
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("command", "get-rooms");
                    q4gVar.l(jSONObject3, new x81(ihVar, ysjVar2, ysjVar, 2), new mb(ihVar, ysjVar2, 4));
                }
            }
        } else if (z && (xmfVarR = fikVar.r((cnf) dnfVar)) != null && (yt1Var = xmfVarR.f) != null && !ru1Var.d(ru1Var.k).keySet().contains(yt1Var)) {
            ysjVar = new ysj(i12Var, 9);
            ysjVar2 = new ysj(i12Var, 10);
            q4gVar = p81Var.b.k;
            if (q4gVar == null) {
                ysjVar2.invoke(new IllegalStateException("Signaling is not ready or released"));
            } else {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("command", "get-rooms");
                q4gVar.l(jSONObject4, new x81(ihVar, ysjVar2, ysjVar, 2), new mb(ihVar, ysjVar2, 4));
            }
        }
        int size = ru1Var.d(ru1Var.k).keySet().size() + 1;
        if (dnfVar.equals(ru1Var.k) && i != size && !list.isEmpty()) {
            i12Var.a(dnfVar);
        }
        if (z) {
            fikVar.d(new x70((cnf) dnfVar, new xr8(), new xr8(), new xr8(), new xr8(), new xr8(), new due(Integer.valueOf(i)), new xr8(), new xr8(), true));
        }
    }

    public void J(JSONObject jSONObject) {
        gnf gnfVarR;
        g85 g85Var = (g85) this.b;
        g85Var.getClass();
        try {
            gnfVarR = g85Var.r(jSONObject);
        } catch (JSONException e) {
            ((CidLogger) g85Var.a).logException("SessionRoomParser", "Can't parse room update notification", e);
            gnfVarR = null;
        }
        if (gnfVarR == null) {
            return;
        }
        ((i12) this.e).e(gnfVarR);
    }

    public void K(JSONObject jSONObject) {
        vn7 vn7VarV;
        g85 g85Var = (g85) this.b;
        g85Var.getClass();
        try {
            vn7VarV = g85Var.v(jSONObject);
        } catch (JSONException e) {
            ((CidLogger) g85Var.a).logException("SessionRoomParser", "Can't parse rooms update notification", e);
            vn7VarV = null;
        }
        if (vn7VarV == null) {
            return;
        }
        i12 i12Var = (i12) this.e;
        Iterator it = ((ArrayList) vn7VarV.b).iterator();
        while (it.hasNext()) {
            i12Var.e((gnf) it.next());
        }
    }

    public void L(xyc xycVar) {
        ((AtomicReference) this.e).updateAndGet(new ea1(7, xycVar));
    }

    public xyc M(long j) {
        return null;
    }

    public void N() {
        final int i;
        agi agiVar = (agi) this.b;
        i1m i1mVar = agiVar.e;
        SSLEngine sSLEngine = (SSLEngine) this.e;
        mf mfVar = (mf) this.d;
        xde xdeVar = (xde) this.c;
        int i2 = 0;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        while (true) {
            SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine.getHandshakeStatus();
            mfVar.b("TLSHandshakeHelper", new bpg(6, handshakeStatus));
            int i3 = handshakeStatus == null ? -1 : mgh.$EnumSwitchMapping$1[handshakeStatus.ordinal()];
            final int i4 = 1;
            if (i3 == 1) {
                agiVar.A();
                return;
            }
            if (i3 == 2) {
                i = i2;
                for (Runnable delegatedTask = sSLEngine.getDelegatedTask(); delegatedTask != null; delegatedTask = sSLEngine.getDelegatedTask()) {
                    delegatedTask.run();
                }
            } else if (i3 == 3) {
                xdeVar.x().clear();
                final SSLEngineResult sSLEngineResultWrap = sSLEngine.wrap(byteBufferAllocate, xdeVar.x());
                i = 0;
                mfVar.b("TLSHandshakeHelper", new af7() { // from class: lgh
                    @Override // defpackage.af7
                    public final Object invoke() {
                        int i5 = i;
                        SSLEngineResult sSLEngineResult = sSLEngineResultWrap;
                        switch (i5) {
                            case 0:
                                return "wrap result:\n" + sSLEngineResult + "\n-";
                            default:
                                return "unwrap result:\n" + sSLEngineResult + "\n-";
                        }
                    }
                });
                SSLEngineResult.Status status = sSLEngineResultWrap.getStatus();
                int i5 = status == null ? -1 : mgh.$EnumSwitchMapping$0[status.ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        throw new TlsConnectionClosedException("SSLEngine.wrap error while handshake. Connection closed. " + sSLEngineResultWrap, null, 2, null);
                    }
                    if (i5 == 3) {
                        throw new TlsBufferOverflowException("SSLEngine.wrap error while handshake. " + sSLEngineResultWrap, null, 2, null);
                    }
                    if (i5 == 4) {
                        throw new TlsBufferUnderflowException("SSLEngine.wrap error while handshake. " + sSLEngineResultWrap, null, 2, null);
                    }
                    ore.o();
                    return;
                }
                xdeVar.x().flip();
                while (xdeVar.x().hasRemaining()) {
                    mfVar.b("TLSHandshakeHelper", new dt0(((SocketChannel) i1mVar.a).write(xdeVar.x()), 2));
                }
            } else {
                if (i3 != 4) {
                    if (i3 == 5) {
                        return;
                    }
                    ore.o();
                    return;
                }
                int i6 = ((SocketChannel) i1mVar.a).read(xdeVar.w());
                if (i6 == -1) {
                    throw new TlsHandshakeEndOfStreamException("Unexpected end of stream while handshaking");
                }
                mfVar.b("TLSHandshakeHelper", new dt0(i6, 3));
                xdeVar.w().flip();
                mfVar.b("TLSHandshakeHelper", new bpg(7, this));
                xdeVar.q().clear();
                final SSLEngineResult sSLEngineResultUnwrap = sSLEngine.unwrap(xdeVar.w(), xdeVar.q());
                mfVar.b("TLSHandshakeHelper", new af7() { // from class: lgh
                    @Override // defpackage.af7
                    public final Object invoke() {
                        int i7 = i4;
                        SSLEngineResult sSLEngineResult = sSLEngineResultUnwrap;
                        switch (i7) {
                            case 0:
                                return "wrap result:\n" + sSLEngineResult + "\n-";
                            default:
                                return "unwrap result:\n" + sSLEngineResult + "\n-";
                        }
                    }
                });
                xdeVar.w().compact();
                SSLEngineResult.Status status2 = sSLEngineResultUnwrap.getStatus();
                int i7 = status2 != null ? mgh.$EnumSwitchMapping$0[status2.ordinal()] : -1;
                if (i7 != 1) {
                    if (i7 == 2) {
                        throw new TlsConnectionClosedException("SSLEngine.unwrap error. Connection closed. " + sSLEngineResultUnwrap, null, 2, null);
                    }
                    if (i7 == 3) {
                        throw new TlsBufferOverflowException("SSLEngine.unwrap error. " + sSLEngineResultUnwrap, null, 2, null);
                    }
                    if (i7 == 4) {
                        agiVar.y();
                        return;
                    } else {
                        ore.o();
                        return;
                    }
                }
                i2 = 0;
            }
            i2 = i;
        }
    }

    public void O(int i, tye tyeVar) {
        SparseArray sparseArray = (SparseArray) this.c;
        lvb.Z("Exactly one SampleExporter can be added for each track type.", !vqi.l(sparseArray, i));
        sparseArray.put(i, tyeVar);
    }

    public void P() {
        ((dch) this.b).release();
        wxl.d(new f4g(7, this));
    }

    public void Q(CharSequence charSequence) {
        ((Intent) this.c).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public void R() {
        ((Context) this.b).startActivity(Intent.createChooser(t(), (String) this.d));
    }

    public p8h S(vg4 vg4Var, String str) {
        String strR = vg4Var.r();
        ArrayList arrayList = new ArrayList(1);
        fi4 fi4VarP = vg4Var.p();
        String strA = fi4VarP != null ? fi4VarP.a() : null;
        if (strA != null) {
            arrayList.add(strA);
        }
        return ((cmf) this.c).k(vg4Var.v(), arrayList, strR, str, vg4Var.A(((zed) this.d).a.k()));
    }

    public aw5 T(bj0 bj0Var) {
        Rect rectI;
        dch dchVar = (dch) this.b;
        wxl.a();
        String strO = c0a.o("[", (String) this.e, "] ");
        StringBuilder sb = new StringBuilder();
        sb.append(strO);
        sb.append("SurfaceProcessorNode Transform (Processor=");
        sb.append(dchVar);
        sb.append("\n   inputEdge = ");
        zbh zbhVar = bj0Var.a;
        List list = bj0Var.b;
        sb.append(zbhVar);
        tvj.a("SurfaceProcessorNode", sb.toString());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tvj.a("SurfaceProcessorNode", "   outputConfig = " + ((ei0) it.next()));
        }
        this.d = new aw5();
        for (Iterator it2 = list.iterator(); it2.hasNext(); it2 = it2) {
            ei0 ei0Var = (ei0) it2.next();
            aw5 aw5Var = (aw5) this.d;
            Rect rect = ei0Var.d;
            int i = ei0Var.f;
            boolean z = ei0Var.g;
            Matrix matrix = zbhVar.b;
            Rect rect2 = zbhVar.d;
            Matrix matrix2 = new Matrix(matrix);
            RectF rectF = new RectF(rect);
            Size size = ei0Var.e;
            Matrix matrixA = y1i.a(rectF, y1i.j(size), i, z);
            matrix2.postConcat(matrixA);
            qyj.i(y1i.d(y1i.h(i, y1i.f(rect)), false, size));
            if (ei0Var.h) {
                qyj.h("Output crop rect " + rect + " must contain input crop rect " + rect2, rect.contains(rect2));
                rectI = new Rect();
                RectF rectF2 = new RectF(rect2);
                matrixA.mapRect(rectF2);
                rectF2.round(rectI);
            } else {
                rectI = y1i.i(size);
            }
            Rect rect3 = rectI;
            tw5 tw5VarB = zbhVar.g.b();
            tw5VarB.a = size;
            aw5Var.put(ei0Var, new zbh(ei0Var.b, ei0Var.c, tw5VarB.j(), matrix2, false, rect3, zbhVar.i - i, -1, zbhVar.e != z));
        }
        try {
            dchVar.e(zbhVar.d((pf2) this.c, true));
        } catch (ProcessingException e) {
            tvj.d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
        for (Map.Entry entry : ((aw5) this.d).entrySet()) {
            o(zbhVar, entry);
            ((zbh) entry.getValue()).a(new alg(this, zbhVar, entry, 1));
        }
        mx1 mx1Var = new mx1(3, (aw5) this.d);
        zbhVar.getClass();
        zbhVar.o.add(mx1Var);
        return (aw5) this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object a(nq4 nq4Var) {
        w8h w8hVar;
        if (nq4Var instanceof w8h) {
            w8hVar = (w8h) nq4Var;
            int i = w8hVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8hVar.f = i - Integer.MIN_VALUE;
            } else {
                w8hVar = new w8h(this, nq4Var);
            }
        } else {
            w8hVar = new w8h(this, nq4Var);
        }
        Object objO = w8hVar.d;
        int i2 = w8hVar.f;
        if (i2 == 0) {
            ch3.d0(objO);
            v8h v8hVar = (v8h) this.e;
            w8hVar.f = 1;
            objO = v8hVar.o(w8hVar);
            hu4 hu4Var = hu4.a;
            if (objO == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objO);
        }
        return yhf.w0(yhf.m0(new m2i(yhf.m0(new sw(1, (List) objO), new chf(this, 29)), new t8h(this, 0)), new u8h(0)));
    }

    @Override // defpackage.w76
    public void b() {
        ((r72) this.b).b(null);
    }

    @Override // defpackage.w76
    public void c(n76 n76Var) throws Exception {
        qi0 qi0Var = (qi0) this.d;
        dee deeVar = (dee) this.e;
        if (deeVar.m0 == 3) {
            n76Var.close();
            c.e("Audio is not enabled but audio encoded data is being produced.");
            return;
        }
        if (deeVar.E != null) {
            try {
                deeVar.Q(n76Var, qi0Var);
                n76Var.close();
                return;
            } catch (Throwable th) {
                try {
                    n76Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (deeVar.t) {
            tvj.a("Recorder", "Drop audio data since recording is stopping.");
        } else {
            deeVar.Y.e(new p31(n76Var));
            if (deeVar.X != null) {
                tvj.a("Recorder", "Received audio data. Starting muxer...");
                deeVar.J(qi0Var);
            } else {
                tvj.a("Recorder", "Cached audio data while we wait for video keyframe before starting muxer.");
            }
        }
        n76Var.close();
    }

    @Override // defpackage.i9j
    public int d(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.c;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        qr7.m(zo5.y(i, "requested global type ", " does not belong to the adapter:"), ((ybb) this.d).c);
        return 0;
    }

    @Override // defpackage.i9j
    public void dispose() {
        mf mfVar = (mf) this.e;
        ybb ybbVar = (ybb) this.d;
        SparseArray sparseArray = (SparseArray) mfVar.c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((ybb) sparseArray.valueAt(size)) == ybbVar) {
                sparseArray.removeAt(size);
            }
        }
    }

    @Override // defpackage.i9j
    public int e(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey > -1) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        mf mfVar = (mf) this.e;
        ybb ybbVar = (ybb) this.d;
        int i2 = mfVar.b;
        mfVar.b = i2 + 1;
        ((SparseArray) mfVar.c).put(i2, ybbVar);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.c).put(i2, i);
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object f(LinkedHashSet linkedHashSet, nq4 nq4Var) {
        x8h x8hVar;
        if (nq4Var instanceof x8h) {
            x8hVar = (x8h) nq4Var;
            int i = x8hVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8hVar.g = i - Integer.MIN_VALUE;
            } else {
                x8hVar = new x8h(this, nq4Var);
            }
        } else {
            x8hVar = new x8h(this, nq4Var);
        }
        Object objO = x8hVar.e;
        int i2 = x8hVar.g;
        if (i2 == 0) {
            ch3.d0(objO);
            v8h v8hVar = (v8h) this.e;
            x8hVar.d = linkedHashSet;
            x8hVar.g = 1;
            objO = v8hVar.o(x8hVar);
            hu4 hu4Var = hu4.a;
            if (objO == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = x8hVar.d;
            ch3.d0(objO);
        }
        return yhf.w0(new m2i(yhf.m0(new sw(1, (List) objO), new r8d(linkedHashSet, this)), new t8h(this, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.d9h
    public Object g(final String str, nq4 nq4Var) {
        y8h y8hVar;
        if (nq4Var instanceof y8h) {
            y8hVar = (y8h) nq4Var;
            int i = y8hVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8hVar.g = i - Integer.MIN_VALUE;
            } else {
                y8hVar = new y8h(this, nq4Var);
            }
        } else {
            y8hVar = new y8h(this, nq4Var);
        }
        Object objO = y8hVar.e;
        int i2 = y8hVar.g;
        final int i3 = 1;
        if (i2 == 0) {
            ch3.d0(objO);
            v8h v8hVar = (v8h) this.e;
            y8hVar.d = str;
            y8hVar.g = 1;
            objO = v8hVar.o(y8hVar);
            hu4 hu4Var = hu4.a;
            if (objO == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = y8hVar.d;
            ch3.d0(objO);
        }
        final int i4 = 0;
        qu6 qu6VarS0 = yhf.s0(new m2i(yhf.m0(yhf.m0(new sw(1, (List) objO), new chf(this, 27)), new cf7(this) { // from class: s8h
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i5 = i4;
                String str2 = str;
                xde xdeVar = this.b;
                vg4 vg4Var = (vg4) obj;
                switch (i5) {
                    case 0:
                        return Boolean.valueOf(((daf) xdeVar.b).f(vg4Var, str2));
                    case 1:
                        return ((daf) xdeVar.b).b(vg4Var, str2);
                    default:
                        return xdeVar.S(vg4Var, str2);
                }
            }
        }), new cf7(this) { // from class: s8h
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i5 = i3;
                String str2 = str;
                xde xdeVar = this.b;
                vg4 vg4Var = (vg4) obj;
                switch (i5) {
                    case 0:
                        return Boolean.valueOf(((daf) xdeVar.b).f(vg4Var, str2));
                    case 1:
                        return ((daf) xdeVar.b).b(vg4Var, str2);
                    default:
                        return xdeVar.S(vg4Var, str2);
                }
            }
        }), new chf(28));
        final int i5 = 2;
        return yhf.w0(new m2i(qu6VarS0, new cf7(this) { // from class: s8h
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.cf7
            public final Object invoke(Object obj) {
                int i6 = i5;
                String str2 = str;
                xde xdeVar = this.b;
                vg4 vg4Var = (vg4) obj;
                switch (i6) {
                    case 0:
                        return Boolean.valueOf(((daf) xdeVar.b).f(vg4Var, str2));
                    case 1:
                        return ((daf) xdeVar.b).b(vg4Var, str2);
                    default:
                        return xdeVar.S(vg4Var, str2);
                }
            }
        }));
    }

    @Override // defpackage.w76
    public void i(EncodeException encodeException) {
        if (((dee) this.e).Z == null) {
            ((ro7) this.c).accept(encodeException);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(nq4 nq4Var) {
        g9k g9kVar;
        if (nq4Var instanceof g9k) {
            g9kVar = (g9k) nq4Var;
            int i = g9kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9kVar.f = i - Integer.MIN_VALUE;
            } else {
                g9kVar = new g9k(this, nq4Var);
            }
        } else {
            g9kVar = new g9k(this, nq4Var);
        }
        Object objK0 = g9kVar.d;
        int i2 = g9kVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            lb5 lb5Var = (lb5) this.e;
            q7k q7kVar = new q7k(this, null, 1);
            g9kVar.f = 1;
            objK0 = yab.K0(lb5Var, q7kVar, g9kVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((m4k) objK0).a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:84:0x024c  */
    @Override // defpackage.d8h
    public void k(byte[] bArr, int i, int i2, c8h c8hVar, qg4 qg4Var) {
        yy4 yy4Var;
        ghe gheVarR;
        boolean z;
        Rect rect;
        nmc nmcVar = (nmc) this.b;
        nmcVar.L(i + i2, bArr);
        nmcVar.N(i);
        nmc nmcVar2 = (nmc) this.c;
        uaj uajVar = (uaj) this.d;
        if (((Inflater) this.e) == null) {
            this.e = new Inflater();
        }
        if (vqi.V(nmcVar, nmcVar2, (Inflater) this.e)) {
            nmcVar.L(nmcVar2.c, nmcVar2.a);
        }
        uajVar.c = false;
        uajVar.g = null;
        uajVar.h = -1;
        uajVar.i = -1;
        int iA = nmcVar.a();
        if (iA < 2 || nmcVar.H() != iA) {
            yy4Var = null;
        } else {
            if (uajVar.d == null) {
                lvb.G0("VobsubParser", "Skipping SPU (no palette)");
            } else if (uajVar.b) {
                int i3 = nmcVar.b - 2;
                nmcVar.N(nmcVar.H() + i3);
                do {
                    int i4 = 4;
                    if (nmcVar.a() < 4) {
                        z = false;
                    } else {
                        int i5 = nmcVar.b;
                        nmcVar.O(2);
                        int iH = nmcVar.H() + i3;
                        z = iH != i5 && iH < nmcVar.c;
                        int i6 = z ? iH : nmcVar.c;
                        boolean z2 = true;
                        while (nmcVar.b < i6 && z2) {
                            int[] iArr = uajVar.a;
                            int iA2 = nmcVar.A();
                            if (iA2 != 255) {
                                switch (iA2) {
                                    case 0:
                                    case 1:
                                    case 2:
                                        z2 = true;
                                        break;
                                    case 3:
                                        if (nmcVar.a() >= 2) {
                                            int iA3 = nmcVar.A();
                                            int iA4 = nmcVar.A();
                                            iArr[3] = uaj.a(iA3 >> 4, uajVar.d);
                                            iArr[2] = uaj.a(iA3 & 15, uajVar.d);
                                            iArr[1] = uaj.a(iA4 >> 4, uajVar.d);
                                            iArr[0] = uaj.a(iA4 & 15, uajVar.d);
                                            uajVar.c = true;
                                            z2 = true;
                                        } else {
                                            lvb.G0("VobsubParser", "Incomplete color command");
                                            z2 = false;
                                        }
                                        break;
                                    case 4:
                                        if (nmcVar.a() < 2) {
                                            lvb.G0("VobsubParser", "Incomplete alpha command");
                                        } else if (uajVar.c) {
                                            int iA5 = nmcVar.A();
                                            int iA6 = nmcVar.A();
                                            iArr[3] = uaj.c(iArr[3], iA5 >> 4);
                                            iArr[2] = uaj.c(iArr[2], iA5 & 15);
                                            iArr[1] = uaj.c(iArr[1], iA6 >> 4);
                                            iArr[0] = uaj.c(iArr[0], iA6 & 15);
                                            z2 = true;
                                        } else {
                                            lvb.G0("VobsubParser", "Ignoring alpha command before color command");
                                        }
                                        z2 = false;
                                        break;
                                    case 5:
                                        if (nmcVar.a() >= 6) {
                                            int iA7 = nmcVar.A();
                                            int iA8 = nmcVar.A();
                                            int i7 = (iA7 << i4) | (iA8 >> 4);
                                            int iA9 = ((iA8 & 15) << 8) | nmcVar.A();
                                            int iA10 = nmcVar.A();
                                            int iA11 = nmcVar.A();
                                            uajVar.g = new Rect(i7, (iA10 << i4) | (iA11 >> 4), iA9 + 1, (((iA11 & 15) << 8) | nmcVar.A()) + 1);
                                            z2 = true;
                                        } else {
                                            lvb.G0("VobsubParser", "Incomplete area command");
                                            z2 = false;
                                        }
                                        break;
                                    case 6:
                                        if (nmcVar.a() >= i4) {
                                            uajVar.h = nmcVar.H();
                                            uajVar.i = nmcVar.H();
                                            z2 = true;
                                        } else {
                                            lvb.G0("VobsubParser", "Incomplete offsets command");
                                            z2 = false;
                                        }
                                        break;
                                    default:
                                        qt4.y(iA2, "Unrecognized command: ", "VobsubParser");
                                        z2 = false;
                                        break;
                                }
                            } else {
                                z2 = false;
                            }
                            i4 = 4;
                        }
                        if (z) {
                            nmcVar.N(iH);
                        }
                    }
                } while (z);
            } else {
                lvb.G0("VobsubParser", "Skipping SPU (no plane)");
            }
            if (uajVar.d == null || !uajVar.b || !uajVar.c || (rect = uajVar.g) == null || uajVar.h == -1 || uajVar.i == -1 || rect.width() < 2 || uajVar.g.height() < 2) {
                yy4Var = null;
            } else {
                Rect rect2 = uajVar.g;
                int[] iArr2 = new int[rect2.height() * rect2.width()];
                mo2 mo2Var = new mo2();
                nmcVar.N(uajVar.h);
                mo2Var.p(nmcVar);
                uajVar.b(mo2Var, true, rect2, iArr2);
                nmcVar.N(uajVar.i);
                mo2Var.p(nmcVar);
                uajVar.b(mo2Var, false, rect2, iArr2);
                yy4Var = new yy4(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / uajVar.f, 0, 0, rect2.left / uajVar.e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / uajVar.e, rect2.height() / uajVar.f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
            }
        }
        if (yy4Var != null) {
            gheVarR = c98.r(yy4Var);
        } else {
            a98 a98Var = c98.b;
            gheVarR = ghe.e;
        }
        qg4Var.accept(new bz4(-9223372036854775807L, 5000000L, gheVarR));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public Object l(String str, nq4 nq4Var) {
        d9k d9kVar;
        shk shkVar;
        int i = this.a;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 19:
                if (nq4Var instanceof d9k) {
                    d9kVar = (d9k) nq4Var;
                    int i2 = d9kVar.f;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        d9kVar.f = i2 - Integer.MIN_VALUE;
                    } else {
                        d9kVar = new d9k(this, nq4Var);
                    }
                } else {
                    d9kVar = new d9k(this, nq4Var);
                }
                Object objK0 = d9kVar.d;
                int i3 = d9kVar.f;
                if (i3 == 0) {
                    ch3.d0(objK0);
                    lb5 lb5Var = (lb5) this.e;
                    rjj rjjVar = new rjj(this, str, null, 13);
                    d9kVar.f = 1;
                    objK0 = yab.K0(lb5Var, rjjVar, d9kVar);
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(objK0);
                }
                return ((roe) objK0).a;
            default:
                if (nq4Var instanceof shk) {
                    shkVar = (shk) nq4Var;
                    int i4 = shkVar.f;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        shkVar.f = i4 - Integer.MIN_VALUE;
                    } else {
                        shkVar = new shk(this, nq4Var);
                    }
                } else {
                    shkVar = new shk(this, nq4Var);
                }
                Object obj = shkVar.d;
                int i5 = shkVar.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return ((roe) obj).a;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                p9k p9kVar = (p9k) this.c;
                d24 d24Var = new d24(this, str, null, 9);
                shkVar.f = 1;
                Object objM27invokegIAlus = p9kVar.m27invokegIAlus(d24Var, shkVar);
                return objM27invokegIAlus == hu4Var ? hu4Var : objM27invokegIAlus;
        }
    }

    @Override // defpackage.w76
    public void m(s63 s63Var) {
        ((dee) this.e).K = s63Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, ClientId clientId, lq4 lq4Var) {
        j9k j9kVar;
        if (lq4Var instanceof j9k) {
            j9kVar = (j9k) lq4Var;
            int i = j9kVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j9kVar.f = i - Integer.MIN_VALUE;
            } else {
                j9kVar = new j9k(this, (nq4) lq4Var);
            }
        } else {
            j9kVar = new j9k(this, (nq4) lq4Var);
        }
        Object objK0 = j9kVar.d;
        int i2 = j9kVar.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            lb5 lb5Var = (lb5) this.e;
            rjj rjjVar = new rjj(this, str, clientId, null, 14);
            j9kVar.f = 1;
            objK0 = yab.K0(lb5Var, rjjVar, j9kVar);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    public void o(zbh zbhVar, Map.Entry entry) {
        zbh zbhVar2 = (zbh) entry.getValue();
        tvj.a("SurfaceProcessorNode", "     -> outputEdge = " + zbhVar2);
        zi0 zi0Var = new zi0(zbhVar.g.a, ((ei0) entry.getKey()).d, zbhVar.c ? (pf2) this.c : null, ((ei0) entry.getKey()).f, ((ei0) entry.getKey()).g);
        int i = ((ei0) entry.getKey()).c;
        zbhVar2.getClass();
        wxl.a();
        zbhVar2.b();
        qyj.l("Consumer can only be linked once.", !zbhVar2.j);
        zbhVar2.j = true;
        ybh ybhVar = zbhVar2.l;
        o9b.a(o9b.j(ybhVar.c(), new xbh(zbhVar2, ybhVar, i, zi0Var, null), zjl.d()), new ewe(this, 5, zbhVar2), zjl.d());
    }

    public vah p(q8 q8Var) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            vah vahVar = (vah) arrayList.get(i);
            if (vahVar != null && vahVar.b == q8Var) {
                return vahVar;
            }
        }
        vah vahVar2 = new vah((Context) this.c, q8Var);
        arrayList.add(vahVar2);
        return vahVar2;
    }

    public ByteBuffer q() {
        return (ByteBuffer) ((ifh) this.e).getValue();
    }

    public Set r() {
        return (Set) ((AtomicReference) this.e).get();
    }

    @Override // defpackage.rmi
    public boolean s() {
        return !((Boolean) ((ifh) this.e).getValue()).booleanValue();
    }

    public Intent t() {
        Intent intent = (Intent) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        if (arrayList != null && arrayList.size() > 1) {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.e);
            bql.b(intent, (ArrayList) this.e);
            return intent;
        }
        intent.setAction("android.intent.action.SEND");
        ArrayList arrayList2 = (ArrayList) this.e;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.e).get(0));
            bql.b(intent, (ArrayList) this.e);
            return intent;
        }
        intent.removeExtra("android.intent.extra.STREAM");
        intent.setClipData(null);
        intent.setFlags(intent.getFlags() & (-2));
        return intent;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                return "Pack{incomingAudio=" + ((ArrayList) this.b) + ", incomingVideo=" + ((ArrayList) this.c) + ", outgoingAudio=" + ((ArrayList) this.d) + ", outgoingVideo=" + ((ArrayList) this.e) + '}';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.rmi
    public Object u(m25 m25Var, lq4 lq4Var) {
        smi smiVar;
        Float fValueOf;
        ifh ifhVar = (ifh) this.e;
        if (lq4Var instanceof smi) {
            smiVar = (smi) lq4Var;
            int i = smiVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                smiVar.f = i - Integer.MIN_VALUE;
            } else {
                smiVar = new smi(this, (nq4) lq4Var);
            }
        } else {
            smiVar = new smi(this, (nq4) lq4Var);
        }
        Object objInvoke = smiVar.d;
        int i2 = smiVar.f;
        Boolean boolValueOf = null;
        if (i2 == 0) {
            ch3.d0(objInvoke);
            Log.d("CXCP", "shouldUseTorchAsFlash: hasUwCameraUnderexposedFlashCaptureQuirk = " + ((Boolean) ifhVar.getValue()).booleanValue());
            if (!((Boolean) ifhVar.getValue()).booleanValue()) {
                return Boolean.TRUE;
            }
            if (Build.VERSION.SDK_INT < 29) {
                Log.w("CXCP", "shouldUseTorchAsFlash: API level is too low to know if it's ultra wide camera, defaulting to workaround for safety.");
                return Boolean.TRUE;
            }
            smiVar.f = 1;
            objInvoke = m25Var.invoke(smiVar);
            Object obj = hu4.a;
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objInvoke);
        }
        xg xgVar = (xg) objInvoke;
        if (xgVar == null) {
            Log.w("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
            return Boolean.TRUE;
        }
        String str = (String) xgVar.a.get(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (str == null) {
            Log.w("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
        } else {
            me2 me2Var = (me2) this.c;
            ef2.a(str);
            bg2 bg2VarD = me2Var.c().c.d(str);
            try {
                try {
                    fValueOf = Float.valueOf(((vk8) this.d).b(bg2VarD) / vk8.a(vk8.c(bg2VarD), vk8.d(bg2VarD)));
                } catch (Exception e) {
                    throw new IllegalStateException("Failed to get a valid view angle", e);
                }
            } catch (Exception e2) {
                Log.e("CXCP", "Failed to get the intrinsic zoom ratio", e2);
                fValueOf = null;
            }
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                Log.d("CXCP", "isUltraWideCamera: cameraId = " + str + ", intrinsicZoomRatio = " + fFloatValue);
                boolValueOf = Boolean.valueOf(fFloatValue < 1.0f);
            } else {
                Log.w("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
            }
        }
        return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : true);
    }

    public ByteBuffer w() {
        return (ByteBuffer) ((ifh) this.d).getValue();
    }

    public ByteBuffer x() {
        return (ByteBuffer) ((ifh) this.c).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0092 -> B:29:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object y(defpackage.nq4 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.wff
            if (r0 == 0) goto L13
            r0 = r12
            wff r0 = (defpackage.wff) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            wff r0 = new wff
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.i
            int r1 = r0.k
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L41
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            int r1 = r0.h
            int r3 = r0.g
            int r6 = r0.f
            java.util.Iterator r7 = r0.e
            java.util.Collection r8 = r0.d
            java.util.Collection r8 = (java.util.Collection) r8
            defpackage.ch3.d0(r12)
            goto L95
        L37:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            return r4
        L3d:
            defpackage.ch3.d0(r12)
            goto L4d
        L41:
            defpackage.ch3.d0(r12)
            r0.k = r3
            java.io.Serializable r12 = r11.z(r0)
            if (r12 != r5) goto L4d
            goto L94
        L4d:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r12 = r12.iterator()
            r3 = 0
            r7 = r12
            r8 = r1
            r1 = r3
            r6 = r1
        L5d:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L9f
            java.lang.Object r12 = r7.next()
            java.lang.Number r12 = (java.lang.Number) r12
            long r9 = r12.longValue()
            java.lang.Object r12 = r11.b
            ny8 r12 = (defpackage.ny8) r12
            if (r12 == 0) goto L98
            java.lang.Object r12 = r12.getValue()
            xn3 r12 = (defpackage.xn3) r12
            if (r12 == 0) goto L98
            r8e r12 = r12.k(r9)
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            r0.d = r9
            r0.e = r7
            r0.f = r6
            r0.g = r3
            r0.h = r1
            r0.k = r2
            java.lang.Object r12 = defpackage.e9i.P(r12, r0)
            if (r12 != r5) goto L95
        L94:
            return r5
        L95:
            rt2 r12 = (defpackage.rt2) r12
            goto L99
        L98:
            r12 = r4
        L99:
            if (r12 == 0) goto L5d
            r8.add(r12)
            goto L5d
        L9f:
            java.util.List r8 = (java.util.List) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xde.y(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (r15 == r13) goto L48;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b9 -> B:37:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable z(defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xde.z(nq4):java.io.Serializable");
    }

    public xde(ru1 ru1Var, k5g k5gVar, xq1 xq1Var, CidLogger cidLogger) {
        this.a = 5;
        ru1Var.getClass();
        k5gVar.getClass();
        xq1Var.getClass();
        this.b = ru1Var;
        this.c = k5gVar;
        this.d = xq1Var;
        this.e = cidLogger;
    }

    public xde(g85 g85Var, dc9 dc9Var, ewe eweVar, i12 i12Var) {
        this.a = 3;
        g85Var.getClass();
        dc9Var.getClass();
        eweVar.getClass();
        this.b = g85Var;
        this.c = dc9Var;
        this.d = eweVar;
        this.e = i12Var;
    }

    public xde(sb9 sb9Var) {
        this.a = 22;
        this.e = sb9Var;
        this.c = new Handler(Looper.getMainLooper());
        this.d = new rda(21, this);
    }

    public xde(eth ethVar, p9k p9kVar, pfk pfkVar, Logger logger) {
        this.a = 21;
        this.b = ethVar;
        this.c = p9kVar;
        this.d = pfkVar;
        this.e = logger.createLogger("RegisterPushTokenUseCase");
    }

    public xde(SSLEngine sSLEngine) {
        this.a = 13;
        this.b = sSLEngine;
        final int i = 0;
        this.c = new ifh(new af7(this) { // from class: ogh
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                xde xdeVar = this.b;
                switch (i2) {
                    case 0:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    case 1:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    default:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getApplicationBufferSize());
                }
            }
        });
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: ogh
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                xde xdeVar = this.b;
                switch (i3) {
                    case 0:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    case 1:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    default:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getApplicationBufferSize());
                }
            }
        });
        final int i3 = 2;
        this.e = new ifh(new af7(this) { // from class: ogh
            public final /* synthetic */ xde b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i4 = i3;
                xde xdeVar = this.b;
                switch (i4) {
                    case 0:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    case 1:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getPacketBufferSize());
                    default:
                        return ByteBuffer.allocate(((SSLEngine) xdeVar.b).getSession().getApplicationBufferSize());
                }
            }
        });
    }

    public xde(agi agiVar, xde xdeVar, mf mfVar) {
        this.a = 12;
        this.b = agiVar;
        this.c = xdeVar;
        this.d = mfVar;
        this.e = (SSLEngine) xdeVar.b;
    }

    public xde(ny8 ny8Var, ny8 ny8Var2, m8b m8bVar) {
        this.a = 2;
        this.b = ny8Var2;
        this.c = m8bVar;
        this.d = ny8Var;
        AtomicReference atomicReference = new AtomicReference(c76.a);
        this.e = atomicReference;
        if (m8bVar.j()) {
            atomicReference.updateAndGet(new pa1(this, 5, new LinkedHashSet(m8bVar.d)));
        }
    }

    public xde(gu4 gu4Var, ik5 ik5Var, a9g a9gVar) {
        this.a = 6;
        this.b = gu4Var;
        this.c = a9gVar;
        this.d = yab.b(Integer.MAX_VALUE, 0, null, 6);
        this.e = new AtomicInteger(0);
        vo8 vo8Var = (vo8) gu4Var.k().x0(nhb.h);
        if (vo8Var == null) {
            return;
        }
        vo8Var.Y(new f6g(ik5Var, 0, this));
    }

    public xde(int i) {
        this.a = i;
        switch (i) {
            case 23:
                break;
            default:
                this.b = Runtime.getRuntime();
                Method nativeLoadRuntimeMethod = kfh.getNativeLoadRuntimeMethod();
                this.c = nativeLoadRuntimeMethod;
                String strJoin = null;
                String classLoaderLdLoadLibrary = nativeLoadRuntimeMethod != null ? kfh.getClassLoaderLdLoadLibrary() : null;
                this.d = classLoaderLdLoadLibrary;
                if (classLoaderLdLoadLibrary != null) {
                    String[] strArrSplit = classLoaderLdLoadLibrary.split(":");
                    ArrayList arrayList = new ArrayList(strArrSplit.length);
                    for (String str : strArrSplit) {
                        if (!str.contains("!")) {
                            arrayList.add(str);
                        }
                    }
                    strJoin = TextUtils.join(":", arrayList);
                }
                this.e = strJoin;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public xde(ny8 ny8Var, ny8 ny8Var2, int i) {
        this(ny8Var, (i & 2) != 0 ? null : ny8Var2, ui9.a);
        this.a = 2;
    }

    public /* synthetic */ xde(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public xde(r6a r6aVar, g7k g7kVar, Logger logger) {
        this.a = 19;
        ao5 ao5Var = ao5.a;
        lb5 lb5Var = lb5.c;
        this.b = r6aVar;
        this.c = g7kVar;
        this.d = logger;
        this.e = lb5Var;
    }

    public xde(ch2 ch2Var, me2 me2Var, vk8 vk8Var) {
        this.a = 15;
        this.b = ch2Var;
        this.c = me2Var;
        this.d = vk8Var;
        this.e = new ifh(new vbi(4, this));
    }

    public xde(pf2 pf2Var, dch dchVar, String str) {
        this.a = 11;
        this.c = pf2Var;
        this.b = dchVar;
        this.e = str;
    }

    public xde(Context context, ActionMode.Callback callback) {
        this.a = 10;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new h6g(0);
    }

    public xde(mf mfVar, ybb ybbVar) {
        this.a = 16;
        this.e = mfVar;
        this.b = new SparseIntArray(1);
        this.c = new SparseIntArray(1);
        this.d = ybbVar;
    }

    public xde(Context context) {
        Activity activity;
        this.a = 4;
        context.getClass();
        this.b = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.c = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.c).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.c).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    public xde(k84 k84Var) {
        this.a = 14;
        this.b = new ArrayList();
        for (int i = 0; i < ((c98) k84Var.b).size(); i++) {
            ((ArrayList) this.b).add(new h2i());
        }
        this.c = new SparseArray();
        this.d = new SparseArray();
        this.e = new SparseArray();
    }

    public xde(dee deeVar, r72 r72Var, ro7 ro7Var, qi0 qi0Var) {
        this.a = 0;
        this.e = deeVar;
        this.b = r72Var;
        this.c = ro7Var;
        this.d = qi0Var;
    }
}

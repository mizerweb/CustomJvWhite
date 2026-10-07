package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.camera.video.internal.muxer.MuxerException;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jrc implements o21, r9b {
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;

    public jrc(Context context, XmlResourceParser xmlResourceParser) {
        this.a = 5;
        this.d = new ArrayList();
        this.c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), e3e.h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
            } else if (index == 1) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new eg4().c((wf4) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static long m(int i, boolean z, byte[] bArr) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public long A() {
        int i = this.c;
        long jRemaining = 0;
        for (int i2 = 0; i2 < i; i2++) {
            jRemaining += (long) ((ByteBuffer[]) this.d)[i2].remaining();
        }
        return jRemaining;
    }

    public void B(double d, double d2, int i) {
        int iZ = z(i);
        double[] dArr = (double[]) this.d;
        dArr[iZ] = d;
        dArr[iZ + 1] = d2;
    }

    public void C() {
        int i = this.c;
        int i2 = (this.b + i) << 1;
        while (i < i2) {
            double[] dArr = (double[]) this.d;
            double d = dArr[i];
            int i3 = i + 1;
            double d2 = dArr[i3];
            dArr[i] = (d * d) + ((-d2) * d2);
            dArr[i3] = d * 2.0d * d2;
            i += 2;
        }
    }

    public BigInteger D() {
        int[] iArr = (int[]) this.d;
        byte[] bArr = new byte[iArr.length << 2];
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).asIntBuffer();
        for (int i = 0; i < iArr.length; i++) {
            intBufferAsIntBuffer.put(i, iArr[i]);
        }
        return new BigInteger(bArr);
    }

    public synchronized int E() {
        PackageInfo packageInfo;
        if (this.b == 0) {
            try {
                packageInfo = q0k.a((Context) this.d).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.b = packageInfo.versionCode;
            }
        }
        return this.b;
    }

    public synchronized int F() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.d;
        PackageManager packageManager = context.getPackageManager();
        if (q0k.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (listQueryBroadcastReceivers != null && !listQueryBroadcastReceivers.isEmpty()) {
            this.c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.c = 2;
        return 2;
    }

    @Override // defpackage.o21
    public int a() {
        int i = this.b;
        return i == -1 ? ((nmc) this.d).E() : i;
    }

    @Override // defpackage.r9b
    public void b(int i) {
        switch (this.a) {
            case 9:
                int i2 = this.b;
                if (i2 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.m(i2)));
                } else {
                    lh6 lh6Var = (lh6) this.d;
                    lvb.b0(!lh6Var.b);
                    ((s2b) lh6Var.e).k(new t2b(i));
                }
                break;
            default:
                int i3 = this.b;
                if (i3 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.p(i3)));
                } else {
                    ((MediaMuxer) this.d).setOrientationHint(i);
                }
                break;
        }
    }

    @Override // defpackage.o21
    public int c() {
        return this.b;
    }

    @Override // defpackage.o21
    public int d() {
        return this.c;
    }

    @Override // defpackage.r9b
    public void e(int i, String str) {
        int i2 = 1;
        switch (this.a) {
            case 9:
                int i3 = this.b;
                if (i3 != 1) {
                    ore.c("Muxer is not idle. Current state: ".concat(mw7.m(i3)));
                } else if (i == 0 || i == 2) {
                    this.d = new lh6(str);
                    this.b = 2;
                } else {
                    ore.p(zo5.h(i, "Unsupported format: "));
                }
                break;
            default:
                int i4 = this.b;
                if (i4 != 1) {
                    ore.c("Muxer is not idle. Current state: ".concat(mw7.p(i4)));
                } else {
                    if (i == 0) {
                        i2 = 0;
                    } else if (i != 1) {
                        if (i != 2) {
                            ore.p(zo5.h(i, "Unsupported format: "));
                        } else {
                            i2 = 2;
                        }
                    }
                    this.d = new MediaMuxer(str, i2);
                    this.b = 2;
                }
                break;
        }
    }

    public void f(int i) {
        if (i == 0) {
            return;
        }
        long j = ((long) i) & 4294967295L;
        int i2 = this.b;
        while (true) {
            i2--;
            if (j == 0) {
                this.c = Math.min(this.c, i2 + 1);
                return;
            }
            int[] iArr = (int[]) this.d;
            long j2 = (((long) iArr[i2]) & 4294967295L) + j;
            iArr[i2] = (int) j2;
            j = j2 >>> 32;
        }
    }

    public void g(LinkedList linkedList) {
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            irc ircVar = (irc) it.next();
            File file = (File) this.d;
            int i = this.c + 1;
            this.c = i;
            if (i <= this.b) {
                try {
                    File parentFile = file.getParentFile();
                    if (parentFile != null) {
                        sb8.U(parentFile);
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));
                    try {
                        yr8.i(dataOutputStream, ircVar);
                        dataOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(dataOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
        }
    }

    @Override // defpackage.r9b
    public void h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) throws MuxerException {
        switch (this.a) {
            case 9:
                int i2 = this.b;
                if (i2 != 3) {
                    ore.c("Muxer is not started. Current state: ".concat(mw7.m(i2)));
                    return;
                }
                try {
                    new tp9(this, i, byteBuffer, bufferInfo).invoke();
                    return;
                } catch (Exception e2) {
                    throw new MuxerException("MediaMuxer operation failed", e2);
                }
            default:
                int i3 = this.b;
                if (i3 != 3) {
                    ore.c("Muxer is not started. Current state: ".concat(mw7.p(i3)));
                    return;
                }
                try {
                    ((MediaMuxer) this.d).writeSampleData(i, byteBuffer, bufferInfo);
                    return;
                } catch (Exception e3) {
                    throw new MuxerException("MediaMuxer operation failed", e3);
                }
        }
    }

    @Override // defpackage.r9b
    public int i(MediaFormat mediaFormat) throws MuxerException {
        int i;
        switch (this.a) {
            case 9:
                int i2 = this.b;
                if (i2 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.m(i2)));
                    return 0;
                }
                String string = mediaFormat.getString("mime");
                if ((string != null ? z5h.K0(string, "video/", false) : false) && (i = this.c) > 0) {
                    mediaFormat.setInteger("capture-rate", i);
                }
                try {
                    return ((Number) new dx4(this, 29, mediaFormat).invoke()).intValue();
                } catch (Exception e2) {
                    throw new MuxerException("MediaMuxer operation failed", e2);
                }
            default:
                int i3 = this.b;
                if (i3 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.p(i3)));
                    return 0;
                }
                String string2 = mediaFormat.getString("mime");
                if ((string2 != null ? z5h.K0(string2, "video/", false) : false) && this.c > 0) {
                    mediaFormat.setInteger("time-lapse-enable", 1);
                    mediaFormat.setInteger("time-lapse-fps", this.c);
                }
                try {
                    return ((MediaMuxer) this.d).addTrack(mediaFormat);
                } catch (Exception e3) {
                    throw new MuxerException("MediaMuxer operation failed", e3);
                }
        }
    }

    @Override // defpackage.r9b
    public void j(int i) {
        switch (this.a) {
            case 9:
                int i2 = this.b;
                if (i2 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.m(i2)));
                } else if (i <= 0) {
                    ore.p("captureFps must be positive");
                } else {
                    this.c = i;
                }
                break;
            default:
                int i3 = this.b;
                if (i3 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.p(i3)));
                } else if (i <= 0) {
                    ore.k("captureFps must be positive");
                } else {
                    this.c = i;
                }
                break;
        }
    }

    public void k(jrc jrcVar) {
        int i = jrcVar.c;
        double[] dArr = (double[]) jrcVar.d;
        int i2 = this.c;
        int i3 = (this.b + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = (double[]) this.d;
            double d = dArr2[i2];
            int i4 = i2 + 1;
            double d2 = dArr2[i4];
            int i5 = i + 1;
            dArr2[i2] = (dArr[i] * d) + (dArr[i5] * d2);
            dArr2[i4] = ((-d) * dArr[i5]) + (d2 * dArr[i]);
            i += 2;
            i2 += 2;
        }
    }

    public void l(jrc jrcVar) {
        int i = jrcVar.c;
        double[] dArr = (double[]) jrcVar.d;
        int i2 = this.c;
        int i3 = (this.b + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = (double[]) this.d;
            double d = dArr2[i2];
            dArr2[i2] = dArr[i] * d;
            dArr2[i2 + 1] = d * dArr[i + 1];
            i += 2;
            i2 += 2;
        }
    }

    public void n(int i) {
        int[] iArr = (int[]) this.d;
        long j = i;
        int i2 = this.b;
        while (true) {
            i2--;
            if (i2 < this.c) {
                break;
            }
            long j2 = (100000000 * (((long) iArr[i2]) & 4294967295L)) + j;
            iArr[i2] = (int) j2;
            j = j2 >>> 32;
        }
        if (j != 0) {
            iArr[i2] = (int) j;
            this.c = i2;
        }
    }

    public double o(int i) {
        return ((double[]) this.d)[(i << 1) + this.c + 1];
    }

    public void p(int i, double d) {
        ((double[]) this.d)[(i << 1) + this.c + 1] = d;
    }

    public int q(int i) {
        return (i << 1) + this.c + 1;
    }

    public void r(int i, hp6 hp6Var) {
        int iZ = z(i);
        int iQ = q(i);
        double[] dArr = (double[]) this.d;
        double d = dArr[iZ];
        double d2 = dArr[iQ];
        double d3 = hp6Var.a;
        double d4 = hp6Var.b;
        dArr[iZ] = (d * d3) + ((-d2) * d4);
        dArr[iQ] = (d * d4) + (d2 * d3);
    }

    @Override // defpackage.r9b
    public void release() {
        switch (this.a) {
            case 9:
                if (this.b != 5) {
                    try {
                        lh6 lh6Var = (lh6) this.d;
                        if (lh6Var != null && !lh6Var.c) {
                            lh6Var.c();
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    this.d = null;
                    this.b = 5;
                    break;
                }
                break;
            default:
                if (this.b != 5) {
                    try {
                        MediaMuxer mediaMuxer = (MediaMuxer) this.d;
                        if (mediaMuxer != null) {
                            mediaMuxer.release();
                        }
                        break;
                    } catch (Throwable unused2) {
                    }
                    this.d = null;
                    this.b = 5;
                    break;
                }
                break;
        }
    }

    public void s(int i, hp6 hp6Var) {
        int iZ = z(i);
        int iQ = q(i);
        double[] dArr = (double[]) this.d;
        double d = dArr[iZ];
        double d2 = dArr[iQ];
        double d3 = hp6Var.b;
        double d4 = -d2;
        double d5 = hp6Var.a;
        dArr[iZ] = ((-d) * d3) + (d4 * d5);
        dArr[iQ] = (d * d5) + (d4 * d3);
    }

    @Override // defpackage.r9b
    public void start() throws MuxerException {
        switch (this.a) {
            case 9:
                int i = this.b;
                if (i == 3) {
                    return;
                }
                if (i != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.m(i)));
                    return;
                }
                try {
                    lh6 lh6Var = (lh6) this.d;
                    lvb.b0(!lh6Var.b);
                    lvb.b0(!lh6Var.c);
                    lh6Var.b = true;
                    this.b = 3;
                    return;
                } catch (Exception e2) {
                    throw new MuxerException("MediaMuxer operation failed", e2);
                }
            default:
                int i2 = this.b;
                if (i2 == 3) {
                    return;
                }
                if (i2 != 2) {
                    ore.c("Muxer is not configured. Current state: ".concat(mw7.p(i2)));
                    return;
                }
                try {
                    ((MediaMuxer) this.d).start();
                    this.b = 3;
                    return;
                } catch (Exception e3) {
                    throw new MuxerException("MediaMuxer operation failed", e3);
                }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004b */
    @Override // defpackage.r9b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void stop() {
        /*
            r5 = this;
            int r0 = r5.a
            java.lang.String r1 = "Muxer is not started. Current state: "
            java.lang.String r2 = "MediaMuxer operation failed"
            r3 = 3
            r4 = 4
            switch(r0) {
                case 9: goto L35;
                default: goto Lb;
            }
        Lb:
            int r0 = r5.b
            if (r0 != r4) goto L10
            goto L34
        L10:
            if (r0 != r3) goto L29
            java.lang.Object r0 = r5.d     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            android.media.MediaMuxer r0 = (android.media.MediaMuxer) r0     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            r0.stop()     // Catch: java.lang.Exception -> L1c java.lang.Throwable -> L1e
            r5.b = r4
            goto L34
        L1c:
            r0 = move-exception
            goto L20
        L1e:
            r0 = move-exception
            goto L26
        L20:
            androidx.camera.video.internal.muxer.MuxerException r1 = new androidx.camera.video.internal.muxer.MuxerException     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L26:
            r5.b = r4
            throw r0
        L29:
            java.lang.String r5 = defpackage.mw7.p(r0)
            java.lang.String r5 = r1.concat(r5)
            defpackage.ore.c(r5)
        L34:
            return
        L35:
            int r0 = r5.b
            if (r0 != r4) goto L3a
            goto L62
        L3a:
            if (r0 != r3) goto L57
            java.lang.Object r0 = r5.d     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            lh6 r0 = (defpackage.lh6) r0     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            boolean r1 = r0.b     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            defpackage.lvb.b0(r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r0.c()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L4d
            r5.b = r4
            goto L62
        L4b:
            r0 = move-exception
            goto L54
        L4d:
            r0 = move-exception
            androidx.camera.video.internal.muxer.MuxerException r1 = new androidx.camera.video.internal.muxer.MuxerException     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4b
            throw r1     // Catch: java.lang.Throwable -> L4b
        L54:
            r5.b = r4
            throw r0
        L57:
            java.lang.String r5 = defpackage.mw7.m(r0)
            java.lang.String r5 = r1.concat(r5)
            defpackage.ore.c(r5)
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrc.stop():void");
    }

    public void t(int i, hp6 hp6Var) {
        int iZ = z(i);
        int iQ = q(i);
        double[] dArr = (double[]) this.d;
        double d = dArr[iZ];
        double d2 = dArr[iQ];
        double d3 = hp6Var.a;
        double d4 = hp6Var.b;
        dArr[iZ] = (d * d3) + (d2 * d4);
        dArr[iQ] = ((-d) * d4) + (d2 * d3);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return c0a.l(this.b, "ByteBufferSet[", Arrays.toString((ByteBuffer[]) this.d), ":0:", "]");
            default:
                return super.toString();
        }
    }

    public void u(int i, hp6 hp6Var) {
        int iZ = z(i);
        int iQ = q(i);
        double[] dArr = (double[]) this.d;
        double d = dArr[iZ];
        double d2 = dArr[iQ];
        double d3 = -d;
        double d4 = hp6Var.b;
        double d5 = hp6Var.a;
        dArr[iZ] = (d3 * d4) + (d2 * d5);
        dArr[iQ] = (d3 * d5) + ((-d2) * d4);
    }

    public void v(jrc jrcVar) {
        jrc jrcVar2 = this;
        int i = jrcVar.c;
        double[] dArr = (double[]) jrcVar.d;
        int i2 = jrcVar2.c;
        int i3 = (jrcVar2.b + i2) << 1;
        while (i2 < i3) {
            double[] dArr2 = (double[]) jrcVar2.d;
            double d = dArr2[i2];
            int i4 = i2 + 1;
            double d2 = dArr2[i4];
            double d3 = dArr[i];
            double d4 = dArr[i + 1];
            dArr2[i2] = (d * d3) + ((-d2) * d4);
            dArr2[i4] = (d * d4) + (d2 * d3);
            i += 2;
            i2 += 2;
            jrcVar2 = this;
            dArr = dArr;
        }
    }

    public long w(kj6 kj6Var, boolean z, boolean z2, int i) {
        int i2;
        byte[] bArr = (byte[]) this.d;
        if (this.b == 0) {
            if (!kj6Var.t(bArr, 0, 1, z)) {
                return -1L;
            }
            int i3 = bArr[0] & 255;
            int i4 = 0;
            while (true) {
                if (i4 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((e[i4] & ((long) i3)) != 0) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
            }
            this.c = i2;
            if (i2 == -1) {
                ore.k("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i5 = this.c;
        if (i5 > i) {
            this.b = 0;
            return -2L;
        }
        if (i5 != 1) {
            kj6Var.readFully(bArr, 1, i5 - 1);
        }
        this.b = 0;
        return m(this.c, z2, bArr);
    }

    public double x(int i) {
        return ((double[]) this.d)[(i << 1) + this.c];
    }

    public void y(int i, double d) {
        ((double[]) this.d)[(i << 1) + this.c] = d;
    }

    public int z(int i) {
        return (i << 1) + this.c;
    }

    public jrc(Context context) {
        this.a = 11;
        this.c = 0;
        this.d = context;
    }

    public jrc(ByteBuffer[] byteBufferArr) {
        this.a = 4;
        int length = byteBufferArr.length;
        this.d = byteBufferArr;
        this.b = length;
        this.c = length;
        if (byteBufferArr.length >= length) {
            return;
        }
        ore.k("Check failed.");
        throw null;
    }

    public jrc(File file) {
        this.a = 0;
        this.d = file;
        swh swhVar = swh.a;
        Object obj = swh.c().get(f55.c);
        esc escVar = obj instanceof esc ? (esc) obj : null;
        this.b = (escVar == null ? new esc(new qf4()) : escVar).b;
    }

    public jrc(long j) {
        this.a = 2;
        if (j > 0 && j < 2147483647L) {
            int i = (((int) ((j + 63) >>> 6)) + 1) << 1;
            this.b = i;
            this.d = new int[i];
            this.c = i;
            return;
        }
        ore.p(zo5.j(j, "numBits="));
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jrc(ByteBuffer byteBuffer) {
        this(new ByteBuffer[]{byteBuffer});
        this.a = 4;
    }

    public jrc(int i, byte b) {
        this.a = i;
        switch (i) {
            case 8:
                this.d = new jrc[np0.n];
                this.b = 0;
                this.c = 0;
                break;
            default:
                this.d = new byte[8];
                break;
        }
    }

    public /* synthetic */ jrc(char c, int i) {
        this.a = i;
        this.b = 1;
    }

    public jrc(int i, int i2) {
        this.a = 8;
        this.d = null;
        this.b = i;
        int i3 = i2 & 7;
        this.c = i3 == 0 ? 8 : i3;
    }

    public jrc(int i) {
        this.a = 7;
        this.d = new double[i << 1];
        this.b = i;
        this.c = 0;
    }

    public jrc(jrc jrcVar, int i, int i2) {
        this.a = 7;
        this.b = i2 - i;
        this.d = (double[]) jrcVar.d;
        this.c = i << 1;
    }

    public jrc(int i, int i2, SparseArray sparseArray) {
        this.a = 6;
        this.b = i;
        this.c = i2;
        this.d = sparseArray;
    }

    public jrc(n2b n2bVar, b87 b87Var) {
        this.a = 3;
        nmc nmcVar = n2bVar.c;
        this.d = nmcVar;
        nmcVar.N(12);
        int iE = nmcVar.E();
        if ("audio/raw".equals(b87Var.n)) {
            int iV = vqi.v(b87Var.H) * b87Var.F;
            if (iE % iV != 0) {
                lvb.G0("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iV + ", stsz sample size: " + iE);
                iE = iV;
            }
        }
        this.b = iE == 0 ? -1 : iE;
        this.c = nmcVar.E();
    }
}

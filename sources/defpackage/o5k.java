package defpackage;

import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import one.video.calls.sdk_private.g;
import one.video.calls.sdk_private.n;

/* JADX INFO: loaded from: classes3.dex */
public final class o5k extends p5k {
    public static final SecureRandom e;
    public final byte[] a;
    public final byte[] b;
    public final List c;
    public final ArrayList d;

    static {
        Object[] objArr = {hfk.TLS_AES_128_GCM_SHA256};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        Collections.unmodifiableList(arrayList);
        Object[] objArr2 = {mfk.rsa_pss_rsae_sha256};
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = objArr2[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        Collections.unmodifiableList(arrayList2);
        new Random();
        e = new SecureRandom();
    }

    public o5k(String str, PublicKey publicKey, ArrayList arrayList, List list, kfk kfkVar, ArrayList arrayList2, oj6 oj6Var) {
        q3e q3eVar;
        new ArrayList();
        this.c = arrayList;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(3000);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put(new byte[3]);
        byteBufferAllocate.put((byte) 3);
        byteBufferAllocate.put((byte) 3);
        byte[] bArr = new byte[32];
        this.b = bArr;
        e.nextBytes(bArr);
        byteBufferAllocate.put(bArr);
        byte[] bArr2 = new byte[0];
        byteBufferAllocate.put((byte) bArr2.length);
        if (bArr2.length > 0) {
            byteBufferAllocate.put(bArr2);
        }
        byteBufferAllocate.putShort((short) (arrayList.size() << 1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.putShort(((hfk) it.next()).a);
        }
        byteBufferAllocate.put(new byte[]{1, 0});
        do8 do8Var = new do8();
        do8Var.b = str;
        jfk jfkVar = jfk.client_hello;
        pbj pbjVar = new pbj(jfkVar);
        q3e q3eVar2 = new q3e(kfkVar);
        r9i r9iVar = new r9i();
        new ArrayList();
        r9iVar.a = list;
        zkc zkcVar = new zkc();
        ArrayList arrayList3 = new ArrayList();
        zkcVar.b = arrayList3;
        zkcVar.a = jfkVar;
        if (!zkc.d.contains(kfkVar)) {
            qr7.i(kfkVar, "not supported", "Named group ");
            throw null;
        }
        arrayList3.add(new skc(kfkVar, publicKey));
        gab[] gabVarArr = {do8Var, pbjVar, q3eVar2, r9iVar, zkcVar};
        ArrayList arrayList4 = new ArrayList();
        this.d = arrayList4;
        ArrayList arrayList5 = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            gab gabVar = gabVarArr[i];
            Objects.requireNonNull(gabVar);
            arrayList5.add(gabVar);
        }
        arrayList4.addAll(Collections.unmodifiableList(arrayList5));
        ArrayList arrayList6 = this.d;
        int i2 = n5k.a[qt4.D(3)];
        if (i2 == 1) {
            q3eVar = new q3e(lfk.psk_ke);
        } else if (i2 == 2) {
            q3eVar = new q3e(lfk.psk_dhe_ke);
        } else {
            if (i2 != 3) {
                ore.a();
                throw null;
            }
            q3eVar = new q3e(new lfk[]{lfk.psk_ke, lfk.psk_dhe_ke});
        }
        arrayList6.add(q3eVar);
        this.d.addAll(arrayList2);
        byteBufferAllocate.putShort((short) this.d.stream().mapToInt(new ao8(7)).sum());
        int iPosition = -1;
        qx8 qx8Var = null;
        for (gab gabVar2 : this.d) {
            if (gabVar2 instanceof qx8) {
                qx8Var = (qx8) gabVar2;
                iPosition = byteBufferAllocate.position();
            }
            byteBufferAllocate.put(gabVar2.b());
        }
        int iPosition2 = byteBufferAllocate.position();
        byteBufferAllocate.putShort(2, (short) (iPosition2 - 4));
        byte[] bArr3 = new byte[iPosition2];
        this.a = bArr3;
        byteBufferAllocate.get(bArr3);
        if (qx8Var != null) {
            if (oj6Var == null) {
                ore.p("BinderCalculator cannot be null when ClientHelloPreSharedKeyExtension is present");
                throw null;
            }
            byte[] bArr4 = new byte[qx8Var.c + iPosition];
            ByteBuffer.wrap(bArr3).get(bArr4);
            ArrayList arrayList7 = qx8Var.b;
            MessageDigest messageDigest = oj6Var.a;
            short s = oj6Var.e;
            String strH = zo5.h(s << 3, "HmacSHA");
            try {
                messageDigest.reset();
                messageDigest.update(bArr4);
                byte[] bArrDigest = messageDigest.digest();
                SecretKeySpec secretKeySpec = new SecretKeySpec(oj6Var.a(oj6Var.k, "finished", "".getBytes(oj6.u), s), strH);
                Mac mac = Mac.getInstance(strH);
                mac.init(secretKeySpec);
                mac.update(bArrDigest);
                arrayList7.set(0, new nx8(mac.doFinal()));
                byteBufferAllocate.put(qx8Var.b());
                byteBufferAllocate.get(bArr3);
            } catch (InvalidKeyException unused) {
                hs4.b();
                throw null;
            } catch (NoSuchAlgorithmException unused2) {
                ore.q(c0a.o("Missing ", strH, " support"));
                throw null;
            }
        }
    }

    @Override // defpackage.p5k
    public final jfk b() {
        return jfk.client_hello;
    }

    @Override // defpackage.p5k
    public final byte[] d() {
        return this.a;
    }

    public final String toString() {
        return nbh.w("ClientHello[", (String) this.c.stream().map(new f05(21)).collect(Collectors.joining(",")), "|", (String) this.d.stream().map(new f05(22)).collect(Collectors.joining(",")), "]");
    }

    public o5k(ByteBuffer byteBuffer, atj atjVar) throws g {
        this.c = new ArrayList();
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            p51.g("message underflow");
            throw null;
        }
        if (byteBuffer.remaining() < 47) {
            p51.g("message underflow");
            throw null;
        }
        if (byteBuffer.get() != jfk.client_hello.a) {
            hs4.b();
            throw null;
        }
        if (byteBuffer.remaining() < (((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255))) {
            p51.g("message underflow");
            throw null;
        }
        if (byteBuffer.getShort() != 771) {
            p51.g("legacy version must be 0303");
            throw null;
        }
        byte[] bArr = new byte[32];
        this.b = bArr;
        byteBuffer.get(bArr);
        int i = byteBuffer.get();
        if (i > 0) {
            byteBuffer.get(new byte[i]);
        }
        short s = byteBuffer.getShort();
        for (int i2 = 0; i2 < s; i2 += 2) {
            Arrays.stream(hfk.values()).filter(new r4k(byteBuffer.getShort(), 1)).findFirst().ifPresent(new o01(29, this));
        }
        byte b = byteBuffer.get();
        byte b2 = byteBuffer.get();
        if (b != 1 || b2 != 0) {
            throw new n("Invalid legacy compression method");
        }
        int iPosition2 = byteBuffer.position();
        ArrayList arrayListC = p5k.c(byteBuffer, jfk.client_hello, atjVar);
        this.d = arrayListC;
        if (arrayListC.stream().anyMatch(new e05(20))) {
            int i3 = byteBuffer.getShort() & 65535;
            while (i3 > 4) {
                byteBuffer.position();
                byteBuffer.getShort();
                int i4 = byteBuffer.getShort() & 65535;
                byteBuffer.get(new byte[i4]);
                i3 -= i4 + 4;
            }
            if (!(qv1.f(1, this.d) instanceof qzd)) {
                throw new n("pre_shared_key extension MUST be the last extension in the ClientHello");
            }
        }
        byte[] bArr2 = new byte[byteBuffer.position() - iPosition];
        this.a = bArr2;
        byteBuffer.get(bArr2);
    }
}

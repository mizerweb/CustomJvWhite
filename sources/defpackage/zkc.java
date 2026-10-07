package defpackage;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.NamedParameterSpec;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public final class zkc extends gab {
    public static final Map c;
    public static final List d;
    public jfk a;
    public ArrayList b;

    static {
        kfk kfkVar = kfk.secp256r1;
        kfk kfkVar2 = kfk.x25519;
        kfk kfkVar3 = kfk.x448;
        AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(kfkVar, 65);
        AbstractMap.SimpleEntry simpleEntry2 = new AbstractMap.SimpleEntry(kfkVar2, 32);
        AbstractMap.SimpleEntry simpleEntry3 = new AbstractMap.SimpleEntry(kfkVar3, 56);
        Map.Entry[] entryArr = {simpleEntry, simpleEntry2, simpleEntry3};
        HashMap map = new HashMap(3);
        for (int i = 0; i < 3; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                ore.p(c0a.n(key, "duplicate key: "));
                return;
            }
        }
        c = Collections.unmodifiableMap(map);
        Object[] objArr = {kfk.secp256r1, kfk.x25519};
        ArrayList arrayList = new ArrayList(2);
        for (int i2 = 0; i2 < 2; i2++) {
            Object obj = objArr[i2];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        d = Collections.unmodifiableList(arrayList);
    }

    public static ECParameterSpec d(String str) {
        try {
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
            algorithmParameters.init(new ECGenParameterSpec(str));
            return (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class);
        } catch (NoSuchAlgorithmException unused) {
            ore.q("Missing support for EC algorithm");
            return null;
        } catch (InvalidParameterSpecException unused2) {
            ore.q("Inappropriate parameter specification");
            return null;
        }
    }

    public static void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr.length == 32) {
            byteBuffer.put(bArr);
            return;
        }
        if (bArr.length < 32) {
            for (int i = 0; i < 32 - bArr.length; i++) {
                byteBuffer.put((byte) 0);
            }
            byteBuffer.put(bArr, 0, bArr.length);
            return;
        }
        if (bArr.length > 32) {
            for (int i2 = 0; i2 < bArr.length - 32; i2++) {
                if (bArr[i2] != 0) {
                    ore.q(qv1.k("W Affine more then 32 bytes, leading bytes not 0 ", t5k.a(bArr)));
                    return;
                }
            }
            byteBuffer.put(bArr, bArr.length - 32, 32);
        }
    }

    public static void f(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b;
            length--;
        }
    }

    @Override // defpackage.gab
    public final byte[] b() {
        ArrayList<skc> arrayList = this.b;
        short sSum = (short) arrayList.stream().map(new f05(8)).mapToInt(new ao8(4)).map(new qkc(0)).sum();
        jfk jfkVar = this.a;
        jfk jfkVar2 = jfk.client_hello;
        short s = jfkVar == jfkVar2 ? (short) (sSum + 2) : sSum;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(s + 4);
        byteBufferAllocate.putShort(ifk.key_share.a);
        byteBufferAllocate.putShort(s);
        if (jfkVar == jfkVar2) {
            byteBufferAllocate.putShort(sSum);
        }
        for (skc skcVar : arrayList) {
            byteBufferAllocate.putShort(skcVar.a.a);
            kfk kfkVar = skcVar.a;
            Map map = c;
            byteBufferAllocate.putShort(((Integer) map.get(kfkVar)).shortValue());
            kfk kfkVar2 = skcVar.a;
            if (kfkVar2 == kfk.secp256r1) {
                byteBufferAllocate.put((byte) 4);
                e(byteBufferAllocate, ((ECPublicKey) skcVar.a()).getW().getAffineX().toByteArray());
                e(byteBufferAllocate, ((ECPublicKey) skcVar.a()).getW().getAffineY().toByteArray());
            } else {
                if (kfkVar2 != kfk.x25519 && kfkVar2 != kfk.x448) {
                    hs4.b();
                    return null;
                }
                byte[] byteArray = jx5.p(skcVar.a()).getU().toByteArray();
                int length = byteArray.length;
                int iIntValue = ((Integer) map.get(skcVar.a)).intValue();
                kfk kfkVar3 = skcVar.a;
                if (length > iIntValue) {
                    throw new RuntimeException("Invalid " + kfkVar3 + " key length: " + byteArray.length);
                }
                if (byteArray.length < ((Integer) map.get(kfkVar3)).intValue()) {
                    f(byteArray);
                    byteArray = Arrays.copyOf(byteArray, ((Integer) map.get(skcVar.a)).intValue());
                } else {
                    f(byteArray);
                }
                byteBufferAllocate.put(byteArray);
            }
        }
        return byteBufferAllocate.array();
    }

    public final int c(ByteBuffer byteBuffer) throws j {
        ArrayList arrayList = this.b;
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            p51.g("extension underflow");
            return 0;
        }
        Optional optionalFindFirst = Arrays.stream(kfk.values()).filter(new r4k(byteBuffer.getShort(), 5)).findFirst();
        int i = byteBuffer.getShort();
        if (byteBuffer.remaining() < i) {
            p51.g("extension underflow");
            return 0;
        }
        if (optionalFindFirst.isPresent() && d.contains(optionalFindFirst.get())) {
            kfk kfkVar = (kfk) optionalFindFirst.get();
            if (i != ((Integer) c.get(kfkVar)).intValue()) {
                throw new j(nbh.r(i, "Invalid ", kfkVar.name(), " key length: "));
            }
            if (kfkVar == kfk.secp256r1) {
                if (byteBuffer.get() != 4) {
                    p51.g("EC keys must be in legacy form");
                    return 0;
                }
                int i2 = i - 1;
                byte[] bArr = new byte[i2];
                byteBuffer.get(bArr);
                try {
                    arrayList.add(new rkc(kfkVar, (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, i2 / 2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2 / 2, i2))), d(kfkVar.name())))));
                } catch (NoSuchAlgorithmException unused) {
                    ore.q("Missing support for EC algorithm");
                    return 0;
                } catch (InvalidKeySpecException unused2) {
                    ore.q("Inappropriate parameter specification");
                    return 0;
                }
            } else if (kfkVar == kfk.x25519 || kfkVar == kfk.x448) {
                byte[] bArr2 = new byte[i];
                byteBuffer.get(bArr2);
                try {
                    f(bArr2);
                    BigInteger bigInteger = new BigInteger(bArr2);
                    KeyFactory keyFactory = KeyFactory.getInstance("XDH");
                    jx5.t();
                    NamedParameterSpec namedParameterSpecQ = jx5.q(kfkVar.name().toUpperCase());
                    jx5.C();
                    arrayList.add(new skc(kfkVar, keyFactory.generatePublic(jx5.r(namedParameterSpecQ, bigInteger))));
                } catch (NoSuchAlgorithmException unused3) {
                    ore.q("Missing support for EC algorithm");
                    return 0;
                } catch (InvalidKeySpecException unused4) {
                    ore.q("Inappropriate parameter specification");
                    return 0;
                }
            }
        } else {
            byteBuffer.get(new byte[i]);
        }
        return byteBuffer.position() - iPosition;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iml {
    public static final yya a(vf8 vf8Var, g3 g3Var) {
        long j = vf8Var.a;
        String str = vf8Var.b;
        String str2 = vf8Var.c;
        if (str2.length() == 0) {
            str2 = null;
        }
        String str3 = vf8Var.d;
        ag8[] ag8VarArr = vf8Var.q;
        if (ag8VarArr.length == 0) {
            ag8VarArr = null;
        }
        String str4 = vf8Var.p;
        if (str4.length() == 0) {
            str4 = null;
        }
        String str5 = vf8Var.e;
        ag8[] ag8VarArr2 = ag8VarArr;
        String str6 = str4;
        long j2 = vf8Var.f;
        int i = vf8Var.g;
        int i2 = vf8Var.h;
        boolean z = vf8Var.i;
        boolean z2 = vf8Var.j;
        byte[] bArr = null;
        boolean z3 = vf8Var.k;
        long j3 = vf8Var.l;
        long j4 = vf8Var.m;
        Long lValueOf = Long.valueOf(j4);
        if (j4 <= 0) {
            lValueOf = null;
        }
        long j5 = vf8Var.r;
        String str7 = vf8Var.n;
        if (str7.length() == 0) {
            str7 = null;
        }
        byte[] bArr2 = vf8Var.o;
        String str8 = str7;
        if (bArr2.length != 0) {
            bArr = bArr2;
        }
        return new yya(j, str, str2, str3, ag8VarArr2, str6, str5, j2, i, i2, z, z2, z3, j3, lValueOf, j5, vf8Var.s, str8, bArr, (CharSequence) g3Var.invoke(vf8Var), vf8Var.t);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static a9m c(byte[] bArr) {
        UUID[] uuidArr;
        nmc nmcVar = new nmc(bArr);
        if (nmcVar.c < 32) {
            return null;
        }
        nmcVar.N(0);
        int iA = nmcVar.a();
        int iM = nmcVar.m();
        if (iM != iA) {
            lvb.G0("PsshAtomUtil", "Advertised atom size (" + iM + ") does not match buffer size: " + iA);
            return null;
        }
        int iM2 = nmcVar.m();
        if (iM2 != 1886614376) {
            qt4.y(iM2, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int iE = r21.e(nmcVar.m());
        if (iE > 1) {
            qt4.y(iE, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(nmcVar.u(), nmcVar.u());
        if (iE == 1) {
            int iE2 = nmcVar.E();
            uuidArr = new UUID[iE2];
            for (int i = 0; i < iE2; i++) {
                uuidArr[i] = new UUID(nmcVar.u(), nmcVar.u());
            }
        } else {
            uuidArr = null;
        }
        int iE3 = nmcVar.E();
        int iA2 = nmcVar.a();
        if (iE3 == iA2) {
            byte[] bArr2 = new byte[iE3];
            nmcVar.k(0, bArr2, iE3);
            return new a9m(uuid, iE, bArr2, uuidArr);
        }
        lvb.G0("PsshAtomUtil", "Atom data size (" + iE3 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static byte[] d(UUID uuid, byte[] bArr) {
        a9m a9mVarC = c(bArr);
        if (a9mVarC == null) {
            return null;
        }
        UUID uuid2 = (UUID) a9mVarC.c;
        if (uuid.equals(uuid2)) {
            return (byte[]) a9mVarC.d;
        }
        lvb.G0("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }
}

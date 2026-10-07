package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class sia {
    protected volatile int cachedSize = -1;

    public static final <T extends sia> T mergeFrom(T t, byte[] bArr, int i, int i2) throws InvalidProtocolBufferNanoException {
        try {
            su3 su3Var = new su3(bArr, i, i2);
            t.mergeFrom(su3Var);
            su3Var.a(0);
            return t;
        } catch (InvalidProtocolBufferNanoException e) {
            throw e;
        } catch (IOException unused) {
            ore.q("Reading from a byte array threw an IOException (should never happen).");
            return null;
        }
    }

    public static final boolean messageNanoEquals(sia siaVar, sia siaVar2) {
        int serializedSize;
        if (siaVar == siaVar2) {
            return true;
        }
        if (siaVar == null || siaVar2 == null || siaVar.getClass() != siaVar2.getClass() || siaVar2.getSerializedSize() != (serializedSize = siaVar.getSerializedSize())) {
            return false;
        }
        byte[] bArr = new byte[serializedSize];
        byte[] bArr2 = new byte[serializedSize];
        toByteArray(siaVar, bArr, 0, serializedSize);
        toByteArray(siaVar2, bArr2, 0, serializedSize);
        return Arrays.equals(bArr, bArr2);
    }

    public static final void toByteArray(sia siaVar, byte[] bArr, int i, int i2) {
        try {
            uu3 uu3Var = new uu3(bArr, i, i2);
            siaVar.writeTo(uu3Var);
            if (uu3Var.a.remaining() == 0) {
            } else {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        } catch (IOException e) {
            ore.h("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    public sia clone() throws CloneNotSupportedException {
        return (sia) super.clone();
    }

    public int computeSerializedSize() {
        return 0;
    }

    public int getCachedSize() {
        if (this.cachedSize < 0) {
            getSerializedSize();
        }
        return this.cachedSize;
    }

    public int getSerializedSize() {
        int iComputeSerializedSize = computeSerializedSize();
        this.cachedSize = iComputeSerializedSize;
        return iComputeSerializedSize;
    }

    public abstract sia mergeFrom(su3 su3Var);

    public String toString() {
        return vsk.c(this);
    }

    public void writeTo(uu3 uu3Var) {
    }

    public static final <T extends sia> T mergeFrom(T t, byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (T) mergeFrom(t, bArr, 0, bArr.length);
    }

    public static final byte[] toByteArray(sia siaVar) {
        int serializedSize = siaVar.getSerializedSize();
        byte[] bArr = new byte[serializedSize];
        toByteArray(siaVar, bArr, 0, serializedSize);
        return bArr;
    }
}

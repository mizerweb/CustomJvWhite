package androidx.datastore.preferences.protobuf;

import defpackage.o8e;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {
    public final boolean a(Object obj, o8e o8eVar) throws InvalidProtocolBufferException {
        int tag = o8eVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            ((j) obj).c(i << 3, Long.valueOf(o8eVar.K()));
            return true;
        }
        if (i2 == 1) {
            ((j) obj).c((i << 3) | 1, Long.valueOf(o8eVar.a()));
            return true;
        }
        if (i2 == 2) {
            ((j) obj).c((i << 3) | 2, o8eVar.q());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            ((j) obj).c(5 | (i << 3), Integer.valueOf(o8eVar.w()));
            return true;
        }
        j jVarB = j.b();
        int i3 = i << 3;
        int i4 = i3 | 4;
        while (o8eVar.C() != Integer.MAX_VALUE && a(jVarB, o8eVar)) {
        }
        if (i4 != o8eVar.getTag()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        jVarB.e = false;
        ((j) obj).c(i3 | 3, jVarB);
        return true;
    }
}

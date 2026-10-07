package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import one.me.callssdk.CallsSdkInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class qj8 {
    public final Context a;
    public final ek5 b;
    public final i94 c;
    public final ifh d = new ifh(new d2(26, this));

    public qj8(Context context, ek5 ek5Var, i94 i94Var) {
        this.a = context;
        this.b = ek5Var;
        this.c = i94Var;
    }

    public final byte[] a(Long l) {
        byte[] bArr = (byte[]) this.d.getValue();
        if (bArr != null) {
            return bArr;
        }
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(jLongValue);
        return CallsSdkInitializer.INSTANCE.initializeSessionSeed(this.a, byteBufferAllocate.array(), this.b.a().getBytes(pt2.a));
    }
}

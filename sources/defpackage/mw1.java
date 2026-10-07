package defpackage;

import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mw1 implements BiFunction {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return (Set) ((lw1) obj3).invoke(obj, obj2);
            case 1:
                return (Set) ((s81) obj3).invoke(obj, obj2);
            case 2:
                return (vo8) ((ifa) obj3).invoke(obj, obj2);
            case 3:
                return (no5) ((ipa) obj3).invoke(obj, obj2);
            case 4:
                return (r7a) ((ejc) obj3).invoke(obj, obj2);
            case 5:
                return (r7a) ((djc) obj3).invoke(obj, obj2);
            case 6:
                return (r7a) ((fjc) obj3).invoke(obj, obj2);
            case 7:
                return (n9i) ((ifa) obj3).invoke(obj, obj2);
            case 8:
                return (f9b) ((uv2) obj3).invoke(obj, obj2);
            case 9:
                return (f9b) ((s81) obj3).invoke(obj, obj2);
            case 10:
                return (i64) ((uv2) obj3).invoke(obj, obj2);
            case 11:
                return (ConcurrentHashMap) ((wf0) obj3).invoke(obj, obj2);
            case 12:
                return (ConcurrentHashMap) ((uv2) obj3).invoke(obj, obj2);
            case 13:
                return (ConcurrentHashMap) ((z1f) obj3).invoke(obj, obj2);
            case 14:
                return (Set) ((z1f) obj3).invoke(obj, obj2);
            case 15:
                return (ylc) ((uv2) obj3).invoke(obj, obj2);
            case 16:
                return (ylc) ((s81) obj3).invoke(obj, obj2);
            case 17:
                return (Integer) ((wf0) obj3).invoke(obj, obj2);
            case 18:
                return (vo8) ((uv2) obj3).invoke(obj, obj2);
            case 19:
                return (vo8) ((s81) obj3).invoke(obj, obj2);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (n1i) ((wf0) obj3).invoke(obj, obj2);
            case 21:
                return (vo8) ((xx4) obj3).invoke(obj, obj2);
            case 22:
                return (xf5) ((km4) obj3).invoke(obj, obj2);
            default:
                z7k z7kVar = (z7k) obj3;
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                byte[] bArr = new byte[16];
                byteBuffer.get(bArr);
                boolean z = false;
                if (z7kVar.G.e.a.values().stream().filter(new e05(16)).anyMatch(new q4k(0, bArr))) {
                    z = true;
                    z7kVar.f(new v5k(3, true, null, null));
                    if (!ewi.a(z7kVar.p)) {
                        z7kVar.B.g();
                        z7kVar.E.f();
                        z7kVar.p = 5;
                        try {
                            z7kVar.s.schedule(new x7k(z7kVar, 4), z7kVar.B.i() * 3, TimeUnit.MILLISECONDS);
                            break;
                        } catch (RejectedExecutionException unused) {
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}

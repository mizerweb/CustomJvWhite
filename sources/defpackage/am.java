package defpackage;

import android.os.VibrationEffect;
import android.text.TextPaint;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.stream.Collectors;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class am implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return (RLottieDrawable) ((m) obj2).invoke(obj);
            case 1:
                return (int[]) ((m) obj2).invoke(obj);
            case 2:
                return (Set) ((qo1) obj2).invoke(obj);
            case 3:
                return (f9b) ((ol0) obj2).invoke(obj);
            case 4:
                return (as2) ((j22) obj2).invoke(obj);
            case 5:
                return (f9b) ((xk1) obj2).invoke(obj);
            case 6:
                return (f9b) ((tc) obj2).invoke(obj);
            case 7:
                return (f9b) ((j22) obj2).invoke(obj);
            case 8:
                return (f9b) ((j22) obj2).invoke(obj);
            case 9:
                return (f9b) ((en3) obj2).invoke(obj);
            case 10:
                return (f9b) ((j22) obj2).invoke(obj);
            case 11:
                return (y02) ((nv4) obj2).invoke(obj);
            case 12:
                return (fi9) ((x27) obj2).invoke(obj);
            case 13:
                return (dbb) ((fbb) obj2).invoke(obj);
            case 14:
                return (CopyOnWriteArraySet) ((pyb) obj2).invoke(obj);
            case 15:
                return (f9b) ((pyb) obj2).invoke(obj);
            case 16:
                return (f9b) ((p7d) obj2).invoke(obj);
            case 17:
                return (ArrayList) ((pyb) obj2).invoke(obj);
            case 18:
                return (f9b) ((skd) obj2).invoke(obj);
            case 19:
                return (vo8) ((v14) obj2).invoke(obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return (vo8) ((nb) obj2).invoke(obj);
            case 21:
                return (f9b) ((chf) obj2).invoke(obj);
            case 22:
                return (f9b) ((chf) obj2).invoke(obj);
            case 23:
                return (TextPaint) ((bad) obj2).invoke(obj);
            case 24:
                return (ej5) ((u8h) obj2).invoke(obj);
            case 25:
                return (VibrationEffect) ((aoj) obj2).invoke(obj);
            case 26:
                d5k d5kVar = (d5k) obj2;
                int iIntValue = ((Integer) obj).intValue();
                int i2 = d5kVar.m - d5kVar.l;
                int iMin = Integer.min(i2, iIntValue - 10);
                if (iMin == 0) {
                    return null;
                }
                if (iMin < i2) {
                    d5kVar.e.f(new am(26, d5kVar), 10, d5kVar.b, new o01(28, d5kVar));
                }
                byte[] bArr = new byte[iMin];
                int i3 = 0;
                while (i3 < iMin) {
                    int iMin2 = Integer.min(iMin - i3, ((ByteBuffer) d5kVar.j.get(0)).remaining());
                    ((ByteBuffer) d5kVar.j.get(0)).get(bArr, i3, iMin2);
                    if (((ByteBuffer) d5kVar.j.get(0)).remaining() == 0) {
                        d5kVar.j.remove(0);
                    }
                    i3 += iMin2;
                }
                e8k e8kVar = d5kVar.a.a;
                long j = d5kVar.l;
                g5k g5kVar = new g5k();
                g5kVar.a = j;
                g5kVar.c = bArr;
                g5kVar.b = iMin;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin + 12);
                ti8.a(6, byteBufferAllocate);
                ti8.c(j, byteBufferAllocate);
                ti8.a(iMin, byteBufferAllocate);
                byteBufferAllocate.put(bArr);
                byte[] bArr2 = new byte[byteBufferAllocate.position()];
                byteBufferAllocate.get(bArr2);
                d5kVar.l += iMin;
                return g5kVar;
            case 27:
                return (zbk) ((ybk) obj2).f.get((Long) obj);
            case 28:
                return ((fak[]) ((i46) obj2).a)[((w4k) obj).ordinal()];
            default:
                Map.Entry entry = (Map.Entry) obj;
                List list = (List) ((List) entry.getValue()).stream().filter(new baf((BiPredicate) obj2, 2, entry)).collect(Collectors.toList());
                if (list.isEmpty()) {
                    return Optional.empty();
                }
                String str = (String) entry.getKey();
                Objects.requireNonNull(str);
                return Optional.of(new AbstractMap.SimpleImmutableEntry(str, list));
        }
    }
}

package defpackage;

import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class r51 extends ThreadLocal {
    public final /* synthetic */ int a;

    @Override // java.lang.ThreadLocal
    public Object get() {
        switch (this.a) {
            case 6:
                Rect rect = (Rect) super.get();
                rect.set(0, 0, 0, 0);
                return rect;
            case 7:
                Rect rect2 = (Rect) super.get();
                rect2.set(0, 0, 0, 0);
                return rect2;
            default:
                return super.get();
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                return new ConcurrentLinkedQueue();
            case 1:
                return Boolean.FALSE;
            case 2:
                int i = k55.a;
                return ByteBuffer.allocate(16384);
            case 3:
                return new Random();
            case 4:
                return new DecimalFormat("#,##0");
            case 5:
                return new DecimalFormat("#,##0.0");
            case 6:
                return new Rect();
            default:
                return new Rect();
        }
    }
}

package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z70 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z70(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                return ((Number) ((y70) obj3).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((s81) obj3).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((km4) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((xx4) obj3).invoke(obj, obj2)).intValue();
            case 4:
                tt9 tt9Var = (tt9) obj3;
                return tt9Var.b(obj2) - tt9Var.b(obj);
            case 5:
                return ((Number) ((rea) obj3).invoke(obj, obj2)).intValue();
            case 6:
                return ((Number) ((wf0) obj3).invoke(obj, obj2)).intValue();
            case 7:
                ui0 ui0Var = (ui0) obj2;
                ((sc8) obj3).getClass();
                Class cls = ((ui0) obj).a.j;
                int i3 = 0;
                if (cls == MediaCodec.class) {
                    i = 2;
                } else {
                    i = (cls == igd.class || cls == q4h.class) ? 0 : 1;
                }
                Class cls2 = ui0Var.a.j;
                if (cls2 == MediaCodec.class) {
                    i3 = 2;
                } else if (cls2 != igd.class && cls2 != q4h.class) {
                    i3 = 1;
                }
                return i - i3;
            case 8:
                return ((Number) ((s81) obj3).invoke(obj, obj2)).intValue();
            case 9:
                return ((Number) ((qti) obj3).invoke(obj, obj2)).intValue();
            default:
                Rect rect = (Rect) obj3;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(size.getWidth() - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}

package defpackage;

import android.graphics.Point;
import android.view.View;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.mediaeditor.PhotoEditScreen;
import one.video.transloader.task.UploadTask;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.FileValidationConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class po implements wo, se5, u8g, ygh, t65, d3i {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ po(wfe wfeVar, ro roVar, zo zoVar, wfe wfeVar2) {
        this.a = wfeVar;
        this.c = roVar;
        this.d = zoVar;
        this.b = wfeVar2;
    }

    @Override // defpackage.ygh
    public void b(ugh ughVar, int i) {
        dx8 dx8Var = (dx8) this.a;
        ex8 ex8Var = (ex8) this.b;
        y8j y8jVar = (y8j) this.c;
        kbc kbcVar = (kbc) this.d;
        int selectedTabPosition = dx8Var.getSelectedTabPosition();
        View view = ughVar.b;
        cx8 cx8Var = view instanceof cx8 ? (cx8) view : null;
        int iO0 = xw3.O0((List) ex8Var.b);
        List list = (List) ex8Var.b;
        if (i > iO0) {
            gm0.Y(ex8.class.getName(), "Keyboard media tabs position wrong, pos:" + i + "|size:" + list.size());
            return;
        }
        ax8 ax8Var = (ax8) list.get(i);
        owb owbVar = new owb(String.valueOf(ax8Var.c), y8jVar.getContext().getString(ax8Var.a), i == selectedTabPosition ? 1 : 2, null, null, 120);
        if (cx8Var != null) {
            cx8Var.setCustomTheme(kbcVar);
            cx8Var.setTabItem(owbVar);
        } else {
            cx8 cx8Var2 = new cx8(dx8Var.getContext());
            cx8Var2.setCustomTheme(kbcVar);
            cx8Var2.setTabItem(owbVar);
            ughVar.b(cx8Var2);
        }
    }

    @Override // defpackage.u8g
    public void c(b8g b8gVar) throws Throwable {
        DownloadService.Impl.download$lambda$0((String) this.a, (File) this.b, (FileValidationConfig) this.c, (DownloadService.Impl) this.d, b8gVar);
    }

    @Override // defpackage.d3i
    public void cancel() {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.a;
        v56 v56Var = (v56) this.b;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
        UploadTask uploadTask = (UploadTask) this.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            v56Var.K(new xre(atomicBoolean2, 29, uploadTask));
        }
    }

    @Override // defpackage.wo
    public uo d(uo uoVar) {
        wfe wfeVar = (wfe) this.a;
        ro roVar = (ro) this.c;
        zo zoVar = (zo) this.d;
        wfe wfeVar2 = (wfe) this.b;
        b1k b1kVar = new b1k(27, uoVar);
        try {
            wfeVar.a = roVar.d(zoVar, b1kVar);
        } catch (ApiInvocationException e) {
            wfeVar2.a = e;
        }
        return (uo) b1kVar.b;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // defpackage.se5
    public ghe e(int i, hyh hyhVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        hyh hyhVar2 = hyhVar;
        pe5 pe5Var = (pe5) this.a;
        String str = (String) this.b;
        int[] iArr2 = (int[]) this.c;
        Point point = (Point) this.d;
        int i5 = iArr2[i];
        int i6 = point != null ? point.x : pe5Var.i;
        int i7 = point != null ? point.y : pe5Var.j;
        boolean z = pe5Var.l;
        ohc ohcVar = ve5.k;
        if (i6 == Integer.MAX_VALUE || i7 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < hyhVar2.a; i9++) {
                b87 b87Var = hyhVar2.d[i9];
                int i10 = b87Var.u;
                int i11 = b87Var.v;
                if (i10 > 0 && i11 > 0) {
                    if (!z) {
                        i3 = i7;
                        i4 = i6;
                    } else if ((i10 > i11) != (i6 > i7)) {
                        i4 = i7;
                        i3 = i6;
                    } else {
                        i3 = i7;
                        i4 = i6;
                    }
                    int i12 = i10 * i3;
                    int i13 = i11 * i4;
                    Point point2 = i12 >= i13 ? new Point(i4, vqi.g(i13, i10)) : new Point(vqi.g(i12, i11), i3);
                    int i14 = b87Var.u;
                    int i15 = i14 * i11;
                    if (i14 >= ((int) (point2.x * 0.98f)) && i11 >= ((int) (point2.y * 0.98f)) && i15 < i8) {
                        i8 = i15;
                    }
                }
            }
            i2 = i8;
        }
        z88 z88VarL = c98.l();
        int i16 = 0;
        while (i16 < hyhVar2.a) {
            int iB = hyhVar2.d[i16].b();
            z88VarL.c(new ue5(i, hyhVar2, i16, pe5Var, iArr[i16], str, i5, i2 == Integer.MAX_VALUE || (iB != -1 && iB <= i2)));
            i16++;
            hyhVar2 = hyhVar;
        }
        return z88VarL.h();
    }

    @Override // defpackage.t65
    public Object t() {
        return new PhotoEditScreen((String) this.a, (Long) this.b, (xz5) this.c, (ha9) this.d);
    }

    public /* synthetic */ po(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}

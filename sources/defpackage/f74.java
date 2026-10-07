package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;

/* JADX INFO: loaded from: classes.dex */
public final class f74 extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f74(b bVar, int i) {
        super(0);
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        b bVar = this.b;
        switch (i) {
            case 0:
                return new d1f(bVar.getApplication(), bVar, bVar.getIntent() != null ? bVar.getIntent().getExtras() : null);
            case 1:
                bVar.reportFullyDrawn();
                return sbi.a;
            case 2:
                return new ze7(bVar.f, new f74(bVar, i2));
            default:
                ltb ltbVar = new ltb(new w64(bVar, i2));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                        bVar.a.a(new a74(ltbVar, 0, bVar));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new o90(bVar, 3, ltbVar));
                    }
                }
                return ltbVar;
        }
    }
}

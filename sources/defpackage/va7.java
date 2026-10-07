package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.b;

/* JADX INFO: loaded from: classes.dex */
public final class va7 extends qe7 implements i8j, mtb, c1f, jb7 {
    public final b g;
    public final b h;
    public final Handler i;
    public final hb7 j;
    public final /* synthetic */ b k;

    public va7(b bVar) {
        this.k = bVar;
        Handler handler = new Handler();
        this.g = bVar;
        this.h = bVar;
        this.i = handler;
        this.j = new hb7();
    }

    @Override // defpackage.qe7
    public final View A(int i) {
        return this.k.findViewById(i);
    }

    @Override // defpackage.qe7
    public final boolean B() {
        Window window = this.k.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.jb7
    public final void a() {
    }

    @Override // defpackage.i8j
    public final h8j b() {
        return this.k.b();
    }

    @Override // defpackage.c1f
    public final b1f c() {
        return (b1f) this.k.d.c;
    }

    @Override // defpackage.mtb
    public final ltb d() {
        return this.k.d();
    }

    @Override // defpackage.g19
    public final i19 f() {
        return this.k.t;
    }
}

package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qv9 implements rv9, c3a {
    public final /* synthetic */ PendingIntent a;

    public /* synthetic */ qv9(int i, PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // defpackage.c3a
    public void a(h2a h2aVar, int i) {
        h2aVar.a(i, this.a);
    }

    @Override // defpackage.rv9
    public void l(jv9 jv9Var) {
        if (jv9Var.isConnected()) {
            PendingIntent pendingIntent = jv9Var.r;
            PendingIntent pendingIntent2 = this.a;
            if (Objects.equals(pendingIntent, pendingIntent2)) {
                return;
            }
            jv9Var.r = pendingIntent2;
            iu9 iu9Var = jv9Var.a;
            iu9Var.getClass();
            lvb.b0(Looper.myLooper() == iu9Var.f.getLooper());
            iu9Var.e.getClass();
        }
    }

    public /* synthetic */ qv9(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}

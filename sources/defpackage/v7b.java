package defpackage;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;

/* JADX INFO: loaded from: classes.dex */
public final class v7b implements tte {
    public final /* synthetic */ w7b a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;

    public v7b(w7b w7bVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = w7bVar;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    @Override // defpackage.tte
    public final void a() {
        ((t90) this.c.getValue()).e();
    }

    @Override // defpackage.tte
    public final void b() {
        ((t90) this.c.getValue()).f();
    }

    @Override // defpackage.tte
    public final void c(PlaybackException playbackException) {
        int i;
        Bundle bundle;
        b0a b0aVar = this.a.a.v;
        String string = (b0aVar == null || (bundle = b0aVar.I) == null) ? null : bundle.getString("MediaMetadata.Extra.ATTACH_ID");
        if (string != null && ((i = playbackException.a) == 2004 || i == 2003 || i == 2005)) {
            ((wa0) this.b.getValue()).getClass();
            wa0.c(string);
        }
        ((t90) this.c.getValue()).d(playbackException);
    }

    @Override // defpackage.tte
    public final void d(long j) {
        ((t90) this.c.getValue()).c();
    }

    @Override // defpackage.tte
    public final void f() {
        ((t90) this.c.getValue()).b();
    }

    @Override // defpackage.tte
    public final void j() {
        ((t90) this.c.getValue()).a(this.a.a.u);
    }
}

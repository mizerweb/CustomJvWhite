package defpackage;

import android.media.VolumeProvider;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class k3a {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ Handler f;
    public final /* synthetic */ j4d g;

    public k3a(int i, int i2, int i3, String str, Handler handler, j4d j4dVar) {
        this.f = handler;
        this.g = j4dVar;
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public final VolumeProvider a() {
        k3a k3aVar;
        if (this.e != null) {
            k3aVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            k3aVar = this;
            k3aVar.e = new yaj(k3aVar, this.a, this.b, this.d, this.c);
        } else {
            k3aVar = this;
            k3aVar.e = new zaj(k3aVar, k3aVar.a, k3aVar.b, k3aVar.d);
        }
        return k3aVar.e;
    }

    public final void b(int i) {
        this.d = i;
        a().setCurrentVolume(i);
    }
}

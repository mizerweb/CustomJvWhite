package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class oek implements hek {
    public final pak a;
    public final wki b;
    public final nek c;
    public final /* synthetic */ x70 d;

    public oek(x70 x70Var, pak pakVar) {
        this.d = x70Var;
        this.a = pakVar;
        this.b = new wki(pakVar);
        this.c = new nek(this, pakVar);
    }

    @Override // defpackage.hek
    public final void a(long j) {
        this.a.e.g(j);
    }

    @Override // defpackage.hek
    public final void b(long j) {
        this.a.f.b(j);
    }

    @Override // defpackage.hek
    public final boolean e() {
        return this.a.d();
    }

    @Override // defpackage.hek
    public final OutputStream a() {
        return this.b;
    }

    @Override // defpackage.hek
    public final InputStream b() {
        return this.c;
    }
}
